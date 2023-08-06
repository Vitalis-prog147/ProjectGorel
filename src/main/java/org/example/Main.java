package org.example;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;
import org.example.logic.PlacementPoint;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        MyRectangle zoneRectangle = new MyRectangle(0,0,40,50);
        List<MyRectangle> alarmZone = new ArrayList<>();
        alarmZone.add(0,new MyRectangle(0,0,1,1));
        alarmZone.add(1,new MyRectangle(0,0,2,3));

        List<MyRing> listRing = new ArrayList<>();
        listRing.add(0,new MyRing(0,2,3));
        listRing.add(1,new MyRing(0,3,4));

        PlacementPoint.searchPlacementPointForRing(zoneRectangle.getMinX(),zoneRectangle.getWidth(),alarmZone,listRing);
    }
}