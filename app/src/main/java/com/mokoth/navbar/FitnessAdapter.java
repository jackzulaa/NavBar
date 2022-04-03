package com.mokoth.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FitnessAdapter extends RecyclerView.Adapter<FitnessAdapter.ViewHolder>{
    private FitnessModel[] fitnessmodel;
    Context context;

    // Constructor for initialization
    public FitnessAdapter(FitnessModel[] fitnessmodel) {
        this.fitnessmodel = fitnessmodel;

    }

    @NonNull
    @Override
    public FitnessAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates list_item.xml layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_fitness, parent, false);

        // Passing view to ViewHolder
        FitnessAdapter.ViewHolder viewHolder = new FitnessAdapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull FitnessAdapter.ViewHolder holder, int position) {
        // TypeCast Object to int type
        final FitnessModel myListData = fitnessmodel[position];
        holder.textView.setText(fitnessmodel[position].getfitness_name());
        holder.imageView.setImageResource(fitnessmodel[position].getImgid());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getfitness_name(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // Returns number of items currently available in Adapter
        return fitnessmodel.length;
    }

    // Initializing the Views
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
