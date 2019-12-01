package com.pratik.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view){
        EditText userTextField = findViewById(R.id.user_message);
        String userMessage = userTextField.getText().toString();
        Intent messageActivityIntent = new Intent(this, MessageActivity.class);
        messageActivityIntent.putExtra("displayMessage",userMessage);
        startActivity(messageActivityIntent);
    }
}
