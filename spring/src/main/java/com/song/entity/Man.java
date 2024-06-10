package com.song.entity;

public class Man extends Person{
    private String manProp;

    public String getManProp() {
        return manProp;
    }

    @Override
    public String toString() {
        return super.toString() + "Man{" +
                "manProp='" + manProp + '\'' +
                '}';
    }

    public void setManProp(String manProp) {
        this.manProp = manProp;
    }
}
