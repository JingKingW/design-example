package com.xunmall.example.design.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:48
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        init(order);
        for (OrderDetail orderDetail : order.getList()) {
            BigDecimal payMoney = PromotionFactory.getPayMoney(orderDetail);
            orderDetail.setPayMoney(payMoney);
            System.out.println("最终支付的金额:" + orderDetail.getPayMoney());
        }

    }

    private static void init(Order order) {
        order.setId(100);
        order.setOrderNo("NO100");
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(1001);
        orderDetail.setOrderId(100);
        Merchandise merchandise = new Merchandise();
        merchandise.setSku("IPad");
        merchandise.setName("IPad Pro");
        merchandise.setPrice(new BigDecimal(2300));
        SupportPromotions supportPromotions = new SupportPromotions();
        supportPromotions.setId(10);
        supportPromotions.setPriority(5);
        supportPromotions.setPromotionType(PromotionType.COUPON);
        UserCoupon userCoupon = new UserCoupon();
        userCoupon.setId(1);
        userCoupon.setSku("IPad");
        userCoupon.setUserId(123);
        userCoupon.setCoupon(new BigDecimal(500));
        supportPromotions.setUserCoupon(userCoupon);
        SupportPromotions supportPromotions2 = new SupportPromotions();
        supportPromotions2.setId(20);
        supportPromotions2.setPriority(15);
        supportPromotions2.setPromotionType(PromotionType.REDPACKED);
        UserRedPacket userRedPacket = new UserRedPacket();
        userRedPacket.setId(2);
        userRedPacket.setSku("IPad");
        userRedPacket.setUserId(123);
        userRedPacket.setRedPacket(new BigDecimal(200));
        supportPromotions2.setUserRedPacket(userRedPacket);
        Map<PromotionType, SupportPromotions> map = new HashMap<>();
        map.put(PromotionType.COUPON, supportPromotions);
        map.put(PromotionType.REDPACKED, supportPromotions2);
        merchandise.setSupportPromotions(map);
        orderDetail.setMerchandise(merchandise);
        List<OrderDetail> orderDetails = new ArrayList<>();
        orderDetails.add(orderDetail);
        order.setList(orderDetails);
    }
}
