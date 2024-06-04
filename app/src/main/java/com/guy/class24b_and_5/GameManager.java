package com.guy.class24b_and_5;

import static android.content.Context.MODE_PRIVATE;

import static androidx.core.content.ContextCompat.getSystemService;
import static com.guy.class24b_and_5.MainActivity.SP_KEY_NAME;
import static com.guy.class24b_and_5.MainActivity.SP_KEY_SCORE;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class GameManager {

    public void saveNewRecord(String name, int score) {
        MSPV3.getInstance().saveString(SP_KEY_NAME, name);
        MSPV3.getInstance().saveInt(SP_KEY_SCORE, score);

    }

}
