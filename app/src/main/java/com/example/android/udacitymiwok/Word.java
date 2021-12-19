package com.example.android.udacitymiwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    // member variable
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mAudioResId;
    private int mImageResId = -1;

    /**
     * Create a new word
     *
     * @param defaultTranslation default translation of a word, such as english
     * @param miwokTranslation   miwok translation of a word
     * @param audioResId         resource id of audio
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResId = audioResId;
    }

    /**
     * Create a new Word object
     *
     * @param defaultTranslation default translation of a word, such as english
     * @param miwokTranslation   miwok translation of a word
     * @param imageResId         drawable resource ID for the image asset
     * @param audioResId         resource id of audio
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResId, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResId = imageResId;
        mAudioResId = audioResId;
    }

    /**
     * @return String of default translation for word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return String of miwok translation for word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return resource id for the word image
     */
    public int getImageResId() {
        return mImageResId;
    }

    /**
     * @return if word object has image
     */
    public boolean hasImage() {
        // return if mImageResID not equal to NO_IMAGE_PROVIDED
        return mImageResId != NO_IMAGE_PROVIDED;
    }

    /**
     * @return resource id of audio
     */
    public int getAudioResId() {
        return mAudioResId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResId=" + mImageResId +
                ", mAudioResId=" + mAudioResId +
                '}';
    }
}
