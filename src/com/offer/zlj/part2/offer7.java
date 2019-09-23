package com.offer.zlj.part2;

import java.util.Arrays;


public class offer7 {


    public static void main(String[] args) {
        TreeNode tree = offer7(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});
        lastOrder(tree);
    }


    /**
     * 重建二叉树
     * 根据前序遍历与中序遍历
     */
    public static TreeNode offer7(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null || preOrder.length == 0 ||
                inOrder.length == 0 || preOrder.length != inOrder.length) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preOrder[0]); //根节点为前序遍历的第一个
        for (int i = 0; i < preOrder.length; i++) {
            if (preOrder[0] == inOrder[i]) {
                treeNode.left = offer7(Arrays.copyOfRange(preOrder, 1, 1 + i),                                       Arrays.copyOfRange(inOrder, 0, i));
                treeNode.right = offer7(Arrays.copyOfRange(preOrder, 1 + i,                                             preOrder.length), Arrays.copyOfRange(inOrder, i+1, inOrder.length));
            }
        }

        return treeNode;
    }


    //递归求出后续遍历去验证
    public static void lastOrder(TreeNode treeNode){
        if (treeNode!=null){
            lastOrder(treeNode.left);
            lastOrder(treeNode.right);
            System.out.println(treeNode.data);
        }
    }


    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }


}
