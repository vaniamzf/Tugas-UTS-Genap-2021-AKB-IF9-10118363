package com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vaniamzf.uts_akb_genap_2021_if9_10118363.R;
import com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.fragment.NoteFragment;
import com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.fragment.ProfileFragment;
import com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.fragment.InfoFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        //menampilkan halaman yang pertama muncul
        getFragmentPage(new InfoFragment());

        //insialisasi bottom nav
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                        R.id.info:
                        fragment = new InfoFragment();
                    break;
                    case
                        R.id.note:
                        fragment = new NoteFragment();
                    break;
                    case
                        R.id.profile:
                        fragment = new ProfileFragment();
                    break;
                }
                return getFragmentPage(fragment);
            }
        });
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}

// 5 Juni 2021 - 10118363 - Vania Yulianti Mozef - IF9