import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.example.compu.capyfinder.R
import kotlinx.android.synthetic.main.contenedor.view.*


class Adaptador (context: Context, val items:MutableList<informacion>):ArrayAdapter<informacion>(context, R.layout.contenedor,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var vista = convertView

        if (vista == null){
            vista = LayoutInflater.from(parent?.context).inflate(R.layout.contenedor, parent,false)
        }
        ponerImagen(vista?.imagen!!,position)
        vista?.Pais?.text = items[position].pais
        vista?.Capital?.text = items[position].Capital
        return vista
    }

    fun ponerImagen (imagen:ImageView,posicion:Int){
        when  (posicion){
            0-> imagen.setImageResource(R.drawable.argentina)
            1-> imagen.setImageResource(R.drawable.colombia)
            2-> imagen.setImageResource(R.drawable.france)
            3-> imagen.setImageResource(R.drawable.guatemala)
            4-> imagen.setImageResource(R.drawable.unitedkingdom)
            5-> imagen.setImageResource(R.drawable.unitedstates)
            else -> imagen.setImageResource(R.drawable.logo)
        }
    }

}