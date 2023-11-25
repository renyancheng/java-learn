package com.mufeng.test.data;

public class TreeNode {
    private int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getVal() {
        return val;
    }

    /*public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n1 = new TreeNode(1, n3, n4);
        TreeNode n2 = new TreeNode(2, n5, n6);
        TreeNode root = new TreeNode(1, n1, n2);
        System.out.println(root.getLeft().getLeft().getVal()); //3
        TreeNode n7 = new TreeNode(7);
        // 插入n7节点：将n1节点指向n7，并且将n7指针指向n3
        n1.left = n7;
        n7.left = n3;
        System.out.println(root.getLeft().getLeft().getLeft().getVal()); //3
        n1.left = n3; // 从树上删除n7节点
        System.out.println(root.getLeft().getLeft().getVal()); //3
        *//*  此时的树为这样：
        *             root(0)
        *      n1(1)             n2(2)
        *   n3(3)  n4(4)      n5(5)  n6(6)
        *
        *//*
    }*/
}
