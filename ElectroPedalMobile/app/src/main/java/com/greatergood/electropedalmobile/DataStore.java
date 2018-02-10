package com.greatergood.electropedalmobile;

/**
 * Created by shado on 10/02/2018.
 */

public class DataStore {
    private static String mUserName;

    public static String getUserName() {
        return mUserName;
    }

    public static void setUserName(String userName) {
        mUserName = userName;
    }
}
