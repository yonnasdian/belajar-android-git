package com.example.abdalim.abdielalim.Util.PrefrenceHelper;

import android.content.SharedPreferences;package com.example.abdalim.abdielalim.Util.PrefrenceHelper;
        import android.content.Context;
        import android.content.SharedPreferences;
        import android.preference.Preference;

        import java.util.prefs.Preferences;
/**
 * Created by amikom on 28/09/2018.
 */

public class PrefrenceHelper {
    private static PrefrenceHelper INSTANCE;
    private SharedPreferences = Context
    .getApplicationContext()
    .getSharedPrefrences("simple.android.app", Context.MODE_PRIVATE);
    )
    public static PrefrenceHelperINSTANCE(Context context){
        if (INSTANCE == null){
            INSTANCE == PrefrenceHelper (context);
        }
    return INSTANCE;
    }
    public SharedPreferences Pref(){
        return SharedPreferences;
    }
    public Boolean isLogin(){
    return SharedPreferences.getBoolen()
    }



}
