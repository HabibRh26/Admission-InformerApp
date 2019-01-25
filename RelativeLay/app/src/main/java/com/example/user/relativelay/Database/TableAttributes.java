package com.example.user.relativelay.Database;

/**
 * Created by User on 3/10/2018.
 */

public class TableAttributes  {
    public static final String TABLE_NAME ="student";
    public static final String STUDENT_ID ="ID";
    public static final String STU_USERNAME ="name";
    public static final String STU_PHONENO ="phoneNo";
    public static final String STU_CGPA ="cgpa";
    public static final String STU_PASSWORD ="password";

    public String TableCreation(){
        String query = " CREATE TABLE "+TABLE_NAME+"("+STUDENT_ID+" INTEGER AUTO INCREMENT PRIMARY KEY,"+
                STU_USERNAME+"TEXT,"+STU_PHONENO+"TEXT,"+STU_CGPA+"TEXT,"+STU_CGPA+"TEXT,";


        return query;
    }




}
