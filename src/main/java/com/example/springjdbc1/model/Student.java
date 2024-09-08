package com.example.springjdbc1.model;

public class Student {
    private int sid;
    private String sname;
    private String scity;
    private double spercentage;
    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getSid() {
        return sid;
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
    }
    public String getSname() {
        return sname;
    }
    public String getScity() {
        return scity;
    }
    public double getSpercentage() {
        return spercentage;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setScity(String scity) {
        this.scity = scity;
    }
    public void setSpercentage(double spercentage) {
        this.spercentage = spercentage;
    }
    
}
