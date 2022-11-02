package com.android.shoesRecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.android.shoesRecyclerView.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter ParentAdapter;
    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(new ParentModel("Walking Shoes"));
        parentModelArrayList.add(new ParentModel("Running Shoes"));
        parentModelArrayList.add(new ParentModel("Sneakers"));
        parentModelArrayList.add(new ParentModel("Casual Shoes"));
        parentModelArrayList.add(new ParentModel("Boots"));
        parentRecyclerView = findViewById(R.id.Parent_recyclerView);
        parentRecyclerView.setHasFixedSize(true);


        parentLayoutManager = new LinearLayoutManager(this);
        ParentAdapter = new ParentRecyclerviewAdapter(MainActivity.this, parentModelArrayList);
        parentRecyclerView.setLayoutManager(parentLayoutManager);
        parentRecyclerView.setAdapter(ParentAdapter);
        ParentAdapter.notifyDataSetChanged();
    }
}
