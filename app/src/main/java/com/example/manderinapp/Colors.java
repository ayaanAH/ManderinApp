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

        colorList.add(new Word(R.drawable.color_red,"Red","红色-Hóngsè"    ));
        colorList.add(new Word(R.drawable.color_green,"Green","绿色-Lǜsè"    ));
        colorList.add(new Word(R.drawable.color_brown,"Brown","棕色-Zōngsè"  ));
        colorList.add(new Word(R.drawable.color_gray,"Grey","灰色-Huīsè"    ));
        colorList.add(new Word(R.drawable.color_black,"Black","黑色-Hēisè"   ));
        colorList.add(new Word(R.drawable.color_white,"White","白色-Báisè"   ));
        colorList.add(new Word(R.drawable.color_mustard_yellow,"Yellow","黄色-Huángsè"));

        colorListView=findViewById(R.id.colorsLists);
        WordAdapter wrdAdapt=new WordAdapter(this,colorList,R.color.greenback);
        colorListView.setAdapter(wrdAdapt);



    }
}
