package castillo.leonel.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerview.R

class LugarAdapter(listaLugares:ArrayList<Lugar>, contexto: Context):RecyclerView.Adapter<LugarAdapter.ViewHolder>() {

    var listaLugares:List<Lugar>?=null
    var contexto:Context?=null
    //
    init {
        this.listaLugares = listaLugares
        this.contexto = contexto
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaLugar = LayoutInflater.from(contexto).inflate(R.layout.tarjeta_individual, parent,false)
        val lugarViewHolder = ViewHolder(vistaLugar)
        vistaLugar.tag = lugarViewHolder
        return lugarViewHolder

    }


    override fun getItemCount(): Int {
        return listaLugares!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombreDelLugar!!.text = listaLugares!![position].nombre
        Picasso.get().load(listaLugares!![position].imagen)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.foto)
    }



    class ViewHolder(vistaIndividual:View):RecyclerView.ViewHolder(vistaIndividual) {
        var nombreDelLugar:TextView?=null
        var foto:ImageView?=null

        init {
            nombreDelLugar = vistaIndividual.findViewById(R.id.textView)
            foto = vistaIndividual.findViewById(R.id.imglugar)
        }

    }
}