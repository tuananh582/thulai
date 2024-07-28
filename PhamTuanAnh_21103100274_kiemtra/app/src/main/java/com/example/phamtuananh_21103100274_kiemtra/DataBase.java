package com.example.phamtuananh_21103100274_kiemtra;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DataBase extends SQLiteOpenHelper {
    private static final String DATABSE_NAME = "sinhvien.db";
    private static final int DATABASE_VERSION = 1;
    private  static final String TABLE_NAME="Sinhvien";
    private static final String COLUMN_ID = "manv";
    private  static final String COLUMN_NAME="hoten";
    private  static final String COLUMN_AGE="tuoi";
    //constructor
    public DataBase(Context context){
        super(context,DATABSE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_AGE + " INTEGER)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
   public boolean addSinhvien(String hoten, int tuoi){
        SQLiteDatabase db = this.getWritableDatabase();
       ContentValues values = new ContentValues();
       values.put(COLUMN_NAME,hoten);
       values.put(COLUMN_AGE,tuoi);
       long result = db.insert(TABLE_NAME,null,values);
       db.close();
       return result!=-1;
   }
}
