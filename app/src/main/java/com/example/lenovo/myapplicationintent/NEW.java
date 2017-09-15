package com.example.lenovo.myapplicationintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NEW extends AppCompatActivity {
    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        tt = (TextView)findViewById(R.id.editText);
        tt.getText().toString();
    }
}
