package com.example.manderinapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    int color;

    public WordAdapter(Activity context, ArrayList<Word> numberList,int colorBack) {
        super(context,0,numberList);
        this.color=colorBack;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View root= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);

        Word currentWord=getItem(position);
        TextView defaultTrans=root.findViewById(R.id.default_lang);
        TextView manderinTrans=root.findViewById(R.id.manderin_lang);
        defaultTrans.setText(currentWord.getmDefaultTranslation());
        manderinTrans.setText(currentWord.getmMandrinTranslation());

        View viewContainer = root.findViewById(R.id.container);
        int colour= ContextCompat.getColor(getContext(),color);
        viewContainer.setBackgroundColor(colour);

        return root;
    }
}
