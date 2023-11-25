package com.mufeng.test.data;

import java.util.ArrayList;

public class TreeNodeByArray {
    private ArrayList<Integer> tree;

    public TreeNodeByArray(ArrayList<Integer> array) {
        tree = new ArrayList<>(array);
    }
    public int size() {
        return tree.size();
    }

    public Integer getVal(int index) {
        if (index < 0 || index > size()) {
            return null;
        }
        return tree.get(index);
    }

    public Integer getLeftIndex(int index) {
        return index * 2 + 1;
    }

    public Integer getRightIndex(int index) {
        return index * 2 + 2;
    }

    public Integer getParentIndex(int index) {
        return (index - 1) / 2;
    }

    public void dfs(Integer index, String order, ArrayList<Integer> res) {
        if (getVal(index) == null) return;
        if (order == "pre") {
            res.add(getVal(index));
            dfs(getLeftIndex(index), order, res);
        }
        if (order == "in") {
            dfs(getRightIndex(index), order, res);
            res.add(getVal(index));
        }
        if (order == "post") {
            res.add(getVal(index));
        }
    }

    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0, "pre", res);
        return res;
    }

    public ArrayList<Integer> inOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0, "in", res);
        return res;
    }
    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0, "post", res);
        return res;
    }

}
