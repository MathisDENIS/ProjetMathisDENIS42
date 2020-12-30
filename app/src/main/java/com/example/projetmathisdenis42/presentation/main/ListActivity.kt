package com.example.projetmathisdenis42.presentation.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetmathisdenis42.R
import com.example.projetmathisdenis42.data.acAPI
import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale
import kotlinx.android.synthetic.main.activity_list.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        fun retrofit(): Retrofit {

            return Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/MathisDENIS/ProjetMathisDENIS42/master/")
                .addConverterFactory(GsonConverterFactory.create())
                .build() //Doesn't require the adapter
        }

        val api = retrofit().create(acAPI::class.java)


        api.getPays().enqueue(object : Callback<List<PaysAmeriqueCentrale>> {
            override fun onResponse(
                call: Call<List<PaysAmeriqueCentrale>>,
                response: Response<List<PaysAmeriqueCentrale>>
            ) {
                showData(response.body()!!)
            }

            override fun onFailure(call: Call<List<PaysAmeriqueCentrale>>, t: Throwable) {
                toast("API Erreur")
            }
        })


    }

        private fun showData(users: List<PaysAmeriqueCentrale>) {

            recycler_view.adapter = ListAdapter(users)
            recycler_view.layoutManager = LinearLayoutManager(this@ListActivity)
            recycler_view.setHasFixedSize(true)
        }


}


