package org.example.printToConsole;

import org.example.clases.MyRing;

import java.util.List;

public class PrintDataMyRing {
    public static void printRing (List<MyRing> circleData){
        System.out.println("\nДанные по кругам:");
        for (MyRing circle : circleData) {
            System.out.println("ID круга: " + circle.getId());
            System.out.println("Внутренний радиус: " + circle.getInnerRad());
            System.out.println("Внешний радиус: " + circle.getOuterRad());
        }
    }
}
