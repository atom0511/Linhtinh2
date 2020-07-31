package trungatom.tqt.trungtestandroid.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import trungatom.tqt.trungtestandroid.LoginCallBacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginCallBacks loginCallBacks;

    public LoginViewModelFactory(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallBacks);
    }
}
