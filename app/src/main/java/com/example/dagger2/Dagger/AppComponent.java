package com.example.dagger2.Dagger;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    MainActivityComponent.Builder mainAcitityComonentBuilder();
    void inject(App app);

    @Component.Factory
    interface  factory{
        AppComponent create(@BindsInstance App app, AppModule appModule);
    };
}
