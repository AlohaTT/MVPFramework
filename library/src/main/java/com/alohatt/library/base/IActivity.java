package com.alohatt.library.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @ClassName IActivity
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:01
 * @Version 1.0
 */
public interface IActivity<P extends IPresenter> {

    /**
     * 初始化布局
     * @param savedInstanceState
     * @return 布局id
     */
    int initView(@Nullable Bundle savedInstanceState);

    /**
     * 初始化数据
     * @param savedInstanceState
     */
    void initData(@Nullable Bundle savedInstanceState);

    /**
     * 绑定Presenter
     * @return
     */
    P setPresenter();
}
