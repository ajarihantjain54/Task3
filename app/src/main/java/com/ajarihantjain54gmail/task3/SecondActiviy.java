package com.ajarihantjain54gmail.task3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActiviy extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiy);
        String message = "Task 3 complete!!";
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        Snackbar snackbar = Snackbar.make(coordinatorLayout, "Second Activity", Snackbar.LENGTH_LONG);


        snackbar.show();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

    }
}

