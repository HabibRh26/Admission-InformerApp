package com.example.habibcse25.sqlitenormal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by HabibCse25 on 04-Jan-19.
 */

public class DB_helperCls extends SQLiteOpenHelper {
    public static final String DB_Name = "Mydb.db";
    public static final int DB_Version =1;
    public static final String TABLE_NAME = "Mystudnt";
    public static final String col_1 = "ID";
    public static final String col_2 = "NAME";
    public static final String col_3 = "SURNAME";
    public static final String col_4 = "MARKS";

    public DB_helperCls(Context context) {
        super(context, DB_Name, null, DB_Version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL("create table " + TABLE_NAME +"("+col_1 +" INTEGER PRIMARY KEY AUTOINCREMENT,"+col_2+" TEXT,"+col_3+" TEXT,"+col_4+" INTEGER);");
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
    public long insertData(String name,String surname,int marks){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_2,name);
        contentValues.put(col_3,surname);
        contentValues.put(col_4,marks);
        long result = db.insert(TABLE_NAME,null,contentValues);
        return result;
    }
    public boolean updateData(String id,String name,String surname,int marks){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1,id);
        contentValues.put(col_2,name);
        contentValues.put(col_3,surname);
        contentValues.put(col_4,marks);
        String correction[]={id};
        db.update(TABLE_NAME,contentValues,"ID = ?",correction);

        return true ;
    }
    public boolean delMethod(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        String del[]={id};
        db.delete(TABLE_NAME,"ID = ?",del);

        return true;

    }
}
