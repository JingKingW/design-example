package com.xunmall.example.design.decorator;

import java.math.BigDecimal;

/**
 * @author wangyj03@zenmen.com
 * @description
 * @date 2021/7/19 10:17
 */
public interface IBaseCount {

    BigDecimal countPayMoney(OrderDetail orderDetail);
}
