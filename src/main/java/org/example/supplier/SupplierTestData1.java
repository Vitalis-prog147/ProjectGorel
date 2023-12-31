package org.example.supplier;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.util.ArrayList;
import java.util.List;

public class SupplierTestData1 {

    public static void create() {

    }

    public static MyRectangle supplierZoneRectangle() {
        MyRectangle zoneRectangle = new MyRectangle(-3, -6, 3, 6);

        return zoneRectangle;
    }

    public static List<MyRectangle> supplierAlarmZone() {
        List<MyRectangle> alarmZone = new ArrayList<>();
        alarmZone.add(0, new MyRectangle(0, 0, 1, 1));
        alarmZone.add(1, new MyRectangle(0, 0, 2, 3));

        return alarmZone;
    }

    public static List<MyRing> supplierListRing() {
        List<MyRing> listRing = new ArrayList<>();
        listRing.add(0, new MyRing(0, 2, 3));
        listRing.add(1, new MyRing(0, 3, 4));

        return listRing;
    }


}
