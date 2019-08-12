package com.gfh.ktxhello.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.gfh.ktxhello.R
import org.jetbrains.anko.find
import org.jetbrains.anko.toast

class BundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bundle_activity)

        val button: Button = findViewById(R.id.commit)
        val site1: EditText = find(R.id.et_site1)
        val site2: EditText = find(R.id.et_site2)

        button.setOnClickListener {
            val s1 = site1.text.toString()
            val s2 = site2.text.toString()

            if (s1.isBlank() || s2.isBlank()) {
                toast("请填写完成的地址")
                return@setOnClickListener
            }

            val intent = Intent(this, ShowBundleActivity::class.java)

//            val bundle = Bundle()
//            bundle.putString("s1", s1)
//            bundle.putString("s2", s2)
//            intent.putExtras(bundle)

            intent.putExtra("s1", s1)
            intent.putExtra("s2", s2)

            startActivity(intent)
        }
    }
}
