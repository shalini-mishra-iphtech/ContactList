package com.example.contactlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.adapter.ContactAdapter
import com.example.contactlist.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter
    private val contactList = mutableListOf<Contact>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        loadContacts()
        contactAdapter = ContactAdapter(contactList)
        recyclerView.adapter = contactAdapter
    }

    private fun loadContacts() {
        contactList.add(Contact("Alice Johnson", "133-456-7100", R.drawable.ic_user))
        contactList.add(Contact("Bob Smith", "287-654-3210", R.drawable.user1))
        contactList.add(Contact("Charlie Brown", "555-006-7017", R.drawable.user7))
        contactList.add(Contact("Charlie Knothe", "555-666-7457", R.drawable.ser3))
        contactList.add(Contact("Nathon Devid", "555-666-5677", R.drawable.user4))
        contactList.add(Contact("Chalkes Brown", "215-616-1277", R.drawable.user5))
        contactList.add(Contact("Kris Brown", "915-666-7217", R.drawable.user6))

    }
}
