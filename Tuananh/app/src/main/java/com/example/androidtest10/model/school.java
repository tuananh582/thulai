package com.example.androidtest10.model;

public class school {
    private int hinh;
    private String hoten;

    public school(int hinh, String hoten) {
        this.hinh = hinh;
        this.hoten = hoten;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

}
