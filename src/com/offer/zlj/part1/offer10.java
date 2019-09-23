package com.offer.zlj.part1;

//求斐波那契数列
public class offer10 {

    public static void main(String args[]) {
        System.out.println(fb2(10));
    }


    //最原始的递归实现，但随着i的增大,时间会剧增. 不推荐
    public static int fb1(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fb1(i - 1) + fb1(i - 2);
    }


    //循环求 时间复杂度 O(n)
    public static int fb2(int num) {
        int zero = 0;
        int one = 1;
        int result = 0;

        if (num == 0) {
            return zero;
        }
        if (num == 1) {
            return one;
        }

        for (int i = 2; i <= num; i++) {
            result = zero + one;
            zero = one;
            one = result;
        }

        return result;
    }


    //🐸青蛙跳台阶
    public static int frog(int n){

        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }

        int result = 0;
        int first = 1;
        int second = 2;

        for (int i = 3; i <=n ; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

}
