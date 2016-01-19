package com.second_appli.dadoo.yalla_sawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Music extends AppCompatActivity {

    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Button2 = (Button)findViewById(R.id.Button2);
        Button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent appel2 = new Intent(Music.this, CLASSIQUE.class);
                startActivity(appel2);
            }
        });
        Button3 = (Button)findViewById(R.id.Button3);
        Button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent appel3 = new Intent(Music.this, POP.class);
                startActivity(appel3);
            }
        });

        Button4 = (Button)findViewById(R.id.Button4);
        Button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent appel4 = new Intent(Music.this, RAP.class);
                startActivity(appel4);
            }
        });

        Button5 = (Button)findViewById(R.id.Button5);
        Button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent appel5 = new Intent(Music.this, ROCK.class);
                startActivity(appel5);
            }
        });

    }


}
