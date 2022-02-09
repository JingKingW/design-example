package com.xunmall.example.design.observer;

import java.util.Observable;

/**
 *
 * @author yanjing_wang
 * @date 2017/4/27
 */
public class House extends Observable {

    private double price;

    public House(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price > price){
            super.setChanged();
            super.notifyObservers(price);
        }
        this.price = price;
    }
}
