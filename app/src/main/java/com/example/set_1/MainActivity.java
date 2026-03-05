package com.example.set_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LAB_TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Witaj obiektowy świecie");

        runTests();
    }

    private void runTests(){

        Lamp lamp = new Lamp();

        Log.i(TAG,"TEST 1: Turn lamp ON");
        lamp.turnOn();
        Log.i(TAG,"Lamp shining: " + lamp.isShining());

        Log.i(TAG,"TEST 2: Brighten to 10");

        for(int i=0;i<10;i++){
            lamp.brighten();
        }

        Log.i(TAG,"Intensity: " + lamp.getIntensity());

        Log.i(TAG,"TEST 3: Brighten above 10 -> bulb burns");

        lamp.brighten();
        Log.i(TAG,"Bulb burned: " + lamp.isBulbBurned());

        Log.i(TAG,"TEST 4: Replace bulb when OFF");

        boolean replaced = lamp.replaceBulb();
        Log.i(TAG,"Replace success: " + replaced);

        Log.i(TAG,"TEST 5: Replace bulb when ON");

        lamp.turnOn();
        boolean replacedFail = lamp.replaceBulb();
        Log.i(TAG,"Replace success (should fail): " + replacedFail);

    }
}