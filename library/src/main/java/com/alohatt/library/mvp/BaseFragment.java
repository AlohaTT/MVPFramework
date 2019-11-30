package com.alohatt.library.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alohatt.library.base.IFragment;
import com.alohatt.library.base.IPresenter;

import javax.inject.Inject;

/**
 * @ClassName BaseFragment
 * @Description TODO
 * @Author tony
 * @Date 2019-11-13 23:20
 * @Version 1.0
 */
public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IFragment {
    @Inject
    @Nullable
    P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        int layoutId = initView();
        if (layoutId != 0) {
            view = inflater.inflate(layoutId, container);
        } else {
            view = super.onCreateView(inflater, container, savedInstanceState);
        }
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentComponent();
    }

}
