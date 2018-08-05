package com.feng.jia;

import com.feng.jia.commom.XLinkedList;
import com.feng.jia.model.Node;

import java.util.Stack;

/**
 * stack 是线程安全的，效率低下
 */
public class RevertPrintLinkedList {

    public static void main(String[] args) {

        Node list = XLinkedList.getXLinkedList();
        revertByStack(list);
        revertByRecurrent(list);
    }

    private static void revertByRecurrent(Node list) {

        if(list==null){
            return;
        }

        revertByStack(list.getNext());

        System.out.println(list.getValue());
    }

    private static void revertByStack(Node list) {

        if(list==null){
            return;
        }

        Stack<Node> stack = new Stack();
        Node node = list;
        while(node!=null){
            stack.push(node);
            node = node.getNext();
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop().getValue());
        }
    }


}
