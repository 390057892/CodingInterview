package com.offer.zlj.utils;


//懒汉模式
public class Lhan {

    public static Lhan instance;

//    public static Lhan getInstance(){ //线程不安全
//        if (instance==null){
//            instance = new Lhan();
//        }
//        return instance;
//    }

//    public synchronized static Lhan getInstance(){ //线程安全 一个线程获取了该方法，其他线程必须等待，消耗资源
//        if (instance==null){
//            instance = new Lhan();
//        }
//        return instance;
//    }

    public static Lhan getInstance() { //线程安全 双重锁
        if (instance == null) {
            synchronized (Lhan.class) {
                instance = new Lhan();
            }
        }
        return instance;
    }

    public Lhan() {
    }
}
