package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PlacementPoint {
    public static void searchPlacementPointForRing(MyRectangle placementZone,
                                                   List<MyRectangle> alarmZone,
                                                   List<MyRing> ringZone) {

        List<MyRing> placementRing = new ArrayList<>(); //список расставленных колец
        for (MyRing noPlacementRing : ringZone //проход по списку не расставленных колец
        ) {
            if (true == Include.includedInThePlacementZone(noPlacementRing, placementZone)) {// входит кольцо в зону расстановки?
                int valueCoordinateX = placementZone.getMinX() + noPlacementRing.getOuterRad();
                int valueCoordinateY = placementZone.getMinY() + noPlacementRing.getOuterRad();
                boolean intersection = false;
                boolean abort = false;
                int height = placementZone.getHeight() + 1;
                int width = placementZone.getWidth() + 1;

                for (int i = 0; i < height; i++) {

                    for (int j = 0; j < width; j++) {

                        Point center = new Point(valueCoordinateX, valueCoordinateY);
                        if (true == Intersect.intersectsOtherObjectsAlarm(alarmZone, center)) { //ToDo не работает проверка пересечения
                            intersection = true;
                        }

                        if (true == Intersect.intersectsOtherObjectsRing(placementRing, center)) { //ToDo не работает проверка пересечения
                            intersection = true;
                        }

                        if (false == intersection) {
                            noPlacementRing.setCenterY(valueCoordinateY);
                            noPlacementRing.setCenterX(valueCoordinateX);
                            Point centerPoint = new Point(valueCoordinateX, valueCoordinateY);
                            noPlacementRing.setCenter(centerPoint);
                            Point[][] ArrayRing = RepresentationArray.convertingToAnArray(noPlacementRing);
                            //Todo нужна проверка на пересечения массивом
                            noPlacementRing.setRepresentationShapeInArray(ArrayRing);
                            placementRing.add(noPlacementRing);
                            abort = true;
                            break;
                        }
                        valueCoordinateX++;
                    }
                    if (true == abort) {
                        break;
                    }
                    valueCoordinateY++;
                }

            }

        }

    }

}
