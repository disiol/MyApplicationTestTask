package com.denisimusit.sample.denis.olenyk.di.modules;

import com.denisimusit.sample.denis.olenyk.di.scopes.FragmentScope;
import com.denisimusit.sample.denis.olenyk.ui.fragments.home.view.ChatFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {


    @FragmentScope
    ChatFragment homeFragment();




}
