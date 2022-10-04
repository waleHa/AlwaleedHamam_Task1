package com.wa7a.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText nameEditText, addressEditText, professionEditText, jobEditText, foodEditText;
    final static String NAME = "name", ADDRESS = "address", PROFESSION = "profession", DREAM_JOB = "job", FAVORITE_FOOD = "food";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.edit_text_name);
        addressEditText = findViewById(R.id.edit_text_address);
        professionEditText = findViewById(R.id.edit_text_profession);
        jobEditText = findViewById(R.id.edit_text_job);
        foodEditText = findViewById(R.id.edit_text_food);
        submitButton = findViewById(R.id.button_submit);
        Log.d("myTag1", "This is my message");

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ProfileActivity.class);
                intent.putExtra(NAME,nameEditText.getText().toString());
                intent.putExtra(ADDRESS,addressEditText.getText().toString());
                intent.putExtra(PROFESSION,professionEditText.getText().toString());
                intent.putExtra(DREAM_JOB,jobEditText.getText().toString());
                intent.putExtra(FAVORITE_FOOD,foodEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}