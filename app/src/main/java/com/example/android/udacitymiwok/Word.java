package com.example.android.udacitymiwok;

public class Word {

    // member variable
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResID = -1;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new word
     *
     * @param defaultTranslation default translation of a word, such as english
     * @param miwokTranslation miwok translation of a word
     * */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a new Word object
     *
     * @param defaultTranslation default translation of a word, such as english
     * @param miwokTranslation miwok translation of a word
     * @param imageResID drawable resource ID for the image asset
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResID = imageResID;
    }

    /**
     *
     * @return String of default translation for word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * @return String of miwok translation for word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     *
     * @return resource id for the word image
     */
    public int getImageResID() {
        return mImageResID;
    }

    public boolean hasImage() {
        // return if mImageResID not equal to NO_IMAGE_PROVIDED
        return mImageResID != NO_IMAGE_PROVIDED;
    }
}
