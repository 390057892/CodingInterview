package com.offer.zlj.part3;


public class offer18 {

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node7 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node7;
        node7.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println("删除前的链表：");
        printList(node1);
//        deleteNode(node1, node1);
        deleteNode2(node1);

        System.out.println("\n删除后的链表：");
        printList(node1);
    }

    //删除链表的节点
    private static void deleteNode(ListNode headNode, ListNode deleteNode) {
        if (headNode == null || deleteNode == null) {
            return;
        }
        if (deleteNode.next != null) { //要删除的不是尾结点
            deleteNode.val = deleteNode.next.val;
            deleteNode.next = deleteNode.next.next;
        } else if (deleteNode == headNode) { //只有一个节点
            headNode = null;
        } else { //删除尾节点
            ListNode node = headNode;
            while (node.next != deleteNode) {
                node = node.next;
            }
            node.next = null;
        }
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }
    }


    //扩展 删除链表重复的节点
    private static void deleteNode2(ListNode headNode) {
//        if (headNode == null) {
//            return ;
//        }
//        ListNode preNode = headNode;
//        ListNode curNode = headNode;
//        ListNode nextNode = curNode.next;
//        while (curNode.next != null) {
//
//            if (curNode.val != nextNode.val) {
//                if (nextNode.next!=null) {
//                    curNode = curNode.next;
//                    nextNode = curNode.next;
//                }else {
//                    preNode = preNode.next;
//                    curNode = preNode.next;
//                    nextNode = curNode.next;
//                }
//            } else {
//                if (nextNode.next != null) {
//                    curNode = nextNode.next;
//                    nextNode = curNode.next;
//                } else {
//                    //尾节点重复
//                    curNode.next = null;
//                }
//            }
//        }

        ListNode first = new ListNode(-1);
        first.next = headNode;
        ListNode last = first;
        ListNode p = headNode;
        while(p!=null&&p.next!=null){
            if(p.val==p.next.val){
                int val = p.val;
                while(p!=null&&p.val==val){
                    p = p.next;
                    last.next = p;
                }
            }else{
                last = p;
                p = p.next;
            }
        }
    }

}
