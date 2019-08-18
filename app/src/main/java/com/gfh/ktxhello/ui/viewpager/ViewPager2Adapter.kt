package com.gfh.ktxhello.ui.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gfh.ktxhello.R

class ViewPager2Adapter : RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {
    private val eventList = listOf("1", "2", "3", "4")
    private val colorList = listOf(R.color.colorPrimary, R.color.colorPrimaryDark, R.color.colorAccent, R.color.colorPrimary)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_pager2_cell_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.view as? TextView)?.also {
            it.text = "Page ${eventList[position]}"
            it.setBackgroundResource(colorList[position])
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}