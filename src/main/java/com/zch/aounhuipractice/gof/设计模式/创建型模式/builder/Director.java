package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
