package com.example.manderinapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity
{

    ArrayList<Word> phraseList;
    ListView phraseListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        phraseList=new ArrayList<>();

        phraseList.add(new Word("thank you so much","非常感谢。"));
        phraseList.add(new Word("I really appreciate…","我真的很感激…"));
        phraseList.add(new Word("where are you?","你在哪？"));
        phraseList.add(new Word("are you coming","你来吗"));
        phraseList.add(new Word("What do you think?","你怎么看？"));
        phraseList.add(new Word("Nice to meet you.","谢谢。这有很大帮助。"));
        phraseList.add(new Word("How can I help you?","很高兴见到你。"));
        phraseList.add(new Word(" I’ll be with you in a moment.","我怎么帮你？ 我马上就会和你在一起。"));
        phraseList.add(new Word ("Oh really  Actually, I thought…","实际上，我想.."));

        phraseListView=findViewById(R.id.phrasesLists);
        WordAdapter wrdAdapt=new WordAdapter(this,phraseList,R.color.blueback);
        phraseListView.setAdapter(wrdAdapt);

    }
}


