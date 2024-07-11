package com.example.androidtest10;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Lab3b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3b);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Bún chả", 30000.0, R.drawable.buncha));
        productList.add(new Product("Phở bò", 35000.0, R.drawable.phobo));
        productList.add(new Product("Nem chua", 25000.0, R.drawable.nemchua));

        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
