package com.example.bargo;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    Fragment perfil = new profileFragment();
    Fragment code = new CodeFragment();
    Fragment bars = new ListBarFragment();
    Fragment eventos = new ListEventsFragment();
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_layout, perfil);
        ft.commit();
        BottomBar bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                if(tabId == R.id.tab_perfil) {
                    ft2.replace(R.id.fragment_layout, perfil);
                }
                else if(tabId == R.id.tab_entrenamientos) {
                    ft2.replace(R.id.fragment_layout, code);
                }
                else if(tabId == R.id.tab_dietas) {
                    ft2.replace(R.id.fragment_layout, bars);
                }
                else if(tabId == R.id.tab_eventos) {
                    ft2.replace(R.id.fragment_layout, eventos);
                }
                ft2.commit();
            }
        });

    }

    //press back to back mainpage
    @Override
    public void onBackPressed() {
        if(backPressedTime+2000 > System.currentTimeMillis()){ //compare first click time with second
            finish();
        }
        else Toast.makeText( getBaseContext(), "Press back again", Toast.LENGTH_SHORT).show();

        backPressedTime = System.currentTimeMillis();

    }


}

