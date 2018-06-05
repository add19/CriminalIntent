package com.example.aadishdeshpande.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Aadish Deshpande on 5/29/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
