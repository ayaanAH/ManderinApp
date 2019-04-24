package com.example.manderinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity
{

    ArrayList<Word> familyList;
    ListView familyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        familyList=new ArrayList<>();

        familyList.add(new Word("Father","父亲"));
        familyList.add(new Word("Mother","妈妈"));
        familyList.add(new Word("Son","儿子"));
        familyList.add(new Word("Daughter","女儿"));
        familyList.add(new Word("Younger brother","弟弟"));
        familyList.add(new Word("Younger sister","妹妹"));
        familyList.add(new Word("Grandmother","姥姥"));
        familyList.add(new Word("Grandfather","爷爷"));
        familyList.add(new Word("Elder brother","哥哥"));

        familyListView=findViewById(R.id.familiesLists);
        WordAdapter wrdAdapt=new WordAdapter(this,familyList,R.color.redback);
        familyListView.setAdapter(wrdAdapt);
    }
}
