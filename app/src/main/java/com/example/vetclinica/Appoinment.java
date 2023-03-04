package com.example.vetclinica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.vetclinica.databinding.ActivityAppoinmentBinding;
import com.example.vetclinica.databinding.ActivityMainBinding;

public class Appoinment extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Пункт 5
        ActivityAppoinmentBinding binding = ActivityAppoinmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Пункт 3

        ImageButton btnAppointment = (ImageButton) findViewById(R.id.btn_appointment);
        ImageButton btnProfile = (ImageButton) findViewById(R.id.btn_profile);
        ImageButton btnMyAppointment = (ImageButton) findViewById(R.id.btn_my_appointment);
        ImageButton btnCat = (ImageButton) findViewById(R.id.btn_cat);
        Button btnBack = (Button) findViewById(R.id.btn_back);
        TextView textInfo2 = (TextView) findViewById(R.id.text_info_2);

       // binding.textInfo2.setText("gfd");
       // TextView tvPhone = (TextView) findViewById(R.id.tvPhone);//
       // Intent intent = getIntent();//
       // String phone = intent.getStringExtra("phone");//
       // tvPhone.setText(phone);//

    //    Button btnBack = (Button) findViewById(R.id.btnBack);
    //    btnBack.setOnClickListener(ClickBack);

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