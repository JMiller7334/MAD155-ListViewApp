package com.ebookfrenzy.mad155_listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView) //find the list view - See xml file
        val names = arrayOf("Kotlin", "Javascript", "Python", "Lua", "HTML") // strings/names tobe desplayed by listview

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_expandable_list_item_1, names
        )// configure the array adapter

        listView.adapter = arrayAdapter //set the listview's adapter to the one just created.

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "obj selected:"+names[i], Toast.LENGTH_SHORT).show()
        } //function to fire on selected item
    }
}