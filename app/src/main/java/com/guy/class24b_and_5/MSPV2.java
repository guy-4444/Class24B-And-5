package com.guy.class24b_and_5;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class MSPV2 {

    private SharedPreferences prefs;

    public MSPV2(Context context) {
        prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
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
