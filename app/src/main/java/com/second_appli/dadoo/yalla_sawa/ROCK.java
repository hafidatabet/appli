package com.second_appli.dadoo.yalla_sawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ROCK extends AppCompatActivity {
    TextView Rock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        Rock = (TextView)findViewById(R.id.Rock);
    }
}
