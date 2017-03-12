package com.example.zohar.mainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static Button btn;

    private static EditText uname;
    private static EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn=(Button)findViewById(R.id.signup);
        gotosinup();

        login();


    }

    private void login() {

        uname=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

        btn=(Button)findViewById(R.id.submit);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(uname.getText().toString().equalsIgnoreCase("zohar") && password.getText().toString().equalsIgnoreCase("zohar"))
                        {
                            Toast.makeText(Login.this, "You are Coreect", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(Login.this, "You are inCoreect", Toast.LENGTH_SHORT).show();

                        }
                    }
                }
        );
    }

    private void gotosinup() {
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
