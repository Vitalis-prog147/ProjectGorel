package org.example.clases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;


public class MyImage extends BufferedImage {
    private BufferedImage image;

    public MyImage(int width, int height, int imageType) {
        super(width, height, imageType);
    }

    public MyImage(int width, int height, int imageType, IndexColorModel cm) {
        super(width, height, imageType, cm);
    }

    public MyImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
        super(cm, raster, isRasterPremultiplied, properties);
    }
}
