package com.tradelexi.sp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tradelexi.R;
import com.tradelexi.databinding.FragmentSixthSetupBinding;

public class SixthSetupFragment extends Fragment {

    private FragmentSixthSetupBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSixthSetupBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonBack.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_sixthSetupFragment_to_fifthSetupFragment));
        binding.buttonNext.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_sixthSetupFragment_to_seventhSetupFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}