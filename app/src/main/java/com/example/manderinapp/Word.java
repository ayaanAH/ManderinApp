package com.example.manderinapp;

public class Word
{

    String mDefaultTranslation, mMandrinTranslation;

    public Word(String mDefaultTranslation, String mMandrinTranslation)
    {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMandrinTranslation = mMandrinTranslation;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMandrinTranslation()
    {
        return mMandrinTranslation;
    }
}
