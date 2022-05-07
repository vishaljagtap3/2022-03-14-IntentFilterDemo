package com.bitcode.intentfilters

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import com.bitcode.intentfilters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder().build()
        )

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowImage.setOnClickListener {
            var intent = Intent("in.bitcode.media.SHOW")
            //intent.action = "in.bitcode.media.SHOW"
            //intent.putExtra("path", binding.edtPath.text.toString())
            intent.setDataAndType(
                Uri.parse(binding.edtPath.text.toString()),
                "image/png"
            )

            startActivity(intent)
        }
    }
}