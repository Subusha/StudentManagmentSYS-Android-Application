package com.example.studentmanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddStudent extends AppCompatActivity {

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        FirebaseApp.initializeApp(this);

        databaseReference = FirebaseDatabase.getInstance().getReference("https://studentmanagementapp-bb54c-default-rtdb.asia-southeast1.firebasedatabase.app/");

        ImageButton imgBtnSearch = findViewById(R.id.imgBtnSearch);

        imgBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddStudent.this, SearchStudent.class);
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.imgBtnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddStudent.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnBack = findViewById(R.id.imgBtnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Spinner sltYear = findViewById(R.id.sltYear);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Batch, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sltYear.setAdapter(adapter);

        Spinner sltCourse = findViewById(R.id.sltCourse);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.Course, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sltCourse.setAdapter(adapter1);
    }
}