package com.example.alumno.worldyappandroid.GuidesRecyclerView;

/**
 * Created by Cesar on 20/02/2018.
 */

public class Marker {

    private String markerName = "";
    private String markerDescription = "";
    private String markerGuide = "";
    private int markerImage = 0;
    private int markerPosition = 0;



    public Marker(int imagen_prod, String nombre_prod, String precio_prod) {

        this.markerName = markerName;
        this.markerDescription = markerDescription;
        this.markerGuide = markerGuide;
        this.markerImage = markerImage;
        this.markerPosition = markerPosition;

    }


    public String getMarkerName() {return markerName;}

    public String getMarkerDescription() {return markerDescription;}

    public String getMarkerGuide() {return markerGuide;}

    public int getMarkerImage() {return markerImage;}

    public int getMarkerPosition() {return markerPosition;}


}

