package com.example.habibcse25.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by HabibCse25 on 30-Dec-18.
 */

public class DB_AdapterCls {
    DB_helperCls helper;
    DB_AdapterCls (Context context) {
        helper = new DB_helperCls(context);
    }
    public long insertData(String name,String password) {
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DB_helperCls.u_name,name);
        contentValues.put(DB_helperCls.password,password);

        long id = db.insert(DB_helperCls.Table_Name,null,contentValues);
        return id;
    }
    static class DB_helperCls extends SQLiteOpenHelper {
        private static final String DB_NAME = "MyDatabase.db";
        private static final String Table_Name = "MyTable";
        private static final int DB_Version =1;
        private static final String u_id="id";
        private static final String u_name="Name";
        private static final String password="Password";
        private  Context context;
        private static final String CreateTable="CREATE TABLE "+Table_Name+"("+u_id+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +u_name+" VARCHAR(255),"+password+" VARCHAR(255));";
        private static final String DeleteTable = "DROP TABLE IF  EXISTS "+Table_Name;

        public DB_helperCls(Context context) {
            super(context, DB_NAME, null, DB_Version);
            this.context = context;
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CreateTable);
            } catch (SQLException e) {
                System.out.println("error in creating db statement "+e);
            }
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            try {

                db.execSQL(DeleteTable);
                onCreate(db);
            } catch (SQLException e) {
                System.out.println("error in Drop table code "+e);
            }


        }
    }



}


