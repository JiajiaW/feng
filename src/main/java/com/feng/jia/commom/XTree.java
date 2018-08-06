package com.feng.jia.commom;

import com.feng.jia.model.TreeNode;
import com.google.common.collect.Lists;

import java.util.List;

public class XTree {

    public static List<TreeNode> getFirstSequeue() {

        return getSequeue(1, 2, 4, 7, 3, 5, 6, 8);
    }

    public static List<TreeNode> getMidSequeue(){
        return getSequeue(4, 7, 2, 1, 5, 3, 8, 6);
    }

    private static List<TreeNode> getSequeue(int... a) {

        List<TreeNode> list = Lists.newArrayList();

        for(int i : a){
            list.add(new TreeNode(i, null, null));
        }

        return list;
    }
}
