package com.zch.aounhuipractice.gof.设计模式.结构型模式.adapter.objectadapter;

public class Phone {

    public static void main(String args[]){
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        int getV = voltageAdapter.output5V();
        System.out.println("转换的电压为：" + getV);
        if (getV ==5 ){
            System.out.println("手机可以用来充电");
        }else {
            System.out.println("电压不匹配，会冲爆手机");
        }
    }
}
