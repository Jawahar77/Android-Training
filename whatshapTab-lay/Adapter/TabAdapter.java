package com.example.tablayout.Adapter;

import android.content.Context;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayout.Fragment.Callsss;
import com.example.tablayout.Fragment.HomeFrag;
import com.example.tablayout.Fragment.Mesagee;

public class TabAdapter extends FragmentPagerAdapter {
    public Context context;
    public int itemcount;

    public TabAdapter(@NonNull FragmentManager fm,Context context, int itemcount) {
        super(fm);
        this.context=context;
        this.itemcount=itemcount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFrag hf=new HomeFrag();
                return hf;
            case 1:
                Callsss cal=new Callsss();
                return cal;
            case 2:
                Mesagee ms=new Mesagee();
                return ms;
    }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
