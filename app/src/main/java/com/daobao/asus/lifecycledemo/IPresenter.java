package com.daobao.asus.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;

/**
 * Created by db on 2018/9/17.
 */
public interface IPresenter extends LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    default void OnCreate(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    default void OnDestroy(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    default void OnPause(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    default void OnResume(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    default void OnStart(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    default void OnStop(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    default void OnLifeCycleChanged(@NonNull LifecycleOwner owner){}
}
