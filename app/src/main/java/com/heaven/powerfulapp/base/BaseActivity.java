package com.heaven.powerfulapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Heaven on 2016/12/12.
 */

public abstract class BaseActivity<T extends BasePresenterInfer> extends SupportActivity implements BaseViewInfer{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
        initView();
    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void refreshUI() {

    }

    protected abstract void initData();
    protected abstract void initView();
}
