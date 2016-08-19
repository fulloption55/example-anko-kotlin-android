package com.example.theerut.mykot

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setOnClick()
    }

    fun setOnClick() {
        button_main.setOnClickListener(onClickButtonMain)
        next_page_button.setOnClickListener(onClickNextPageButton)
    }

    val onClickButtonMain = View.OnClickListener {
        text_main.text = Math.random().toString()
    }

    val onClickNextPageButton = View.OnClickListener {
        startActivity(intentFor<Main2Activity>())
    }


}
