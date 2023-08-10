package org.example.JAXP.parser;

import org.example.clases.MyRing;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ParserRing {
    public static List<MyRing> getRing(Document doc){
        //размещаемые кольца
        Element circles = (Element) doc.getElementsByTagName("circles").item(0);
        NodeList circleList = circles.getElementsByTagName("circle");
        List<MyRing> circleData = new ArrayList<>();
        for (int i = 0; i < circleList.getLength(); i++) {
            Element circle = (Element) circleList.item(i);
            int id = Integer.parseInt(circle.getAttribute("id"));
            int innerRad = Integer.parseInt(circle.getAttribute("inner_rad"));
            int outerRad = Integer.parseInt(circle.getAttribute("outter_rad"));
            MyRing c = new MyRing(id, innerRad, outerRad);
            circleData.add(c);
        }
        return circleData;
    }
}
