package com.example.projetmathisdenis42.presentation.main



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetmathisdenis42.R
//import com.example.projetmathisdenis42.presentation.controller.MainController


class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

    }
}

    /*private var recyclerView: RecyclerView? = null
    private var mAdapter: ListAdapter? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val mySwipeRefreshLayout: SwipeRefreshLayout? = null

    private var controller: MainController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        controller = MainController(
            ListActivity(),
            Singletons.getgson(),
            Singletons.getSharedPreferences(applicationContext)!!
        )

        controller!!.onStart()
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    fun showList(acList: List<PaysAmeriqueCentrale?>?) {
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager
        mAdapter = ListAdapter(acList, object : OnItemClickListener() {
            fun onItemClick(item: PaysAmeriqueCentrale?) {
                controller.OnItemClick(item)
            }
        })
        recyclerView!!.adapter = mAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    fun showError() {
        Toast.makeText(applicationContext, "API ERROR", Toast.LENGTH_SHORT).show()
    }

    /*fun navigateDetails(paysAmeriqueCentrale: PaysAmeriqueCentrale?) {
        val myIntent = Intent(this@ListActivity, DetailActivity::class.java)
        myIntent.putExtra(
            "paysAmeriqueCentraleKey",
            Singletons.gson?.toJson(paysAmeriqueCentrale)
        )
        this@ListActivity.startActivity(myIntent)
    }*/


}*/