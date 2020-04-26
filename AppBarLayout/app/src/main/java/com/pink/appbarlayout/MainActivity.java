package com.pink.appbarlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pink.appbarlayout.adapter.FeedAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private FeedAdapter mFeedAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView =findViewById(R.id.recycler_view);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mFeedAdapter = new FeedAdapter(this);

        recyclerView.setAdapter(mFeedAdapter);


    }
}
