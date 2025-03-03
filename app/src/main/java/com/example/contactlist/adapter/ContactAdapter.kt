package com.example.contactlist.adapter


import android.annotation.SuppressLint
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.ContactDetailsActivity
import com.example.contactlist.R
import com.example.contactlist.model.Contact

class ContactAdapter(private val contactList: List<Contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardView: CardView = itemView.findViewById(R.id.cardView)
        val imgProfile: ImageView = itemView.findViewById(R.id.imgProfile)
        val txtName: TextView = itemView.findViewById(R.id.txtName)
        val txtPhone: TextView = itemView.findViewById(R.id.txtPhone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        holder.txtName.text = contact.name
        holder.txtPhone.text = contact.phone
        holder.imgProfile.setImageResource(contact.imageResId) // Assuming you have an image ID


        holder.cardView.setOnClickListener { v ->
            val context = v.context

            // Debugging Log
            Log.d("ContactAdapter", "Clicked on: ${contact.name}")

            val intent = Intent(context, ContactDetailsActivity::class.java).apply {
                putExtra("EXTRA_NAME", contact.name)
                putExtra("EXTRA_PHONE", contact.phone)
                putExtra("EXTRA_IMAGE", contact.imageResId)
            }
            context.startActivity(intent)
        }



        // 🎯 Scale animation on click (tap effect)
        holder.cardView.setOnClickListener { v ->
            v.animate().scaleX(1.05f).scaleY(1.05f).setDuration(100).withEndAction {
                v.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
            }.start()
        }
    }




    override fun getItemCount(): Int {
        return contactList.size
    }
}
