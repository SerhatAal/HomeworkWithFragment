package com.kotlinegitim.homeworkwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kotlinegitim.homeworkwithfragment.databinding.FragmentPageBBinding;


public class PageBFragment extends Fragment {
    private FragmentPageBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPageBBinding.inflate(inflater, container, false);

        binding.buttonGoYfromB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_pageBFragment_to_pageYFragment);
        });

        return binding.getRoot();
    }
}