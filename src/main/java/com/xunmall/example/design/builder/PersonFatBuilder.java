package com.xunmall.example.design.builder;

import java.awt.*;

/**
 * @author Eugene
 * @date 2018/9/14
 */
public class PersonFatBuilder extends PersonBuilder {

    public PersonFatBuilder(Graphics graphics) {
        super(graphics);
    }
    @Override
    public void buildHead() {
        graphics.drawOval(50, 20, 30, 30);
        graphics.drawArc(50, 30, 10, 5, 45, 135);
        graphics.drawArc(70, 30, 10, 5, 45, 135);
        graphics.drawArc(60, 35, 10, 5, 200, 135);
    }

    @Override
    public void buildBody() {
        graphics.drawRect(55, 50, 20, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(55, 50, 40, 100);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(75, 50, 90, 100);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(55, 100, 45, 150);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(75, 100, 85, 150);
    }
}
