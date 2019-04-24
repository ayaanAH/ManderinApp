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

        numberList.add(new Word("one","yi"));
        numberList.add(new Word("two","èr"));
        numberList.add(new Word("three","san"));
        numberList.add(new Word("four","sì"));
        numberList.add(new Word("five","wu"));
        numberList.add(new Word("six","liù"));
        numberList.add(new Word("seven","qi"));
        numberList.add(new Word("eight","ba"));
        numberList.add(new Word("nine","jiu"));
        numberList.add(new Word("ten","shí"));

        numListView=findViewById(R.id.numbersLists);
        WordAdapter wrdAdapt=new WordAdapter(this,numberList,R.color.greyback);
        numListView.setAdapter(wrdAdapt);

    }
}
