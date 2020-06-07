package com.andygeek.shoppinglistjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declare
    Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize
        btn_go = findViewById(R.id.btn_go);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a message
                String messageTitle = "Shopping List";

                // Create a intent
                Intent goListActivity = new Intent(MainActivity.this, ListActivity.class);

                // Put message in the intent
                goListActivity.putExtra("message", messageTitle);

                // Star activity with intent
                startActivity(goListActivity);

            }
        });
    }



}
