package org.example.draw;

import org.example.clases.MyRectangle;
import org.example.clases.MyRing;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DrawImage {
    public static void main(String @NotNull [] args, MyRectangle zoneRectangle, List<MyRectangle> alarmZone, List<MyRing> listRing) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите имя выходного файла в качестве аргумента командной строки");
            return;
        }

        BufferedImage image = draw(zoneRectangle, alarmZone, listRing);
        // Сохранение изображения в формате PNG
        try {
            String outputFilename = args[0];
            File output = new File(outputFilename);
            ImageIO.write(image, "png", output);
            System.out.println(
                    new StringBuilder()
                            .append("Изображение успешно сохранено в файл ")
                            .append(outputFilename)
                            .toString());
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении изображения.");
            e.printStackTrace();
        }
    }

    public static BufferedImage draw(MyRectangle zoneRectangle, List<MyRectangle> alarmZone, List<MyRing> listRing) {
        // Создание изображения
        BufferedImage image = new BufferedImage(
                zoneRectangle.getWidth() * 4,
                zoneRectangle.getHeight() * 4,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();

        // Отрисовка изображения
        g.setColor(Color.WHITE);
        g.fillRect(zoneRectangle.getMinX(),
                zoneRectangle.getMinY(),
                zoneRectangle.getWidth(),
                zoneRectangle.getHeight()
        );

        g.setColor(Color.RED);
        for (MyRectangle alarm : alarmZone
        ) {
            g.fillRect(alarm.getMinX(),
                    alarm.getMinY(),
                    alarm.getWidth(),
                    alarm.getHeight()
            );
        }

        g.setColor(Color.BLUE);
        for (MyRing ring : listRing
        ) {
            g.drawOval(ring.getCenterX(),
                    ring.getCenterY(),
                    ring.getOuterRad(),
                    ring.getOuterRad()
            );

        }

        g.setColor(Color.ORANGE); //TODO не сопрягает центра
        for (MyRing ring : listRing
        ) {
            g.drawOval(ring.getCenterX(),
                    ring.getCenterY(),
                    ring.getInnerRad(),
                    ring.getInnerRad()
            );
        }

        g.dispose();

        return image;
    }
}
