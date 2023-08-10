package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.awt.*;
import java.util.List;

public class Intersect {
    public static boolean doesItIntersect(Point valueCoordinate, Point[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                Point a = array[i][j];
                if (true == a.equals(valueCoordinate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean intersectsOtherObjectsAlarm(List<MyRectangle> list, Point valueCoordinate) {

        for (MyRectangle obi : list
        ) {
            if (true == doesItIntersect(valueCoordinate, obi.getRepresentationShapeInArray())) { //пересекает ли зоны тревог?
                return true;
            }
        }
        return false;
    }

    public static boolean intersectsOtherObjectsRing(List<MyRing> list, Point valueCoordinate) {

        for (MyRing obi : list
        ) {
            if (true == doesItIntersect(valueCoordinate, obi.getRepresentationShapeInArray())) { //пересекает ли зоны тревог?
                return true;
            }
        }
        return false;
    }

}
