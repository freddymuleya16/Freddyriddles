package com.example.freddysriddles

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_level.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_riddle.*
import kotlin.math.log

class RiddleActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedPosition:Int = 0
    private var mCorrectAnswers = 0
    private var mUserName: String? = null
    private var mLevel:Int = 0
    private var nLevel:String? = null
    private var cLevel:String? = null


    private lateinit var mInterstitialAd: InterstitialAd


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riddle)

        MobileAds.initialize(this,
                "ca-app-pub-7208245764116792~7975219403")

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-7208245764116792/7817721554"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdLoaded() {
               // Toast.makeText(this@RiddleActivity,"Code to be executed when an ad finishes loading.",Toast.LENGTH_SHORT).show()
            }

            override fun onAdFailedToLoad(adError: LoadAdError) {
                //Toast.makeText(this@RiddleActivity,"Code to be executed when an ad failed loading.",Toast.LENGTH_SHORT).show()
                Log.d("asd",adError.toString())
            }

            override fun onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        }


        val adRequest = AdRequest.Builder().build()
        this.adriddleView.loadAd(adRequest)




        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName= intent.getStringExtra(Constants.USER_NAME)
        mLevel = intent.getIntExtra(Constants.LEVEL,0)
        nLevel =intent.getStringExtra(Constants.NEXTLEVEL)
        cLevel = intent.getStringExtra(Constants.CURRENTLEVEL)

        //Toast.makeText(this, getStatus(cLevel.toString()).toString(),Toast.LENGTH_SHORT).show()


        when (mLevel) {
            1 -> mQuestionsList = Constants.getQuestions()
            2 -> mQuestionsList = Constants.getQuestions2()
            3 -> mQuestionsList = Constants.getQuestions3()
            4 -> mQuestionsList = Constants.getQuestions4()
            5 -> mQuestionsList = Constants.getQuestions5()
            6 -> mQuestionsList = Constants.getQuestions6()
            7 -> mQuestionsList = Constants.getQuestions7()
            8 -> mQuestionsList = Constants.getQuestions8()
            9 -> mQuestionsList = Constants.getQuestions9()
            10 -> mQuestionsList = Constants.getQuestions10()
            11 -> mQuestionsList = Constants.getQuestions11()
            12 -> mQuestionsList = Constants.getQuestions12()
            13 -> mQuestionsList = Constants.getQuestions13()
            14 -> mQuestionsList = Constants.getQuestions14()
            15 -> mQuestionsList = Constants.getQuestions15()
            16 -> mQuestionsList = Constants.getQuestions16()
            17 -> mQuestionsList = Constants.getQuestions17()
            18 -> mQuestionsList = Constants.getQuestions18()
            19 -> mQuestionsList = Constants.getQuestions19()
            20 -> mQuestionsList = Constants.getQuestions20()

            else -> {
                mQuestionsList = Constants.getQuestions()
            }
        }

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

        btn_submit.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion(){
        val question = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text = "Skip"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition/${progressBar.max}"

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.my_border)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one->{
                selectedOptionView(tv_option_one,1)
                tv_option_one.setOnClickListener(null)
                tv_option_two.setOnClickListener(null)
                tv_option_three.setOnClickListener(null)
                tv_option_four.setOnClickListener(null)
                selectOpt()
            }
            R.id.tv_option_two->{
                selectedOptionView(tv_option_two,2)

                tv_option_one.setOnClickListener(null)
                tv_option_two.setOnClickListener(null)
                tv_option_three.setOnClickListener(null)
                tv_option_four.setOnClickListener(null)

                selectOpt()
            }
            R.id.tv_option_three->{
                selectedOptionView(tv_option_three,3)
                tv_option_one.setOnClickListener(null)
                tv_option_two.setOnClickListener(null)
                tv_option_three.setOnClickListener(null)
                tv_option_four.setOnClickListener(null)
                selectOpt()
            }
            R.id.tv_option_four->{
                selectedOptionView(tv_option_four,4)
                tv_option_one.setOnClickListener(null)
                tv_option_two.setOnClickListener(null)
                tv_option_three.setOnClickListener(null)
                tv_option_four.setOnClickListener(null)
                selectOpt()
            }

            R.id.btn_submit->{
                selectOpt()
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1 ->{
                tv_option_one.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                tv_option_two.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                tv_option_three.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                tv_option_four.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.my_selected_border)

    }

    private fun selectOpt() {

        if(mSelectedPosition == 0){
            mCurrentPosition++

            when{
                mCurrentPosition<= mQuestionsList!!.size ->{
                    setQuestion()
                    tv_option_one.setOnClickListener(this)
                    tv_option_two.setOnClickListener(this)
                    tv_option_three.setOnClickListener(this)
                    tv_option_four.setOnClickListener(this)
                }else->{





                Toast.makeText(this, "You have successfully completed  $cLevel",Toast.LENGTH_SHORT).show()

                val db = DatabaseHandler(this)


                if (getStatus(cLevel.toString())!=2){
                    //Toast.makeText(this, getStatus(cLevel.toString()).toString(),Toast.LENGTH_SHORT).show()
                    db.updateLevel(Level(0,nLevel.toString(),1,0))
                    db.updateScore(Level(0,cLevel.toString(),2,mCorrectAnswers))
                    db.updateLevel(Level(0,cLevel.toString(),2,0))
                }




                val intent = Intent(this,ResultActivity::class.java);
                intent.putExtra(Constants.USER_NAME,mUserName)
                intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList!!.size)
                startActivity(intent);
                finish();

                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                    Log.d("TAGteam", "The interstitial was loaded")

                } else {
                    Log.d("TAGteam", "The interstitial wasn't loaded yet.")
                }
            }
            }
        }else{
            val question =mQuestionsList?.get(mCurrentPosition -1)

            if(question!!.correctOption != mSelectedPosition){
                answerView(mSelectedPosition, R.drawable.my_wrong_border)
            }else{
                mCorrectAnswers++
                Toast.makeText(this,mCorrectAnswers.toString(),Toast.LENGTH_SHORT).show()

            }
            answerView(question.correctOption,R.drawable.my_correct_border)

            if (mCurrentPosition == mQuestionsList!!.size){
                btn_submit.text = "Finish"
            }else{



                btn_submit.text = "Go to next riddle"
            }

            mSelectedPosition = 0


        }
    }

    private fun getStatus(level:String):Int{
        val db = DatabaseHandler(this)
        var status = db.viewLevels()
        var locker:Int = 5
        return if(status.size>0){
            for (state in status){
                if (state.level == level){
                    locker = state.status
                }
            }
            locker
        }else{
            5
        }


    }




        }