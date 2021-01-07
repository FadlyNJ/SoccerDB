package com.fadly.soccerdb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ControlClass extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);

        if(sharedPreferences.getString("username","").isEmpty() ||
                sharedPreferences.getString("username","").isEmpty())
        {
            startActivity(new Intent(getApplicationContext(), com.fadly.soccerdb.MainActivity.class));
            finish();
        }else{
            startActivity(new Intent(getApplicationContext(),MainMenu.class));
            finish();
        }
    }
}