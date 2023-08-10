package org.example.JAXP;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;


public class Reading {
    @SneakyThrows
    public static @NotNull Document main() {
        Scanner in = new Scanner(System.in);
        System.out.print(
                new StringBuilder().append("Необходимо указать расположение файла, с расширением:\n")
                        .append("Пример:c:/input.xml\n")
                        .toString());
        String src = in.nextLine();

        File inputFile = new File("C:\\IDEA_project\\Test_Gorel\\src\\main\\java\\res\\ToInput.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(src);
        doc.getDocumentElement()
                .normalize();
        return doc;
    }
}
