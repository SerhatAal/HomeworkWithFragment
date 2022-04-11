package com.kotlinegitim.homeworkwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kotlinegitim.homeworkwithfragment.databinding.FragmentHomepageBinding;


public class HomepageFragment extends Fragment {
    private FragmentHomepageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomepageBinding.inflate(inflater, container, false);

        binding.buttonGoA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_homepageFragment_to_pageAFragment);
        });

        binding.buttonGoX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_homepageFragment_to_pageXFragment);
        });

        return binding.getRoot();
    }
}