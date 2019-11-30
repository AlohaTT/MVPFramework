package com.alohatt.library.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.InflateException;

import com.alohatt.library.base.IActivity;
import com.alohatt.library.base.IPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @ClassName BaseActivity
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:06
 * @Version 1.0
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity {
    @Inject
    @Nullable
    protected P mPresenter;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutId = initView(savedInstanceState);
        try {
            if (layoutId != 0) {
                setContentView(layoutId);
                mUnbinder = ButterKnife.bind(this);
            }
        } catch (Exception e) {
            if (e instanceof InflateException) throw e;
            e.printStackTrace();
        }
        activityComponent();
        initData(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null && mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
        this.mUnbinder = null;
        if (mPresenter != null) {
            mPresenter.onDestroy();
        }
        this.mPresenter = null;
    }

}
