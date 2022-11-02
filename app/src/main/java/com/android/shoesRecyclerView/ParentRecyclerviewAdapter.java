package com.android.shoesRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentRecyclerviewAdapter extends RecyclerView.Adapter<ParentRecyclerviewAdapter.MyViewHolder> {

    private ArrayList<ParentModel> shoeCategoriesList;
    public Context context;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.Shoe_category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public ParentRecyclerviewAdapter(Context context,ArrayList<ParentModel> shoeCategoriesList) {
        this.context = context;
        this.shoeCategoriesList = shoeCategoriesList;
    }


    @NonNull
    @Override
    public ParentRecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentRecyclerviewAdapter.MyViewHolder holder, int position) {
        ParentModel currentItem = shoeCategoriesList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);

        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.getShoeCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();


        // added the first child row
        if (shoeCategoriesList.get(position).getShoeCategory().equals("Walking Shoes")) {
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
        }

        // added in second child row
        if (shoeCategoriesList.get(position).getShoeCategory().equals("Running Shoes")) {
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
        }

        // added in third child row
        if (shoeCategoriesList.get(position).getShoeCategory().equals("Sneakers")) {
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
        }

        // added in fourth child row
        if (shoeCategoriesList.get(position).getShoeCategory().equals("Casual Shoes")) {
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
        }

        // added in fifth child row
        if (shoeCategoriesList.get(position).getShoeCategory().equals("Boots")) {
            arrayList.add(new ChildModel("https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
            arrayList.add(new ChildModel( "https://www.highsnobiety.com/static-assets/thumbor/n_3CL-cxlepbKGdED84mnLu1udg=/1600x1067/www.highsnobiety.com/static-assets/wp-content/uploads/2018/01/16122913/Sneaker-Main.jpg","Shoe Name"));
        }

        ChildRecyclerviewAdaper childRecyclerViewAdapter = new ChildRecyclerviewAdaper(holder.childRecyclerView.getContext(), arrayList);
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }


    @Override
    public int getItemCount() {
        return shoeCategoriesList.size();
    }

}
