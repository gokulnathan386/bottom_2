package com.omerasoftware.bottom_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.action_favorites);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.action_recents:
                        Intent rect = new Intent(FirstActivity.this,MainActivity.class);
                        startActivity(rect);
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.action_favorites:
                        Intent first = new Intent(FirstActivity.this,FirstActivity.class);
                        startActivity(first);
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.action_nearby:
                        Intent second = new Intent(FirstActivity.this,SecondActivity.class);
                        startActivity(second);
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });



    }
}