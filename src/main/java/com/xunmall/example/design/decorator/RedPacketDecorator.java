package com.xunmall.example.design.decorator;

import java.math.BigDecimal;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:31
 */
public class RedPacketDecorator extends BaseCountDecorator{
    public RedPacketDecorator(IBaseCount count) {
        super(count);
    }

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail){
        BigDecimal payTotalMoney = new BigDecimal(0);
        payTotalMoney = super.countPayMoney(orderDetail);
        payTotalMoney = countRedpacketPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal countRedpacketPayMoney(OrderDetail orderDetail){
        BigDecimal redPacket = orderDetail.getMerchandise().getSupportPromotions().get(PromotionType.REDPACKED).getUserRedPacket().getRedPacket();
        System.out.println("红包金额" + redPacket);
        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));
        return  orderDetail.getPayMoney();
    }
}
