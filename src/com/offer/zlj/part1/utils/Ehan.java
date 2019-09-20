package com.offer.zlj.part1.utils;


//饿汉模式 线程安全、耗费资源
public class Ehan {

    public static final Ehan e = new Ehan();

    public static Ehan getInstance(){
        return e;
    }

    public Ehan() {
    }
}
