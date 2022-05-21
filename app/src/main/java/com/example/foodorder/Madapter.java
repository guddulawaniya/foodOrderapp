package com.example.foodorder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Madapter extends RecyclerView.Adapter<Madapter.viewholder> {


    ArrayList<module>list;
    Context context;
    public Madapter(ArrayList<module> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sapmle1,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        module module = list.get(position);
//
        holder.foodname.setText( module.getFoodname());
        holder.decrpt.setText( module.getDecrpt());
        holder.foodimage.setImageResource(module.getFoodimage());

        holder.viewlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        view.getContext().startActivity(new Intent(context,fooddetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class viewholder extends RecyclerView.ViewHolder
    {

        TextView foodname,decrpt,viewlist;
        ImageView foodimage;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            foodname = itemView.findViewById(R.id.foodname);
            decrpt = itemView.findViewById(R.id.decript);
            foodimage = itemView.findViewById(R.id.foorimage);
            viewlist = itemView.findViewById(R.id.viewlistsample);


        }
    }
}
