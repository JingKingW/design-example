package com.xunmall.example.design.decorator;

import java.math.BigDecimal;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:21
 */
public class BaseCountDecorator implements IBaseCount {

    private IBaseCount baseCount;

    public BaseCountDecorator(IBaseCount count){
        this.baseCount = count;
    }

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        BigDecimal payTotalMoney = new BigDecimal(0);
        if (baseCount != null){
            payTotalMoney = baseCount.countPayMoney(orderDetail);
        }
        return payTotalMoney;
    }
}
