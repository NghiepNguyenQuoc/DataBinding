package com.nghiepnguyen.databinding.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.nghiepnguyen.databinding.BR;
import com.nghiepnguyen.databinding.model.User;

public class LoginViewModel extends BaseObservable {
    private User mUser;
    private String successMessage = "Login was successfull";
    private String erroMessage = "Email or Password not valid";

    @Bindable
    public String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public LoginViewModel() {
        mUser = new User("", "");
    }

    public void afterEmailTextChanged(CharSequence charSequence) {
        mUser.setmEmail(charSequence.toString());
    }

    public void afterPasswordTextChanged(CharSequence s) {
        mUser.setmPassword(s.toString());
    }

    public void onLoginClicked() {
        if (mUser.isInputDataValid()) {
            setToastMessage(successMessage);
        } else
            setToastMessage(erroMessage);
    }
}
