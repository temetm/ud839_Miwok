package com.example.android.miwok;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** Picture ID for this object */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSongId;
    /**
     * Create a new Word object. two constructors available depends of arguments
     */
    public Word(String defaultTranslation, String miwokTranslation, int songId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongId = songId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int songId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSongId = songId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getPictureID() {
        return mImageResourceId;
    }
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
