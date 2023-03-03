package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Appoinment extends AppCompatActivity {

    //tvPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoinment);

        TextView tvPhone = (TextView) findViewById(R.id.tvPhone);//
        Intent intent = getIntent();//
        String phone = intent.getStringExtra("phone");//
        tvPhone.setText(phone);//

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(ClickBack);

    }

    View.OnClickListener ClickBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Intent intent = new Intent(Appoinment.this, MainActivity.class);
           // EditText etNamePet = findViewById(R.id.etPetName);
           // String PetName = etNamePet.getText().toString();
           // intent.putExtra("namePet", PetName);
           // startActivity(intent);
        }
    };
}