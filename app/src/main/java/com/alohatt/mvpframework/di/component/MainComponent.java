package com.alohatt.mvpframework.di.component;

import com.alohatt.mvpframework.di.module.MainModule;
import com.alohatt.mvpframework.mvp.contract.MainContract;
import com.alohatt.mvpframework.mvp.ui.activity.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @ClassName MainComponent
 * @Description TODO
 * @Author tony
 * @Date 2019-11-14 21:59
 * @Version 1.0
 */
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MainComponent.Builder view(MainContract.View view);
        MainComponent build();
    }
}
