package com.wa7a.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView nameTextView, addressTextView, professionTextView, jobTextView, foodTextView;
    final static String NAME = "name", ADDRESS = "address", PROFESSION = "profession", DREAM_JOB = "job", FAVORITE_FOOD = "food";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameTextView = findViewById(R.id.text_view_name_output);
        addressTextView = findViewById(R.id.text_view_address_output);
        professionTextView = findViewById(R.id.text_view_profession_output);
        jobTextView = findViewById(R.id.text_view_job_output);
        foodTextView = findViewById(R.id.text_view_food_output);

        Intent intent = getIntent();

        nameTextView.setText(intent.getStringExtra(NAME));
        addressTextView.setText(intent.getStringExtra(ADDRESS));
        professionTextView.setText(intent.getStringExtra(PROFESSION));
        jobTextView.setText(intent.getStringExtra(DREAM_JOB));
        foodTextView.setText(intent.getStringExtra(FAVORITE_FOOD));




    }
}