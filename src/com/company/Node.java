package com.company;

import java.util.ArrayList;

public class Node {
    public ArrayList<Node> incomingEdges;
    public ArrayList<Node> outgoingEdges;

    public Node(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    @Override
    public String toString() {
        return "Node{" +
                "num=" + num +
                '}';
    }
}
