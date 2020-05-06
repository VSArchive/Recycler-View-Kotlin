package com.vs.recyclerviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view.adapter = Adapter(generateDummyList(1000))
        view.layoutManager = LinearLayoutManager(this)
        view.hasFixedSize()
    }

    private fun generateDummyList(size: Int): List<Item> {

        val list = ArrayList<Item>()

        for (i in 0 until size) {
            val item = Item("Item $i")
            list += item
        }
        return list
    }
}