package com.gfh.ktxhello.ui.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import com.gfh.ktxhello.R
import org.jetbrains.anko.toast
import timber.log.Timber

class RatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating_activity)

        val button = findViewById<Button>(R.id.button)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        button.setOnClickListener {
            val progress = ratingBar.progress
            val rating = ratingBar.rating
            val step = ratingBar.stepSize

            Timber.i("progress $progress")
            Timber.i("rating $rating")
            Timber.i("step $step")

            toast("rating : $rating")
        }

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            toast("rating : $rating")
        }
    }
}
