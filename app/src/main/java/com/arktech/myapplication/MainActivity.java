package com.arktech.myapplication;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageView imgUP,imgDown,imgLeft,imgRight,imgConnect,imgSound,imgLight;
    final static String UP="A";
    final static String DOWN="B";
    final static String LEFT="C";
    final static String RIGHT="D";
    final static String CONNECT="F";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        inicializarControles();
    }
    private void inicializarControles(){
        imgUP = findViewById(R.id.img_up);
        imgDown= findViewById(R.id.img_down);
        imgLeft= findViewById(R.id.img_left);
        imgRight= findViewById(R.id.img_right);
        imgConnect= findViewById(R.id.img_connect);
        imgLight= findViewById(R.id.img_light);
        imgSound= findViewById(R.id.img_sound);
        imgUP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,
                "boton arriba "+UP, Toast.LENGTH_LONG).show();
            }
        });
        imgDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,
                        "boton abajo "+DOWN, Toast.LENGTH_LONG).show();
            }
        });
        imgLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,
                        "boton izquierda "+LEFT, Toast.LENGTH_LONG).show();
            }
        });
        imgRight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,
                        "boton derecha "+RIGHT, Toast.LENGTH_LONG).show();
            }
        });
        imgConnect.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,
                        "boton conexion "+CONNECT, Toast.LENGTH_LONG).show();
            }
        });


    }
}