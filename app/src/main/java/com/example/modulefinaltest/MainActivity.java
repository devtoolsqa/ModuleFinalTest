package com.example.modulefinaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

          Button btn;
          @Override
          protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                    btn=findViewById(R.id.button);
                    btn.setTextColor(getResources().getColor(R.color.lib_black));
                    btn.setTextColor(getResources().getColor(com.example.andlib.R.color.lib_purple_200));
                    btn.setText(R.string.lib_string);
                    btn.setBackground(getDrawable(R.drawable.lib_sandeep));

          }
}