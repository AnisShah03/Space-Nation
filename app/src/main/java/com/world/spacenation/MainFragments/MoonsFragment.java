package com.world.spacenation.MainFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.world.spacenation.Moon.CallistoMoonFragment;
import com.world.spacenation.Moon.CharonMoonFragment;
import com.world.spacenation.Moon.DeimosMoonFragment;
import com.world.spacenation.Moon.EnceladusMoonFragment;
import com.world.spacenation.Moon.EuropaMoonFragment;
import com.world.spacenation.Moon.IapetusMoonFragment;
import com.world.spacenation.Moon.IoMoonFragment;
import com.world.spacenation.Moon.MirandaMoonFragment;
import com.world.spacenation.Moon.PhobosMoonFragment;
import com.world.spacenation.Moon.RheaMoonFragment;
import com.world.spacenation.Moon.TheMoonFragment;
import com.world.spacenation.Moon.TitanMoonFragment;
import com.world.spacenation.Moon.TitaniaMoonFragment;
import com.world.spacenation.Moon.TritonMoonFragment;
import com.world.spacenation.R;

import org.jetbrains.annotations.Nullable;

public class MoonsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_moons, container, false);


        AdView mAdView = view.findViewById(R.id.adView29);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        AdView mAdView1 = view.findViewById(R.id.adView30);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);


///////////////////////////
        ImageButton moonbtn = (ImageButton) view.findViewById(R.id.moon_btn);
        moonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new TheMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton phobosbtn = (ImageButton) view.findViewById(R.id.phobos_btn);
        phobosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new PhobosMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton deimosbtn = (ImageButton) view.findViewById(R.id.deimos_btn);
        deimosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new DeimosMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton iobtn = (ImageButton) view.findViewById(R.id.io_btn);
        iobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new IoMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton europabtn = (ImageButton) view.findViewById(R.id.europa_btn);
        europabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new EuropaMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton callisto = (ImageButton) view.findViewById(R.id.callisto);
        callisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new CallistoMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton encladus = (ImageButton) view.findViewById(R.id.encladus);
        encladus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new EnceladusMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton rhea = (ImageButton) view.findViewById(R.id.rhea);
        rhea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new RheaMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton titan = (ImageButton) view.findViewById(R.id.titan);
        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new TitanMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton iapetus = (ImageButton) view.findViewById(R.id.iapetus);
        iapetus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new IapetusMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton miranda = (ImageButton) view.findViewById(R.id.miranda);
        miranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new MirandaMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton titania = (ImageButton) view.findViewById(R.id.titania);
        titania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new TitaniaMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton triton = (ImageButton) view.findViewById(R.id.triton);
        triton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new TritonMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


///////////////////////////
        ImageButton charon = (ImageButton) view.findViewById(R.id.charon);
        charon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.add(R.id.nav_host_fragment, new CharonMoonFragment());
                ft.addToBackStack(null);
                ft.commit();

            }
        });


        return view;
    }

}