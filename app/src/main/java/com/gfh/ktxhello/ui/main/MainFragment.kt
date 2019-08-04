package com.gfh.ktxhello.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.safeContext
import com.gfh.ktxhello.databinding.MainFragmentBinding
import com.gfh.ktxhello.ui.widget.*
import timber.log.Timber

class MainFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel

        initListener()
    }

    fun initListener() {
        //
        binding.button01.setOnClickListener {
            Timber.i("[MainFragment.initListener] button01 click")
            TextViewActivity.start(safeContext)
        }
        binding.button02.setOnClickListener {
            Timber.i("[MainFragment.initListener] button02 click")
            EditTextActivity.start(safeContext)
        }
        binding.button03.setOnClickListener {
            Timber.i("[MainFragment.initListener] button03 click")
            ButtonActivity.start(safeContext)
        }
        binding.button04.setOnClickListener {
            Timber.i("[MainFragment.initListener] button04 click")
            ImageButtonActivity.start(safeContext)
        }

        //
        binding.button11.setOnClickListener {
            Timber.i("[MainFragment.initListener] button11 click")
            RadioActivity.start(safeContext)
        }
        binding.button12.setOnClickListener {
            Timber.i("[MainFragment.initListener] button12 click")
        }
        binding.button13.setOnClickListener {
            Timber.i("[MainFragment.initListener] button13 click")
        }
        binding.button14.setOnClickListener {
            Timber.i("[MainFragment.initListener] button14 click")
        }

        //
        binding.button21.setOnClickListener {
            Timber.i("[MainFragment.initListener] button21 click")
        }
        binding.button22.setOnClickListener {
            Timber.i("[MainFragment.initListener] button22 click")
        }
        binding.button23.setOnClickListener {
            Timber.i("[MainFragment.initListener] button23 click")
        }
        binding.button24.setOnClickListener {
            Timber.i("[MainFragment.initListener] button24 click")
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }

}
