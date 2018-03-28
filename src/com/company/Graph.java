package com.company;

import java.util.*;

public class Graph {
    private ArrayList<Node> nodes;
    private LinkedList<DirectedEdge> edges;

    public Graph() {
        nodes = new ArrayList<>();
        edges = new LinkedList<>();
    }

    public void addNode(Node n){
        nodes.add(n);
    }
    public Node getRandomNode(){
        Random r = new Random();
        int x = r.nextInt(nodes.size());
        return nodes.get(x);
    }

}
