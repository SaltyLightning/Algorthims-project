package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Graph zachs = GenerateZachsGraph();
        if (zachs.edgeCount() == 0){
            System.out.println("Failed to initialize Zachary's karate graph. Exiting...");
            System.exit(1);
        }
        else {

        }
    }

    private static Graph GenerateZachsGraph() {
        Graph g = new Graph();
        try {
            File inputFile = new File("ZacharysKarateCllub\\zachary.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("node");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                org.w3c.dom.Node nNode = nList.item(temp);
                    Element eElement = (Element) nNode;
                    g.addNode(new Node(Integer.parseInt(eElement.getAttribute("id"))));
            }

            nList = doc.getElementsByTagName("link");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                org.w3c.dom.Node nNode = nList.item(temp);
                Element eElement = (Element) nNode;
                Node origin = new Node(Integer.parseInt(eElement.getAttribute("source")));
                Node target = new Node(Integer.parseInt(eElement.getAttribute("target")));
                int value = Integer.parseInt(eElement.getAttribute("value"));
                g.addEdge(new DirectedEdge(origin, target, value));
            }
            for (int i = 0; i < 50; i++) {
                System.out.println("Current edge:" + g.getEdge(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }
}
