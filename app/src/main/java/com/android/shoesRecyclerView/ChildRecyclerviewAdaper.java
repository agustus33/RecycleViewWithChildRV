package com.android.shoesRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class ChildRecyclerviewAdaper extends RecyclerView.Adapter<ChildRecyclerviewAdaper.MyViewHolder> {

    Context context;
    ArrayList<ChildModel> shoesList;
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView shoeImage;
        public TextView shoeName;

        public MyViewHolder(View itemView) {
            super(itemView);
            shoeImage = itemView.findViewById(R.id.shoe_image);
            shoeName = itemView.findViewById(R.id.shoe_name);
        }

    }

    public ChildRecyclerviewAdaper(Context context, ArrayList<ChildModel> shoesList) {
    this.context = context;
    this.shoesList = shoesList;
    }

    @NonNull
    @Override
    // to create/provide a view inside recycle_view
    public ChildRecyclerviewAdaper.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    // this will set a value to view_holder. holder will be having the view objects created in view_holder like shoeImage and Shoe_list
    public void onBindViewHolder(@NonNull ChildRecyclerviewAdaper.MyViewHolder holder, int position) {
        ChildModel currentItem = shoesList.get(position);
        Glide.with(context).load(currentItem.getShoeImage()).centerCrop().into(holder.shoeImage);
        holder.shoeName.setText(currentItem.getShoeName());
    }
    @Override
    //number of items to be displayed in recyclerview
    public int getItemCount() {
        return shoesList.size();
    }
}
