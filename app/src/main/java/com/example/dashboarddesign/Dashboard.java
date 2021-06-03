package com.example.dashboarddesign;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboardutil.LogDebug;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

public class Dashboard extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

       // LogDebug.data("asdsa");

       // showProgressBar();


        bottomNavigationView = findViewById(R.id.bottom_navigation);
        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fab);

        myFab.setColorFilter(Color.WHITE);
        float radius = 17;
        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        bottomNavigationView.setBackground(null);
        MaterialShapeDrawable bottomBarBackground = (MaterialShapeDrawable) bottomAppBar.getBackground();
        bottomBarBackground.setShapeAppearanceModel(
                bottomBarBackground.getShapeAppearanceModel()
                        .toBuilder()
                        .setTopRightCorner(CornerFamily.ROUNDED, radius)
                        .setTopLeftCorner(CornerFamily.ROUNDED, radius)
                        .setBottomLeftCorner(CornerFamily.ROUNDED, radius)
                        .setBottomRightCorner(CornerFamily.ROUNDED, radius)
                        .build());
    }



    }
