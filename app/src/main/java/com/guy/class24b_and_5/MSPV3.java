package com.guy.class24b_and_5;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class MSPV3 {

    private static MSPV3 mspv3;
    private SharedPreferences prefs;

    private MSPV3(Context context) {
        prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
    }

    public static void init(Context context) {
        if (mspv3 == null) {
            mspv3 = new MSPV3(context);
        }
    }

    public static MSPV3 getInstance() {
        return mspv3;
    }

    public void saveString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String readString(String key, String def) {
        return prefs.getString(key, def);
    }

    public void saveInt(String key, int value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public int readInt(String key, int def) {
        return prefs.getInt(key, def);
    }
}
