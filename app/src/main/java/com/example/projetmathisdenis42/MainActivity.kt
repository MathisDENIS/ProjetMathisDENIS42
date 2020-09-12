package com.example.projetmathisdenis42

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import java.util.Observer

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_button.setOnClickListener{
            mainViewModel.onClickedIncrement()
        }

        mainViewModel.counter.observe(this, androidx.lifecycle.Observer {
                value-> main_text.text = value.toString()
        })
    }
}