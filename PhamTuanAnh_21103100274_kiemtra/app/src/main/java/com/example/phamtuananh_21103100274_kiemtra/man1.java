package com.example.phamtuananh_21103100274_kiemtra;

import android.content.Intent;
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

public class man1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        EditText user = findViewById(R.id.txtusername);
//        EditText pass = findViewById(R.id.txtpassword);
//        Button btnsubmit = findViewById(R.id.btnenter);
//
//        btnsubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String username = user.getText().toString();
//                String password = pass.getText().toString();
//                if(!username.equals("cnttk15hn")||!password.equals("cnttk15")){
//                    Toast.makeText(man1.this, "Nhap Lai", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Intent intent = new Intent(man1.this, man2.class);
//                    startActivity(intent);
//                }
//            }
//        });


        EditText user = findViewById(R.id.txtusername);
        EditText tuoi = findViewById(R.id.txttuoi);
        EditText pass = findViewById(R.id.txtpassword);
        Button btnsubmit = findViewById(R.id.btnenter);
        Button btnExit = findViewById(R.id.btnexit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String age = tuoi.getText().toString();
                String password =  pass.getText().toString();
                if(!username.equals("tuananh")||!password.equals("1234")||!age.equals("18")){
                    Toast.makeText(man1.this, "Nhap Lai", Toast.LENGTH_SHORT).show();
                }else{
                    Intent itent = new Intent(man1.this, man2.class);
                    startActivity(itent);
                }
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}