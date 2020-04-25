package com.pink.drawerlayout.entity;

public class Acg {

    private String name;

    private int imagerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImagerId() {
        return imagerId;
    }

    public void setImagerId(int imagerId) {
        this.imagerId = imagerId;
    }

    public Acg(String name, int imagerId) {
        this.name = name;
        this.imagerId = imagerId;
    }
}
