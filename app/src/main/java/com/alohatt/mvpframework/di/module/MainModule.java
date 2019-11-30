package com.alohatt.mvpframework.di.module;

import com.alohatt.mvpframework.mvp.contract.MainContract;
import com.alohatt.mvpframework.mvp.model.MainModel;

import dagger.Binds;
import dagger.Module;

/**
 * @ClassName MainModule
 * @Description TODO
 * @Author tony
 * @Date 2019-11-14 21:59
 * @Version 1.0
 */
@Module
public abstract class MainModule {

    @Binds
    abstract MainContract.Model bindMainModel(MainModel model);
}
