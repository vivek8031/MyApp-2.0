package com.example.myapp_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity{
    ArrayList<String> groceryItems;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        groceryItems = new ArrayList<>();
        groceryItems.add("VEGETABES");
        groceryItems.add("FRUITS");
        groceryItems.add("BREAD");
        groceryItems.add("Oatmeal");
        groceryItems.add("Instant dosa mix");
        groceryItems.add("Ice Cream");
        groceryItems.add("Whipping Cream");
        groceryItems.add("Yogurt");
        groceryItems.add("Eggs");
        groceryItems.add("Basmati rice");
        groceryItems.add("Potato Chips");
        groceryItems.add("Pet Food");
        groceryItems.add("Cheese");
        groceryItems.add("Turmeric Powder");
        groceryItems.add("Aluminum Foil");
        groceryItems.add("Shampoo");
        lv = (ListView) findViewById(R.id.lv_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, groceryItems);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, ""+groceryItems.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}