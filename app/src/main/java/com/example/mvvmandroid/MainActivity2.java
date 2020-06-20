package com.example.mvvmandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvmandroid.ui.main.MainFragment;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}