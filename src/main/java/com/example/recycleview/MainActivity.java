package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Dog> mDogList = new ArrayList<Dog>();
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleview);
        //水平线性
       /* LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayout.HORIZONTAL);*/

        //网格
        //GridLayoutManager manager = new GridLayoutManager(this,4);

        //瀑布流
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(manager);
        mMyAdapter = new MyAdapter(mDogList);
        mRecyclerView.setAdapter(mMyAdapter);
    }

    private void initDogList() {
        mDogList.add(new Dog("dog1111111111111",R.drawable.dog1));
        mDogList.add(new Dog("dog222",R.drawable.dog2));
        mDogList.add(new Dog("dog333333333333333333",R.drawable.dog3));
        mDogList.add(new Dog("dog4444444444444444",R.drawable.dog4));
        mDogList.add(new Dog("dog5",R.drawable.dog5));
        mDogList.add(new Dog("dog666666",R.drawable.dog6));
        mDogList.add(new Dog("dog7777777777777777777777777777",R.drawable.dog7));
        mDogList.add(new Dog("dog888888888888",R.drawable.dog8));
        mDogList.add(new Dog("dog9",R.drawable.dog9));
        mDogList.add(new Dog("dog10",R.drawable.dog10));

    }
}
