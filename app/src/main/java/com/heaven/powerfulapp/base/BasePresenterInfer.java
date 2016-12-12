package com.heaven.powerfulapp.base;

/**
 * Created by Heaven on 2016/12/12.
 */

public interface BasePresenterInfer <T extends BaseViewInfer>{
    void attachView(T view);
    void detachView();
}
