package com.offer.zlj.part1;


import java.util.ArrayList;

public class offer6 {


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(offer6(node1));
    }


    /**
     * 输入一个链表的头节点，从尾到头打印每个节点的值
     */
    public static ArrayList<Integer> offer6(ListNode listNode){
        if (listNode==null){
            return new ArrayList<>();
        }
        ListNode head = listNode;
        ListNode cur = listNode.next;
        ListNode temp;
        while (cur!=null){
            temp = cur.next;
            cur.next = head;
            head = cur;
            cur = temp;
        }

        listNode.next = null;

        ArrayList<Integer> res = new ArrayList<>();
        while (head!=null){
            res.add(head.val);
            head = head.next;
        }
        return res;
    }


    public static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
