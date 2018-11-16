package com.nyp.sit.dit.it2107.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nc16.setOnClickListener{
            if (nc16.isChecked)
            { violence.visibility=View.VISIBLE
                languageUsed.visibility=View.VISIBLE
            }
            else {violence.visibility=View.INVISIBLE
                languageUsed.visibility=View.INVISIBLE
            }
        }
    }
}
