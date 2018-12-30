package com.nyp.sit.dit.it2107.movierater

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import  android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity(){

    internal lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        var movie = Movie()
        titleName.text = movie.movieName
        overviewName.text = movie.movieDesc
        reviewName.text = movie.review
        languageName.text = movie.language
        relName.text = movie.relDate
        suitableName.text = movie.suitable

        textview = findViewById(R.id.reviewName) as TextView

        registerForContextMenu(textview)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.add(0,0, 0 ,"Add Review")
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId ==0){
            val review = Intent(this, Review::class.java)

            startActivity(review)
        }
        return super.onContextItemSelected(item)
    }
}


