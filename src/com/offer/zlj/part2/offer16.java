package com.offer.zlj.part2;

//数值的整数乘方
public class offer16 {

    public static void main(String args[]){
        System.out.println(power(5,-1));
    }


    private static double power(double base,int power){
        if (equal(base,0)){
            return 0;
        }

        if (power==0){
            return 1;
        }

        if (power>0){
            return num(base, power);
        }else {
            return num(1 / base, -power);
        }

    }

    private static double num(double base,int power){
        double result = 1.0;
        for (int i = 1; i <=power ; i++) {
            result = result * base;
        }

        return result;
    }



    //判断两个double类型的值是否相等
    private static boolean equal(double a, double b) {
        if(a-b<0.000001&&a-b>-0.000001) {
            //若a-b的差极小  则认为两个值相等  返回true
            return true;
        }
        //否则，返回false
        return false;
    }


}
