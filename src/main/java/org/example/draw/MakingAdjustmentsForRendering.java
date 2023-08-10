package org.example.draw;

import org.example.clases.MyRectangle;
import java.util.List;

public class MakingAdjustmentsForRendering {
    public static void makingAdjustments(MyRectangle zoneRectangle) {
        check(zoneRectangle);
    }

    public static void makingAdjustments(List<MyRectangle> alarmZone) {
        for (MyRectangle alarm : alarmZone
        ) {
            check(alarm);
        }
    }

    public static void theFirstCase(MyRectangle zoneRectangle) {
        /**
         * MinX = -1;
         * MinY = -1;
         * MaxX = 1;
         * MaxY = 1;
         */
        if (zoneRectangle.getMinX() <= 0
                &&
                zoneRectangle.getMinY() <= 0
                &&
                zoneRectangle.getMaxX() >= 0
                &&
                zoneRectangle.getMaxY() >= 0) {

            zoneRectangle.setMinX(
                    Math.abs(zoneRectangle.getMinX()));
            zoneRectangle.setMinY(
                    Math.abs(zoneRectangle.getMinY()));
            zoneRectangle.setMaxX(
                    zoneRectangle.getMaxX()
                            + Math.abs(zoneRectangle.getMinX()));
            zoneRectangle.setMaxX(
                    zoneRectangle.getMaxX()
                            + Math.abs(zoneRectangle.getMinY()));
        }

    }

    public static void theSecondCase(MyRectangle zoneRectangle) {
        /**
         * MinX = -3;
         * MinY = -3;
         * MaxX = -1;
         * MaxY = -1;
         */
        if (zoneRectangle.getMinX() <= 0
                &&
                zoneRectangle.getMinY() <= 0
                &&
                zoneRectangle.getMaxX() <= 0
                &&
                zoneRectangle.getMaxY() <= 0) {

            zoneRectangle.setMinX(
                    Math.abs(zoneRectangle.getMinX()));
            zoneRectangle.setMinY(
                    Math.abs(zoneRectangle.getMinY()));
            zoneRectangle.setMaxX(
                    Math.abs(zoneRectangle.getMaxX()));
            zoneRectangle.setMaxX(
                    Math.abs(zoneRectangle.getMaxX()));

        }

    }

    public static void theThirdCase(MyRectangle zoneRectangle) {
        /**
         * MinX = 1;
         * MinY = 1;
         * MaxX = 3;
         * MaxY = 3;
         */
        if (zoneRectangle.getMinX() >= 0
                &&
                zoneRectangle.getMinY() >= 0
                &&
                zoneRectangle.getMaxX() >= 0
                &&
                zoneRectangle.getMaxY() >= 0) {
        }

    }

    public static void theFourthCase(MyRectangle zoneRectangle) {
        /**
         * MaxX < MinX;
         * MaxY < MinY;
         */
        if (
                zoneRectangle.getMaxX() <= zoneRectangle.getMinX()
                        &&
                        zoneRectangle.getMaxY() <= zoneRectangle.getMinY()) {
            errorMessage();
        }
        if (
                zoneRectangle.getMaxX() <= zoneRectangle.getMinX()
                        ||
                        zoneRectangle.getMaxY() <= zoneRectangle.getMinY()) {
            errorMessage();
        }
    }

    public static void check(MyRectangle zoneRectangle) {
        theFirstCase(zoneRectangle);
        theSecondCase(zoneRectangle);
        theThirdCase(zoneRectangle);
        theThirdCase(zoneRectangle);
    }

    public static void errorMessage() {
        System.out.println("Фигура имеет не корректные размеры");
    }

}
