package com.kotlinegitim.homeworkwithfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;
import com.kotlinegitim.homeworkwithfragment.databinding.FragmentPageYBinding;


public class PageYFragment extends Fragment {
    private FragmentPageYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPageYBinding.inflate(inflater, container, false);

        return binding.getRoot();

    }


}