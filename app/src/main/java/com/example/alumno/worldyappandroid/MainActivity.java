package com.example.alumno.worldyappandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.alumno.worldyappandroid.Favourites.FavouritesFragment;
import com.example.alumno.worldyappandroid.GuidesRecyclerView.GuidesFragment;
import com.example.alumno.worldyappandroid.Map.MapFragment;
import com.example.alumno.worldyappandroid.Profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    //private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.id_guides:
                    //mTextMessage.setText("Guides");
                    changeFragment(1);
                    return true;
                case R.id.id_map:
                    //mTextMessage.setText("Map");
                    changeFragment(2);
                    return true;
                case R.id.id_fav:
                    //mTextMessage.setText("Favourites");
                    changeFragment(3);
                    return true;
                case R.id.id_prof:
                    //mTextMessage.setText("Profile");
                    changeFragment(4);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private void changeFragment(int position) {

        FragmentManager manager = getSupportFragmentManager();
        Fragment newFragment = null;

        if (position == 1) {
            newFragment = new GuidesFragment();
        } else if (position == 2) {
            newFragment = new MapFragment();
        } else if (position == 3){
            newFragment = new FavouritesFragment();
        } else if (position == 4) {
            newFragment = new ProfileFragment();
        }

        manager.beginTransaction().replace(R.id.fragmentContainer, newFragment).commit();
    }


}
