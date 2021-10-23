package com.example.freddysriddles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this@MainActivity)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val db = DatabaseHandler(this)
        var name = db.viewName()

        if(getName().isNotEmpty()){

            gotoNextPage(getName())
        }else{
            btn_start.setOnClickListener{
                if(et_name.text.toString().isEmpty()){
                    Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show();
                }else{
                    var user = User(0,et_name.text.toString(),"hfjfyf")

                    var result = db.insertData(user)

                    if (result>-1){
                       Toast.makeText(this,"Name Saved",Toast.LENGTH_SHORT).show()
                        gotoNextPage(et_name.text.toString())
                    }else{
                       Toast.makeText(this,"Failed to save name",Toast.LENGTH_SHORT).show()

                    }


                }
            }
        }





    }

    private fun getName():String{
        val db = DatabaseHandler(this)
        var name = db.viewName()
        if(name.size>0){
            return name[0].name
        }else{
            return ""
        }


    }

    private fun gotoNextPage(name:String){
        val intent = Intent(this,LevelActivity::class.java);
        intent.putExtra(Constants.USER_NAME,name)
        startActivity(intent);
        finish();
    }
}