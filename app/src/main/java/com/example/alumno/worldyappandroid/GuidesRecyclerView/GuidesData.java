package com.example.alumno.worldyappandroid.GuidesRecyclerView;

import android.widget.Button;

/**
 * Created by Alumno on 28/02/2018.
 */

public class GuidesData {

    private String guideName;
    private String guideDescription;
    private float guidePuntuation;
    private int guideImage;
    private int guideTotalMarkers;
    private Boolean guideIsActive;
    //private Button btMarkAsActive;

    public GuidesData(String guideName, String guideDescription, float guidePuntuation, int guideTotalMarkers, int guideImage, boolean guideIsActive) {

        this.guideName = guideName;
        this.guideDescription = guideDescription;
        this.guideImage = guideImage;
        this.guideTotalMarkers = guideTotalMarkers;
        this.guidePuntuation = guidePuntuation;
        this.guideIsActive = guideIsActive;

    }


    public String getGuideName() { return guideName; }

    public String getGuideDescription() {
        return guideDescription;
    }

    public float getGuidePuntuation() {
        return guidePuntuation;
    }

    public int getGuideImage() { return guideImage; }

    public int getGuideTotalMarkers() {
        return guideTotalMarkers;
    }

    public Boolean getGuideIsActive() { return  guideIsActive; }

}
