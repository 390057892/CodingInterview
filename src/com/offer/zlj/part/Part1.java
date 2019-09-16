package com.offer.zlj.part;

public class Part1 {

    /**
     * 剑指offer面试题3 数组中重复的数字
     * [2,3,1,0,2,5,3] => 2/3
     */
    public static int offer3(int[] array) {

        return 0;
    }


    /**
     * 剑指offer面试题4 二维数组查找
     * array[][] 二维递增数组 target 目标数字
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
