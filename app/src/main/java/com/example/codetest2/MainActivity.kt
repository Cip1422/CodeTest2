package com.example.codetest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  thing = arrayListOf(2,8,9,3,4,3,2,6,6,2,4,9,8)

        thing.sort()

        answer.text = thing.toString()

        var frog = "frog"

        string_stuff.text = getSubstring(frog).toString()

    }


    fun getSubstring(frog:String): MutableList<String> {

        var stringList = mutableListOf<String>()

        var size_string = frog.length
        for(i in 0..size_string)
        {
            for(j in 0 ..size_string) {
                if(i< j) {
                    var str_add = frog.removeRange(i, j)
                    stringList.add(str_add)
                }
            }

        }
       return stringList

    }

}
