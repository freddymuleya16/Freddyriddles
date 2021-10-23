package com.example.freddysriddles

class Level {

    var id: Int = 0
    var level:String = ""
    var status:Int = 0
    var score:Int = 0


    constructor(id:Int,level:String, status:Int, score:Int ){
        this.id=id
        this.level = level
        this.status = status
        this.score = score
    }
}