//package com.example.myapplication;
//
//import android.os.Bundle;
//import android.widget.Spinner;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import com.example.androidtest10.adapter.schoolAdapter;
//import com.example.androidtest10.model.school;
//
//import java.util.ArrayList;
//
//public class Demospinner extends AppCompatActivity {
//    Spinner sp;
//    private ArrayList<school> list = new ArrayList<>();
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_demospinner);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//        sp = findViewById(R.id.spndiachi);
//        list.add(new school(R.drawable.facebook1, "Facebook"));
//        list.add(new school(R.drawable.instagram, "Instagram"));
//        list.add(new school(R.drawable.linkedin, "Linkedin"));
//        list.add(new school(R.drawable.yahoo, "Yahoo"));
//        list.add(new school(R.drawable.skype, "Skype"));
//        schoolAdapter adapter = new schoolAdapter(this, list);
//        sp.setAdapter(adapter);
//    }
//}