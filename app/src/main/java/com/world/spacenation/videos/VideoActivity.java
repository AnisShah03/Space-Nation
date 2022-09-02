package com.world.spacenation.videos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.world.spacenation.R;
import com.world.spacenation.ViewHolder.ViewHolder;
import com.world.spacenation.model.member;

public class VideoActivity extends AppCompatActivity {

    RecyclerView MrecyclerView;
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        MrecyclerView = findViewById(R.id.recyclerview_video1);
        MrecyclerView.setHasFixedSize(true);
        MrecyclerView.setLayoutManager(new LinearLayoutManager(this));

//        database = FirebaseDatabase.getInstance();
//        reference = database.getReference("video");

//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();

        FirebaseRecyclerOptions<member> options = new FirebaseRecyclerOptions.Builder<member>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("video"), member.class)
                .build();


        FirebaseRecyclerAdapter<member, ViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<member, ViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull ViewHolder viewHolder, int i, @NonNull member member) {
                        viewHolder.setvideo(getApplication(), member.getTitle(), member.getUrl());
                    }


                    @NonNull
                    @Override
                    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
                        return new ViewHolder(view);
                    }
                };

        firebaseRecyclerAdapter.startListening();
        MrecyclerView.setAdapter(firebaseRecyclerAdapter);

    }
}