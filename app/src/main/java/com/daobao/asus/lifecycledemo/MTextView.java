package com.daobao.asus.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;


/**
 * Created by db on 2018/9/18.
 */
public class MTextView extends AppCompatTextView implements IPresenter {
    
    private String TAG = "Test";

    public MTextView(Context context) {
        this(context,null);
    }

    public MTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void setLifecycle(Lifecycle lifecycle){
        lifecycle.addObserver(this);
    }

    @Override
    public void OnCreate(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnCreate");
    }

    @Override
    public void OnDestroy(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnDestroy");
    }

    @Override
    public void OnPause(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnPause");
    }

    @Override
    public void OnResume(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnResume");
    }

    @Override
    public void OnStart(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnStart");
    }

    @Override
    public void OnStop(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnStop");
    }

    @Override
    public void OnLifeCycleChanged(@NonNull LifecycleOwner owner) {
        Log.d(TAG,"OnLifeCycleChanged");
    }

}
