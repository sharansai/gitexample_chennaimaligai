package com.example.surya.chennaimaligai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout setyy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setyy=(LinearLayout)findViewById(R.id.set);


        setyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent is=new Intent(MainActivity.this,details.class);
                startActivity(is);
            }
        });
    }
}
