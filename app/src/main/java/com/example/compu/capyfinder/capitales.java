package com.example.compu.capyfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class capitales extends AppCompatActivity {

    String Capitales[] = {"Guatemala", "Mexico", "Espana", "Estados Unidos", "Francia"};

    private ListView lista;
    private EditText etBuscar;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitales);

        lista = (ListView) findViewById(R.id.Lista);
        etBuscar = (EditText) findViewById(R.id.etBuscar);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Capitales);
        lista.setAdapter(adapter);
        etBuscar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
