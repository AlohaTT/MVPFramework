package com.alohatt.library.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.InflateException;

import com.alohatt.library.base.IActivity;
import com.alohatt.library.base.IPresenter;

/**
 * @ClassName BaseActivity
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:06
 * @Version 1.0
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity<P> {
    P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutId = initView(savedInstanceState);
        try {
            if (layoutId != 0) {
                setContentView(layoutId);
            }
        } catch (Exception e) {
            if (e instanceof InflateException) throw e;
            e.printStackTrace();
        }
        mPresenter = setPresenter();
        initData(savedInstanceState);
    }

}
