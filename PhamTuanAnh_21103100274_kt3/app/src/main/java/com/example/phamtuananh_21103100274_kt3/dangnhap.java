package com.example.phamtuananh_21103100274_kt3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class dangnhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dangnhap);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText user = findViewById(R.id.txtusername);
        EditText pass = findViewById(R.id.txtpassword);
        Button btnsubmit = findViewById(R.id.btnenter);
        Button btnexit = findViewById(R.id.btnexit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String password = user.getText().toString();
              if(!username.equals("cnttk15hn")|| !password.equals("cnttk15")){
                  Toast.makeText(dangnhap.this, "Nhap Lai", Toast.LENGTH_SHORT).show();
              }
            }
        });
    }
}