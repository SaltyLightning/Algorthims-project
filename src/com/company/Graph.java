package com.company;

import java.util.*;

public class Graph {
    private ArrayList<Node> nodes;
    private ArrayList<DirectedEdge> edges;

    public Graph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addNode(Node n){
        nodes.add(n);
    }

    public void addEdge(DirectedEdge e){
        edges.add(e);
    }
    public Node getRandomNode(){
        Random r = new Random();
        int x = r.nextInt(nodes.size());
        return nodes.get(x);
    }

    public Node getNodeById(int i){
        return nodes.get(0);
    }

    public DirectedEdge getEdge(int index){
        return edges.get(index);
    }

    public int nodeCount(){
        return nodes.size();
    }

    public int edgeCount(){
        return edges.size();
    }
}
