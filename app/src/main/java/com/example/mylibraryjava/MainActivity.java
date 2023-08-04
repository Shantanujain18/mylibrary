package com.example.mylibraryjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.DataDisplayManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataDisplayManager.displayData(this,"SHantanu", 10);

    }
}