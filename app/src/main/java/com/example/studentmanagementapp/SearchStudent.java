package com.example.studentmanagementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class SearchStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);

        ImageButton imgBtnSearch = findViewById(R.id.imgBtnSearch);

        imgBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchStudent.this, SearchStudent.class);
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.imgBtnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchStudent.this, MainActivity.class);
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


        Spinner sltSearchItem = findViewById(R.id.sltSearchItem);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.SearchItem, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sltSearchItem.setAdapter(adapter);

    }
}