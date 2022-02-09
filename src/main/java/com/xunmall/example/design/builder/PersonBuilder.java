package com.xunmall.example.design.builder;

import java.awt.*;

/**
 * @author Eugene
 * @date 2018/9/14
 */
public abstract class PersonBuilder {

    protected Graphics graphics;

    public PersonBuilder(Graphics graphics) {
        this.graphics = graphics;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
