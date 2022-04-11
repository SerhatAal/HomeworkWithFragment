package com.kotlinegitim.homeworkwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kotlinegitim.homeworkwithfragment.databinding.FragmentPageABinding;


public class PageAFragment extends Fragment {
    private FragmentPageABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPageABinding.inflate(inflater, container, false);

        binding.buttonGoB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_pageAFragment_to_pageBFragment);
        });

        return binding.getRoot();
    }
}