package com.second_appli.dadoo.yalla_sawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class POP extends AppCompatActivity {
    TextView Pop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        Pop = (TextView)findViewById(R.id.Pop);
    }
}
