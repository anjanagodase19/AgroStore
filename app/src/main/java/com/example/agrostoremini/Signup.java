package com.example.agrostoremini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        MaterialTextView signInMTV = findViewById(R.id.signInMTV);
        signInMTV.setOnClickListener(v -> {

            startActivity(new Intent(this, SignIn.class));
            finish();
        });

        FloatingActionButton languageFAB = findViewById(R.id.languageFAB);
        languageFAB.setOnClickListener(v -> AppLanguageDialog.show(Signup.this));
    }
}