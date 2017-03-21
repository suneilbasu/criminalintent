package com.ethanbarker.criminalintent4;

import android.support.v4.app.Fragment;

/**
 * Created by ibasu on 21/03/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
