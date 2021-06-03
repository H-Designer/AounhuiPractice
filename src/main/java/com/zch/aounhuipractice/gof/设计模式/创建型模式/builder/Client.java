package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder;

public class Client {
    public static void main(String args[]){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
