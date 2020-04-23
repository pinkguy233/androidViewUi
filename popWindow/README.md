# pop 弹窗

- 创建pop 布局

- 通过 LayoutInflater 打气筒获取 view 布局

- 再 初始化 PopupWindow

- 通过事件 显示pop

  

```java
package com.pink.popwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 1 获取到 popwindow 的布局
        View view = LayoutInflater.from(this).inflate(R.layout.pop_window, null);

        //1.2 初始化 popwindow
        popupWindow = new PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT,
                                      WindowManager.LayoutParams.WRAP_CONTENT);

        //1.4 点击外部 popwindow 消失
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setFocusable(true);

        //1.3 通过点击事件，显示 pop
        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  popupWindow.showAsDropDown(v);

                // 显示居中
                // 获取 MainActivity 的跟view的居中位置
                popupWindow.showAtLocation(MainActivity.this.getWindow().getDecorView(), Gravity.CENTER,0,0);

            }
        });

        //1.5 点击pop 内部控件 消失
        view.findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ok", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
            }
        });




    }
}

```

