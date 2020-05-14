package com.example.walktodashboard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pagerAdapterTop extends FragmentPagerAdapter {

    private int tabNumberTop;

    public pagerAdapterTop(FragmentManager fm, int tabs) {
        super(fm);
        this.tabNumberTop = tabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new profile();
            case 1:
                return new myCourses();
            case 2:
                return  new assignments();
                default: return null;

        }

    }

    @Override
    public int getCount() {
        return tabNumberTop;
    }
}
