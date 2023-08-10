package org.example.JAXP.parser;

import org.example.clases.MyRectangle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class ParserAlarmAreaRectangle {
    public static List<MyRectangle> getAlarmArea(Document doc){
        Element placementZone = (Element) doc.getElementsByTagName("placement_zone").item(0);
        //прямоугольник зон тревог
        Element alarms = (Element) placementZone.getElementsByTagName("alarms").item(0);
        NodeList alarmList = alarms.getElementsByTagName("alarm");
        List<MyRectangle> alarmRectangles = new ArrayList<>();
        for (int i = 0; i < alarmList.getLength(); i++) {
            Element alarm = (Element) alarmList.item(i);
            Element minPointAlarm = (Element) alarm.getElementsByTagName("min_point").item(0);
            Element maxPointAlarm = (Element) alarm.getElementsByTagName("max_point").item(0);
            int minXAlarm = Integer.parseInt(minPointAlarm.getAttribute("x"));
            int minYAlarm = Integer.parseInt(minPointAlarm.getAttribute("y"));
            int maxXAlarm = Integer.parseInt(maxPointAlarm.getAttribute("x"));
            int maxYAlarm = Integer.parseInt(maxPointAlarm.getAttribute("y"));
            MyRectangle alarmRect = new MyRectangle(minXAlarm, minYAlarm, maxXAlarm, maxYAlarm);
            alarmRectangles.add(alarmRect);
        }
        return alarmRectangles;
    }
}
