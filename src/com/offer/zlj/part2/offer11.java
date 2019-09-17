package com.offer.zlj.part2;

public class offer11 {


    public static void main(String[] args) {
        offer11(new int[]{3, 4, 5, 1, 2});
    }

    /**
     * 剑指offer面试题11 旋转数组中的最小数字
     * [3,4,5,1,2] => 1
     */
    public static int offer11(int[] array) {
        if (null == array || array.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while (array[index1] >= array[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;

            if (array[index1] == array[index2] && array[indexMid] == array[index1]) {
                return minInOrder(array, index1, index2);
            }

            if (array[indexMid] >= array[index1]) {
                index1 = indexMid;
            } else if (array[indexMid] <= array[index2]) {
                index2 = indexMid;
            }
        }
        return array[indexMid];
    }

    /**
     * 当数组中第一个数 最后一个数 中间的数都相等时，无法判断最小数字在哪，只能采取循环遍历
     *
     * @return min
     */
    private static int minInOrder(int[] array, int index1, int index2) {
        int result = array[index1];
        for (int i = index1 + 1; i <= index2; ++i) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}
