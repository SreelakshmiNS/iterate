package com.example.aacharya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        startActivity(new Intent(this,FeedActivity.class));
    }
    public void register(View view){
        startActivity(new Intent(this,RegisterActivity.class));
    }
}
