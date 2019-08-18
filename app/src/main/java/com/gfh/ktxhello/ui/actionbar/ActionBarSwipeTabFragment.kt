package com.gfh.ktxhello.ui.actionbar


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.gfh.ktxhello.R

class ActionBarSwipeTabFragment private constructor(private val name: String, private val colorId: Int) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root: View = inflater.inflate(R.layout.action_bar_tab_fragment, container, false)
        val tv: TextView = root.findViewById(R.id.textView)
        tv.text = name
        root.setBackgroundResource(colorId)
        return root
    }

    companion object {
        fun createInstance(name: String, color: Int): ActionBarSwipeTabFragment {
            return ActionBarSwipeTabFragment(name, color)
        }
    }
}
