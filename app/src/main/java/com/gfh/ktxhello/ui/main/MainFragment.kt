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
import com.gfh.ktxhello.common.extension.startActivity
import com.gfh.ktxhello.databinding.MainFragmentBinding
import com.gfh.ktxhello.ui.activity.BundleActivity
import com.gfh.ktxhello.ui.activity.StartActivity
import com.gfh.ktxhello.ui.activity.StartForResultActivity
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

        initLine5()

        initLine6()

        initLine7()
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
            // Spinner
            Timber.i("[MainFragment.initListener] button41 click")
            startActivity<SpinnerActivity>()
        }
        binding.button42.setOnClickListener {
            // ListView
            Timber.i("[MainFragment.initListener] button42 click")
            startActivity<ListViewActivity>()
        }
        binding.button43.setOnClickListener {
            // ScrollView
            Timber.i("[MainFragment.initListener] button43 click")
            startActivity<ScrollViewActivity>()
        }
        binding.button44.setOnClickListener {
            // Tab
            Timber.i("[MainFragment.initListener] button44 click")
            startActivity<TabActivity>()
        }
    }

    private fun initLine5() {
        //
        binding.button51.setOnClickListener {
            // Start Stop Activity
            Timber.i("[MainFragment.initListener] button51 click")
            startActivity<StartActivity>()
        }
        binding.button52.setOnClickListener {
            // Bundle
            Timber.i("[MainFragment.initListener] button52 click")
            startActivity<BundleActivity>()
        }
        binding.button53.setOnClickListener {
            // startActivityForResult
            Timber.i("[MainFragment.initListener] button53 click")
            startActivity<StartForResultActivity>()
        }
        binding.button54.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button54 click")
        }
    }

    private fun initLine6() {
        //
        binding.button61.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button61 click")
        }
        binding.button62.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button62 click")
        }
        binding.button63.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button63 click")
            startActivity<ScrollViewActivity>()
        }
        binding.button64.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button64 click")
        }
    }

    private fun initLine7() {
        //
        binding.button71.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button71 click")
        }
        binding.button72.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button72 click")
        }
        binding.button73.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button73 click")
            startActivity<ScrollViewActivity>()
        }
        binding.button74.setOnClickListener {
            //
            Timber.i("[MainFragment.initListener] button74 click")
        }
    }
    companion object {
        fun newInstance() = MainFragment()
    }

}
