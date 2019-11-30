package com.alohatt.mvpframework.mvp.model;

import com.alohatt.library.mvp.BaseModel;
import com.alohatt.mvpframework.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * @ClassName MainModel
 * @Description TODO
 * @Author tony
 * @Date 2019-11-14 00:11
 * @Version 1.0
 */
public class MainModel extends BaseModel implements MainContract.Model {

    @Inject
    public MainModel() {

    }

    @Override
    public int getText() {
        return mockData();
    }

    private int mockData() {
        return 11;
    }
}
