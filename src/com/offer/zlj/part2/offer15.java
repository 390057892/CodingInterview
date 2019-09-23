package com.offer.zlj.part2;


//二进制中1的个数
public class offer15 {

    public static void main(String args[]) {
        System.out.println("二进制中1的个数为" + numOfOne(12));
    }


    /**
     * 思路  把一个整数减去1，在和原整数做与运算，会把该整数最右边的1变为0
     * 那么一个整数的二进制表示中有多少个1，就要进行多少次这种操作
     *
     * 例如：原数12转二进制为1100，减去1后变为1011，再与原数1100相与，得到1000，最后一位1变为0
     * 再对1000做同样操作  1000与0111相与 得到0 只做了两次操作 所以结果为2
     */
    private static int numOfOne(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }

        return count;
    }


}
