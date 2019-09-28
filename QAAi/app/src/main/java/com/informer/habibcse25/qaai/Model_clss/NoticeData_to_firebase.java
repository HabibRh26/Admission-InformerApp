package com.informer.habibcse25.qaai.Model_clss;

public class NoticeData_to_firebase {
    public NoticeData_to_firebase() {
    }

    private String uni_Name;
    private String univ_Notice;

    public NoticeData_to_firebase(String uni_Name, String univ_Notice) {
        this.uni_Name = uni_Name;
        this.univ_Notice = univ_Notice;
    }

    public String getUni_Name() {
        return uni_Name;
    }

    public void setUniv_Name(String uniName) {
        this.uni_Name = uniName;
    }

    public String getUniv_Notice() {
        return univ_Notice;
    }

    public void setUniv_Notice(String univ_Notice) {
        this.univ_Notice = univ_Notice;
    }
}
