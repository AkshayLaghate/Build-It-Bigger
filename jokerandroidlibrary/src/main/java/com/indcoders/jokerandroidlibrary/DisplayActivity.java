package com.indcoders.jokerandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvJoke = (TextView) findViewById(R.id.tvJoke);
        tvJoke.setText(getIntent().getStringExtra("joke"));
    }
}
