package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddMenuItem extends AppCompatActivity {
    EditText description;
    EditText price;
    Button add;
    Button cancel;
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
                if(description.getText().toString().isEmpty() || price.getText().toString().isEmpty()){
                    Toast.makeText( getApplicationContext(), "No fields can be left empty!", Toast.LENGTH_SHORT);
                    return;
                }

            }
        });

    }
}