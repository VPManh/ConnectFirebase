package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private FirebaseRecyclerOptions<Vegetable> options;
    private FirebaseRecyclerAdapter<Vegetable,VegetableViewHolder> adapter;
    private RecyclerView recyclerView;
    DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView  =findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        database = FirebaseDatabase.getInstance().getReference("hocVien");

        options= new FirebaseRecyclerOptions.Builder<Vegetable>().setQuery(database,Vegetable.class).build();
        adapter = new FirebaseRecyclerAdapter<Vegetable, VegetableViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull VegetableViewHolder holder, int position, @NonNull Vegetable model) {
                holder.txName.setText("" +model.getName());
                holder.txMota.setText("" +model.getTitle());
                Picasso.get().load(model.getHinhanh()).into(holder.imgHinh);

            }
            @NonNull
            @Override
            public VegetableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
                return new VegetableViewHolder(view);
            }
        };

        adapter.startListening();
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    }

}