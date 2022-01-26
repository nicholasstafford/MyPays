package com.example.mypays;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PaysAdapter extends RecyclerView.Adapter<PaysAdapter.PaysViewHolder>{
    List<pays> paysList;
    Context context;

    public PaysAdapter(List<pays> paysList, Context context) {
        this.paysList = paysList;
        this.context = context;
    }

    @Override
    public PaysViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.pays_item,parent, false);
        return new PaysViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PaysViewHolder holder, int position) {
        pays item = paysList.get(position);
        holder.nom.setText(item.getNom());
        holder.superficie.setText("Superficie : " + String.valueOf(item.getSuperficie()) + "km\u00B2");
        holder.drapeau.setImageResource(item.getDrapeau());
    }

    @Override
    public int getItemCount() {
        return paysList.size();
    }

    public class PaysViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nom;
        private TextView superficie;
        private ImageView drapeau;

        public PaysViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            nom=itemView.findViewById(R.id.nom);
            superficie = itemView.findViewById(R.id.superficie);
            drapeau=itemView.findViewById(R.id.drapeau);
        }

        @Override
        public void onClick(View v) {
            pays item = paysList.get(getAdapterPosition());
            //Toast.makeText(context,item.getNom(),Toast.LENGTH_LONG).show();
            Intent intent = new Intent(context,PaysDetails.class);
            intent.putExtra("nom",item.getNom());
            intent.putExtra("superficie",item.getSuperficie());
            intent.putExtra("drapeau",item.getDrapeau());
            context.startActivity(intent);
        }
    }
}