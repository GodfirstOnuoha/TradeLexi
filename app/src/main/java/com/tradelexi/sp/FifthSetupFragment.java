package com.tradelexi.sp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.transition.Transition;
import androidx.transition.TransitionInflater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tradelexi.R;
import com.tradelexi.databinding.FragmentFifthSetupBinding;

public class FifthSetupFragment extends Fragment {

    private FragmentFifthSetupBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Transition transition = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move);
        setSharedElementEnterTransition(transition);
        setSharedElementReturnTransition(transition);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFifthSetupBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentNavigator.Extras extras1 = new FragmentNavigator.Extras.Builder()
                .addSharedElement(binding.imageProgress, "progress4")
                .build();
        FragmentNavigator.Extras extras2 = new FragmentNavigator.Extras.Builder()
                .addSharedElement(binding.imageProgress, "progress6")
                .build();
        binding.buttonBack.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_fifthSetupFragment_to_fourthSetupFragment, null, null, extras1));
        binding.buttonNext.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_fifthSetupFragment_to_sixthSetupFragment, null, null, extras2));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}