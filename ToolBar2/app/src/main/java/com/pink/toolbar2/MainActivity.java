package com.pink.toolbar2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //获取 toolbar 转换成 ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 获取 ActionBar 设置相应属性
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("标题");
        actionBar.setDisplayHomeAsUpEnabled(true);//显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //设置抽屉按钮


        //toolbar 关联  DrawerLayout
        DrawerLayout drawer= findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.close,R.string.open);
        toggle.syncState(); //同步 DrawerLayout 状态



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.backup:
                Toast.makeText(getApplicationContext(),"点击了Backup", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
