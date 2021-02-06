package com.example.helloassi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showName (View view){
        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.editText);
        String Message = editText.getText().toString();
        intent = getIntent();
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello, "+ Message);
    }
}