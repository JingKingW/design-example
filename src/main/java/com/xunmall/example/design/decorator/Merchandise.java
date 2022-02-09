package com.xunmall.example.design.decorator;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:09
 */
public class Merchandise {

    private String sku;
    private String name;
    private BigDecimal price;
    private Map<PromotionType,SupportPromotions> supportPromotions;

    @Override
    public String toString() {
        return "Merchandise{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supportPromotions=" + supportPromotions +
                '}';
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Map<PromotionType, SupportPromotions> getSupportPromotions() {
        return supportPromotions;
    }

    public void setSupportPromotions(Map<PromotionType, SupportPromotions> supportPromotions) {
        this.supportPromotions = supportPromotions;
    }
}
