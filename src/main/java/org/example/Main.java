package org.example;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;
import org.example.draw.DrawImage;
import org.example.logic.PlacementPoint;
import org.example.logic.RepresentationArray;
import org.example.supplier.SupplierTestData4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Document document = Reading.main(); // Путь "C:\IDEA_project\ProjectGorel\src\main\resources\ToInput.xml"
        MyRectangle placementArea = ParserPlacementAreaRectangle.getPlacementArea(document);
        List<MyRectangle> alarmArea = ParserAlarmAreaRectangle.getAlarmArea(document);
        List<MyRing> listRing = ParserRing.getRing(document);
         */

        MyRectangle placementArea = SupplierTestData4.supplierZoneRectangle();
        List<MyRectangle> alarmArea = SupplierTestData4.supplierAlarmZone();
        List<MyRing> listRing = SupplierTestData4.supplierListRing();

        placementArea.setRepresentationShapeInArray(RepresentationArray.convertingToAnArray(placementArea));
        for (MyRectangle alarm : alarmArea
        ) {
            alarm.setRepresentationShapeInArray(RepresentationArray.convertingToAnArray(alarm));
        }

        //MakingAdjustmentsForRendering.makingAdjustments(zoneRectangle);//ToDO неверная логика, нет синхронизации сдвига координат
        //MakingAdjustmentsForRendering.makingAdjustments(alarmZone);//ToDO неверная логика, нет синхронизации сдвига координат

        PlacementPoint.searchPlacementPointForRing(placementArea, alarmArea, listRing);

        DrawImage.main(new String[]{"C:\\IDEA_project\\ProjectGorel\\out.png"}, placementArea, alarmArea, listRing);

        System.out.println("test");
    }
}