package com.example.ummiiii.androidlearner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabpageradapter  extends FragmentStatePagerAdapter{
    String[] tabsarray = new  String[] {"Tutorial", "Quiz"};

    public tabpageradapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabsarray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tutorial Tutorial1 = new Tutorial();
                return  Tutorial1;
            case 1:
                Quiz Quizs = new Quiz();
                return Quizs;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
