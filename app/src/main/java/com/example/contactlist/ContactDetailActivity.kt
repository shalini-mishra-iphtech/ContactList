
package com.example.contactlist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imageResId = intent.getIntExtra("image", -1)

        findViewById<TextView>(R.id.detail_name).text = name
        findViewById<TextView>(R.id.detail_phone).text = phone
        findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)

        if (imageResId != -1) {
            findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)
        }

    }
}
