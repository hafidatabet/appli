package com.second_appli.dadoo.yalla_sawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button firstButton;
    TextView firstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstButton = (Button)findViewById(R.id.firstButton);
        firstView = (TextView)findViewById(R.id.firstView);
        firstButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Music.class);
        startActivity(intent);
    }
}
