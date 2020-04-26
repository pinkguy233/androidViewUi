package com.pink.tablayout.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.pink.tablayout.fragment.ItemFragment;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //1.4.1 准备集合
    private List<ItemFragment> fragments;

    public ViewPagerAdapter(@NonNull FragmentManager fm, List<ItemFragment> fragments) {
        super(fm);
        //1.4.2 初始化集合
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //根据位置返回对应的  Fragment
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        // 返回集合数量
        return fragments.size();
    }


    //得到页面的标题
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return fragments.get(position).getContent();
    }
}
