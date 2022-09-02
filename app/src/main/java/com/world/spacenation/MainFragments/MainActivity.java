package com.world.spacenation.MainFragments;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.crash.FirebaseCrash;
import com.world.spacenation.R;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    private AdView mAdView, mAdView1;

    private InterstitialAd mInterstitialAd;


    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Log.d(TAG, "onCreate: Starting.");
        FirebaseCrash.log("onCreate: Started.");


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);


        InterstitialAd.load(this, "ca-app-pub-2279958907250111/9178519584", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_space)
                .setDrawerLayout(drawer)
                .build();
        final NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_rate) {


                    try {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" +
                                getPackageName())));
// google play

                    } catch (Exception ex) {
                        startActivity(new
                                Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" +
                                getPackageName())));
// website google play

                    }


                } else if (id == R.id.nav_share) {


                    Intent myIntent = new Intent(Intent.ACTION_SEND);
                    myIntent.setType("text/plain");
                    String shareBody = "This is The best App \n For Learn And Know More About Mysterious Vast Space  & \n This is  Free App Hurry up !Download Now \n & \n Share This App With Friend And Family " + "https://play.google.com/store/apps/details?id=com.world.spacenation&hl=en";
                    String shareSub = "Learn More About Space";
                    myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                    myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(myIntent, "Share using"));


                } else if (id == R.id.nav_privacy_policy) {


                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://princeanisshah.wordpress.com/2021/06/22/privacy-policy/"));
                    startActivity(intent);


                } else if (id == R.id.nav_terms_condition) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://princeanisshah.wordpress.com/2021/06/22/terms-conditions/"));
                    startActivity(intent);


                } else if (id == R.id.nav_about_us) {


//                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://princeanisshah.wordpress.com/"));
//                    startActivity(intent);

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, AboutUsFragment.class, null)
                            .addToBackStack(null)
                            .commit();


                } else if (id == R.id.nav_planets) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, PlanetFragment.class, null)
                            .addToBackStack(null)
                            .commit();
                    Toast.makeText(MainActivity.this, "Click On Images To Know More.", Toast.LENGTH_LONG).show();


                } else if (id == R.id.nav_solar) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, SolarFragment.class, null)
                            .addToBackStack(null)
                            .commit();
                    Toast.makeText(MainActivity.this, "Click On Images To Know More.", Toast.LENGTH_LONG).show();


                } else if (id == R.id.nav_moon) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, MoonsFragment.class, null)
                            .addToBackStack(null)
                            .commit();
                    Toast.makeText(MainActivity.this, "Click On Images To Know More.", Toast.LENGTH_LONG).show();


                } else if (id == R.id.nav_dwarf_planets) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, DwarfPlanetsFragment.class, null)
                            .addToBackStack(null)
                            .commit();
                    Toast.makeText(MainActivity.this, "info adding in next update.", Toast.LENGTH_LONG).show();


                } else if (id == R.id.nav_galaxies) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, GalaxiesFragment.class, null)
                            .addToBackStack(null)
                            .commit();
                    Toast.makeText(MainActivity.this, "info adding in next update.", Toast.LENGTH_LONG).show();


                } else if (id == R.id.nav_space) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, HomeFragment.class, null)
                            .addToBackStack(null)
                            .commit();

                } else if (id == R.id.nav_videos) {

                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .add(R.id.nav_host_fragment, VideoFragment.class, null)
                            .addToBackStack(null)
                            .commit();

                }


                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {


            if (mInterstitialAd != null) {
                mInterstitialAd.show(this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }

            super.onBackPressed();

//            if (backPressedTime +2000 > System.currentTimeMillis()){
//                super.onBackPressed();
//                return;
//            }else {
//                Toast.makeText(getBaseContext(),"Press Back Again To Exit",Toast.LENGTH_SHORT).show();
//            }
//         backPressedTime = System.currentTimeMillis();

        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }


}

