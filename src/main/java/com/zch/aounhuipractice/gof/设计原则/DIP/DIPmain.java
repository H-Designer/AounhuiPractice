package com.zch.aounhuipractice.gof.设计原则.DIP;

public class DIPmain {
    public static void main(String argsp[]){
        Customer customer = new Customer();
        customer.goShopping(new Shop001());
        customer.goShopping(new Shop002());
    }
}
