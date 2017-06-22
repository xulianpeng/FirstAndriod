package com.example.xulianpeng.firstandriod;

/**
 * Created by xulianpeng on 2017/6/21.
 */

public class FruitModel {


    private String name;
    private int imageId;

    public FruitModel(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
