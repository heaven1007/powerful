package com.heaven.powerfulapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.heaven.powerfulapp.PowerfulApp;

/**
 * Created by Heaven on 2016/12/12.
 */

public class AppUtils {
    private static final String SHAREDPREFERENCES_NAME = "powerful_app";

    public static SharedPreferences getAppSp() {
        return PowerfulApp.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
    }
}
