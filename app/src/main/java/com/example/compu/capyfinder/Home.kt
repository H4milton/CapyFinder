package com.example.compu.capyfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


    }//FIN ONCREATE

    /**    * INICIO DE ESPACIO PARA MIS FUCNIONES     */



    /**    * FIN DE ESPACIO PARA MIS FUCNIONES     */

    companion object {// Used to load the 'native-lib' library on application startup.
        init {System.loadLibrary("native-lib")}
    }
}
