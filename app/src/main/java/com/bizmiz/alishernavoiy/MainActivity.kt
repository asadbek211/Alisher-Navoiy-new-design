package com.bizmiz.alishernavoiy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bizmiz.alishernavoiy.databinding.ActivityMainBinding
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homeInfoAppbar.addOnOffsetChangedListener(AppBarLayout.BaseOnOffsetChangedListener<AppBarLayout> { appBarLayout, verticalOffset ->
            if (abs(verticalOffset) >= appBarLayout.totalScrollRange) {

            } else if (verticalOffset <= -636) {
                binding.linerLay.visibility = View.GONE
            } else {
                binding.linerLay.visibility = View.VISIBLE
            }
        })
    }
}