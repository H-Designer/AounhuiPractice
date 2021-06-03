package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println(order.cost());
        System.out.println(order.getDsc());
        order = new Milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDsc());
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDsc());
    }
}
