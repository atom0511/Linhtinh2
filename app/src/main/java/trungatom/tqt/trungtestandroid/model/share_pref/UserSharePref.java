package trungatom.tqt.trungtestandroid.model.share_pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import trungatom.tqt.trungtestandroid.model.User;

public class UserSharePref {
    private SharedPreferences sharedPreferences;
    private User user;
    private static final String KEY_EMAIL = "keyEmail";
    private static final String KEY_PASSWORD = "keyPassword";
    private static final String KEY_CHECKED = "keyChecked";

    public UserSharePref(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        user = new User();
    }

    public void saveData() {
        sharedPreferences.edit().putString(KEY_EMAIL, user.getEmail());
        sharedPreferences.edit().putString(KEY_PASSWORD, user.getPassword());
        sharedPreferences.edit().putBoolean(KEY_CHECKED, true);
        sharedPreferences.edit().commit();
    }

    public String getEmailData() {
        return sharedPreferences.getString(KEY_EMAIL, "");
    }

    public String getPasswordData() {
        return sharedPreferences.getString(KEY_PASSWORD, "");
    }

    public Boolean getCheckedData() {
        return sharedPreferences.getBoolean(KEY_CHECKED, false);
    }
}
