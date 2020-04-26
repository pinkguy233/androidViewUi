package com.pink.drawerlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pink.drawerlayout.entity.Acg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    List<Acg> acgList  = new ArrayList<>();

    AcgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Data deleted",Snackbar.LENGTH_SHORT)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(),"点击了data", Toast.LENGTH_SHORT).show();
                            }
                        }).show();

            }
        });


        initAcg();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AcgAdapter(acgList);
        recyclerView.setAdapter(adapter);
    }



    private Acg[] acgs = {
            new Acg("ooo",R.drawable.ooo),
            new Acg("pichi",R.drawable.pichi),
            new Acg("v3",R.drawable.v3),
            new Acg("ooo2",R.drawable.ooo2),
            new Acg("黑猫",R.drawable.hm),
            new Acg("红爹",R.drawable.hd),
            new Acg("空我",R.drawable.kw)
    };


    private void initAcg(){
        acgList.clear();
        for (int i = 0;i < 50; i++){
            Random random = new Random();
            int index = random.nextInt(acgs.length);
            acgList.add(acgs[index]);
        }

    }

}
