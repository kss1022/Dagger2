package com.example.dagger2.Dagger;

import com.example.dagger2.MainFragment;

import dagger.BindsInstance;
import dagger.Subcomponent;


@FragmentScope
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentComponent {

    void inject(MainFragment mainFragment);

    @Subcomponent.Builder
    interface  Builder{
        MainFragmentComponent.Builder setModule(MainFragmentModule module);
        @BindsInstance
        MainFragmentComponent.Builder setFragment(MainFragment fragment);
        MainFragmentComponent build();
    }
}
