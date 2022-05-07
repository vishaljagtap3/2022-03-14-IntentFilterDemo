package com.bitcode.intentfilters

import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.app.AppCompatActivity
import com.bitcode.intentfilters.databinding.ImageActivityBinding

class ImageActivity : AppCompatActivity() {

    lateinit var binding: ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder().build()
        )

        binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* var imagePath = intent.getStringExtra("path")
         var imageUri = Uri.parse(imagePath)*/

        var imageUri = intent.data
        binding.img.setImageURI(imageUri)
    }
}