package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

public class Include {
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

        if (Math.abs(maxCoordinateThePlacementZone) //TODO need checing logic
                -Math.abs(minCoordinateThePlacementZone)
                >=RadiusRing
                ||
                Math.abs(maxCoordinateThePlacementZone)
                +Math.abs(minCoordinateThePlacementZone)
                >=RadiusRing){
            return true;
        }
        return false;
    }
}
