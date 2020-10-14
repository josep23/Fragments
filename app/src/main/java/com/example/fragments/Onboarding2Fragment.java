package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.fragments.R;
import com.example.fragments.databinding.FragmentOnboarding1Binding;
import com.example.fragments.databinding.FragmentOnboarding2Binding;

public class Onboarding2Fragment extends Fragment {

    private FragmentOnboarding2Binding binding;

    Button botonsiguiente;
    NavController navController;
    private Object View;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnboarding2Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.botonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment);
            }
        });
        binding.skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                navController.navigate(R.id.action_onboarding2Fragment_to_obording3Fragment);
            }
        });
    }
}