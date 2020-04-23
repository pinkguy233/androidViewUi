package com.pink.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //初始化 viewpager
    private ViewPager myViewPager;


    private List<View> listView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.1初始化 View pager
        myViewPager = findViewById(R.id.my_view_pager);

        //1.2 获取布局 view , 中的 imagerView 并 赋予图片 添加到 集合中
        {
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager,null);
            ImageView imageView = view.findViewById(R.id.item_image_view);
            imageView.setBackgroundResource(R.drawable.img1);
            listView.add(view);
        }

        {
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager,null);
            ImageView imageView = view.findViewById(R.id.item_image_view);
            imageView.setBackgroundResource(R.drawable.img2);
            listView.add(view);
        }

        {
            View view = LayoutInflater.from(this).inflate(R.layout.item_view_pager,null);
            ImageView imageView = view.findViewById(R.id.item_image_view);
            imageView.setBackgroundResource(R.drawable.img3);
            listView.add(view);
        }


        myViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return listView.size();
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return view == object;
            }


            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                container.addView(listView.get(position));
                return listView.get(position);
            }

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView(listView.get(position));
            }
        });

    }
}
