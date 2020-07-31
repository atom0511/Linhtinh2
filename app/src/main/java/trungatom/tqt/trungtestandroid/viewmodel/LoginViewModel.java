package trungatom.tqt.trungtestandroid.viewmodel;

import android.content.SharedPreferences;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;

import androidx.lifecycle.ViewModel;

import trungatom.tqt.trungtestandroid.LoginCallBacks;
import trungatom.tqt.trungtestandroid.model.User;
import trungatom.tqt.trungtestandroid.model.share_pref.UserSharePref;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginCallBacks loginCallBacks;
    private UserSharePref userSharePref;

    public LoginViewModel(LoginCallBacks loginCallBacks, UserSharePref userSharePref) {
        this.loginCallBacks = loginCallBacks;
        this.user = new User();
        this.userSharePref = userSharePref;
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
            if (1 + 1 == 2) {
                userSharePref.saveData();
            }
        } else {
            loginCallBacks.onFailure("Login Failure");
        }
    }
}
