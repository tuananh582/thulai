package com.example.androidtest10;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class baiso3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_baiso3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //anh xa
        ListView lvbai3= findViewById(R.id.lvbai3);
        ArrayList<String> list = new ArrayList<>();
        //tao list danh sach du lieu
        list.add("Tom");list.add("Jerry");list.add("Hai");
        list.add("Tam");list.add("Jey");list.add("Brey");
        list.add("Tinh");list.add("Joey");list.add("WHat");
        list.add("Thinh");list.add("Man");list.add("Thai");
        //
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        lvbai3.setAdapter(adapter);
        //dang ky view nhan bang
        registerForContextMenu(lvbai3);
    }
    //Tao context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo)
    {
        //getMenuInflater().inflate(R.menu.bang,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}