package com.nyp.sit.dit.it2107.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
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

        fun validate()
        {
            if(movieName.text.isEmpty())
                movieName.setError("Field empty")
            if(DText.text.isEmpty())
                DText.setError("Field empty")
            if(ReleaseDate.text.isEmpty())
                ReleaseDate.setError("Field empty")

        }

         validate.setOnClickListener{
            validate()



                var id = languageChoice.checkedRadioButtonId
                val radio: RadioButton = findViewById(id)
                var movie: String = movieName.text.toString()
                var description: String = DText.text.toString()
                var releaseDate: String = ReleaseDate.text.toString()
                var reasonViolence: String = ""
                var reasonProfanity: String = ""
                var allAges: String = ""

                if (nc16.isChecked) {
                    allAges = "False"
                } else {
                    allAges = "True"
                }

                if (violence.isChecked) {
                    reasonViolence = "Violence"
                }

                if (languageUsed.isChecked) {
                    reasonProfanity = "Language"
                }

                Toast.makeText(
                    this, "Title = ${movie}\n Overview = ${description}\n " +
                            "Release date = ${releaseDate}\n Language = ${radio.text}\n Suitable for all ages = ${allAges}\n" +
                            "reason:\n ${reasonProfanity}\n ${reasonViolence}", Toast.LENGTH_SHORT
                ).show()

        }
    }
}
