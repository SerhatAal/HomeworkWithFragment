package com.kotlinegitim.homeworkwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kotlinegitim.homeworkwithfragment.databinding.FragmentPageXBinding;


public class PageXFragment extends Fragment {
    private FragmentPageXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPageXBinding.inflate(inflater, container, false);

        binding.buttonGoYfromX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_pageXFragment_to_pageYFragment);
        });

        return binding.getRoot();
    }
}