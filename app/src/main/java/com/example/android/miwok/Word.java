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
    private int AudioId;

    public Word(String MilName, String EngName, int AudioId){
        this.MilName = MilName;
        this.EngName = EngName;
        this.AudioId = AudioId;
    }

    public Word(String MilName, String EngName, int ImageId, int AudioId){
        this.MilName = MilName;
        this.EngName = EngName;
        this.ImageId = ImageId;
        this.AudioId = AudioId;
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

    public int getAudioId() {
        return AudioId;
    }

}
