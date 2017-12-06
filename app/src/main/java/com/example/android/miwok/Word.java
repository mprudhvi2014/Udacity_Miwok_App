package com.example.android.miwok;

import android.media.Image;

/**
 * Created by prudhvimandapati on 11/30/17.
 */

public class Word {

    private String MilName;
    private String EngName;
    private int ImageId = NO_IMAGEId;
    private  static final int NO_IMAGEId = -1;

    public Word(String MilName, String EngName){
        this.MilName = MilName;
        this.EngName = EngName;
    }

    public Word(String MilName, String EngName, int ImageId){
        this.MilName = MilName;
        this.EngName = EngName;
        this.ImageId = ImageId;
    }

    public String getMilName() {
        return MilName;
    }

    public String getEngName() {
        return EngName;
    }

    public int getImageId() {
        return ImageId;
    }

    public boolean hasImage() {
        return ImageId != NO_IMAGEId;
    }

}
