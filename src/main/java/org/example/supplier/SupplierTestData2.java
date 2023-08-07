package org.example.supplier;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.util.ArrayList;
import java.util.List;

public class SupplierTestData2 {
    public static void create() {
        MyRectangle zoneRectangle = new MyRectangle(-50,-100,50,100);
        List<MyRectangle> alarmZone = new ArrayList<>();
        alarmZone.add(0,new MyRectangle(-5,-100,+5,+100));
        alarmZone.add(1,new MyRectangle(-50,-100,-30,-80));

        List<MyRing> listRing = new ArrayList<>();
        listRing.add(0,new MyRing(0,12,20));
        listRing.add(1,new MyRing(1,25,30));
        listRing.add(2,new MyRing(2,32,35));
        listRing.add(3,new MyRing(3,25,30));
        listRing.add(4,new MyRing(4,12,20));
    }
}
