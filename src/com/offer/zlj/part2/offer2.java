package com.offer.zlj.part2;


import com.offer.zlj.utils.Ehan;
import com.offer.zlj.utils.Lhan;

public class offer2 {


    public static void main(String[] args) {
        offer2();
    }

    /**
     * 实现单例
     */
    public static void  offer2(){
        Ehan ehan = Ehan.getInstance(); //饿汉
        Lhan lhan = Lhan.getInstance(); //懒汉
    }



}
