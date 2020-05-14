package com.example.walktodashboard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pagerAdapterBottom extends FragmentPagerAdapter {

    private int tabNumberBottom;

    public pagerAdapterBottom(FragmentManager fm, int tabs) {
        super(fm);
        this.tabNumberBottom = tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new explore();
            case 1:
                return new discussion();
            case 2:
                return new liveSessions();

                default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabNumberBottom;
    }
}
