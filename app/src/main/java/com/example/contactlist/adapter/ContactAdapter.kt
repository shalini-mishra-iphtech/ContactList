package com.example.contactlist.adapter




import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.R
import com.example.contactlist.model.Contact

class ContactAdapter(private var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgProfile: ImageView = view.findViewById(R.id.imgProfile)
        val txtName: TextView = view.findViewById(R.id.txtName)
        val txtPhone: TextView = view.findViewById(R.id.txtPhone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        holder.txtName.text = contact.name
        holder.txtPhone.text = contact.phone
        holder.imgProfile.setImageResource(contact.imageResId)
    }

    override fun getItemCount(): Int = contactList.size
}
