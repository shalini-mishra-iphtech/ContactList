
package com.example.contactlist

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    val TAG = MainActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)


        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imageResId = intent.getIntExtra("image", -1)

        if(TAG!=null){
            Log.d(TAG ,"OnCreate")
        }

        findViewById<TextView>(R.id.detail_name).text = name
        findViewById<TextView>(R.id.detail_phone).text = phone
        findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)

        if (imageResId != -1) {
            findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)
        }

    }

    override fun onStart() {
        super.onStart()
        if(TAG!=null){
            Log.d(TAG,"OnStart is called")
        }
    }

    override fun onResume() {
        super.onResume()
        if(TAG!=null){
            Log.d(TAG ,"OnResume is called")
        }
    }

    override fun onPause(){
        super.onPause()
        if(TAG!=null){
            Log.d(TAG,"OnPause is called")
        }

    }

    override fun onStop() {
        super.onStop()
        if(TAG!=null){
            Log.d(TAG,"onStop is created")
        }
    }

    override fun onRestart() {
        super.onRestart()
        if(TAG!=null){
            Log.d(TAG,"OnRestart is called")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if(TAG!=null){
            Log.d(TAG ,"OnDestroy is called")
        }
    }

}
