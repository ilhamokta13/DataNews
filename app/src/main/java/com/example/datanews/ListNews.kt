package com.example.datanews

import java.io.Serializable

data class ListNews (val judul : String, val  tanggal : String, val image : Int, val content : String, val penulis : String): Serializable
