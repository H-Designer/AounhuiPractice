package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType;

public class PrototypeTest {
    public static void main(String args[]) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = (Realizetype) r1.clone();
        System.out.println("r1==r2 ?" +(r1==r2));
    }
}
