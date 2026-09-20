package com.tanasook.development

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttons = listOf(R.id.apartments, R.id.shops, R.id.offices, R.id.land, R.id.buildings)
        buttons.forEach { id -> findViewById<Button>(id).setOnClickListener { Toast.makeText(this, "سيتم عرض العقارات في هذا القسم", Toast.LENGTH_SHORT).show() } }
        findViewById<Button>(R.id.addProperty).setOnClickListener { Toast.makeText(this, "شاشة إضافة العقار جاهزة للربط بقاعدة البيانات", Toast.LENGTH_SHORT).show() }
    }
}
