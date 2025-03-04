package com.example.contactlist

import android.os.Bundle
import androidx.annotation.OptIn
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.adapter.ContactAdapter
import com.example.contactlist.model.Contact

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.simpleName
    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter
    private val contactList = mutableListOf<Contact>()

    @OptIn(UnstableApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        if (TAG != null) {
            Log.d(TAG,"onCreate")
        }
        loadContacts()
        contactAdapter = ContactAdapter(contactList)
        recyclerView.adapter = contactAdapter
    }

    private fun loadContacts() {
        contactList.add(Contact("Alice Johnson", "133-456-7100", R.drawable.ic_user))
        contactList.add(Contact("Bob Smith", "287-654-3210", R.drawable.user1))
        contactList.add(Contact("Charlie Brown", "555-006-7017", R.drawable.user7))
        contactList.add(Contact("Charlie Knothe", "325-666-7457", R.drawable.ser3))
        contactList.add(Contact("Nathon Devid", "125-666-5677", R.drawable.user4))
        contactList.add(Contact("Chalkes Brown", "215-616-1277", R.drawable.user5))
        contactList.add(Contact("Kris Brown", "915-666-7217", R.drawable.user6))
    }

    @OptIn(UnstableApi::class)
    override fun onStart() {
        super.onStart()
        if (TAG != null) {
            Log.d(TAG,"Onstart")
        }

    }

    @OptIn(UnstableApi::class)
    override fun onResume() {
        super.onResume()
        if (TAG != null) {
            Log.d(TAG,"OnResume")
        }

    }

    @OptIn(UnstableApi::class)
    override fun onPause() {
        super.onPause()
        if(TAG!=null){
            Log.d(TAG,"OnPause")
        }
    }

    @OptIn(UnstableApi::class)
    override fun onStop() {
        super.onStop()
        if(TAG!=null){
            Log.d(TAG,"Onstop")
        }
    }

    @OptIn(UnstableApi::class)
    override fun onRestart() {
        super.onRestart()
        if(TAG!=null){
            Log.d(TAG,"OnRestart")
        }
    }

    @OptIn(UnstableApi::class)
    override fun onDestroy() {
        super.onDestroy()
        if(TAG!=null){
            Log.d(TAG,"OnDestroy")
        }
    }

}
