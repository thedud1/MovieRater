package com.nyp.sit.dit.it2107.movierater

import android.support.v7.app.AppCompatActivity
import  android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetail : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        var movie = Movie()
        titleName.text = movie.movieName
        overviewName.text = movie.movieDesc
        languageName.text = movie.language
        relName.text = movie.relDate
        suitableName.text = movie.suitable
    }
}


