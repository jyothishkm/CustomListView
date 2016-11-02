package com.example.bridgeit.customlistview;

/**
 * Created by bridgeit on 2/11/16.
 */

public class RowItems {

    private int mImageId;
    private String mTitle;
    private String mSubTitle;


    public RowItems(int mImageId, String mTitle, String mSubTitle) {
        this.mImageId = mImageId;
        this.mTitle = mTitle;
        this.mSubTitle = mSubTitle;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public void setmSubTitle(String mSubTitle) {
        this.mSubTitle = mSubTitle;
    }
}
