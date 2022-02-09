package com.xunmall.example.design.proxy.jdk;

/**
 *
 * @author Eugene
 * @date 2017/2/14
 */
public class DbQuery implements IDBQuery {

    @Override
    public void requestMq(String message) {
        System.out.println("Say Hello " + message);
    }
}
