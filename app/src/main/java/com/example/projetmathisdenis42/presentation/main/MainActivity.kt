package com.example.projetmathisdenis42.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.projetmathisdenis42.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer {
            when (it) {
                is LoginSuccess -> {

                }
                LoginError -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Erreur")
                        .setMessage("Compte inconnu")
                        .setPositiveButton("OK") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }
            }
        })

        login_button.setOnClickListener{
            mainViewModel.onClickedLogin(
                login_edit.text.toString().trim(),
                password_edit.text.toString()
            )
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)

        }

        /*fun navigateList() {
            val myIntent = Intent(this@MainActivity, MainActivity::class.java)
            /*myIntent.putExtra(
                "paysAmeriqueCentraleKey",
                Singletons.getGson().toJson(paysAmeriqueCentrale)
            )*/
            this@MainActivity.startActivity(myIntent)
        }*/

        /*mainViewModel.counter.observe(this, androidx.lifecycle.Observer {
                value-> main_text.text = value.toString()
        })*/
    }
}