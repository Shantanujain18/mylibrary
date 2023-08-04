package com.example.mylibraryjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mylibrary.DataDisplayManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void displayData(Context context, String name, int amount) {
        String displayText = "Name: " + name + "\nAmount: $" + amount;
        Toast.makeText(context, displayText, Toast.LENGTH_LONG).show();
    }

}