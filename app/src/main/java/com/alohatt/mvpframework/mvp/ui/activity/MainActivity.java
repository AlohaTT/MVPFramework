package com.alohatt.mvpframework.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alohatt.library.mvp.BaseActivity;
import com.alohatt.mvpframework.R;
import com.alohatt.mvpframework.mvp.contract.MainContract;
import com.alohatt.mvpframework.mvp.model.MainModel;
import com.alohatt.mvpframework.mvp.presenter.MainPresenter;

/**
 * @author tony
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public MainPresenter setPresenter() {
        return new MainPresenter(new MainModel(),this);
    }
}
