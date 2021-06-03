package com.zch.aounhuipractice.gof.设计原则.ISP;

public class Student implements InputImpl,PrintImpl,CountImpl {
    public InputImpl getInput(){
        return new Student();
    }
    public PrintImpl getPrint(){
        return new Student();
    }
    public CountImpl getCount(){
        return new Student();
    }

    @Override
    public void countTotal() {
        System.out.println("countTotal");
    }

    @Override
    public void countAverage() {
        System.out.println("countAverage");
    }

    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void modify() {
        System.out.println("modify");
    }

    @Override
    public void pirngInfo() {
        System.out.println("pirngInfo");
    }

    @Override
    public void quertInfo() {
        System.out.println("quertInfo");
    }
}
