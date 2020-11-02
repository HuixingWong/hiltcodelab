package com.example.hiltcodelab

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by  viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            lifecycleScope.launch {
                viewModel.fetchData()
            }
        }
        viewModel.data.observe(this, {

        })

        viewModel.enbale.observe(this, {

        })

        viewModel.b.observe(this, {

        })


        viewModel.Viewstate.observe(this, {



        })

    }

    sealed class UploadViewState {
        object Initial : UploadViewState()

        data class UploadInProgress(val percentage: Int) : UploadViewState()

        object UploadFailed : UploadViewState()

        object UploadSuccess : UploadViewState()
    }

}