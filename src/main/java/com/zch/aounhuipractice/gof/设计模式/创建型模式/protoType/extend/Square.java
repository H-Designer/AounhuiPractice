package com.zch.aounhuipractice.gof.设计模式.创建型模式.protoType.extend;

import java.util.Scanner;

public class Square implements Shape {
    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("复制方形失败");
        }
        return b;
    }

    @Override
    public void countArea() {
        int c = 0;
        int k = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("当前为方形，请输入长");
        c = scanner.nextInt();
        System.out.println("请输入宽");
        k = scanner.nextInt();
        System.out.println("面积为"+c*k);
    }
}
