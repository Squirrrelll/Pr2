package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnreg.setText("sdfghj");
        //Пункт 3

        Button btnEnter = (Button) findViewById(R.id.btnreg); //кнопка "Войти"
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText etPhone = (EditText) findViewById(R.id.etPhone); //ввод номера телефона
        EditText etPassword = (EditText) findViewById(R.id.editTextTextPassword); //ввод пароля

        btnEnter.setText(R.string.registrarte);
        etPhone.setHint(R.string.phone);
        etPassword.setHint(R.string.password);

        //Пункт 6
        textView = (TextView) findViewById(R.id.fb1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("namePet");
        textView.setText(name);

        //Пункт 4
        btnEnter.setOnClickListener(ClickLog);


        //Пункт 5
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