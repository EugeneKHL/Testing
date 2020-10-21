package com.xmltest.parsing;

import com.xmltest.geometry.Point;
import com.xmltest.geometry.Road;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    public void parse (File file) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = factory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
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
        NodeList nodeList = doc.getElementsByTagName("way");
        ArrayList<Road> roads = new ArrayList<>();
        return roads;
    }
}