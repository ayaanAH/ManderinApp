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

        familyList.add(new Word(R.drawable.family_father,"Father","父亲"));
        familyList.add(new Word(R.drawable.family_mother,"Mother","妈妈"));
        familyList.add(new Word(R.drawable.family_son,"Son","儿子"));
        familyList.add(new Word(R.drawable.family_daughter,"Daughter","女儿"));
        familyList.add(new Word(R.drawable.family_younger_brother,"Younger brother","弟弟"));
        familyList.add(new Word(R.drawable.family_younger_sister,"Younger sister","妹妹"));
        familyList.add(new Word(R.drawable.family_grandmother,"Grandmother","姥姥"));
        familyList.add(new Word(R.drawable.family_grandfather,"Grandfather","爷爷"));
        familyList.add(new Word(R.drawable.family_older_brother,"Elder brother","哥哥"));

        familyListView=findViewById(R.id.familiesLists);
        WordAdapter wrdAdapt=new WordAdapter(this,familyList,R.color.redback);
        familyListView.setAdapter(wrdAdapt);
    }
}
