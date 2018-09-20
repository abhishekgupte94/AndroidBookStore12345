package com.example.abhishek.androidbookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageMain extends AppCompatActivity {
    private Button Login1;
    private Button reg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_main);
        Login1 = (Button)findViewById(R.id.Login);
        Login1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                openLogin();
            }

        });
        reg1 = (Button)findViewById(R.id.Register);
        reg1.setOnClickListener(new View.OnClickListener(){

          @Override
          public void onClick(View v){
          openmain();

          }

        });
    }

    public void openLogin(){

        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
    public void openmain(){

        Intent intent3 = new Intent(this,RegisterPage.class);
        startActivity(intent3);
    }
}
