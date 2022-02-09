package com.xunmall.example.design.singleton;

import java.io.Serializable;

/**
 * 功能描述: 该解决方案的根本就在于：利用classloder的机制来保证初始化instance时只有一个线程。
 * JVM在类初始化阶段会获取一个锁，这个锁可以同步多个线程对同一个类的初始化
 *
 * @params:
 * @return:
 * @Author: wangyanjing
 * @Date: 2019/5/6 13:15
 **/
public class SingletonDemo3 implements Serializable {

    private SingletonDemo3() {
        System.out.println("SingletonDemo3 created!");
    }

    public static SingletonDemo3 getInstance() {
        return SingletonFactory.buildInstance;
    }

    private static class SingletonFactory {
        private static SingletonDemo3 buildInstance = new SingletonDemo3();
    }
}

