package com.xunmall.example.design.decorator;

import java.math.BigDecimal;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:18
 */
public class BaseCount implements IBaseCount {
    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        orderDetail.setPayMoney(orderDetail.getMerchandise().getPrice());
        System.out.println("商品的原来单价金额：" + orderDetail.getPayMoney());
        return orderDetail.getPayMoney();
    }
}
