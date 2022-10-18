package com.gamo.adimer.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Model>()

        list.add(Model("Hollywood","Descripcion uno",R.drawable.img01))
        list.add(Model("Alien","Descripcion dos",R.drawable.img02))
        listView.adapter=MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,list[i].title,Toast.LENGTH_SHORT).show()
        }
    }
}