package org.example.printToConsole;

import org.example.clases.MyRectangle;

import java.util.List;

public class PrintDataMyRectangle {
    public static void printPlacementArea (MyRectangle zoneRect){
        System.out.println("Данные по зоне расстановки:");
        System.out.println("Минимальная точка прямоугольника: (" + zoneRect.getMinX() + ", " + zoneRect.getMinY() + ")");
        System.out.println("Максимальная точка прямоугольника: (" + zoneRect.getMaxX() + ", " + zoneRect.getMaxY() + ")");
    }
    public static void printAlarmArea (List<MyRectangle> alarmRectangles){
        System.out.println("\nДанные по зонам исключения:");
        for (MyRectangle alarmRect : alarmRectangles) {
            System.out.println("Минимальная точка прямоугольника: (" + alarmRect.getMinX() + ", " + alarmRect.getMinY() + ")");
            System.out.println("Максимальная точка прямоугольника: (" + alarmRect.getMaxX() + ", " + alarmRect.getMaxY() + ")");
        }
    }
}
