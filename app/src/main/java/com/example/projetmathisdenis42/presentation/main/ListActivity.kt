package com.example.projetmathisdenis42.presentation.main

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetmathisdenis42.R
import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale
import kotlinx.android.synthetic.main.activity_list.*
import okhttp3.*
import org.jetbrains.anko.toast
import org.json.JSONObject
import java.io.IOException


class ListActivity : AppCompatActivity() {

    val BASE_URL = "https://raw.githubusercontent.com/MathisDENIS/ProjetMathisDENIS42/master/americancent.json"

    private val client = OkHttpClient()
    private var paysAC = listOf<PaysAmeriqueCentrale>()
    private lateinit var adapter: ListAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var sharedPreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        linearLayoutManager = LinearLayoutManager(this)

        recycler_view.layoutManager = linearLayoutManager

        var acList = listOf<PaysAmeriqueCentrale>()


        if (acList.isNullOrEmpty()) {
            paysAC = run(BASE_URL)
        } else {
            adapter = ListAdapter(acList)
            runOnUiThread {
                recycler_view.adapter = adapter
            }
        }
    }

    fun run(url: String): List<PaysAmeriqueCentrale> {

        val requete = Request.Builder()
            .url(url)
            .build()

        client.newCall(requete).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                var responses = client.newCall(requete).execute();
                val jsonData = responses.body()!!.string()
                val Jobject = JSONObject(jsonData)
                val Jarray = Jobject.getJSONArray("results")
                var vName: String
                var vPop: String
                var vCap: String
                var vMon: String
                var vPre: String
                var vLan: String
                var vSup: String
                var vUtc: String

                var paysAC = listOf<PaysAmeriqueCentrale>()
                for (i in 0 until Jarray.length()) {
                    vName = Jarray.getJSONObject(i).getString("name")
                    vPop = Jarray.getJSONObject(i).getString("pop")
                    vCap = Jarray.getJSONObject(i).getString("cap")
                    vMon = Jarray.getJSONObject(i).getString("mon")
                    vPre = Jarray.getJSONObject(i).getString("pre")
                    vLan = Jarray.getJSONObject(i).getString("lan")
                    vSup = Jarray.getJSONObject(i).getString("sup")
                    vUtc = Jarray.getJSONObject(i).getString("utc")

                    paysAC += PaysAmeriqueCentrale(vName, vPop, vCap, vMon, vPre, vLan, vSup, vUtc)
                }
                adapter = ListAdapter(paysAC)
                runOnUiThread { recycler_view.adapter = adapter }
            }

            override fun onFailure(call: Call, e: IOException) {
                toast("API ERROR")
            }
        })
        return paysAC
    }

}


