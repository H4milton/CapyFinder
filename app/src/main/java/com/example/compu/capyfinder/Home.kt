package com.example.compu.capyfinder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity(), View.OnClickListener {
    private var OpIng : CardView? = null
    private var OpEsp : CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        OpIng = findViewById(R.id.Ingles)
        OpEsp = findViewById(R.id.Spanish)

        OpIng!!.setOnClickListener(this)
        OpEsp!!.setOnClickListener(this)

    }//FIN ONCREATE

    /**    * INICIO DE ESPACIO PARA MIS FUCNIONES     */



    /**    * FIN DE ESPACIO PARA MIS FUCNIONES     */
    override fun onClick(v: View?) {
        var idioma=""
        when(v!!.id){
            R.id.Ingles -> {
                Toast.makeText(this,"Have selected English",Toast.LENGTH_SHORT).show()
                idioma="ingles"
                val intent = Intent(this, ActSearch::class.java)
                intent.putExtra("lenguage",idioma)
                startActivity(intent)
            }
            R.id.Spanish ->{
                Toast.makeText(this,"Ha Seleccionado Español",Toast.LENGTH_SHORT).show()
                idioma="spain"
                val intent = Intent(this, ActSearch::class.java)
                intent.putExtra("lenguage",idioma)
                startActivity(intent)
            }
        }

    }

    companion object {// Used to load the 'native-lib' library on application startup.
        init {System.loadLibrary("native-lib")}
    }
}
