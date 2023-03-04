package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.vetclinica.databinding.ActivityMainBinding;

import java.net.IDN;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Пункт 5
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Пункт 3
      //  EditText etPhone = (EditText) findViewById(R.id.etPhone);
      //  EditText etPassword = (EditText) findViewById(R.id.etPassword);
      //  Button btnLogIn = (Button) findViewById(R.id.btn_log_in);
      //  Button btnRegister = (Button) findViewById(R.id.btn_register);

        //Пункт 6
        TextView textInfo1 = (TextView) findViewById(R.id.text_info_1);
        Intent intent = getIntent();
        String clickCatNum = intent.getStringExtra("clickCat");
        textInfo1.setText("На котика нажали: "+clickCatNum+" раза");


        //textView = (TextView) findViewById(R.id.fb1);
       // Intent intent = getIntent();
       // String name = intent.getStringExtra("namePet");
       // textView.setText(name);

        //Пункт 4
        binding.btnLogIn.setOnClickListener(ClickLog);
    }
    View.OnClickListener ClickLog = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.i(TAG, "Программно");
            // создание объекта Intent для запуска Appointment
            Intent intent = new Intent(MainActivity.this, Appoinment.class);
            EditText etPhone = (EditText) findViewById(R.id.etPhone); //ввод номера телефона
            String Phone = etPhone.getText().toString();
            // передача объекта с ключом "phone" и значением строки Phone
            intent.putExtra("phone", Phone);
            // запуск Appointment
            startActivity(intent);
        }
    };
    public void GoLog(View V) {
        Log.i(TAG, "Декларативно");
    }
}