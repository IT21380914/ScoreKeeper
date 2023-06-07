package com.example.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.scorekeeper.databinding.ActivityMainBinding
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        val ivT1plus=binding.ivT1plus
        val ivT1minus=binding.ivT1minus
        val ivT2plus=binding.inT2plus
        val ivT2minus=binding.ivT2minus
        val tvScore1=binding.tvScore1
        val tvScore2=binding.tvScore2

        var team1Score= parseInt(tvScore1.text.toString())
        var team2Score= parseInt(tvScore2.text.toString())

        ivT1plus.setOnClickListener{
            var newScore=TeamOnescore(ivT1plus,team1Score)
            team1Score=newScore
            tvScore1.setText("${team1Score}")
        }
        ivT1minus.setOnClickListener{
            var newScore=TeamOnescore(ivT1minus,team1Score)
            team1Score=newScore
            tvScore1.setText("${team1Score}")
        }
        ivT2plus.setOnClickListener{
            var newScore=TeamTwoscore(ivT2plus,team2Score)
            team2Score=newScore
            tvScore2.setText("${team2Score}")
        }
        ivT2minus.setOnClickListener{
            var newScore=TeamTwoscore(ivT2minus,team2Score)
            team2Score=newScore
            tvScore2.setText("${team2Score}")
        }

    }
    fun TeamOnescore(v: View,score:Int): Int {
        if (v.id == R.id.ivT1plus) {
            return score + 1
        } else if (v.id == R.id.ivT1minus) {
            return score - 1
        } else {
            return 0
        }
    }
    fun TeamTwoscore(v: View,score:Int): Int {
        if (v.id == R.id.inT2plus) {
            return score + 1
        } else if (v.id == R.id.ivT2minus) {
            return score - 1
        }else{
            return 0
        }
    }




}