package com.zch.aounhuipractice.gof.设计模式.结构型模式.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        int srcV = voltage220V.output220v();
        return srcV / 44;
    }
}
