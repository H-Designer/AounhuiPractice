package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType.extend;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public Object clone(){
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("复制园失败");
        }
        return w;
    }
    @Override
    public void countArea(){
        int r = 0;
        System.out.println("这是一个圆，请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.println("面积为"+3.14*r*r);
    }
}
