package com.example.compu.capyfinder

import android.os.Build.VERSION_CODES.N
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View.Y
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import informacion

class kCapitales : AppCompatActivity() {

    private var etBuscar : EditText? = null
    private var lstview : ListView? = null
    private var list: MutableList<informacion> = ArrayList()
    internal var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_capitales)

        etBuscar = findViewById(R.id.etBuscar)
        lstview = findViewById(R.id.Lista)

        list.add(informacion("GUATEMALA","GUATEMALA","GUATEMALTECO/a"))
        list.add(informacion("Ecuador","QUITO","ECUATORIANO/A"))
        list.add(informacion("KIRIBATI","TARAWA","KIRIBATENSE/A"))
        list.add(informacion("TRINIDAD Y TOBAGO","PUERTO ESPAÑA","TRINITARIO/A"))
        list.add(informacion("CAMBOYA","PNON PEHN","CAMBOYANO/A"))

        seeData(list)
        etBuscar!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS

        etBuscar!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                adapter!!.filter.filter(s)
            }
            override fun afterTextChanged(s: Editable) {
            }
        })

    }

    private fun seeData(listData: MutableList<informacion>){
        val adapter = ArrayAdapter<informacion>(this,android.R.layout.simple_list_item_1,listData)
        lstview!!.adapter = adapter
    }

}
