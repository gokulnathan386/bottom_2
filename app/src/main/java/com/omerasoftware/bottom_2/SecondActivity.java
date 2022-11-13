package com.omerasoftware.bottom_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.action_nearby);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.action_recents:
                        Intent rect = new Intent(SecondActivity.this,MainActivity.class);
                        startActivity(rect);
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.action_favorites:
                        Intent first = new Intent(SecondActivity.this,FirstActivity.class);
                        startActivity(first);
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.action_nearby:
                        Intent second = new Intent(SecondActivity.this,SecondActivity.class);
                        startActivity(second);
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });



    }
}