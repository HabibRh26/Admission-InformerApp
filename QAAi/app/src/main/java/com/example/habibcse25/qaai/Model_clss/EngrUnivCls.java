package com.example.habibcse25.qaai.Model_clss;

/**
 * Created by HabibCse25 on 8/16/2018.
 */

public class EngrUnivCls {
    private int imgid;
    private String uni_name;

    public EngrUnivCls(int imgid, String uni_name) {
        this.imgid = imgid;
        this.uni_name = uni_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getUni_name() {
        return uni_name;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }
}
