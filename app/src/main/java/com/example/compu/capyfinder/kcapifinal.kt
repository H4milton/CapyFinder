package com.example.compu.capyfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import informacion
import Adaptador
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kcapifinal.*

class kcapifinal : AppCompatActivity(), AdapterView.OnItemLongClickListener {
    var item : MutableList<informacion> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcapifinal)

        for (i in 1..5){
            item.add(informacion("Pais $i","Capital $i","Gentilicio $i"))
        }

        val adaptador = Adaptador(this, item)
        mlvLista.adapter=adaptador

        mlvLista!!.onItemLongClickListener = this

    }

    override fun onItemLongClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long): Boolean {
        Toast.makeText(this,item[position].Capital, Toast.LENGTH_SHORT).show()
        return true
    }

}
