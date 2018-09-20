package com.example.abhishek.androidbookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginInRegisterPage extends AppCompatActivity {
private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in_register_page);
        back = (Button)findViewById(R.id.BackToLogin);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                openMain();
            }

        });

    }

    public void openMain(){

        Intent intent1 = new Intent(this,PageMain.class);
        startActivity(intent1);
    }
}
