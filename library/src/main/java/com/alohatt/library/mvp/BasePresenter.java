package com.alohatt.library.mvp;

import com.alohatt.library.base.IModel;
import com.alohatt.library.base.IPresenter;
import com.alohatt.library.base.IView;

/**
 * @ClassName BasePresenter
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:58
 * @Version 1.0
 */
public abstract class BasePresenter<M extends IModel, V extends IView> implements IPresenter {
    protected M mModel;
    protected V mView;

    public BasePresenter() {
        this(null, null);
    }

    public BasePresenter(V view) {
        this(null, view);
    }

    public BasePresenter(M model, V view) {
        mModel = model;
        mView = view;
        onStart();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }
}
