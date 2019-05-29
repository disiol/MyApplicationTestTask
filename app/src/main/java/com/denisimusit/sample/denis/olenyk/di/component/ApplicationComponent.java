package com.denisimusit.sample.denis.olenyk.di.component;

import android.content.Context;

import com.denisimusit.sample.denis.olenyk.MyMapsApplication;
import com.denisimusit.sample.denis.olenyk.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        ApplicationComponent build();
    }

    void inject(MyMapsApplication app);
}
