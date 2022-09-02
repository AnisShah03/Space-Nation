package com.world.spacenation.MainFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.world.spacenation.R;


public class AboutUsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
//////
        ImageView fb_icon = (ImageView) view.findViewById(R.id.fb_icon);
        TextView fb_text = (TextView) view.findViewById(R.id.fb_text);


        fb_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100070179483307"));
                startActivity(intent);
            }
        });


        fb_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100070179483307"));
                startActivity(intent);

            }
        });


////////

        ImageView insta_icon = (ImageView) view.findViewById(R.id.insta_icon);
        TextView insta_text = (TextView) view.findViewById(R.id.insta_text);

        insta_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.instagram.com/official.anisshah"));
                startActivity(intent);

            }
        });


        insta_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/www.instagram.com/official.anisshah"));
                startActivity(intent);

            }
        });

        return view;

    }

}