package com.example.habibcse25.qaai.Model_clss;

public class PublicUnivCls {

private String univName;
private String univAddress;
private int imgId;

    public PublicUnivCls(String univName, String univAddress, int imgId) {
        this.univName = univName;
        this.univAddress = univAddress;
        this.imgId = imgId;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getUnivAddress() {
        return univAddress;
    }

    public void setUnivAddress(String univAddress) {
        this.univAddress = univAddress;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
