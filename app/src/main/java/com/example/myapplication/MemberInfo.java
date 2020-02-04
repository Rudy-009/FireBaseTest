package com.example.myapplication;

public class MemberInfo {
    private String name;
    private String phonenum;
    public MemberInfo(){}
    public MemberInfo(String name, String phonenum){
        this.name = name;
        this.phonenum = phonenum;
    }
    public String getName(){
        return this.name;
    }
    public String getPhonenum() {
        return this.phonenum;
    }
}
