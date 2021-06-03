package com.zch.aounhuipractice.gof.设计原则.LKP;

public class Agent {
    private Company company;
    private Star star;
    private Fans fans;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
    public void meeting(){
        System.out.println(fans.getName()+"和明星"+star.getName()+"见面了");
    }
    public  void business(){
        System.out.println(company.getName()+"和明星"+star.getName()+"正在洽谈商务");
    }
}
