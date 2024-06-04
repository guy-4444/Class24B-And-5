package com.guy.class24b_and_5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    public static final String SP_KEY_NAME = "NAME";
    public static final String SP_KEY_ADDRESS = "ADDRESS";
    public static final String SP_KEY_SCORE = "SCORE";

    private MSPV2 mspv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //v1();

        //mspv2 = new MSPV2(this);
        //v2();


        v3();


        MySignal.getInstance().toast("");
        MySignal.getInstance().openDialog("Alert", "Be Careful", "Got it");
        MySignal.getInstance().vibrate();
    }

    private void v3() {
        MSPV3.getInstance().saveString(SP_KEY_NAME, "Guy");
        MSPV3.getInstance().saveInt(SP_KEY_SCORE, 1000);

        String name = MSPV3.getInstance().readString(SP_KEY_NAME, null);
        int score = MSPV3.getInstance().readInt(SP_KEY_SCORE, 0);
        ;

        Log.d("pttt", "Name: " + name);
        Log.d("pttt", "Score: " + score);
    }

    private void v2() {
        mspv2.saveString(SP_KEY_NAME, "Guy");
        mspv2.saveInt(SP_KEY_SCORE, 1000);

        String name = mspv2.readString(SP_KEY_NAME, null);
        int score = mspv2.readInt(SP_KEY_SCORE, 0);
        ;

        Log.d("pttt", "Name: " + name);
        Log.d("pttt", "Score: " + score);
    }

    private void v1() {
        MSPV1.saveString(this, SP_KEY_NAME, "Guy");
        MSPV1.saveInt(this, SP_KEY_SCORE, 1000);

        String name = MSPV1.readString(this, SP_KEY_NAME, null);
        int score = MSPV1.readInt(this, SP_KEY_SCORE, 0);
        ;

        Log.d("pttt", "Name: " + name);
        Log.d("pttt", "Score: " + score);
    }
}