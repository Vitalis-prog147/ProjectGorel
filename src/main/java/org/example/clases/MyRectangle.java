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
public class MyRectangle  {
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;
    private int[] xCoordinatesInArray;
    private int[] yCoordinatesInArray;

    public MyRectangle(int x, int y, int width, int height) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getWidth(){
        return maxX-minX;
    }


    public int getHeight() {
        return maxY-minY;
    }

}
