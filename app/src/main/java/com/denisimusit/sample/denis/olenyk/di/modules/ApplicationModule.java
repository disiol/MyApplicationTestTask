package com.denisimusit.sample.denis.olenyk.di.modules;


import com.denisimusit.sample.denis.olenyk.MainActivity;
import com.denisimusit.sample.denis.olenyk.di.scopes.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class})
public interface ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();

}
