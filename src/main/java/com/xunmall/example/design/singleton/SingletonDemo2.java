package com.xunmall.example.design.singleton;

/**
 * 功能描述: 双重锁检查机制下懒汉模式 特别不推荐使用
 *
 * @params:
 * @return:
 * @Author: wangyanjing
 * @Date: 2019/5/6 13:15
 **/
public class SingletonDemo2 {

    private SingletonDemo2() {
        System.out.println("SingletonDemo2 created!");
    }

    private static volatile SingletonDemo2 singletonDemo2 = null;

    public static SingletonDemo2 getInstance() {
        if (singletonDemo2 == null) {
            synchronized (SingletonDemo2.class) {
                if (singletonDemo2 == null) {
                    singletonDemo2 = new SingletonDemo2();
                }
            }
        }
        return singletonDemo2;
    }
}
