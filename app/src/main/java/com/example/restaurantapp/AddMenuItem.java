package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.restaurantapp.Models.Food;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMenuItem extends AppCompatActivity {
    EditText description;
    EditText price;
    Button add;
    Button cancel;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu_item);

        description = findViewById(R.id.food_description);
        price = findViewById(R.id.food_price);
        add = findViewById(R.id.add_food);
        cancel = findViewById(R.id.add_food_cancel);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String descriptionTxt = description.getText().toString();
                Double priceTxt = new Double(price.getText().toString());

                if(descriptionTxt.isEmpty() || priceTxt == 0.0){
                    Toast.makeText( getApplicationContext(), "No fields can be left empty!", Toast.LENGTH_SHORT);
                    return;
                }

                mDatabase = FirebaseDatabase.getInstance().getReference();
                Food user = new Food(descriptionTxt, priceTxt);
                mDatabase.child("users").setValue(user);

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("msgs").child("msg3");

                myRef.setValue("Hello, World!");
                startActivity(new Intent(getApplicationContext(), EditMenuActivity.class));
                finish();
            }
        });

    }
}