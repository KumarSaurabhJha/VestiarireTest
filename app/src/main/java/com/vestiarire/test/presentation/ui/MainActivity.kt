package com.vestiarire.test.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vestiarire.test.databinding.ActivityMainBinding
import com.vestiarire.test.presentation.viewmodel.WeatherForecastViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherForecastViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.init()
        setupObservers()
    }

    private fun setupObservers() {

    }

    override fun onPause() {
        super.onPause()
        viewModel.cancelFetchJob()
    }
}