package com.xunmall.example.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author yanjing_wang
 * @date 2017/4/27
 */
public class ObservancePeirce implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof House){
            System.out.println("房价跌了：" + arg);
        }
    }
}
