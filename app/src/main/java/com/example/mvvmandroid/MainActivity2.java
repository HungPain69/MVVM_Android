package com.example.mvvmandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.mvvmandroid.ui.main.MainFragment;
import com.example.mvvmandroid.ui.main.MainViewModel;

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
        ViewModelProvider viewModelProvider = ViewModelProviders.of(this);
        ViewModel viewModel = viewModelProvider.get(MainViewModel.class);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

    }
}