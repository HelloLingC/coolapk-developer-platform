package com.lingc.coolapkconsole.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.lingc.coolapkconsole.R;

/**
 * Created by Administrator on 2017/2/4.
 */

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
