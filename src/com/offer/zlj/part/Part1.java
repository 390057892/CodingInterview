package com.offer.zlj.part;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 第一章
 */
public class Part1 {


    public static void main(String[] args) {


//        int[] offer3 = new int[]{2, 3, 4, 5, 2, 3};
//        System.out.println(offer3(offer3));

//        int[][] offer4=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(Part1.offer4(offer4, 10));

        System.out.println(offer5("we need money  "));
    }


    /**
     * 赋值运算函数
     */
    public static void  offer1(){

    }

    /**
     * 实现单例
     */
    public static void  offer2(){

    }

    /**
     * 剑指offer面试题3 数组中重复的数字
     * [2,3,1,0,2,5,3] => 2/3
     */
    public static boolean offer3(int[] array) {
        if(null==array||array.length==0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>(); //存放重复数字集合
        for (int anArray : array) {
            if (!set.add(anArray)) {
                list.add(anArray);
            }
        }
        return list.size() > 0;
    }


    /**
     * 剑指offer面试题4 二维数组查找
     * array[][] 二维递增数组 target 目标数字
     * return 是否包含目标数字
     */
    public static boolean offer4(int[][] array, int target) {
        if (null == array || array.length == 0) {
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] > target) {
                col--;
            } else if (array[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }


    /**
     * 替换空格
     */
    public static String offer5(String text) {
        if (null==text||text.length()==0){
            return "";
        }
        char[] chars = text.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                count++;
            }
        }
        char[] target = new char[chars.length + 2 * count];
        int i = chars.length - 1; //原始字符串末尾
        int j = chars.length + 2 * count - 1; //新字符串末尾位置
        while (i>=0){
            if (chars[i]==' '){
                target[j] = '0';
                target[j - 1] = '2';
                target[j - 2] = '%';
                j = j - 3;
            }else {
                target[j] = chars[i];
                j--;
            }

            i--;
        }

        return new String(target);
    }


    /**
     * 输入一个链表的头节点，从尾到头打印每个节点的值
     */

}
