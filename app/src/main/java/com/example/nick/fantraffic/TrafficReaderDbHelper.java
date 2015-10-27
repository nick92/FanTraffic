package com.example.nick.fantraffic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nkw on 23/10/2015.
 */
public class TrafficReaderDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FanTraffic.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String BOOL_TYPE = " INTEGER";
    private static final String INT_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE IF NOT EXISTS " + TrafficReader.FeedEntry.TABLE_NAME + " (" +
                    TrafficReader.FeedEntry._ID + INT_TYPE +" PRIMARY KEY" + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_CONTENT + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_STARTDATE + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_ENDDATE + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_LOCATION + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_ROADCLOSED + BOOL_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_STATUS + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_LONG + TEXT_TYPE + COMMA_SEP +
                    TrafficReader.FeedEntry.COLUMN_NAME_LAT + TEXT_TYPE  +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TrafficReader.FeedEntry.TABLE_NAME;

    public TrafficReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}