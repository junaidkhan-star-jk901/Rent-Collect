package com.chameleon.rentcollectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EnterPhoneNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_number);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, TenantDetailsActivity.class));
    }
}