package com.offer.zlj.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class offer3 {


    public static void main(String[] args) {
        int[] offer3 = new int[]{2, 3, 4, 5, 2, 3};
        System.out.println(offer3(offer3));
    }

    /**
     * 剑指offer面试题3 数组中重复的数字
     * [2,3,1,0,2,5,3] => 2/3
     */
    private static boolean offer3(int[] array) {
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
}
