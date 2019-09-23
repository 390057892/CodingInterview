package com.offer.zlj.part3;


public class offer18 {

    public static void main(String args[]){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("删除前的链表：");
        printList(node1);
        deleteNode(node1, node1);

        System.out.println("\n删除后的链表：");
        printList(node1);
    }

    
    private static void deleteNode(ListNode headNode,ListNode deleteNode){
        if (headNode==null||deleteNode==null){
            return;
        }
        if (deleteNode.next!=null){ //要删除的不是尾结点
            deleteNode.val = deleteNode.next.val;
            deleteNode.next = deleteNode.next.next;
        }else if (deleteNode==headNode){ //只有一个节点
            headNode = null;
        }else { //删除尾节点
            ListNode node = headNode;
            while (node.next!=deleteNode){
                node = node.next;
            }
            node.next = null;
        }
    }


    public static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public  static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }
    }

}
