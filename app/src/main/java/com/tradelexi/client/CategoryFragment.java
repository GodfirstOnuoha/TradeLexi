package com.tradelexi.client;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tradelexi.R;
import com.tradelexi.databinding.FragmentCategoryBinding;

public class CategoryFragment extends Fragment {

    private FragmentCategoryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.textBack.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_categoryFragment_to_homeFragment));
        binding.buttonFilters.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_categoryFragment_to_filterFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}