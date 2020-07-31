package trungatom.tqt.trungtestandroid.viewmodel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;

import androidx.lifecycle.ViewModel;

import trungatom.tqt.trungtestandroid.LoginCallBacks;
import trungatom.tqt.trungtestandroid.model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginCallBacks loginCallBacks;

    public LoginViewModel(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
        this.user = new User();
    }

    public User getmUser() {
        return user;
    }

    public void setmUser(User mUser) {
        this.user = mUser;
    }

    public LoginCallBacks getLoginCallBacks() {
        return loginCallBacks;
    }

    public void setLoginCallBacks(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
    }

    public TextWatcher emailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setEmail(s.toString());
            }
        };
    }

    public TextWatcher passwordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setPassword(s.toString());
            }
        };
    }

    public void onLoginButtonClick() {
        if (user.isValid()) {
            loginCallBacks.onLoginsuccessful("Login Successful");
        } else {
            loginCallBacks.onFailure("Login Failure");
        }
    }
}
