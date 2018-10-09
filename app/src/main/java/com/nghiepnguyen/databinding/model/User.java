package com.nghiepnguyen.databinding.model;

import android.text.TextUtils;
import android.util.Patterns;

import org.jetbrains.annotations.NotNull;

public class User {
    @NotNull
    private String mEmail;
    @NotNull
    private String mPassword;

    public User(@NotNull String mEmail, @NotNull String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }

    @NotNull
    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(@NotNull String mEmail) {
        this.mEmail = mEmail;
    }

    @NotNull
    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(@NotNull String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(mEmail) && Patterns.EMAIL_ADDRESS.matcher(getmEmail()).matches() && getmPassword().length() > 5;
    }
}
