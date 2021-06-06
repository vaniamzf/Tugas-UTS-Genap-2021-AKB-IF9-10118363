package com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vaniamzf.uts_akb_genap_2021_if9_10118363.view.activity.MainActivity;
import com.vaniamzf.uts_akb_genap_2021_if9_10118363.R;

public class ProfileFragment extends Fragment {

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();
    }
}

// 5 Juni 2021 - 10118363 - Vania Yulianti Mozef - IF9