package com.world.spacenation.MainFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.world.spacenation.R;
import com.world.spacenation.Solar.AsteroidBeltFragment;
import com.world.spacenation.Solar.AsteroidFragment;
import com.world.spacenation.Solar.CometFragment;
import com.world.spacenation.Solar.EclipseFragment;
import com.world.spacenation.Solar.KuiperBeltFragment;
import com.world.spacenation.Solar.MeteorShowerFragment;
import com.world.spacenation.Solar.MeteoriteFragment;
import com.world.spacenation.Solar.OortCloudFragment;
import com.world.spacenation.Solar.SunFragment;

public class SolarFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_solar, container, false);


        AdView mAdView = view.findViewById(R.id.adView39);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        AdView mAdView1 = view.findViewById(R.id.adView40);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);


///////////////////////////
        ImageButton asteroid_belt_btn = (ImageButton) view.findViewById(R.id.asteroid_belt_btn);
        asteroid_belt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new AsteroidBeltFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });


///////////////////////////
        ImageButton kuiper_belt_btn = (ImageButton) view.findViewById(R.id.kuiper_belt_btn);
        kuiper_belt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new KuiperBeltFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton oort_cloud_btn = (ImageButton) view.findViewById(R.id.oort_cloud_btn);
        oort_cloud_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new OortCloudFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton sun_btn = (ImageButton) view.findViewById(R.id.sun_btn);
        sun_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new SunFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton eclipse_btn = (ImageButton) view.findViewById(R.id.eclipse_btn);
        eclipse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new EclipseFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton comet_btn = (ImageButton) view.findViewById(R.id.comet_btn);
        comet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new CometFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton asteroid_btn = (ImageButton) view.findViewById(R.id.asteroid_btn);
        asteroid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new AsteroidFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton meteorite_btn = (ImageButton) view.findViewById(R.id.meteorite_btn);
        meteorite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new MeteoriteFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton meteor_shower_btn = (ImageButton) view.findViewById(R.id.meteor_shower_btn);
        meteor_shower_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new MeteorShowerFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        return view;
    }


}