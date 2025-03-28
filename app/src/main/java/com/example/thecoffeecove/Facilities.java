package com.example.thecoffeecove;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Facilities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);

        Button buttonMenuDisplay = findViewById(R.id.buttonMenuDisplay);
        Button buttonOrderPlacement = findViewById(R.id.buttonOrderPlacement);

        buttonMenuDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facilities.this, Menu_Display.class);
                startActivity(intent);
            }
        });


        buttonOrderPlacement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Facilities.this, PersonalizedRecommendationsActivity.class);
                startActivity(intent);
            }
        });


    }
}