package com.dayo.executer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.dayo.executer.ui.*

//TODO: Convert AppCompatActivity to Activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val infoViewPage = findViewById<ViewPager2>(R.id.InfoViewPage)
        infoViewPage.adapter = InfoViewPageAdapter(this)

    }
}