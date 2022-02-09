package com.xunmall.example.design.strategy;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2020/12/22 10:44
 */
public enum UserType {

    SILVER_VIP("SILVER_VIP", "白银会员"),
    GOLD_VIP("GOLD_VIP", "黄金会员"),
    PLATINUM_VIP("PLATINUM_VIP", "白金会员"),
    COMMON_VIP("COMMON_VIP", "普通会员");

    private String code;
    private String value;

    private UserType(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static String getUserType(String code) {
        for (UserType item : UserType.values()) {
            if (item.getCode() == code) {
                return item.getValue();
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
