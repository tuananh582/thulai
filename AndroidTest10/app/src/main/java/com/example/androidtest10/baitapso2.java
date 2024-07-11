/*package com.example.androidtest10;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class baitapso2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_baitapso2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //anh xa
        Toolbar toolbar=(findViewById(R.id.toolbar));
        setSupportActionBar(toolbar);
        //
        getSupportActionBar().setTitle("Lt Mobile"); //gan tieu de
        getSupportActionBar().setSubtitle("A1c1"); // tieu de phu
        getSupportActionBar().setLogo(R.drawable._307_msn_102525);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  //gán nút back
    }
    //gan option cho menu len toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //getMenuInflater().inflate(R.menu.bang, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //xu ly su kien chon file
/*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId()== R.id.view)
        {
            Toast.makeText(this, "view", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()== R.id.view)
        {
            Intent intent = new Intent(baitapso2.this, baitapgrid1.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
 */