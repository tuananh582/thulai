package com.example.androidtest10;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Form6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //anh xa div
        ListView listview1 = findViewById(R.id.listview1);
        //tao danh sach du lieu
        ArrayList<String> list = new ArrayList<>();
        list.add("Nguyen Thi Anh ");list.add("Nguyen Van Ban");
        list.add("Ly Thi Cam");list.add("Ngo Van Dung");
        //tao doi tuong adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1,list);
        listview1.setAdapter(adapter); //đổ dữ liệu lên listview
        //su ly su kien khi click vao gia tri tren listview
        // Đặt sự kiện OnItemClickListener cho ListView
        //listview1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        //{
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        //    {
        //        Toast.makeText(parent.this, list.get(i), Toast.LENGTH_SHORT).show();
        //    }
        //}
    }
}