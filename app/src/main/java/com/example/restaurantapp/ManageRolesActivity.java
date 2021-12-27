package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ManageRolesActivity extends AppCompatActivity {
    Button cashier;
    Button barmen;
    Button waiter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_roles);

        cashier = findViewById(R.id.cashies_signup);
        waiter = findViewById(R.id.waiter_signup);
        barmen = findViewById(R.id.barmen_signup);




    }
}