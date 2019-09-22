package com.informer.habibcse25.qaai.Model_clss;

public class NoticeData_to_firebase {
    public NoticeData_to_firebase() {
    }

    private String univ_Name;
    private String univ_Notice;

    public NoticeData_to_firebase(String univ_Name, String univ_Notice) {
        this.univ_Name = univ_Name;
        this.univ_Notice = univ_Notice;
    }

    public String getUniv_Name() {
        return univ_Name;
    }

    public void setUniv_Name(String univ_Name) {
        this.univ_Name = univ_Name;
    }

    public String getUniv_Notice() {
        return univ_Notice;
    }

    public void setUniv_Notice(String univ_Notice) {
        this.univ_Notice = univ_Notice;
    }
}
