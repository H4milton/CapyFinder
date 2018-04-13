package com.example.compu.capyfinder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.Holderview>{

    private List<Item> produclist;
    private Context context;

    public MainActivityAdapter(List<Item> produclist, Context context) {
        this.produclist = produclist;
        this.context = context;
    }

    @NonNull
    @Override
    public Holderview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.customitem,parent,false);
        return new Holderview(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull Holderview holder, final int position) {

        holder.v_pais.setText(produclist.get(position).getCountry());
        holder.v_capital.setText(produclist.get(position).getCapytal());
        holder.v_image.setImageResource(produclist.get(position).getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Gentilic " + produclist.get(position).getGentilicio(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return produclist.size();
    }

    public void setfilter(List<Item> listitem){
        produclist=new ArrayList<>();
        produclist.addAll(listitem);
        notifyDataSetChanged();
    }

    class Holderview extends RecyclerView.ViewHolder{
        ImageView v_image;
        TextView v_pais;
        TextView v_capital;

        Holderview(View itemview){
            super(itemview);
            v_image=(ImageView) itemview.findViewById(R.id.imagennuevo);
            v_pais=(TextView) itemview.findViewById(R.id.paisnuevo);
            v_capital=(TextView) itemview.findViewById(R.id.capitalnuevo);
        }

    }

}
