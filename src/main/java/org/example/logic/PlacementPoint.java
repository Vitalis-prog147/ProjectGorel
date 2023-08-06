package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.util.ArrayList;
import java.util.List;

public class PlacementPoint {
    public static void searchPlacementPointForRing (int minCoordinateThePlacementZone,
                                                    int sideSizeForPlacement,
                                                    List <MyRectangle> alarmZone,
                                                    List <MyRing> ringZone){
        List <MyRing> placementRing = new ArrayList<>();
        for (MyRing ring:ringZone
             ) {
            for (int i = minCoordinateThePlacementZone + ring.getOuterRad();i<sideSizeForPlacement;i++){
                for (MyRectangle alarm : alarmZone
                ) {
                    if (false == doesItIntersect(i, alarm.getXCoordinatesInArray())){
                            for (MyRing ignored : placementRing
                                 ) {
                                if (false == doesItIntersect(i, ignored.getXCoordinatesInArray())){
                                    ring.setCenterX(i);
                                    //TODO добавить новые данные круга в массив
                                    placementRing.add(ring);
                            }
                        }
                    }
                }
            }
        }

    }

    public static boolean doesItIntersect ( int i, int [] array){
        for (int j = 0; j< array.length; j++){
            if (i == array[j]){
                if (j == array.length-1){
                    return false;
                }
            }
        }
        return true;
    }

}
