package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnter = findViewById(R.id.btnreg);
        btnEnter.setOnClickListener(ClickLog);
    }
    View.OnClickListener ClickLog = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i(TAG, "Программно");
        }
    };
    public void GoLog(View V) {
        Log.i(TAG, "Декларативно");
    }
}