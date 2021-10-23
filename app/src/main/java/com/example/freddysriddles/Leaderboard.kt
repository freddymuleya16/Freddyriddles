package com.example.freddysriddles

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.content_scrolling.*


class Leaderboard : AppCompatActivity() {
    val id:String=""
    private lateinit var database:FirebaseDatabase
    private lateinit var myRef:DatabaseReference



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        database = FirebaseDatabase.getInstance()
        myRef = database.getReference("Players")

        //setSupportActionBar(toolbar)
        if (getFID()=="hfjfyf"){
            sendData()
        }else {
            update()
        }
        setupRecyclerView()
        loadPlayers()



    }

    private fun sendData(){
        var id  = myRef.push().key
        DatabaseHandler(this).setFID(User(0,getName(),id!!))
        myRef.child(id!!).setValue(Player(0,getName(),"South Africa",calculateTotal()))
        //myRef.child(id!!).

    }


    private fun setupRecyclerView() {
        recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlayerAdapter()
            setHasFixedSize(true)
        }
    }

    private fun loadPlayers() {
        myRef.addValueEventListener(object :ValueEventListener{
            override fun onCancelled(error: DatabaseError) {
                Log.e("cancel",error.toString())
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                var list= ArrayList<Player>()

                for (data in snapshot.children){
                    var node = data.getValue(Player::class.java)
                    list.add(node as Player)
                }
                showPlayersPosition(list.sortedWith(compareByDescending {it.score; it.name}))
            }
        })


    }

    private fun showPlayersPosition(players: List<Player>) {
        val adapter = recycler_view.adapter as PlayerAdapter
        adapter.addPlayers(players)
    }
    
    private fun calculateTotal(): Int {
        val db = DatabaseHandler(this)
        var level = db.viewLevels()
        var total = 0

        for (leve in level){
            total += leve.score
        }

        return total
    }

    private fun getName():String{
        val db = DatabaseHandler(this)
        var name = db.viewName()

        return name.first().name
    }

    private fun getFID():String{
        val db = DatabaseHandler(this)
        var name = db.viewName()

        return name.first().fid
    }

    private fun update(){

        val scoreMap: MutableMap<String, Any> = HashMap()
        scoreMap["score"] = calculateTotal()
        //Toast.makeText(this,myRef.key,Toast.LENGTH_SHORT).show()
        myRef.child(getFID()).updateChildren(scoreMap)

    }

}