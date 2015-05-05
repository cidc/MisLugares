package mislugares.example.org.mislugares;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Administrador on 04/05/2015.
 */
public class Preferencias extends PreferenceActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }

}