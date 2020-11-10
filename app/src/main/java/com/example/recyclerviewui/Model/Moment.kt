package com.example.recyclerviewui.Model

import java.sql.Timestamp

class Moment{
    var title: String? = null
    var description: String? = null
    var image: String? = null
    var timestamp: String? = null

    constructor(){}

    constructor(title:String, description: String, image: String?, timestamp: String?){
        this.title = title
        this.description = description
        this.image = image
        this.timestamp = timestamp
    }
}