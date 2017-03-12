package com.example.zohar.mainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        mahlogin();
        btn=(Button)findViewById(R.id.register);
        mahRegistration();
    }
    public void mahlogin()
    {

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent=new Intent("com.example.zohar.mainapp.Login");
                        startActivity(intent);
                    }
                }
        );
    }
    public void mahRegistration()
    {

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent=new Intent("com.example.zohar.mainapp.Registration");
                        startActivity(intent);
                    }
                }
        );
    }
}
