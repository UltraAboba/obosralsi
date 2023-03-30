package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    EditText fpas;
    EditText fmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fpas =(EditText) findViewById(R.id.Fpas);
        fmail =(EditText) findViewById(R.id.Fmail);
    }
    public void red(View View){
        if(fpas.getText().toString().length() <= 10 && fmail.getText().toString().length() <= 10){
            Toast toast = Toast.makeText(getApplicationContext(), "seccses", Toast.LENGTH_SHORT);
            toast.show();
            startActivity(new Intent(this, MainActivity.class));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "mistake", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void user(){
        DataBase user = new DataBase();
        DataBase.setPassword(fpas.getText().toString());
        DataBase.setGmail(fpas.getText().toString());
    }
}