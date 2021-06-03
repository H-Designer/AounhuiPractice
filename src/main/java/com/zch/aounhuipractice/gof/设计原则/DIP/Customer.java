package com.zch.aounhuipractice.gof.设计原则.DIP;

public class Customer {
    public void goShopping(Shop shop){
        System.out.println(shop.sell());
    }
}
