package com.alohatt.library.base;

/**
 * @ClassName IPresenter
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:17
 * @Version 1.0
 */
public interface IPresenter {

    /**
     * 初始化操作
     */
    void onStart();

    /**
     * 销毁
     */
    void onDestroy();
}
