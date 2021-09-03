package com.example.android.udacitymiwok;

public class Word {

    // member variable
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    // constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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
}
