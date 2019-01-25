package com.example.user.relativelay;

/**
 * Created by User on 2/20/2018.
 */

public class Student {
    private String name;
    private String email;
    private String password;
    private Float CGPA;
    private String phoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getCGPA() {
        return CGPA;
    }

    public void setCGPA(Float CGPA) {
        this.CGPA = CGPA;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\n"+
                "CGPA : "+CGPA+"\n";


    }
    public String infoDialog(){
        return "Name : "+name+"\n"+
                "CGPA : "+CGPA+"\n"+
                "Phone : "+phoneNo+"\n";

    }
}
