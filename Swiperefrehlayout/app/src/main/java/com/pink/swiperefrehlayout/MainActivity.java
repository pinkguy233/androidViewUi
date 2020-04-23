package com.pink.swiperefrehlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.net.LinkAddress;
import android.os.Bundle;
import android.os.Handler;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    SwipeRefreshLayout swipeRefreshLayout;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //1 初始化 控件
        swipeRefreshLayout = findViewById(R.id.swip_refresh_layout);
        listView = findViewById(R.id.my_list_view);

        //准备数据
        final   List<String> dataList = new ArrayList<>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1,dataList);

        for (int i = 0; i < 30; i++){
                dataList.add("----"+i);
        }

        //添加到  listview中
        listView.setAdapter(adapter);

        //设置圈数的 颜色
        swipeRefreshLayout.setColorSchemeColors(Color.RED,Color.RED,Color.RED,Color.RED);

        //设置转圈的开始位置 和结束位置
        swipeRefreshLayout.setProgressViewOffset(false,200,400);

        //触发请求 为true ，展示到控件后false
    //   swipeRefreshLayout.setRefreshing(true);


        //下拉刷新事件
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                //延时
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);

                        for (int i = 0; i < 30; i++){
                            dataList.add("新加的数据"+i);
                        }
                        adapter.notifyDataSetChanged(); //通知刷新

                    }
                },2000);

            }
        });

    }
}
