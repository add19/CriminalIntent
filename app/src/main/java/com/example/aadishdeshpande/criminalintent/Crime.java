package com.example.aadishdeshpande.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aadish Deshpande on 5/28/2018.
 */

public class Crime {
    private UUID mid;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mid = id;
        mDate = new Date();
    }

    public UUID getMid() {
        return mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }
    public String getmSuspect() {
        return mSuspect;
    }

    public void setmSuspect(String suspect) {
        mSuspect = suspect;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getPhotoFileName(){
        return "IMG_" + getMid().toString() + ".jpg";
    }
}
