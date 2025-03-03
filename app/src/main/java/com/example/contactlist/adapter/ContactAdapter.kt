
package com.example.contactlist.adapter  // ✅ Ensure package declaration is at the top
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.ContactDetailActivity
import com.example.contactlist.R
import com.example.contactlist.model.Contact

class ContactAdapter(private val contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.txtName)
        val phone: TextView = itemView.findViewById(R.id.txtPhone)
        val profileImage: ImageView = itemView.findViewById(R.id.imgProfile)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        holder.name.text = contact.name
        holder.phone.text = contact.phone
        holder.profileImage.setImageResource(contact.imageResId)

        // Handle click event
        holder.cardView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ContactDetailActivity::class.java).apply {
                putExtra("name", contact.name)
                putExtra("phone", contact.phone)
                putExtra("image", contact.imageResId)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = contactList.size
}
