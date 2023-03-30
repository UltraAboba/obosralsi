package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.myapplication.DataBase.ai;
import static com.example.myapplication.DataBase.ay;
import static com.example.myapplication.DataBase.getGmail;
import static com.example.myapplication.DataBase.getPassword;
import static com.example.myapplication.DataBase.gmail;
import static com.example.myapplication.DataBase.password;

public class MainActivity extends AppCompatActivity {
    EditText vpas;
    EditText vmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpas =(EditText) findViewById(R.id.Vpas);
        vmail =(EditText) findViewById(R.id.Vmail);
    }
    public void reg(View view){
        startActivity(new Intent(this, MainActivity2.class));
    }
    public void vhod(View view){
        if(vmail.getText().toString() == ai && vpas.getText().toString() == ay){
            startActivity(new Intent(this, MainActivity3.class));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "mistake", Toast.LENGTH_SHORT);
        }
    }
}