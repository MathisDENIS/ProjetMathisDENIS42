package com.example.projetmathisdenis42.presentation.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetmathisdenis42.R
import kotlinx.android.synthetic.main.activity_create.*
import org.koin.android.ext.android.inject

class createActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)


        create_log_pass.setOnClickListener{
            mainViewModel.onClickedCreate(
                login_edit.text.toString().trim(),
                password_edit.text.toString()
            )
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



}