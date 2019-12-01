package com.pratik.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent messageActivityIntent = getIntent();
        String displayMessage  = messageActivityIntent.getStringExtra("displayMessage");
        TextView textViewField = findViewById(R.id.display_message);
        textViewField.setText(displayMessage);
    }
}
