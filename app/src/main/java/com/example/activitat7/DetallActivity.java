package com.example.activitat7;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

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
        final RatingBar rating = findViewById(R.id.ratingBar);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(), getString(R.string.puntuacio) + " " + rating,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
