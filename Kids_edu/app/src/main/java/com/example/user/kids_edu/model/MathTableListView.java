package com.example.user.kids_edu.model;

public class MathTableListView {
    private String table_name;
    private int ImageId;

    public MathTableListView(String table_name, int imageId) {
        this.table_name = table_name;
        ImageId = imageId;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
