package com.example.androidtest10;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ListView;

import com.example.androidtest10.adapter.CustomAdapter;

public class Lab3a extends AppCompatActivity {

    String[] socialNetworkNames = {
            "Facebook", "LinkedIn", "MSN", "Skype", "Yahoo", "Twitter"
    };

    int[] socialNetworkIcons = {
            R.drawable.apps_37935_9007199266245907_b029bd80_381a_4869_854f_bac6f359c5c9, R.drawable._77519684_10158675188522823_7436488509713286219_n, R.drawable._307_msn_102525,
            R.drawable._201516, R.drawable.pngtreeyahoo_purple_icon_3591532, R.drawable.apps_60673_9007199266244427_4d45042b_d7a5_4a83_be66_97779553b24d
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab3a);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CustomAdapter adapter = new CustomAdapter(this, socialNetworkNames, socialNetworkIcons);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
