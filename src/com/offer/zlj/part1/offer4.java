package com.offer.zlj.part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class offer4 {


    public static void main(String[] args) {
        int[][] offer4=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(offer4(offer4, 10));
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

}
