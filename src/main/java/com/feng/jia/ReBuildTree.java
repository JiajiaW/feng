package com.feng.jia;

import com.feng.jia.commom.XTree;
import com.feng.jia.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * 非递归的方法没有想过
 */
public class ReBuildTree {

    public static void main(String[] args) {

        List<TreeNode> firstSequeue = XTree.getFirstSequeue();
        List<TreeNode> midSequeue = XTree.getMidSequeue();

        TreeNode root = rebulidTree(firstSequeue, midSequeue);
        TreeNode rootNew = rebulidTreeByNonRecursion(firstSequeue, midSequeue);
        System.out.println(root);
    }

    private static TreeNode rebulidTreeByNonRecursion(List<TreeNode> firstSequeue, List<TreeNode> midSequeue) {

        if(firstSequeue==null || firstSequeue.isEmpty() ||
            midSequeue==null || midSequeue.isEmpty() ||
                firstSequeue.size()!=midSequeue.size()){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(firstSequeue.get(0));
        while(!stack.isEmpty()){
            //设置左孩子
            //设置右孩子
        }
        Deque<TreeNode> rootDeque = new ArrayDeque<>();
        rootDeque.addFirst(firstSequeue.get(0));
        return null;
    }

    private static TreeNode rebulidTree(List<TreeNode> firstSequeue, List<TreeNode> midSequeue) {


        if(firstSequeue==null || firstSequeue.isEmpty() ||
                midSequeue==null || midSequeue.isEmpty() ||
                firstSequeue.size()!= midSequeue.size()){
            return null;
        }

        if(firstSequeue.size()==1){
            return firstSequeue.get(0);
        }

        TreeNode root = firstSequeue.get(0);
        int index = getIndex(midSequeue, firstSequeue.get(0));
        root.setLeft(rebulidTree(firstSequeue.subList(1, index+1), midSequeue.subList(0, index)));
        root.setRight(rebulidTree(firstSequeue.subList(index+1, firstSequeue.size()),
                midSequeue.subList(index+1, midSequeue.size())));
        return root;

    }

    private static int getIndex(List<TreeNode> midSequeue, TreeNode node) {

        int index = 0;
        for(;index<midSequeue.size(); index++) {
            if (node.getValue() == midSequeue.get(index).getValue()){
                return index;
            }
        }

        throw new IllegalArgumentException("参数错误");
    }
}
