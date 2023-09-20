package com.mufeng.test.data;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversal {

    public static ArrayList<Integer> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n1 = new TreeNode(1, n3, n4);
        TreeNode n2 = new TreeNode(2, n5, n6);
        TreeNode root = new TreeNode(0, n1, n2);
        System.out.println(levelOrder(root)); // [0，1，2，3，4，5，6]
//        preOrder(root); // [0, 1, 3, 4, 2, 5, 6]
//        inOrder(root); // [1, 3, 4, 0, 2, 5, 6]
        postOrder(root); // [1, 3, 4, 2, 5, 6, 0]
        System.out.println(list);
    }

    // 层序遍历
    public static List<Integer> levelOrder(TreeNode root) {
        // 首先创建一个队列，用于保存节点
        Queue<TreeNode> queue = new LinkedList<>();
        // 将根节点添加至队列
        queue.add(root);
        // 然后新建一个列表，用于保存每个节点的值
        LinkedList<Integer> list = new LinkedList<>();
        // 如果队列不为空，就一直循环
        while (!queue.isEmpty()) {
            // 现在在循环中
            // 将先进的节点出队，获取该节点
            TreeNode node = queue.poll();
            // 并将该节点的值添加到列表中
            list.add(node.getVal());
            // 如果节点有左节点，那么将其添加至队列，并参与下次循环
            if (node.left != null) {
                queue.offer(node.left);
            }
            // 如果节点有右节点，那么将其添加至队列，并参与下下次循环
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        // 循环结束，遍历完成二叉树上所有节点并全部添加至列表中，返回该列表
        return list;
    }

    // 前序排序
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        list.add(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    // 中序排序
    public static void inOrder(TreeNode root) {
        if (root == null) return;
        preOrder(root.getLeft());
        list.add(root.getVal());
        preOrder(root.getRight());
    }

    // 后序排序
    public static void postOrder(TreeNode root) {
        if (root == null) return;
        preOrder(root.getLeft());
        preOrder(root.getRight());
        list.add(root.getVal());
    }

    // 主要说函数迭代，不同的地方在于添加值的时机不同
}
