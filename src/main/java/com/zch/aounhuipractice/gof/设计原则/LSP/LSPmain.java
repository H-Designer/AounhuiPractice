package com.zch.aounhuipractice.gof.设计原则.LSP;

public class LSPmain {
    public static void main(String args[]){
        double distance = 300;
        Swallow bird = new Swallow();
        BrownKiwi animal = new BrownKiwi();
        bird.setFlySpeed(50);
        animal.setRunSpeed(30);
        System.out.println("如果300米距离");
        System.out.println("燕子飞行需要"+bird.getFlyTime(distance)+"小时");
        System.out.println("几维鸟跑步需要"+animal.getRunTime(distance)+"小时");
    }
}
