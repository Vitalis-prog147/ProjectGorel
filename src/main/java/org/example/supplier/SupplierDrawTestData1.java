package org.example.supplier;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SupplierDrawTestData1 {
    public static void create() {
        BufferedImage image = new BufferedImage(
                400,
                800,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        int circleOutR1 = 60;
        int circleInR1 = 30;
        int n = circleOutR1 / 4;
        int x = 50;
        int y = 50;

        g.setColor(Color.pink);
        g.drawOval(x, x, circleOutR1, circleOutR1);
        g.setColor(Color.BLACK);
        g.drawOval(x + n, x + n, circleInR1, circleInR1);

        int circleOutR2 = 40;
        int circleInR2 = 30;
        int n2 = circleOutR1 / 12;
        int x2 = 10;
        int y2 = 10;

        g.setColor(Color.pink);
        g.drawOval(x2, x2, circleOutR2, circleOutR2);
        g.setColor(Color.BLACK);
        g.drawOval(x2 + n2, x2 + n2, circleInR2, circleInR2);
    }

}
