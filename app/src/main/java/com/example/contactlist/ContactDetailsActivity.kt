
package com.example.contactlist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        // Get references to views
        val imgLogo: ImageView = findViewById(R.id.imgLogo)
        val txtName: TextView = findViewById(R.id.txtContactName)
        val txtPhone: TextView = findViewById(R.id.txtContactPhone)
        val txtDescription: TextView = findViewById(R.id.txtDescription)

        // Get data from Intent
        val name = intent.getStringExtra("EXTRA_NAME")
        val phone = intent.getStringExtra("EXTRA_PHONE")
        val imageResId = intent.getIntExtra("EXTRA_IMAGE", R.drawable.ic_user)

        // Set data to views
        txtName.text = name ?: "Unknown"
        txtPhone.text = phone ?: "No phone number"
        imgLogo.setImageResource(imageResId)
    }
}
