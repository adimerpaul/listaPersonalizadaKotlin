package com.gamo.adimer.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(var mCtx:Context,var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>(mCtx,resource,items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //inflate layout
        val layoutInflater:LayoutInflater=LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resource,null)
        val imageView:ImageView=view.findViewById(R.id.iconTv)
        val textView:TextView=view.findViewById(R.id.titleTv)
        val textView1:TextView=view.findViewById(R.id.descTv)
        var mItems:Model=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.photo))
        textView.text=mItems.title
        textView1.text=mItems.desc
        return view
    }
}