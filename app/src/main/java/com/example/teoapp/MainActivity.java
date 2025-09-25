package com.example.teoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Nút HelloWorld
    public void onBtnHelloClick(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        startActivity(intent);
    }

    // Nút Register
    public void onBtnRegisterClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
