package com.example.androidtest10;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidtest10.adapter.schoolAdapter;
import com.example.androidtest10.model.school;

import java.util.ArrayList;

public class VDSpinner1 extends AppCompatActivity {
    Spinner sp;
    //String tencs;
    private ArrayList<school> list = new ArrayList<>();// Tạo danh sách

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vdspinner1);
        //anh xa
        sp = findViewById(R.id.spinnerdiachi);
        //Button btnsubmit = findViewById(R.

        //add doi tuong vao list
        list.add(new school(R.drawable.vnlg_glitch, "Hà Nội"));
        list.add(new school(R.drawable.vnlg_glitch, "Hà Nam"));
        list.add(new school(R.drawable.vnlg_glitch, "Thái Bình"));
        list.add(new school(R.drawable.vnlg_glitch, "Bình Thuận"));
        list.add(new school(R.drawable.vnlg_glitch, "Hà Giang"));
        list.add(new school(R.drawable.vnlg_glitch, "Bắc Ninh"));
        list.add(new school(R.drawable.vnlg_glitch, "Ninh Thuận"));
        list.add(new school(R.drawable.vnlg_glitch, "Biên Hòa"));
        list.add(new school(R.drawable.vnlg_glitch, "Bình Định"));
        list.add(new school(R.drawable.vnlg_glitch, "Đà Nẵng"));
        schoolAdapter adapter = new schoolAdapter(this, list);
        sp.setAdapter(adapter); // đo dữ liệu lên spinner

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}