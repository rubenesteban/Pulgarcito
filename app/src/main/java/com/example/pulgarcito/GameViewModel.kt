package com.example.pulgarcito

import android.util.Log
import androidx.compose.runtime.snapshots.MutableSnapshot
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pulgarcito.GameViewModel.julian.libre
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class GameViewModel() : ViewModel() {

    private val _punto = MutableStateFlow(traeMixelPunto())
    val punto: StateFlow<List<Mixtel>> = _punto.asStateFlow()

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

    //--------------------------
    private val _wrap = getWellnessTasks().toMutableStateList()
    val wrap: List<WellnessTask>
        get() = _wrap
    //_________________________________________________

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
    lateinit var pina: List<Mixtel>
    lateinit var platano: List<Mixtel>
    lateinit var mas: MutableSet<String>
    lateinit var holdirt: MutableSet<String>
    lateinit var neco: String


    object julian {
        var libre = loadAffirmations().shuffled()

    }

    fun remove(item: Affirmation) {
        _tasks.remove(item)
        Log.d(TAG, " it - $tasks")
        //gult(item)
    }

    fun remove(item: WellnessTask) {
        _wrap.remove(item)
        //gult(item)
    }


    //------------Addclose
    fun gult(item: Affirmation): MutableSet<String> {
        Trabajo = waffers(item)
        Log.d(TAG, " it - $Trabajo")
        // naranja = punto + pina
        return Trabajo

    }

    fun gilf(item: Mixtel): MutableSet<String> {
        //again = listOf(punto.random())
        // neco = _punto.add(item).toString()
        mas.add(neco)
        return mas

    }

    fun golf(item: WellnessTask): MutableSet<String> {
        aro = listOf(wrap.random())
        neco = _wrap.add(item).toString()
        holdirt.add(neco)
        return holdirt

    }

    fun hola(){
        Log.d(TAG, " it - $libre")
    }

    fun waffers(item: Affirmation): MutableSet<String> {
        Work = listOf(item) as MutableSet<String>
        Words.add(Work.toString())
        Log.d(TAG, " it - $Words")
        return Words
    }


    //-----------------------


    init {

        julian
        Log.d(TAG, " it - $libre")
    }


    private fun traeMixelPunto(): List<Mixtel> {
        return listOf<Mixtel>(
            Mixtel(111, "Angel"),
            Mixtel(112, "Manta"),
            Mixtel(123, "Hugo"),
            Mixtel(114, "Guol"),
            Mixtel(115, "Nulota"),
            Mixtel(116, "Miercoles"),
            Mixtel(117, "Jueves"),
            Mixtel(118, "Viernes"),
            Mixtel(119, "Sabado"),
            Mixtel(120, "Domingo"),
            Mixtel(121, "Marta"),
            Mixtel(122, "Miguel"),

            )
    }

}





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



