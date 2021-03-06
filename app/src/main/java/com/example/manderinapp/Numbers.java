package com.example.manderinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity
{

    ArrayList<Word> numberList;
    ListView numListView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        numberList=new ArrayList<>();

        numberList.add(new Word(R.drawable.number_one,"one","yi"));
        numberList.add(new Word(R.drawable.number_two,"two","èr"));
        numberList.add(new Word(R.drawable.number_three,"three","san"));
        numberList.add(new Word(R.drawable.number_four,"four","sì"));
        numberList.add(new Word(R.drawable.number_five,"five","wu"));
        numberList.add(new Word(R.drawable.number_six,"six","liù"));
        numberList.add(new Word(R.drawable.number_seven,"seven","qi"));
        numberList.add(new Word(R.drawable.number_eight,"eight","ba"));
        numberList.add(new Word(R.drawable.number_nine,"nine","jiu"));
        numberList.add(new Word(R.drawable.number_ten,"ten","shí"));

        numListView=findViewById(R.id.numbersLists);
        WordAdapter wrdAdapt=new WordAdapter(this,numberList,R.color.greyback);
        numListView.setAdapter(wrdAdapt);

    }
}
