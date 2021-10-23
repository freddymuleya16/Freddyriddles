package com.example.freddysriddles

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

const val DATABASE_NAME =  "MyDB"

const val TABLE_NAME = "Users"
const val COL_NAME =  "name"
const val COL_ID ="id"
const val COL_FID = "fid"

const val TABLE_LEVELS = "Levels"
const val COL_1 = "id"
const val COL_2 = "level"
const val COL_3 = "status"

const val COL_4 = "score"



class DatabaseHandler(var context: Context) :SQLiteOpenHelper(context, DATABASE_NAME,null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLE_NAME + " ( " + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COL_NAME + " VARCHAR(256),"+ COL_FID + " VARCHAR(256));";

        val createLevelsTable = "CREATE TABLE " + TABLE_LEVELS + " ( " + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COL_2 + " VARCHAR(256), "+ COL_3+ " INTEGER, "+ COL_4 + " INTEGER);"

        db?.execSQL(createTable)
        db?.execSQL(createLevelsTable)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_LEVELS")
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertData(user: User): Long {
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_NAME,user.name)
        cv.put(COL_FID,user.fid)
        var result = db.insert(TABLE_NAME,null,cv)
        db.close()

        return result

    }

    fun viewName(): ArrayList<User>{
        val nameList:ArrayList<User> =ArrayList<User>()

        val selectQuery = "SELECT * FROM $TABLE_NAME"

        val db = this.writableDatabase
        var cursor:Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery,null)

        }catch (e: SQLiteException){
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id:Int
        var name:String
        var fid:String

        if (cursor.moveToFirst()){
            do{
                id= cursor.getInt(cursor.getColumnIndex(COL_ID))
                name = cursor.getString(cursor.getColumnIndex(COL_NAME))
                fid = cursor.getString(cursor.getColumnIndex(COL_FID))

                val names = User(id= id,name=name,fid=fid)

                nameList.add(names)
            }while (cursor.moveToNext())
        }

        return nameList
    }


    fun updateData(user: User): Int{
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_NAME,user.name)
        val success = db.update(TABLE_NAME,cv, COL_ID + " = "
                +user.id,null)
        db.close()
        return success

    }

    fun setFID(user: User): Int{
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_FID,user.fid)
        val success = db.update(TABLE_NAME,cv, "$COL_NAME = '${user.name}'",null)
        db.close()
        return success

    }

    fun deleteData(user:User):Int{
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_ID,user.id)

        val success =  db.delete(TABLE_NAME, COL_ID+" = "+ user.id,null)
        db.close()

        return success
    }


    fun insertLevel(level: Level): Long {
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_2,level.level)
        cv.put(COL_3,level.status)
        cv.put(COL_4,level.score)
        var result = db.insert(TABLE_LEVELS,null,cv)

        db.close()

        return result

    }

    fun updateLevel(level: Level): Int{
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_3,level.status)
        val success = db.update(TABLE_LEVELS,cv,"$COL_2 = '${level.level}'",null)
        db.close()

        return success

    }

    fun updateScore(level: Level): Int{
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(COL_4,level.score)
        val success = db.update(TABLE_LEVELS,cv,"$COL_2 = '${level.level}'",null)
        db.close()

        return success

    }

    val allLevels: Cursor
    get(){
        val db = this.writableDatabase
        val res = db.rawQuery("SELECT * FROM $TABLE_LEVELS",null)
        return res
    }

    fun viewLevels(): ArrayList<Level>{
        val levelList:ArrayList<Level> =ArrayList<Level>()

        val selectQuery = "SELECT * FROM $TABLE_LEVELS"

        val db = this.writableDatabase
        var cursor:Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery,null)

        }catch (e: SQLiteException){
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id:Int
        var level:String
        var status:Int
        var score:Int

        if (cursor.moveToFirst()){
            do{
                id= cursor.getInt(cursor.getColumnIndex(COL_1))
                level = cursor.getString(cursor.getColumnIndex(COL_2))
                status= cursor.getInt(cursor.getColumnIndex(COL_3))
                score = cursor.getInt(cursor.getColumnIndex(COL_4))

                val names = Level(id= id,level=level,status = status, score = score)

                levelList.add(names)
            }while (cursor.moveToNext())
        }

        return levelList
    }
}