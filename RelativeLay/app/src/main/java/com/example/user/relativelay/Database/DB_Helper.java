package com.example.user.relativelay.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.user.relativelay.Student;

import java.util.ArrayList;

/**
 * Created by User on 3/10/2018.
 */

public class DB_Helper extends SQLiteOpenHelper {
    public static final String DB_Name = "factory.DB";
    public DB_Helper(Context context) {
        super(context, DB_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        TableAttributes t = new TableAttributes();
       String query = t.TableCreation();

       try{
           DB.execSQL(query);
           Log.i("table create","successful");
       }catch(SQLException e){
           Log.e("SQL Error",e.toString());

        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertStudent(Student stu) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TableAttributes.STU_USERNAME,stu.getName());
        contentValues.put(TableAttributes.STU_CGPA,stu.getCGPA());
        contentValues.put(TableAttributes.STU_PASSWORD,stu.getPassword());
        contentValues.put(TableAttributes.STU_PHONENO,stu.getPhoneNo());

        SQLiteDatabase db = this.getWritableDatabase();
        try{
            db.insert(TableAttributes.TABLE_NAME,null,contentValues);
            Log.i("insert","hosie");

        }catch (SQLException e){
            Log.i("Insert Error ",e.toString());

        }

    }

    public ArrayList<Student> getAllstuData() {
        ArrayList<Student> stuArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT * FROM "+TableAttributes.TABLE_NAME;
        Cursor cursor = db.rawQuery(query,null);
        cursor.moveToFirst();

        if(cursor.getCount()>0){
            while(!cursor.isAfterLast()){
                Student std = new Student();

                std.setName(cursor.getString(cursor.getColumnIndex(TableAttributes.STU_USERNAME)));
                std.setPhoneNo(cursor.getString(cursor.getColumnIndex(TableAttributes.STU_PHONENO)));
                std.setPassword(cursor.getString(cursor.getColumnIndex(TableAttributes.STU_PASSWORD)));
                std.setCGPA(cursor.getFloat(cursor.getColumnIndex(TableAttributes.STU_CGPA)));

                stuArrayList.add(std);

                cursor.moveToNext();
            }
        }

        return stuArrayList;
    }
}
