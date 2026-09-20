package com.tanasook.development;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] ids = {R.id.apartments, R.id.shops, R.id.offices, R.id.land, R.id.buildings};
        for (int id : ids) {
            Button b = findViewById(id);
            b.setOnClickListener(v -> Toast.makeText(this, b.getText(), Toast.LENGTH_SHORT).show());
        }

        Button add = findViewById(R.id.addProperty);
        add.setOnClickListener(v -> Toast.makeText(this, "إضافة عقار", Toast.LENGTH_SHORT).show());
    }
}
