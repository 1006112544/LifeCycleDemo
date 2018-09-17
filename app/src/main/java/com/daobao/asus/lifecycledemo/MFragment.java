package com.daobao.asus.lifecycledemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by db on 2018/9/17.
 */
public class MFragment extends Fragment {
    private IPresenter mPresenter;
    private View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mRootView==null){
            mRootView = inflater.inflate(R.layout.fragment_test,container,false);
            mPresenter = new PresenterImpl("MFragment");
            getLifecycle().addObserver(mPresenter);
        }
        return mRootView;
    }
}
