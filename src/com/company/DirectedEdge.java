package com.company;

public class DirectedEdge {
    private Node sourceNode;

    public Node getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(Node targetNode) {
        this.targetNode = targetNode;
    }

    private Node targetNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public DirectedEdge(Node sourceNode, Node targetNode, int value) {
        this.sourceNode = sourceNode;
        this.targetNode = targetNode;
        this.value = value;
    }

    public Node getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(Node sourceNode) {
        this.sourceNode = sourceNode;
    }

    @Override
    public String toString() {
        return "DirectedEdge{" +
                "sourceNode=" + sourceNode +
                ", targetNode=" + targetNode +
                ", value=" + value +
                '}';
    }
}
