package com.company;

public class Node {
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
