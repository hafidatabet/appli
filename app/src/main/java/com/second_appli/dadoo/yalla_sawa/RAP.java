package com.second_appli.dadoo.yalla_sawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RAP extends AppCompatActivity {
    TextView Rap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rap);
        Rap = (TextView)findViewById(R.id.Rap);

    }
}
