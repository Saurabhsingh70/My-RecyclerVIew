package com.example.recycler_adapter_final_tutorial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.ContentHandler;


//always we create Adpter and view holder
public class Recycle_Adapter extends RecyclerView.Adapter<Recycle_Adapter.recycleHolder> {



    // first we alsowaays create cinstuctor
    Context context;
    private String[] dataa; // which will store data
    public Recycle_Adapter(String[] data)
    {
        this.dataa = data;
    }

    public Recycle_Adapter(Context context,String[] data)
    {
        this.context = context;
        this.dataa = data;
    }






    @NonNull
    @Override
    public recycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // it will create view and hold view
        // for this we have to create one view or layout
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);
        return new recycleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recycleHolder holder, int position) {
        // it will bind our view with data
        String title = dataa[position];
        holder.txttitle.setText(title);

    }

    @Override
    public int getItemCount() { // it will ask you how much or many data will store
        return dataa.length;
    }

    public class recycleHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgIcon;
        TextView txttitle;
        public recycleHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgicon);
            txttitle = itemView.findViewById(R.id.texttitle);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

//            Intent intent = new Intent(context.getApplicationContext(),Onclick_check.class);
            Toast.makeText(context,"position"+position,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context,Onclick_check.class );


            context.startActivity(intent);
        }
    }

}
