package com.example.user.gridvwexmple.model;

/**
 * Created by User on 3/4/2018.
 */

public class Cricketer {
    private int imageId;
    private String name;

    public Cricketer(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
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
