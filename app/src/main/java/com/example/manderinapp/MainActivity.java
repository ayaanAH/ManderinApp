package com.example.manderinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView numberTxt, familyTxt, colorTxt, phraseTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberTxt=findViewById(R.id.numbers);
        familyTxt=findViewById(R.id.family);
        colorTxt=findViewById(R.id.color);
        phraseTxt=findViewById(R.id.phrase);

        numberTxt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goNumbers = new Intent(getApplicationContext(), Numbers.class);
                startActivity(goNumbers);
            }
        });

        familyTxt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goFamily = new Intent(getApplicationContext(), FamilyMembers.class);
                startActivity(goFamily);
            }
        });

        colorTxt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goColors = new Intent(getApplicationContext(), Colors.class);
                startActivity(goColors);
            }
        });

        phraseTxt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goPhrases = new Intent(getApplicationContext(), Phrases.class);
                startActivity(goPhrases);
            }
        });

    }



}
