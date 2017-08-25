package com.example.spider.myapplication.Models;

/**
 * Created by spider on 10/4/17.
 */

public class NavDrawItemModel {


    private String name;
    private int imageId;

    public NavDrawItemModel(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}