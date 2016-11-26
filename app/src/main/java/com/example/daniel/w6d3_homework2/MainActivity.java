package com.example.daniel.w6d3_homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.daniel.w6d3_homework2.fragmentmenu.MenuFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doFragment(View view) {
        Intent intent = new Intent (getApplicationContext(), MenuFragmentActivity.class);
        startActivity(intent);
    }
}
