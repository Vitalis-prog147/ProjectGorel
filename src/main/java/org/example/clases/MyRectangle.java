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
public class MyRectangle {
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;
    private Point[][] representationShapeInArray;

    public MyRectangle(int minX, int minY, int maxX, int maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getWidth() { //ToDO неверный расчет
        return (maxX - minX);
    }


    public int getHeight() { //ToDO неверный расчет
        return (maxY - minY);
    }

}
