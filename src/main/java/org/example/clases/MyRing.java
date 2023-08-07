package org.example.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.awt.*;

@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
public class MyRing {
    private int id;
    private int innerRad;
    private int outerRad;
    private int centerX;
    private int centerY;
    private Point center;
    private int[] xCoordinatesInArray;
    private int[] yCoordinatesInArray;
    private Point[][] representationShapeInArray;

    public MyRing(int id, int innerRad, int outerRad) {
        this.id = id;
        this.innerRad = innerRad;
        this.outerRad = outerRad;
    }
}
