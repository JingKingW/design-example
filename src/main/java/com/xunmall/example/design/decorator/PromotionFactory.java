package com.xunmall.example.design.decorator;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:40
 */
public class PromotionFactory {

    public static BigDecimal getPayMoney(OrderDetail orderDetail){
        Map<PromotionType, SupportPromotions> supportPromotionsMap = orderDetail.getMerchandise().getSupportPromotions();
        IBaseCount baseCount = new BaseCount();
        if (supportPromotionsMap != null && supportPromotionsMap.size() >0){
            for (PromotionType promotionType : supportPromotionsMap.keySet()){
                baseCount = protmotion(supportPromotionsMap.get(promotionType),baseCount);
            }
        }
        return  baseCount.countPayMoney(orderDetail);
    }


    private static IBaseCount protmotion(SupportPromotions promotions,IBaseCount baseCount){
        if(promotions.getPromotionType() == PromotionType.COUPON){
            baseCount = new CouponDecorator(baseCount);
        }else if (promotions.getPromotionType() == PromotionType.REDPACKED){
            baseCount = new RedPacketDecorator(baseCount);
        }
        return baseCount;
    }

}
