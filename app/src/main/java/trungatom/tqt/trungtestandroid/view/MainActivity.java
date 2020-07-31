package trungatom.tqt.trungtestandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import trungatom.tqt.trungtestandroid.LoginCallBacks;
import trungatom.tqt.trungtestandroid.R;
import trungatom.tqt.trungtestandroid.databinding.ActivityMainBinding;
import trungatom.tqt.trungtestandroid.model.share_pref.UserSharePref;
import trungatom.tqt.trungtestandroid.viewmodel.LoginViewModel;
import trungatom.tqt.trungtestandroid.viewmodel.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity implements LoginCallBacks {
    private UserSharePref userSharePref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userSharePref = new UserSharePref(this);
        ActivityMainBinding activityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this, userSharePref)).get(LoginViewModel.class));
    }

    @Override
    public void onLoginsuccessful(String message) {
        Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this, "Failure", Toast.LENGTH_SHORT).show();
    }
}
