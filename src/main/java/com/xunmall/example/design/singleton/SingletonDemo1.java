package com.xunmall.example.design.singleton;

/**
 * 功能描述: 饿汉模式单例
 *
 * @params:
 * @return:
 * @Author: wangyanjing
 * @Date: 2019/5/6 13:15
 **/
public class SingletonDemo1 {

    private SingletonDemo1() {
        System.out.println("SingletonDemo1 created!");
    }

    private static SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return singletonDemo1;
    }
}
