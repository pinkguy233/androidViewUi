package com.pink.tablayout.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ItemFragment extends Fragment {

    Context mContext;
    TextView textView;

    private String content;

    public String getContent() {
        return content;
    }

    public ItemFragment(String content) {
        this.content = content;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext =getActivity();
    }

    //1.创建试图
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        textView = new TextView(mContext);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25f);
        textView.setGravity(Gravity.CENTER);

        return textView;
    }


    // 创建活动时 设置内容
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setText(content);
    }
}
