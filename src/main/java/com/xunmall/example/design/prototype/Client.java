package com.xunmall.example.design.prototype;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/16 17:10
 */
public class Client {

    public static void main(String[] args) {
        ConcreatePrototype concreatePrototype = new ConcreatePrototype();
        for (int i =0; i < 10; i++){
            ConcreatePrototype clone = (ConcreatePrototype) concreatePrototype.clone();
            clone.show();
        }
    }

}

