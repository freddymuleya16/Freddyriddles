package com.example.freddysriddles

import android.app.Notification
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ImageSpan
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_level.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_riddle.*
import java.lang.Exception

class LevelActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var  mInterstitialAd:InterstitialAd

    private var mUsedName:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        adStuff()



        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> {
                    val intent = Intent(this, Leaderboard::class.java)
                    startActivity(intent)
                }
                R.id.donate->{
                    val intent = Intent(this,ResultActivity::class.java);
                    intent.putExtra(Constants.USER_NAME,"f")
                    intent.putExtra(Constants.CORRECT_ANSWERS,"5")
                    intent.putExtra(Constants.TOTAL_QUESTIONS,5)
                    startActivity(intent);
                }
            }
            true
        }

        //Log.d("fred11", tv_level_seven.text.toString())
        setLevelNo()
        insertLevel()
        if (getStatus(tv_level_one.text.toString())==0) {
            //Toast.makeText(this,"Level 1 Unlocked",Toast.LENGTH_SHORT).show()
            updateLevel(Level(0, tv_level_one.text.toString(), 1, 0))
        }else{
            //Toast.makeText(this,"Level 1 still locked Unlocked",Toast.LENGTH_SHORT).show()
        }
        lockLevels()

        mUsedName= intent.getStringExtra(Constants.USER_NAME)

        setClick();

        tv_level_one.setOnClickListener(this)
        tv_level_two.setOnClickListener(this)
        tv_level_three.setOnClickListener(this)
        tv_level_four.setOnClickListener(this)
        tv_level_five.setOnClickListener(this)
        tv_level_six.setOnClickListener(this)
        tv_level_seven.setOnClickListener(this)
        tv_level_eight.setOnClickListener(this)
        tv_level_nine.setOnClickListener(this)
        tv_level_ten.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_level_one->{
                goForward(1,tv_level_two,tv_level_one)
            }
            R.id.tv_level_two->{

                goForward(2,tv_level_three,tv_level_two)


            }

            R.id.tv_level_three->{
                goForward(3,tv_level_four,tv_level_three)


            }
            R.id.tv_level_four->{
                goForward(4,tv_level_five,tv_level_four)

            }
            R.id.tv_level_five->{
                goForward(5,tv_level_six,tv_level_five)

            }

            R.id.tv_level_six->{
                goForward(6,tv_level_seven,tv_level_six)


            }

            R.id.tv_level_seven->{
                goForward(7,tv_level_eight,tv_level_seven)

            }
            R.id.tv_level_eight->{
                goForward(8,tv_level_nine,tv_level_eight)

            }
            R.id.tv_level_nine->{
                goForward(9,tv_level_ten,tv_level_nine)

            }
            R.id.tv_level_ten->{
                goForward(10,tv_level_eleven,tv_level_ten)

            }
            R.id.tv_level_eleven->{
                goForward(11,tv_level_twelve,tv_level_eleven)

            }

            R.id.tv_level_twelve->{
                goForward(12,tv_level_threeteen,tv_level_twelve)

            }

            R.id.tv_level_threeteen->{
                goForward(13,tv_level_fourteen,tv_level_threeteen)

            }

            R.id.tv_level_fifteen->{
                goForward(15,tv_level_sixteen,tv_level_fifteen)

            }

            R.id.tv_level_fourteen->{
                goForward(14,tv_level_fifteen,tv_level_fourteen)

            }

            R.id.tv_level_sixteen->{
                goForward(16,tv_level_seventeen,tv_level_sixteen)

            }
            R.id.tv_level_seventeen->{
                goForward(17,tv_level_eightteen,tv_level_seventeen)

            }
            R.id.tv_level_eightteen->{
                goForward(18,tv_level_19,tv_level_eightteen)

            }
            R.id.tv_level_19->{
                goForward(19,tv_level_20,tv_level_19)

            }
            R.id.tv_level_20->{
                goForward(20,tv_level_21,tv_level_20)

            }

            R.id.tv_level_21 ->{
               // dbtest.text = Constants.getQuestions20()
            }




        }
    }

    private fun setLevelNo(){
        val levels = ArrayList<TextView>()

        levels.add(0,tv_level_19)
        levels.add(1,tv_level_20)
        levels.add(2,tv_level_21)
        levels.add(3,tv_level_22)
        levels.add(4,tv_level_23)
        levels.add(5,tv_level_24)
        levels.add(6,tv_level_25)
        levels.add(7,tv_level_26)
        levels.add(8,tv_level_27)
        levels.add(9,tv_level_28)
        levels.add(10,tv_level_29)
        levels.add(11,tv_level_30)
        levels.add(12,tv_level_31)
        levels.add(13,tv_level_32)
        levels.add(14,tv_level_33)
        levels.add(15,tv_level_34)
        levels.add(16,tv_level_35)
        levels.add(17,tv_level_36)
        levels.add(18,tv_level_37)
        levels.add(19,tv_level_38)
        levels.add(20,tv_level_39)
        levels.add(21,tv_level_40)
        levels.add(22,tv_level_41)
        levels.add(23,tv_level_42)
        levels.add(24,tv_level_43)
        levels.add(25,tv_level_44)
        levels.add(26,tv_level_45)
        levels.add(27,tv_level_46)
        levels.add(28,tv_level_47)
        levels.add(29,tv_level_48)



        var start:Int = 19

        for (level in levels){
            level.text = "Level "+ start.toString()
            level.setOnClickListener(this)
            start++
        }
    }

    private fun insertLevel(){
        val db = DatabaseHandler(this)
        val allLev = db.allLevels

        if (allLev.count==0) {

            val levels = ArrayList<TextView>()
            levels.add(0,tv_level_one)
            levels.add(1,tv_level_two)
            levels.add(2,tv_level_three)
            levels.add(3,tv_level_four)
            levels.add(4,tv_level_five)
            levels.add(5,tv_level_six)
            levels.add(6,tv_level_seven)
            levels.add(7,tv_level_eight)
            levels.add(8,tv_level_nine)
            levels.add(9,tv_level_ten)
            levels.add(10,tv_level_eleven)
            levels.add(11,tv_level_twelve)
            levels.add(12,tv_level_threeteen)
            levels.add(13,tv_level_fourteen)
            levels.add(14,tv_level_fifteen)
            levels.add(15,tv_level_sixteen)
            levels.add(16,tv_level_seventeen)
            levels.add(17,tv_level_eightteen)
            levels.add(18, tv_level_19)
            levels.add(19, tv_level_20)
            levels.add(20, tv_level_21)
            levels.add(21, tv_level_22)
            levels.add(22, tv_level_23)
            levels.add(23, tv_level_24)
            levels.add(24, tv_level_25)
            levels.add(25, tv_level_26)
            levels.add(26, tv_level_27)
            levels.add(27, tv_level_28)
            levels.add(28, tv_level_29)
            levels.add(29, tv_level_30)
            levels.add(30, tv_level_31)
            levels.add(31, tv_level_32)
            levels.add(32, tv_level_33)
            levels.add(33, tv_level_34)
            levels.add(34, tv_level_35)
            levels.add(35, tv_level_36)
            levels.add(36, tv_level_37)
            levels.add(37, tv_level_38)
            levels.add(38, tv_level_39)
            levels.add(39, tv_level_40)
            levels.add(40, tv_level_41)
            levels.add(41, tv_level_42)
            levels.add(42, tv_level_43)
            levels.add(43, tv_level_44)
            levels.add(44, tv_level_45)
            levels.add(45, tv_level_46)
            levels.add(46, tv_level_47)
            levels.add(47, tv_level_48)


            for (level in levels) {
                try {
                    db.insertLevel(Level(0, level.text.toString(), 0,0))

                } catch (e: Exception) {
                    e.printStackTrace()
                    Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show()
                }


            }
        }

    }

    private fun updateLevel(level:Level){
        val db = DatabaseHandler(this)
        db.updateLevel(level)
    }

    fun showAll(){
        val db = DatabaseHandler(this)
        val allLev = db.allLevels

        if (allLev.count==0){
            dbtest.text= "ëmpty" + "Count: "+allLev.count.toString()
        }else {

            val buffer = StringBuffer()
            while (allLev.moveToNext()) {
                buffer.append("ID: " + allLev.getString(0))
                buffer.append("\nLevel: " + allLev.getString(1))
                buffer.append("\nStatus: " + allLev.getString(2))
            }

            dbtest.text = buffer.toString() + "Count: "+allLev.count.toString()
        }
    }

    private fun lockLevels(){
        val levels = ArrayList<TextView>()
        levels.add(0,tv_level_one)
        levels.add(1,tv_level_two)
        levels.add(2,tv_level_three)
        levels.add(3,tv_level_four)
        levels.add(4,tv_level_five)
        levels.add(5,tv_level_six)
        levels.add(6,tv_level_seven)
        levels.add(7,tv_level_eight)
        levels.add(8,tv_level_nine)
        levels.add(9,tv_level_ten)
        levels.add(10,tv_level_eleven)
        levels.add(11,tv_level_twelve)
        levels.add(12,tv_level_threeteen)
        levels.add(13,tv_level_fourteen)
        levels.add(14,tv_level_fifteen)
        levels.add(15,tv_level_sixteen)
        levels.add(16,tv_level_seventeen)
        levels.add(17,tv_level_eightteen)
        levels.add(18, tv_level_19)
        levels.add(19, tv_level_20)
        levels.add(20, tv_level_21)
        levels.add(21, tv_level_22)
        levels.add(22, tv_level_23)
        levels.add(23, tv_level_24)
        levels.add(24, tv_level_25)
        levels.add(25, tv_level_26)
        levels.add(26, tv_level_27)
        levels.add(27, tv_level_28)
        levels.add(28, tv_level_29)
        levels.add(29, tv_level_30)
        levels.add(30, tv_level_31)
        levels.add(31, tv_level_32)
        levels.add(32, tv_level_33)
        levels.add(33, tv_level_34)
        levels.add(34, tv_level_35)
        levels.add(35, tv_level_36)
        levels.add(36, tv_level_37)
        levels.add(37, tv_level_38)
        levels.add(38, tv_level_39)
        levels.add(39, tv_level_40)
        levels.add(40, tv_level_41)
        levels.add(41, tv_level_42)
        levels.add(42, tv_level_43)
        levels.add(43, tv_level_44)
        levels.add(44, tv_level_45)
        levels.add(45, tv_level_46)
        levels.add(46, tv_level_47)
        levels.add(47, tv_level_48)
        for (level in levels) {
            if (getStatus(level.text.toString())==0){
                val lock: Drawable? =ContextCompat.getDrawable(this,R.drawable.lock)
                lock!!.setBounds(0,0,80,80)
                level.setCompoundDrawables(null,null,null,lock)

                level.setTextColor(Color.parseColor("#57FFFFFF"))
            }
            //level.text = getStatus(level.id.toString()).toString()
        }

    }

    fun unlockLevel(level: Level){
        val levels = ArrayList<TextView>()
        levels.add(0,tv_level_one)
        levels.add(1,tv_level_two)
        levels.add(2,tv_level_three)
        levels.add(3,tv_level_four)
        levels.add(4,tv_level_five)
        levels.add(5,tv_level_six)
        levels.add(6,tv_level_seven)
        levels.add(7,tv_level_eight)
        levels.add(8,tv_level_nine)
        levels.add(9,tv_level_ten)
        levels.add(10,tv_level_eleven)
        levels.add(11,tv_level_twelve)
        levels.add(12,tv_level_threeteen)
        levels.add(13,tv_level_fourteen)
        levels.add(14,tv_level_fifteen)
        levels.add(15,tv_level_sixteen)
        levels.add(16,tv_level_seventeen)
        levels.add(17,tv_level_eightteen)
        levels.add(18, tv_level_19)
        levels.add(19, tv_level_20)
        levels.add(20, tv_level_21)
        levels.add(21, tv_level_22)
        levels.add(22, tv_level_23)
        levels.add(23, tv_level_24)
        levels.add(24, tv_level_25)
        levels.add(25, tv_level_26)
        levels.add(26, tv_level_27)
        levels.add(27, tv_level_28)
        levels.add(28, tv_level_29)
        levels.add(29, tv_level_30)
        levels.add(30, tv_level_31)
        levels.add(31, tv_level_32)
        levels.add(32, tv_level_33)
        levels.add(33, tv_level_34)
        levels.add(34, tv_level_35)
        levels.add(35, tv_level_36)
        levels.add(36, tv_level_37)
        levels.add(37, tv_level_38)
        levels.add(38, tv_level_39)
        levels.add(39, tv_level_40)
        levels.add(40, tv_level_41)
        levels.add(41, tv_level_42)
        levels.add(42, tv_level_43)
        levels.add(43, tv_level_44)
        levels.add(44, tv_level_45)
        levels.add(45, tv_level_46)
        levels.add(46, tv_level_47)
        levels.add(47, tv_level_48)

        for (level in levels) {


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

    private fun goForward(value:Int, nextLevel:TextView, currentLevel:TextView){
        if (getStatus(currentLevel.text.toString())!=0) {
            val intent = Intent(this, RiddleActivity::class.java);
            intent.putExtra(Constants.USER_NAME, mUsedName)
            intent.putExtra(Constants.LEVEL, value)
            intent.putExtra(Constants.NEXTLEVEL, nextLevel.text.toString())
            intent.putExtra(Constants.CURRENTLEVEL, currentLevel.text.toString())
            startActivity(intent)
        }else{
            Toast.makeText(this,"Complete previous level first",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun adStuff(){
        MobileAds.initialize(this)
        val adRequest = AdRequest.Builder().build()
        this.adViewlevel.loadAd(adRequest)


        adViewlevel.adListener= object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdFailedToLoad(errorCode : Int) {
                // Code to be executed when an ad request fails.
            }

            override fun onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }
    }

    private fun setClick(){
        val levels = ArrayList<TextView>()
        levels.add(0,tv_level_one)
        levels.add(1,tv_level_two)
        levels.add(2,tv_level_three)
        levels.add(3,tv_level_four)
        levels.add(4,tv_level_five)
        levels.add(5,tv_level_six)
        levels.add(6,tv_level_seven)
        levels.add(7,tv_level_eight)
        levels.add(8,tv_level_nine)
        levels.add(9,tv_level_ten)
        levels.add(10,tv_level_eleven)
        levels.add(11,tv_level_twelve)
        levels.add(12,tv_level_threeteen)
        levels.add(13,tv_level_fourteen)
        levels.add(14,tv_level_fifteen)
        levels.add(15,tv_level_sixteen)
        levels.add(16,tv_level_seventeen)
        levels.add(17,tv_level_eightteen)
        levels.add(18, tv_level_19)
        levels.add(19, tv_level_20)
        levels.add(20, tv_level_21)
        levels.add(21, tv_level_22)
        levels.add(22, tv_level_23)
        levels.add(23, tv_level_24)
        levels.add(24, tv_level_25)
        levels.add(25, tv_level_26)
        levels.add(26, tv_level_27)
        levels.add(27, tv_level_28)
        levels.add(28, tv_level_29)
        levels.add(29, tv_level_30)
        levels.add(30, tv_level_31)
        levels.add(31, tv_level_32)
        levels.add(32, tv_level_33)
        levels.add(33, tv_level_34)
        levels.add(34, tv_level_35)
        levels.add(35, tv_level_36)
        levels.add(36, tv_level_37)
        levels.add(37, tv_level_38)
        levels.add(38, tv_level_39)
        levels.add(39, tv_level_40)
        levels.add(40, tv_level_41)
        levels.add(41, tv_level_42)
        levels.add(42, tv_level_43)
        levels.add(43, tv_level_44)
        levels.add(44, tv_level_45)
        levels.add(45, tv_level_46)
        levels.add(46, tv_level_47)
        levels.add(47, tv_level_48)
        for (level in levels) {
            level.setOnClickListener(this)
        }
    }

}