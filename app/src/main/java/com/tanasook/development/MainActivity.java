package com.tanasook.development;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] categoryButtons = {
                R.id.apartments, R.id.shops, R.id.offices,
                R.id.land, R.id.buildings
        };
        for (int id : categoryButtons) {
            findViewById(id).setOnClickListener(v ->
                    Toast.makeText(this, "سيتم عرض العقارات في هذا القسم", Toast.LENGTH_SHORT).show());
        }
        findViewById(R.id.addProperty).setOnClickListener(v ->
                Toast.makeText(this, "شاشة إضافة العقار جاهزة للربط بقاعدة البيانات", Toast.LENGTH_SHORT).show());
    }
}
