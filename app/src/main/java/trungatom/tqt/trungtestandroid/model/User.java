package trungatom.tqt.trungtestandroid.model;

import android.text.TextUtils;

public class User {
    String email, password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid(){
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password) && getPassword().length() > 6;
    }
}
