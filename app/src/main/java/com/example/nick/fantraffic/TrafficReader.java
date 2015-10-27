package com.example.nick.fantraffic;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by nkw on 23/10/2015.
 */
public final class TrafficReader {

    public TrafficReader() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "information";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_CONTENT = "content";
        public static final String COLUMN_NAME_STARTDATE = "start_date";
        public static final String COLUMN_NAME_ENDDATE = "end_date";
        public static final String COLUMN_NAME_LOCATION = "location";
        public static final String COLUMN_NAME_ROADCLOSED = "road_closed";
        public static final String COLUMN_NAME_STATUS = "status";
        public static final String COLUMN_NAME_LONG = "longitude";
        public static final String COLUMN_NAME_LAT = "latitude";

        public static final String COLUMN_NAME_NULLABLE = "NULL";
    }
}

