package com.example.myapplication2;

public class Vegetable {
    private String name;
    private String title;
    private String hinhanh;

    public Vegetable() {
    }

    public Vegetable(String name, String title, String hinhanh) {
        this.name = name;
        this.title = title;
        this.hinhanh = hinhanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
