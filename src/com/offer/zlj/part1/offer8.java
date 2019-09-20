package com.offer.zlj.part1;

public class offer8 {

    public static void main(String args[]){

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        t5.left = t8;
        t5.right = t9;

        t8.parent = t5;
        t9.parent = t5;

        t5.parent = t2;
        t4.parent = t2;

        t6.parent = t3;
        t7.parent = t3;

        t2.parent = t1;
        t3.parent = t1;

        try {
            System.out.println(getNext(t5).val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static TreeNode getNext (TreeNode tree)throws Exception{
        if (tree==null){
            throw new Exception("输入节点为空");
        }
        if (tree.right!=null){ //如果有右节点，说明这是个根节点，中序遍历下一个为它右子树的最左子节点
            tree = tree.right;
            while (tree.left!=null){
                tree = tree.left;
            }
            return tree;
        }

        //无右节点,则中序遍历的下个节点为父节点
        while (tree.parent!=null) {
            if (tree.parent.left==tree) {
                return tree.parent;
            }
            tree = tree.parent;
        }
        throw new Exception("无下一个节点");
    }


    public static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
