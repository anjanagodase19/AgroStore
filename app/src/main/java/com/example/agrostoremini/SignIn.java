package com.example.agrostoremini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        MaterialButton guestMB = findViewById(R.id.guestMB);
        guestMB.setOnClickListener(v -> new Handler((Looper.getMainLooper())).postDelayed(() -> {

            navigateToMainActivity();
        }, 250));

        MaterialTextView signUpMTV = findViewById(R.id.signUpMTV);
        signUpMTV.setOnClickListener(v -> {

            startActivity(new Intent(this, Signup.class));
            finish();
        });
        FloatingActionButton languageFAB = findViewById(R.id.languageFAB);
        languageFAB.setOnClickListener(v -> AppLanguageDialog.show(SignIn.this));
    }

    private void navigateToMainActivity() {

        startActivity(new Intent(this, Home.class));
        finish();
    }
}