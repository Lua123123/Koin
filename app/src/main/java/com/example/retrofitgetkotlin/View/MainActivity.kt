package com.example.retrofitgetkotlin.View

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.retrofitgetkotlin.Fragment.CallApi
import com.example.retrofitgetkotlin.Fragment.PostApi
import com.example.retrofitgetkotlin.R
import com.example.retrofitgetkotlin.model.User
import com.example.retrofitgetkotlin.viewmodel.MainViewModel
import org.koin.android.ext.android.get
import kotlin.getValue

class MainActivity : AppCompatActivity() {

//    var txtTitle: TextView? = null
//    var txtWoeid: TextView? = null
//    var txtLocationtype: TextView? = null
//    var txtLatlng: TextView? = null
//    var txtPostapi: TextView? = null
    var fragmentCallapi: Button? = null
    var fragmentPostapi: Button? = null

    //MVVM
    val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mainViewModel.mutableLiveDataClickCallApi()

//        val user = get<User>()
//        Log.d("iii", user.toString())

        initView();

    }

    private fun initView() {
//        txtTitle = findViewById<TextView>(R.id.txtTitle)
//        txtLocationtype = findViewById<TextView>(R.id.txtLocationtype)
//        txtWoeid = findViewById<TextView>(R.id.txtWoeid)
//        txtLatlng = findViewById<TextView>(R.id.txtLatlng)
//        txtPostapi = findViewById<TextView>(R.id.txtPostapi)
        fragmentCallapi = findViewById<Button>(R.id.fragmentCallapi)
        fragmentPostapi = findViewById<Button>(R.id.fragmentPostapi)



        fragmentCallapi?.setOnClickListener(View.OnClickListener { replaceFragment(
            CallApi()
        ) })

        fragmentPostapi?.setOnClickListener(View.OnClickListener { replaceFragment(
            PostApi()
        ) })


//        mainViewModel.mWeathers.observe(this)
//        {
//            txtTitle!!.text = it!![0].title
//            txtLocationtype!!.text = it[0].locationType
//            txtWoeid!!.text = String.valueOf(it[0].woeid)
//            txtLatlng!!.text = it[0].lattLong
//        }

//        mainViewModel.mUsers.observe(this)
//        {
//            txtPostapi!!.text = it!!.toString()
//        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
