package com.alohatt.library.base;

/**
 * @ClassName IFragment
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:33
 * @Version 1.0
 */
public interface IFragment {

    /**
     * 初始化布局
     *
     * @return
     */
    int initView();

    /**
     * 初始化数据
     */
    void initData();

    void fragmentComponent();
}
