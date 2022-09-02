package com.world.spacenation.MainFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.world.spacenation.R;
import com.world.spacenation.videos.LiveVideoActivity;
import com.world.spacenation.videos.VideoActivity;


public class VideoFragment extends Fragment {


    CardView video,live_video;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);


        video = (CardView) view.findViewById(R.id.video_card1);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),VideoActivity.class);
                startActivity(intent);
            }
        });


        live_video = (CardView) view.findViewById(R.id.video_card2);

        live_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LiveVideoActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}