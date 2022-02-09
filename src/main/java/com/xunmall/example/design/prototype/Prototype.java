package com.xunmall.example.design.prototype;

/**
 * @author wangyj03@zenmen.com
 * @description 原型模式
 * @date 2021/7/16 17:01
 */
public class Prototype implements Cloneable {

    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return prototype;
    }
}
