package com.example.dagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.dagger2.Dagger.MainFragmentModule;

import javax.inject.Inject;

public class MainFragment extends Fragment {
    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    String activityName;

    @Inject
    Integer randomNumber;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(getActivity() instanceof MainActivity){
            ((MainActivity) getActivity()).getComponent()
                    .mainFragmentComponentBuilder()
                    .setModule(new MainFragmentModule())
                    .setFragment(this)
                    .build()
                    .inject(this);
        }
        Log.d("MainFragment", activityName);
        Log.d("MainFragment", "RandomNumber :" + randomNumber);
    }
}
