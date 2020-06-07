package com.andygeek.shoppinglistjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    // Declare
    TextView txt_Title;
    ListView lst_Shopping;
    List<String> shoppingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Initialize
        txt_Title = findViewById(R.id.txt_Title);
        lst_Shopping = findViewById(R.id.lst_Shopping);

        // Must be insede of onCreate function
        Bundle messageExtra = getIntent().getExtras();
        String title = messageExtra.getString("message");
        txt_Title.setText(title);

        // Add data to list
        shoppingList = new ArrayList<String>();
        shoppingList.add("Apple");
        shoppingList.add("Orange");
        shoppingList.add("Tomatoe");
        shoppingList.add("Patata");

        // Create an adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, shoppingList);

        // Set adapter
        lst_Shopping.setAdapter(adapter);

    }
}
