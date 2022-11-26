package com.asma.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asma.recyclerview.adapter.userAdapter
import com.asma.recyclerview.model.User

class MainActivity : AppCompatActivity() {


    private var userArrayList: ArrayList<User>? = null
    private var userAdapter: userAdapter? = null
    private var recyclerViewUser: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewUser = findViewById(R.id.usersRecyclerView)
        userArrayList = ArrayList()
        setUserInfo()
        setAdapter()
    }

    private fun setAdapter() {

        userAdapter = userAdapter(userArrayList!!)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)

        recyclerViewUser!!.layoutManager = layoutManager

        recyclerViewUser!!.itemAnimator = DefaultItemAnimator()

        recyclerViewUser!!.adapter = userAdapter

    }

    private fun setUserInfo() {
        userArrayList!!.add(User("Sara", false))
        userArrayList!!.add(User("Mehwish", false))
        userArrayList!!.add(User("Mahnoor", false))
        userArrayList!!.add(User("Asma", false))
        userArrayList!!.add(User("Tanzila", false))
    }
}