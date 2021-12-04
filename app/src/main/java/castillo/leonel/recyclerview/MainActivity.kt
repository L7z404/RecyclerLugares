package castillo.leonel.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val listaDeLugares = ArrayList<Lugar>()
        listaDeLugares.add(Lugar("Ameca","https://turismo.mexplora.com/wp-content/uploads/2012/05/04-02-2011-Ameca1.jpg","Venden cosas"))
        listaDeLugares.add(Lugar("Chiquilistlán","https://i.ytimg.com/vi/mY9JdOT2v1E/maxresdefault.jpg","Venden chiquitos"))
//        listaDeLugares.add(Lugar("Tecolotlán","","Venden tecolotes"))
//        listaDeLugares.add(Lugar("Union de Tula","","Venden tulas"))
//        listaDeLugares.add(Lugar("Jalpa","","Venden jalapeños"))
        listaDeLugares.add(Lugar("Cocula","https://1.bp.blogspot.com/_m93lJH8LGww/TSdiIs2a3-I/AAAAAAAAFTg/qhj3JxaasJw/s1600/PLAZA+COCULA+22+AG8+09+%252857%2529.jpg","Venden mariachi"))
        listaDeLugares.add(Lugar("Tala","https://partidero.com/wp-content/uploads/2020/08/Tala-1280x640.jpeg","Venden taladoress"))

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        recyclerView.layoutManager = GridLayoutManager(this,GridLayoutManager.VERTICAL)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LugarAdapter(listaDeLugares, this)
    }


}