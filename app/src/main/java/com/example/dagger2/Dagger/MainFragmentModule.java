package com.example.dagger2.Dagger;

import com.example.dagger2.Dagger.FragmentScope;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class MainFragmentModule {

    @Provides
    @FragmentScope
    Integer provideInt()
    {
        return new Random().nextInt();
    }

}
