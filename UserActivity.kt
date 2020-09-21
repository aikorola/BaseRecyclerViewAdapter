package com.testAdapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.v6v10.R
import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val data = mutableListOf<UserInfo>()

        (1..100).forEach {
            val value = it.plus(1)
            data.add(UserInfo("张三$value", value))
        }

        userRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(data)
    }
}