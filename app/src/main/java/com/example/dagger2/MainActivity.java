package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.dagger2.Dagger.App;
import com.example.dagger2.Dagger.MainActivityComponent;
import com.example.dagger2.Dagger.MainActivityModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    String activityName;

    MainActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        component = ((App)getApplication()).getAppComponent()
                .mainAcitityComonentBuilder()
                .setModule(new MainActivityModule())
                .setActivity(this)
                .build();

        component.inject(this);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.container, new MainFragment())
                .commit();


    }

    public MainActivityComponent getComponent()
    {
        return  component;
    }

}