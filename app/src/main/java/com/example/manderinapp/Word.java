package com.example.manderinapp;

public class Word
{

    String mDefaultTranslation, mMandrinTranslation;
    int images;

    public Word(String mDefaultTranslation, String mMandrinTranslation, int images)
    {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMandrinTranslation = mMandrinTranslation;
        this.images=images
    }
    
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
    
    public int getImages()
    {
        return images;
    }
}
