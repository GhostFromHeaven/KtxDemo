package com.gfh.ktxhello.ui.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.gfh.ktxhello.R
import com.gfh.ktxhello.common.extension.safeContext
import com.gfh.ktxhello.common.extension.startActivity
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
        initLine0()

        initLine1()

        initLine2()

        initLine3()

        initLine4()
    }

    private fun initLine0() {
        //
        binding.button01.setOnClickListener {
            // TextView
            Timber.i("[MainFragment.initListener] button01 click")
            TextViewActivity.start(safeContext)
        }
        binding.button02.setOnClickListener {
            // EditText
            Timber.i("[MainFragment.initListener] button02 click")
            EditTextActivity.start(safeContext)
        }
        binding.button03.setOnClickListener {
            // Button
            Timber.i("[MainFragment.initListener] button03 click")
            ButtonActivity.start(safeContext)
        }
        binding.button04.setOnClickListener {
            // ImageButton
            Timber.i("[MainFragment.initListener] button04 click")
            ImageButtonActivity.start(safeContext)
        }
    }

    private fun initLine1() {
        //
        binding.button11.setOnClickListener {
            // Radio
            Timber.i("[MainFragment.initListener] button11 click")
            RadioActivity.start(safeContext)
        }
        binding.button12.setOnClickListener {
            // Shape
            Timber.i("[MainFragment.initListener] button12 click")
            ShapeActivity.start(safeContext)
        }
        binding.button13.setOnClickListener {
            // Checkbox
            Timber.i("[MainFragment.initListener] button13 click")
            CheckboxActivity.start(safeContext)
        }
        binding.button14.setOnClickListener {
            // DatePicker
            Timber.i("[MainFragment.initListener] button14 click")
            DatePickerActivity.start(safeContext)
        }
    }

    private fun initLine2() {
        //
        binding.button21.setOnClickListener {
            // TimePicker
            Timber.i("[MainFragment.initListener] button21 click")
            TimePickerActivity.start(safeContext)
        }
        binding.button22.setOnClickListener {
            // Chronometer
            Timber.i("[MainFragment.initListener] button22 click")
            ChronometerActivity.start(safeContext)
        }
        binding.button23.setOnClickListener {
            // ProgressBar
            Timber.i("[MainFragment.initListener] button23 click")
            ProgressActivity.start(safeContext)
        }
        binding.button24.setOnClickListener {
            // SeekBar
            Timber.i("[MainFragment.initListener] button24 click")
            // SeekBarActivity.start(safeContext)
            startActivity<SeekBarActivity>()
        }
    }

    private fun initLine3() {
        //
        binding.button31.setOnClickListener {
            // RatingBar
            Timber.i("[MainFragment.initListener] button31 click")
            startActivity<RatingActivity>()
        }
        binding.button32.setOnClickListener {
            // ImageView
            Timber.i("[MainFragment.initListener] button32 click")
            startActivity<ImageViewActivity>()
        }
        binding.button33.setOnClickListener {
            // ImageSwitcher
            Timber.i("[MainFragment.initListener] button33 click")
            startActivity<ImageSwitcherActivity>()
        }
        binding.button34.setOnClickListener {
            Timber.i("[MainFragment.initListener] button34 click")
            startActivity<GridViewActivity>()
        }
    }

    private fun initLine4() {
        //
        binding.button41.setOnClickListener {
            Timber.i("[MainFragment.initListener] button41 click")
        }
        binding.button42.setOnClickListener {
            Timber.i("[MainFragment.initListener] button42 click")
        }
        binding.button43.setOnClickListener {
            Timber.i("[MainFragment.initListener] button43 click")
        }
        binding.button44.setOnClickListener {
            Timber.i("[MainFragment.initListener] button44 click")
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }

}
