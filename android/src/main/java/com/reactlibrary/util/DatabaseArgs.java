package com.reactlibrary.util;

import android.content.Context;

import com.couchbase.lite.DatabaseConfiguration;
import com.couchbase.lite.EncryptionKey;
import com.facebook.react.bridge.ReactContext;

import org.json.JSONException;
import org.json.JSONObject;

public class DatabaseArgs {

    String directory;
    String dbName;
    String encryptionKey;
    String username;


    public String getDirectory() {
        return directory;
    }

    public String getDbName() {
        return dbName;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public DatabaseArgs(String dbArgsJSON) throws JSONException
    {

        JSONObject databaseArgs;

        if(!dbArgsJSON.isEmpty())
        {
            databaseArgs  = new JSONObject(dbArgsJSON);


            if(databaseArgs.has("dbName"))
            {
                dbName = databaseArgs.getString("dbName");
            }

            if(databaseArgs.has("Directory"))
            {
                directory = databaseArgs.getString("Directory");
            }

            if(databaseArgs.has("encryptionKey"))
            {
                encryptionKey = databaseArgs.getString("encryptionKey");
            }

        }


    }


}
