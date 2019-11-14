package com.alohatt.mvpframework.mvp.presenter;

import com.alohatt.library.mvp.BasePresenter;
import com.alohatt.mvpframework.mvp.contract.MainContract;

/**
 * @ClassName MainPresenter
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:57
 * @Version 1.0
 */
public class MainPresenter extends BasePresenter<MainContract.Model, MainContract.View> {

    public MainPresenter(MainContract.Model model, MainContract.View view) {
        super(model, view);
    }
}
