package com.guy.class24b_and_5;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class MSPV1 {

    public static void saveString(Context context, String key, String value) {
        SharedPreferences prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static  String readString(Context context, String key, String def) {
        SharedPreferences prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
        return prefs.getString(key, def);
    }

    public static  void saveInt(Context context, String key, int value) {
        SharedPreferences prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static  int readInt(Context context, String key, int def) {
        SharedPreferences prefs = context.getSharedPreferences("MyPreference", MODE_PRIVATE);
        return prefs.getInt(key, def);
    }
}
