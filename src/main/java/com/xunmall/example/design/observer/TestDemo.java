package com.xunmall.example.design.observer;

/**
 *
 * @author yanjing_wang
 * @date 2017/4/27
 */
public class TestDemo {

    public static void main(String[] args){
        House house = new House(3000);
        ObservancePeirce ob1 = new ObservancePeirce();
        ObservancePeirce ob2 = new ObservancePeirce();
        ObservancePeirce ob3 = new ObservancePeirce();
        house.addObserver(ob1);
        house.addObserver(ob2);
        house.addObserver(ob3);
        house.setPrice(2000);
    }
}
