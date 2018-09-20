package com.example.abhishek.androidbookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterPage extends AppCompatActivity {
private Button backmain;
private Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        backmain = (Button)findViewById(R.id.mainpagebutton);
        backmain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                openMain1();
            }

        });

    }
    public void openMain1(){

        Intent intent2 = new Intent(this,PageMain.class);
        startActivity(intent2);
    }
}
