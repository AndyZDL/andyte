package com.andyzdl.ec.andyzdl_core.delegates;

import android.os.Binder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * File: BaseDelegates.java
 * Author: AndyDongDong
 * Create: 2018/12/19 16:42
 * Desc: ${DESC}
 */
public abstract class BaseDelegates extends SwipeBackFragment {
    public abstract int   setlayout();
    //public Unbinder mUnBinded = null;
    public ViewDataBinding mBinding;
    public abstract void onBindView(@Nullable Bundle savedInstanceState, ViewDataBinding binding);


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


            //rootView = inflater.inflate((Integer) setlayout(), container, false);
            mBinding = DataBindingUtil.inflate(inflater, setlayout(), container, false);

       // if (rootView != null) {
//            mUnBinded = ButterKnife.bind(this, rootView);
            onBindView(savedInstanceState, mBinding);
       // }

        return mBinding.getRoot();
    }

}
