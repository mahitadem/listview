package com.jiad.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listviewm=findViewById<ListView>(R.id.mylistview)
        val majina= arrayOf("Kenya","Tanzania","Uganda","Ethopia","Rwanda")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,majina)
        listviewm.adapter=arrayAdapter

        listviewm.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "You have clicked on " + majina[position], Toast.LENGTH_LONG).show()
        }
    }
}