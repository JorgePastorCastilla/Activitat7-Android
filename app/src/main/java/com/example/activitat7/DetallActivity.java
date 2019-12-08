package com.example.activitat7;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView textElement = findViewById(R.id.Texto);
            textElement.setText(extras.getString("nomvi"));
        }



    }
}
