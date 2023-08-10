package org.example.JAXP.parser;

import org.example.clases.MyRectangle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class ParserPlacementAreaRectangle {
    public static MyRectangle getPlacementArea(Document doc){
        Element placementZone = (Element) doc.getElementsByTagName("placement_zone").item(0);
        //прямоугольник зоны размещения
        Element rect = (Element) placementZone.getElementsByTagName("rect").item(0);
        Element minPointRect = (Element) rect.getElementsByTagName("min_point").item(0);
        Element maxPointRect = (Element) rect.getElementsByTagName("max_point").item(0);
        int minXRect = Integer.parseInt(minPointRect.getAttribute("x"));
        int minYRect = Integer.parseInt(minPointRect.getAttribute("y"));
        int maxXRect = Integer.parseInt(maxPointRect.getAttribute("x"));
        int maxYRect = Integer.parseInt(maxPointRect.getAttribute("y"));
        MyRectangle zoneRect = new MyRectangle(minXRect, minYRect, maxXRect, maxYRect);

        return zoneRect;
    }
}
