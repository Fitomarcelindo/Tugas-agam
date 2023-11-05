package com.example.myapplication

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context): SQLiteOpenHelper(context,"itpln", null, 1){
    private var db = this.writableDatabase

    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE Pengguna(id_pengguna INTEGER PRIMARY KEY AUTOINCREMENT,nama_pengguna varchar,password varchar)")
        p0?.execSQL("INSERT INTO Pengguna(nama_pengguna,password) VALUES ('ADMIN','ADMIN')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}