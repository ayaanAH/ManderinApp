package com.example.manderinapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity
{
    ArrayList<Word> colorList;
    ListView colorListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        colorList=new ArrayList<>();

        colorList.add(new Word("Red","红色-Hóngsè"    ));
        colorList.add(new Word("Green","绿色-Lǜsè"    ));
        colorList.add(new Word("Blue","蓝色-Lán sè"   ));
        colorList.add(new Word("Brown","棕色-Zōngsè"  ));
        colorList.add(new Word("Grey","灰色-Huīsè"    ));
        colorList.add(new Word("Black","黑色-Hēisè"   ));
        colorList.add(new Word("White","白色-Báisè"   ));
        colorList.add(new Word("Yellow","黄色-Huángsè"));
        colorList.add(new Word("Pink","粉-Fěng"       ));
        colorList.add(new Word("Orange","橙子-Chéngzi"));

        colorListView=findViewById(R.id.colorsLists);
        WordAdapter wrdAdapt=new WordAdapter(this,colorList,R.color.greenback);
        colorListView.setAdapter(wrdAdapt);



    }
}
