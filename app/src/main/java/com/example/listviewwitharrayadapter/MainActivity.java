package com.example.listviewwitharrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Produit> data=new ArrayList<Produit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);

        data.add(new Produit(1,"téléphone","samsung galaxy",800.50,50));
        data.add(new Produit(2,"casque","sans fil",49.99,100));
        data.add(new Produit(3,"écouteur","xiomi sans fil ",25.00,250));


        //ArrayAdapter ad=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,data) ;

        MonAdapter ad=new MonAdapter(MainActivity.this,data);

        lv.setAdapter(ad);

    }
}