package com.example.pulgarcito

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.pulgarcito.GameViewModel.julian.libre
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class GameViewModel() : ViewModel() {

    private val _punto = MutableStateFlow(traeMixelPunto())
    val punto: StateFlow<List<Mixtel>> = _punto.asStateFlow()

    //private val _uiState = MutableStateFlow(GameUiState())
    val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    //private var UsaWord: Set<String> = getallWords().toMutableSet()
    private var Words: MutableSet<String> = mutableSetOf<String>("")
    private var Work: MutableSet<String> = mutableSetOf<String>("")
    private var Trabajo: MutableSet<String> = mutableSetOf<String>("")
    private var Fulliy: MutableSet<String> = mutableSetOf<String>("")
    private var Marcot: MutableSet<String> = mutableSetOf<String>("")
    private var Polo: MutableSet<String> = mutableSetOf<String>("")
    private var Roma: MutableSet<String> = mutableSetOf<String>("")


    private lateinit var currentTask: String
   // var gol = loadAffirmations().toMutableStateList().shuffled()
    private lateinit var tull: String
    var pass: Boolean = true
    var tren: Boolean = false
    private val TAG: String = "UserPref"


    //--------------------------
    private val _tasks = libre.toMutableStateList()
    val tasks: List<Affirmation>
        get() = _tasks
    //_________________________________________________
    private val _juca = traeMixelPunto().toMutableStateList()
    val juca: List<Mixtel>
        get() = _juca

    //--------------------------
    private val _wrap = getWellnessTasks().toMutableStateList()
    val wrap: List<WellnessTask>
        get() = _wrap
    //_________________________________________________

    data class Mix(val label: String)

    //_________________________________________________

    var otoli: List<Affirmation> = listOf<Affirmation>()
    var again: List<Affirmation> = listOf<Affirmation>()
    var futher: List<Mixtel> = listOf<Mixtel>().toMutableStateList()
    var ipiales: List<Mixtel> = listOf<Mixtel>().toMutableStateList()

    //var gol: List<Affirmation> = listOf<Affirmation>().toMutableStateList()
    var aro: List<WellnessTask> = listOf<WellnessTask>().toMutableStateList()
    var rectangulo: List<Mixtel> = listOf<Mixtel>().toMutableStateList()

    //teinit var libre: List<Affirmation>
    lateinit var ocupado: List<WellnessTask>
    lateinit var apple: List<Mixtel>
    lateinit var toronja: List<WellnessTask>
    lateinit var naranja: List<Mixtel>
    lateinit var pera: List<Mixtel>
    lateinit var pina: MutableList<Affirmation>
    lateinit var platano: List<Mixtel>
    lateinit var mas: MutableSet<String>
    lateinit var holdirt: MutableSet<String>
    lateinit var neco: String


    object julian {
        var libre = loadAffirmations().shuffled()

    }

    fun remove(item: Affirmation) {
        var jul = _tasks.remove(item)
        val Ago = _tasks.add(item)
        Log.d(TAG, " it - $Ago")
        val hill = tasks.toMutableList()
        Log.d(TAG, " it - $hill")
        //gult(item)
    }

    fun remove(item: WellnessTask) {
        _wrap.remove(item)
        //gult(item)
    }

    fun remove(item: Mixtel) {
        _juca.remove(item)

    }

    //------------Addclose

    fun gilf(item: Mixtel): MutableSet<String> {
        val fu = item.label
        Work.add(fu)
        return Work
    }

    fun golf(item: WellnessTask): MutableSet<String> {
        aro = listOf(wrap.random())
        neco = _wrap.add(item).toString()
        holdirt.add(neco)
        return holdirt

    }

    fun hola(){
        Log.d(TAG, " it - $pina")
    }

    fun waffers(item: Affirmation): Boolean {
        var tolss = _tasks.add(item)
        val litio = _tasks.toMutableList() as MutableSet<*>
        val tjjjss = (_wrap + litio) as MutableSet<*>
        Log.d(TAG, " it - $tjjjss")
        return tolss
    }


    //-----------------------


    init {

        julian
        Log.d(TAG, " it - $libre")
    }


    private fun traeMixelPunto(): List<Mixtel> {
        return listOf<Mixtel>(
            Mixtel(111, "Angel"),
            )
    }

}




//data class Mix(val label: String)
data class Mixtel(val id: Int, val label: String)
data class WellnessTask(val id: Int, val label: String)
data class Affirmation(val id: Int, val label: String)

private fun getWellnessTasks() = List(3){i ->WellnessTask(i, "Task # $i")}
private fun loadAffirmations(): List<Affirmation> {
    return listOf<Affirmation>(
        Affirmation(1, "R.image11"),
        Affirmation(2, "R.image12"),
        Affirmation(3, "R.image13"),
        Affirmation(4, "R.image14"),
        Affirmation(5, "R.image15"),
        Affirmation(6, "R.image16"),
        Affirmation(7, "R.image17"),
        Affirmation(8, "R.image18"),
        Affirmation(9, "R.image19"),
        Affirmation(10, "R.image10"))
}



