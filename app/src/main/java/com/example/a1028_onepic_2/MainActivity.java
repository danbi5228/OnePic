package com.example.a1028_onepic_2;

import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Image> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_TagFeed, R.id.navigation_PICMap)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        // prototype 용 Image 추가
        images.add(new Image(null, new LatLng(37.56, 126.97),"한단비",
                Calendar.getInstance(),R.drawable.ic_launcher_tmp_wantpic, "pic1"));
        images.add(new Image(null, new LatLng(37.548927, 126.965692),"한단비",
                Calendar.getInstance(),R.drawable.ic_launcher_tmp_wantpic, "pic2"));
        images.add(new Image(null, new LatLng(37.561728, 126.987228),"한단비",
                Calendar.getInstance(),R.drawable.ic_launcher_tmp_wantpic, "pic3"));
        images.add(new Image(null, new LatLng(37.548303, 126.963895),"한단비",
                Calendar.getInstance(),R.drawable.ic_launcher_tmp_wantpic, "pic4"));
        images.add(new Image(null, new LatLng(37.557960, 126.982323),"한단비",
                Calendar.getInstance(),R.drawable.ic_launcher_tmp_wantpic, "pic5"));


    }

}
