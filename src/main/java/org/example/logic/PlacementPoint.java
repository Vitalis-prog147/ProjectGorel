package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.util.ArrayList;
import java.util.List;

public class PlacementPoint {
    public static void searchPlacementPointForRing (MyRectangle placementZone,//TODO перейти на двумерный массив
                                                    List <MyRectangle> alarmZone,
                                                    List <MyRing> ringZone){

        List <MyRing> placementRing = new ArrayList<>(); //список расставленных колец
        for (MyRing noPlacementRing:ringZone //проход по списку не расставленных колец
             ) {
            if(true == includedInThePlacementZone(noPlacementRing, placementZone)){//TODO входит кольцо в зону расстановки?
                int valueCoordinateX = placementZone.getMinX() + noPlacementRing.getOuterRad();
                int valueCoordinateY = placementZone.getMaxY() + noPlacementRing.getOuterRad();
                boolean intersection = false;
                    for (int i = 0; i< placementZone.getYCoordinatesInArray().length; i++){
                        for (int j = 0; j< placementZone.getXCoordinatesInArray().length; j++) {
                            if (false == intersectsOtherObjectsAlarm(alarmZone, valueCoordinateX)) {
                                intersection = true;
                                break;
                            }

                            if (false == intersectsOtherObjectsRing(placementRing, valueCoordinateX)) {
                                intersection = true;
                                break;
                            }

                            if (false == intersection) {
                                noPlacementRing.setCenterX(valueCoordinateX);
                                //TODO добавить новые данные круга в массив
                                placementRing.add(noPlacementRing);
                                break;
                            }
                            valueCoordinateX++;
                        }
                        valueCoordinateY++;
                    }

                }

            }

        }


    public static boolean doesItIntersect (int valueCoordinate, int [] array){
        for (int i = 0; i< array.length; i++){
            if (valueCoordinate == array[i]){
                if (i == array.length-1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean includedInThePlacementZone(MyRing noPlacementRing, MyRectangle placementZone){
        if (true == includedInThePlacementZoneByAxis(
                noPlacementRing.getOuterRad(),
                placementZone.getMinX(),
                placementZone.getMaxX())){
            if (true == includedInThePlacementZoneByAxis(
                    noPlacementRing.getOuterRad(),
                    placementZone.getMinY(),
                    placementZone.getMaxY())){
                return true;
            }
        }
        return false;
    }

    public static boolean includedInThePlacementZoneByAxis(int RadiusRing, int minCoordinateThePlacementZone, int maxCoordinateThePlacementZone){

        if (Math.abs(maxCoordinateThePlacementZone)-Math.abs(minCoordinateThePlacementZone)>=RadiusRing){
            return true;
        }
        return false;
    }

    public static <T> boolean intersectsOtherObjects(List <T> list, int valueCoordinate, int [] array){

        for (T obi : list
        ) {
                if (false == doesItIntersect(valueCoordinate, array)) { //пересекает ли зоны тревог?
                    return true;
                }
        }
        return  false;
    }

    public static boolean intersectsOtherObjectsAlarm(List <MyRectangle> list, int valueCoordinate){

        for (MyRectangle obi : list
        ) {
            if (false == doesItIntersect(valueCoordinate, obi.getXCoordinatesInArray())) { //пересекает ли зоны тревог?
                return true;
            }
        }
        return  false;
    }

    public static boolean intersectsOtherObjectsRing(List <MyRing> list, int valueCoordinate){

        for (MyRing obi : list
        ) {
            if (false == doesItIntersect(valueCoordinate, obi.getXCoordinatesInArray())) { //пересекает ли зоны тревог?
                return true;
            }
        }
        return  false;
    }

}
