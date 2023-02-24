package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnter = (Button) findViewById(R.id.btnreg);
        btnEnter.setOnClickListener(ClickLog);

        textView = (TextView) findViewById(R.id.fb1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("namePet");
        textView.setText(name);
    }
    View.OnClickListener ClickLog = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i(TAG, "Программно");
            Intent intent = new Intent(MainActivity.this, Appoinment.class);
            EditText etPhone = findViewById(R.id.etPhone);
            String Phone = etPhone.getText().toString();
            intent.putExtra("Phone", Phone);
            startActivity(intent);
        }
    };
    public void GoLog(View V) {
        Log.i(TAG, "Декларативно");
    }
}