package com.example.pulgarcito

import androidx.compose.runtime.toMutableStateList

fun main(){
    dessete()
}


 fun  dessete() {

     val (ut, nort, hy, gul) = _tulu
     var ruben = Tuto(1552, "sart")
     var manul = ut
     var nico = _tulu + ruben
     var holdepg = _tulu.add(ruben)
     var holdeg = _tulu.add(manul)
     var tiy = gul
     //var cull = holdeg + tiy
    var hulk = _tulu.toMutableList()
     println(holdeg)
     println(_tulu)
     println(hulk)

 }

 val _tulu = traeTutoPunto().toMutableStateList()
val tulu: List<Tuto>
    get() = _tulu

data class Tuto(val id: Int, val label: String)

private fun traeTutoPunto(): List<Tuto> {
    return listOf<Tuto>(
        Tuto(111, "Angel"),
        Tuto(121, "Gabriel"),
        Tuto(311, "Miguel"),
        Tuto(357, "Luis"),
        )
}