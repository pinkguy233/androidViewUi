package com.pink.tablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.pink.tablayout.adapter.ViewPagerAdapter;
import com.pink.tablayout.fragment.ItemFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //mViewPager
    private ViewPager mViewPager;

    //tab
    private TabLayout tabLayout;

    //数据适配器
    private ViewPagerAdapter adapter;

    List<ItemFragment> fragments;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1加载viewPager
        //1.1创建 viewPager
        mViewPager =  findViewById(R.id.view_pager);

        //1.2 准备需要加载的 fragment 集合
        fragments = new ArrayList<>();

        tabLayout = findViewById(R.id.tabLayout);

        //1.3 准备数据  去查看 ItemFragment
        for (int i = 0; i < 8 ; i++){
            fragments.add(new ItemFragment("内容"+i));
        }

        //1.4使用 FragmentPagerAdapter 适配器
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
        //1.5 添加到控件中
        mViewPager.setAdapter(adapter);

        //2 tablayout 关联viewPager
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }



}
