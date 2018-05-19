package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView TextView = (TextView)findViewById(R.id.textView);
        final EditText e = (EditText)findViewById(R.id.editText);
        final Button button;
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          TextView.setText(e.getText());
                                      }
                                  });
    }
}
