package com.example.listviewwitharrayadapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class MonAdapter extends BaseAdapter {

    ArrayList<Produit> data;

    Context con;

    public MonAdapter( Context con , ArrayList<Produit> data) {
        this.data = data;
        this.con = con;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       // LinearLayout l=null;
        CardView l=null;

        //creation d'un view

        LayoutInflater inf=LayoutInflater.from(con);
        l=(CardView) inf.inflate(R.layout.element,null);

        //recuperation des champs

        TextView tvid=l.findViewById(R.id.tvid);
        TextView tvintitule=l.findViewById(R.id.tvintitule);
        TextView tvdesign=l.findViewById(R.id.tvdesignation);
        TextView tvprix=l.findViewById(R.id.tvprix);
        TextView tvqte=l.findViewById(R.id.tvquantite);

        //affecter les valeurs des champs

        Produit p=data.get(i);
        tvid.setText(""+p.getId());
        tvqte.setText(""+p.getQuantite());
        tvdesign.setText(""+p.getDesignation());
        tvintitule.setText(""+p.getIntitule());
        tvprix.setText(""+p.getPrix());

        if (p.getQuantite()==0){
            tvqte.setTextColor(Color.RED);
        }
        return l;
    }
}
