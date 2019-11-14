package com.alohatt.library.base;

/**
 * @ClassName IView
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:28
 * @Version 1.0
 */
public interface IView {
    /**
     * 显示加载
     */
    default void showLoading() {

    }

    /**
     * 隐藏加载
     */
    default void hideLoading() {

    }
}
