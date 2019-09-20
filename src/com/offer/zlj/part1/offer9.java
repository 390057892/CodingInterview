package com.offer.zlj.part1;

import java.util.Stack;

//将该类作为一个队列
public class offer9 {

    public static void main(String args[]){
        test();
    }

    /**
     * 两个栈建立队列
     */
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void test(){
        offer9 offer9 = new offer9();
        offer9.push(7);
        offer9.push(8);
        offer9.push(9);
        System.out.println("输出stack1的内容："+stack1);
        System.out.println("输出stack2的内容："+stack2);

        try {
            System.out.println(offer9.pop());
            System.out.println(offer9.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }

        offer9.push(10);
        System.out.println("输出stack1的内容："+stack1);
        System.out.println("输出stack2的内容："+stack2);

        try {
            System.out.println(offer9.pop());
            System.out.println(offer9.pop());
            System.out.println(offer9.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //进栈
    public void push(int i){
        stack1.push(i);
    }

    //出栈 删除头部元素
    public int pop()throws Exception{
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw new Exception("栈为空");
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
