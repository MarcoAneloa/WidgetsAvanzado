package com.aneloa.widgetsavanzado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aneloa.widgetsavanzado.view.ConteinerActivity;
import com.aneloa.widgetsavanzado.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent=new Intent(LoginActivity.this,CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goLogin(View view){
        Intent intent2 = new Intent(LoginActivity.this, ConteinerActivity.class);
        startActivity(intent2);
    }
}
