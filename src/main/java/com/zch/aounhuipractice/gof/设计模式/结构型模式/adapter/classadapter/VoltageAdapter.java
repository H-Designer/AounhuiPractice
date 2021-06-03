package com.zch.aounhuipractice.gof.设计模式.结构型模式.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements  IVoltage5V{
    @Override
    public int output5V() {
        int srcV = output220v();
        return srcV / 44;
    }
}
