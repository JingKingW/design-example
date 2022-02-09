package com.xunmall.example.design.decorator;

import java.math.BigDecimal;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:13
 */
public class UserRedPacket {

    private int id;
    private int userId;
    private String sku;
    private BigDecimal redPacket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getRedPacket() {
        return redPacket;
    }

    public void setRedPacket(BigDecimal redPacket) {
        this.redPacket = redPacket;
    }
}
