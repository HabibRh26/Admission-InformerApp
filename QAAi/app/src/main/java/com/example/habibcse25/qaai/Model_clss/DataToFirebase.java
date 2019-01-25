package com.example.habibcse25.qaai.Model_clss;

/**
 * Created by HabibCse25 on 07-Sep-18.
 */

public class DataToFirebase {
    public DataToFirebase() {
    }

    private String univ_Name;
    private String univ_details;

    public DataToFirebase(String univ_Name, String univ_details) {
        this.univ_Name = univ_Name;
        this.univ_details = univ_details;
    }

    public String getuniv_Name() {
        return univ_Name;
    }

    public void setVarsityName(String univ_Name) {
        this.univ_Name = univ_Name;
    }

    public String getuniv_details() {
        return univ_details;
    }

    public void setDetails(String univ_details) {
        this.univ_details = univ_details;
    }
}
