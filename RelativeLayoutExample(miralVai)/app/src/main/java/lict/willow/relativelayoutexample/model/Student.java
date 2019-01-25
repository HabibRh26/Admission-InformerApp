package lict.willow.relativelayoutexample.model;

/**
 * Created by Lenovo on 2/19/2018.
 */

public class Student {
    private String name;
    private String email;
    private String phoneNo;
    private Float cgpa;

    public Student(String name, String email, String phoneNo, Float cgpa) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.cgpa = cgpa;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Name: "+ name+"\n"+
                "CGPA: "+cgpa;
    }

    public String toStringForDialog() {
        return "Name: "+ name+"\n"+
                "Email: "+email+"\n"+
                "Phone No: "+phoneNo+"\n"+
                "CGPA: "+cgpa;
    }
}
