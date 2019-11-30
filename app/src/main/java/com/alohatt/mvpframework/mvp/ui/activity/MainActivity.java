package com.alohatt.mvpframework.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.alohatt.library.mvp.BaseActivity;
import com.alohatt.mvpframework.R;
import com.alohatt.mvpframework.di.component.DaggerMainComponent;
import com.alohatt.mvpframework.mvp.contract.MainContract;
import com.alohatt.mvpframework.mvp.presenter.MainPresenter;

import butterknife.BindView;

/**
 * @author tony
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.tv_main)
    TextView mTvMain;

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mPresenter.getDataFromServer();
    }

    @Override
    public void activityComponent() {
        DaggerMainComponent.
                builder().
                view(this)
                .build()
                .inject(this);
    }

    @Override
    public void setText(int data) {
        mTvMain.setText(String.valueOf(data));
    }
}
