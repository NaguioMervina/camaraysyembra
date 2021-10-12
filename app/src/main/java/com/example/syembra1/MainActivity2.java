package com.example.syembra1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {
    public ImageButton images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        images = (ImageButton) findViewById(R.id.imageView4);

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}