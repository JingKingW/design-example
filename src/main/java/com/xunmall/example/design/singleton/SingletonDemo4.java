package com.xunmall.example.design.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: WangYanjing
 * @Date: 2019/5/6 13:40
 * @Description:
 */
public class SingletonDemo4 {

    private static final AtomicReference<SingletonDemo4> INSTANCE = new AtomicReference<SingletonDemo4>();

    private SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance() {
        for (; ; ) {
            SingletonDemo4 singleton = INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }
            singleton = new SingletonDemo4();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }

}
