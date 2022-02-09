package com.xunmall.example.design.builder;

/**
 * @author Eugene
 * @date 2018/9/14
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void drawPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
