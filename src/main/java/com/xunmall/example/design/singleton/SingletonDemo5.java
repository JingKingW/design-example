package com.xunmall.example.design.singleton;

/**
 * @Description: 枚举模式单例
 * @author: WangYanjing
 * @date: 2020年06月10日 13:18
 */
public enum SingletonDemo5 {
    INSTANCE;

    public void doSomething() {
        System.out.println("doSomething");
    }
}
