package org.example;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;
import org.example.draw.DrawColor;
import org.example.draw.DrawMono;
import org.example.draw.MakingAdjustmentsForRendering;
import org.example.logic.PlacementPoint;
import org.example.logic.RepresentationArray;
import org.example.supplier.SupplierTestData4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        MyRectangle zoneRectangle = SupplierTestData4.supplierZoneRectangle();
        List<MyRectangle> alarmZone = SupplierTestData4.supplierAlarmZone();
        List<MyRing> listRing = SupplierTestData4.supplierListRing();


        //MakingAdjustmentsForRendering.makingAdjustments(zoneRectangle);//ToDO неверная логика, нет синхронизации
        //MakingAdjustmentsForRendering.makingAdjustments(alarmZone);//ToDO неверная логика, нет синхронизации

        zoneRectangle.setRepresentationShapeInArray(RepresentationArray.convertingToAnArray(zoneRectangle));
        for (MyRectangle alarm:alarmZone
             ) {
            alarm.setRepresentationShapeInArray(RepresentationArray.convertingToAnArray(alarm));
        }

        MakingAdjustmentsForRendering.makingAdjustments(zoneRectangle);
        MakingAdjustmentsForRendering.makingAdjustments(alarmZone);

        PlacementPoint.searchPlacementPointForRing(zoneRectangle,alarmZone,listRing);



        //DrawColor.main(new String[]{"C:\\IDEA_project\\ProjectGorel\\image.png"},zoneRectangle,alarmZone,listRing);

        DrawMono.main(new String[]{"C:\\IDEA_project\\ProjectGorel\\imageMono.png"},zoneRectangle,alarmZone,listRing);

        System.out.println("test");
        //PlacementPoint.searchPlacementPointForRing(zoneRectangle,alarmZone,listRing);
    }
}