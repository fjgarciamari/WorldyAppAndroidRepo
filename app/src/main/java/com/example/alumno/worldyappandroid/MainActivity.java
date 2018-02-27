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
import android.widget.Toast;

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
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.id_guides:
                    //mTextMessage.setText("Guides");
                    transaction.replace(R.id.fragmentContainer,new GuidesFragment()).commit();
                    return true;
                case R.id.id_map:
                    //mTextMessage.setText("Map");
                    transaction.replace(R.id.fragmentContainer,new MapFragment()).commit();
                    return true;
                case R.id.id_fav:
                    //mTextMessage.setText("Favourites");
                    transaction.replace(R.id.fragmentContainer,new FavouritesFragment()).commit();
                    return true;
                case R.id.id_prof:
                    //mTextMessage.setText("Profile");
                    transaction.replace(R.id.fragmentContainer,new ProfileFragment()).commit();
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

}
