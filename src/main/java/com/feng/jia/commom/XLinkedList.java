package com.feng.jia.commom;

import com.feng.jia.model.Node;

public class XLinkedList {

    public static Node getXLinkedList(){

        Node node = new Node(5, null);
        Node node1 = new Node(4, node);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(2, node2);
        Node node4 = new Node(1, node3);
        return node4;
    }
}
