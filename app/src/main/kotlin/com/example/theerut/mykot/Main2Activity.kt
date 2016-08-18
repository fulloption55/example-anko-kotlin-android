package com.example.theerut.mykot

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        toast("Hello, This is page 2!")
    }
}
