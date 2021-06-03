package com.zch.aounhuipractice.gof.设计原则.ISP;

public class Studentmain {
    public static void main(String args[]){
        InputImpl input = new Student();
        CountImpl count = new Student();
        PrintImpl print = new Student();
        input.insert();
        count.countAverage();
        print.pirngInfo();
    }
}
