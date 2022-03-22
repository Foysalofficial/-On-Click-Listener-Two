package com.foysaldev.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button first , second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.TextView);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

    }

    public void ButtonClick(View view) {
        if (view.getId() == R.id.first) {
            textView.setText("first button is clicked");
        } else if (view.getId() == R.id.second) {
            textView.setText("second button is clicked");
        }
    }
}