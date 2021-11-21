package com.example.dagger2.Dagger;

import com.example.dagger2.Dagger.ActivityScope;
import com.example.dagger2.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = MainFragmentComponent.class)
public class MainActivityModule {
    @Provides
    @ActivityScope
    String provideAcitivtyName(){
        return MainActivity.class.getSimpleName();
    }
}
