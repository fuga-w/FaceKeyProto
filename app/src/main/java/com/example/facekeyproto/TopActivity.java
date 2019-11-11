package com.example.facekeyproto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TopActivity extends AppCompatActivity {
    final String TAG = "Top";
    protected Button registerBtn;
    protected Button authBtn;
    protected Intent toRegister;
    protected Intent toAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_top);
        Log.d(TAG, "In onCreate");
        registerBtn = findViewById(R.id.topRegisterBtn);
        authBtn = findViewById(R.id.topAuthBtn);
        toRegister = new Intent(this, com.example.facekeyproto.RegisterActivity.class);
        toAuth = new Intent(this, com.example.facekeyproto.AuthActivity.class);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "In OnClickListener associated RegisterBtn");
                startActivity(toRegister);
            }
        });

        authBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "In OnClickListener associated AuthBtn");
                startActivity(toAuth);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "In onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "In onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "In onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "In onDestroy");
    }
}
