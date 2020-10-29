package com.xmltest.parsing;

import com.xmltest.geometry.Point;
import com.xmltest.geometry.Road;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    public static void parse (File file) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = factory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            getRoads(doc);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Point> getPoints(Document doc) throws IOException {
        NodeList pointList = doc.getElementsByTagName("node");
        ArrayList<Point> nodes = new ArrayList<>();
        return nodes;
    }
    private static ArrayList<Road> getRoads(Document doc) throws IOException {
        try {
            NodeList nodeList = doc.getElementsByTagName("way");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node road = nodeList.item(i);
                Element eRoad = (Element) road;
                NodeList subNodes = ((Element) road).getElementsByTagName("tag");
                /* temporary work checker */
                boolean isRoad = false;
                for (int j = 0; j < subNodes.getLength(); j++) {
                    Node subNode = subNodes.item(j);
                    if (subNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eSubNode = (Element) subNode;
                        String attribute1 = eSubNode.getAttribute("k");
                        String attribute2 = eSubNode.getAttribute("v");
                        if (attribute1.equals("highway")) {
                            isRoad = true;
                        }
                        if (attribute1.equals("name") && isRoad) {
                            System.out.println(attribute2);
                        }
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Road> roads = new ArrayList<>();
        return roads;
    }
}