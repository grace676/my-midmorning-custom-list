package com.haz.midmorningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = findViewById(R.id.mLIstPeople)
        users = ArrayList()
        adapter = CustomAdapter(this,users!!)
        //Create the Users to be displayed
        var user1 = User(R.mipmap.imgone, "Harrison", "0743411990")
        var user2 = User(R.mipmap.imgtwo, "Jimmy", "0743411990")
        var user3 = User(R.mipmap.imgthree, "Gatz", "0743411990")
        var user4 = User(R.mipmap.imgtwo, "Sonnie", "0743411990")
        var user5 = User(R.mipmap.imgthree, "Haz", "0743411990")
        var user6 = User(R.mipmap.imgone, "Blaze", "0743411990")
        var user7 = User(R.mipmap.imgone, "Blaze", "0743411990")
        var user8 = User(R.mipmap.imgone, "Blaze", "0743411990")
        var user9 = User(R.mipmap.imgone, "Blaze", "0743411990")

        // Add the users to the array list
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
        //Finally assign the custom adapter to the list view
        mList!!.adapter = adapter!!
    }
}