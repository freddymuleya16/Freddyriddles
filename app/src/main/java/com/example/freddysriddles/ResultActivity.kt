package com.example.freddysriddles

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds


import com.google.android.gms.ads.interstitial.InterstitialAd
import kotlinx.android.synthetic.main.activity_level.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        toggle = ActionBarDrawerToggle(this, drawerLayoutR, R.string.open,R.string.close)
        drawerLayoutR.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_viewR.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> {
                    val intent = Intent(this, Leaderboard::class.java)
                    startActivity(intent)
                }
            }
            true
        }

        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        this.adViewresult.loadAd(adRequest)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this, LevelActivity::class.java))
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}