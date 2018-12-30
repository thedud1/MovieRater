package com.nyp.sit.dit.it2107.movierater

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class LandingPage : AppCompatActivity() {

    internal lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landingpage)

        textview = findViewById(R.id.landingPage) as TextView

        registerForContextMenu(textview)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.add(0,0, 0 ,"Add")
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId ==0){
            val addMovie = Intent(this, MainActivity::class.java)

            startActivity(addMovie)
        }
        return super.onContextItemSelected(item)

    }
}