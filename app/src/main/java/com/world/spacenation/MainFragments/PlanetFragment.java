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
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.world.spacenation.Planets.EarthFragment;
import com.world.spacenation.Planets.JupiterFragment;
import com.world.spacenation.Planets.MarsFragment;
import com.world.spacenation.Planets.MercuryFragment;
import com.world.spacenation.Planets.NeptuneFragment;
import com.world.spacenation.Planets.SaturnFragment;
import com.world.spacenation.Planets.UranusFragment;
import com.world.spacenation.Planets.VenusFragment;
import com.world.spacenation.R;

public class PlanetFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_planet, container, false);


        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdView mAdView = view.findViewById(R.id.adView35);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        AdView mAdView1 = view.findViewById(R.id.adView36);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);


///////////////////////////
        ImageButton mercurybtn = (ImageButton) view.findViewById(R.id.mercury_btn);
        mercurybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new MercuryFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton venusbtn = (ImageButton) view.findViewById(R.id.venus_btn);
        venusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new VenusFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton earthbtn = (ImageButton) view.findViewById(R.id.earth_btn);
        earthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new EarthFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton marsbtn = (ImageButton) view.findViewById(R.id.mars_btn);
        marsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new MarsFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton jupiterbtn = (ImageButton) view.findViewById(R.id.jupiter_btn);
        jupiterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new JupiterFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton saturnbtn = (ImageButton) view.findViewById(R.id.saturn_btn);
        saturnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new SaturnFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton uranus_btn = (ImageButton) view.findViewById(R.id.uranus_btn);
        uranus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new UranusFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton neptune_btn = (ImageButton) view.findViewById(R.id.neptune_btn);
        neptune_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new NeptuneFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        return view;

    }
}