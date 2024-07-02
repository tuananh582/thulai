package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class giaodien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_giaodien);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnsubmit= findViewById(R.id.btnsubmit);

        RadioButton jv = findViewById(R.id.jv);
        RadioButton c = findViewById(R.id.c);
        RadioButton python = findViewById(R.id.python);
        EditText txtmon = findViewById(R.id.txtmon);
// Xu Ly Su Kien Cho Button
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mon = String.valueOf(txtmon.getText());
                String gt="";
                if(jv.isChecked()){
                    gt="java";
                }
                else if(c.isChecked()){
                    gt="c";
                }
                else{
                    gt="khac";
                }
                Toast.makeText(giaodien.this, "Hello",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
