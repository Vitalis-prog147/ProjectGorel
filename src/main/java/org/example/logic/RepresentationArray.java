package org.example.logic;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;

import java.awt.*;

public class RepresentationArray {
    public static Point[][] convertingToAnArray (MyRectangle rectangle){
        int height = rectangle.getHeight()+1;
        int width = rectangle.getWidth()+1;
        Point[][] array = new Point[height][width];
        int minY = rectangle.getMinY();

        for (int i=0; i<height; i++){ // столбы ось Y
            int minX = rectangle.getMinX();
            for (int j=0; j<width; j++){ // строки ось X
                array[i][j] = new Point(minX, minY);
                minX++;
            }
            minY++;
        }
        return array;
    }

    public static Point[][] convertingToAnArray (MyRing ring){
        int height = (ring.getOuterRad()*2)+1;
        int width = (ring.getOuterRad()*2)+1;
        Point[][] array = new Point[height][width];
        int minY = ring.getCenterY() - ring.getOuterRad();

        for (int i=0; i< height; i++){ // столбы ось Y
            int minX = ring.getCenterX();
            for (int j=0; j< width; j++){ // строки ось X
                array[i][j] = new Point(minX, minY);
                minX++;
            }
            minY++;
        }
        return array; // TODO вроде верно
        // работает не верно. заливает половину сектора
    }
}
