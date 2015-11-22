package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mediaStreamerOnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Spotify Streamer!", Toast.LENGTH_SHORT).show();
    }

    public void superDuo1OnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Scores App!", Toast.LENGTH_SHORT).show();
    }

    public void superDuo2OnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Library App!", Toast.LENGTH_SHORT).show();
    }

    public void antTerminatorOnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
    }

    public void materializeOnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Bacon Reader!", Toast.LENGTH_SHORT).show();
    }

    public void capstoneOnClick(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch My Capstone App!", Toast.LENGTH_SHORT).show();
    }
}
