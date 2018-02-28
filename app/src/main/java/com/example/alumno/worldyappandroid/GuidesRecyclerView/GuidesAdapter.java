package com.example.alumno.worldyappandroid.GuidesRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.alumno.worldyappandroid.R;
import java.util.ArrayList;

/**
 * Created by Alumno on 28/02/2018.
 */

public class GuidesAdapter extends RecyclerView.Adapter<GuidesAdapter.guidesViewHolder> {

    private ArrayList<GuidesData> item;

    public GuidesAdapter(ArrayList<GuidesData> item) {
        this.item = item;
    }

    //Método que rellena o "infla" la vista y devuelve su contenido
    @Override
    public guidesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_guides_recview_cards, viewGroup, false);
        guidesViewHolder guide=new guidesViewHolder(v);
        return guide;
    }

    //Muestra/"recoje" la informacion de cada item del RecycleView
    @Override
    public void onBindViewHolder(guidesViewHolder guidesViewHolder, int i) {
        guidesViewHolder.guideName.setText(item.get(i).getGuideName());
        guidesViewHolder.guideDescription.setText(item.get(i).getGuideDescription());
        guidesViewHolder.guidePuntuation.setText((int) item.get(i).getGuidePuntuation());
        guidesViewHolder.guideTotalMarkers.setText(item.get(i).getGuideTotalMarkers());
        guidesViewHolder.guideImage.setImageResource(item.get(i).getGuideImage());
        guidesViewHolder.guideName.setText(item.get(i).getGuideDescription());
    }

    //Contiene el tamaño de los items
    @Override
    public int getItemCount() {
        return item.size();
    }


    public class guidesViewHolder extends RecyclerView.ViewHolder {

        TextView guideName, guideDescription;
        ImageView guideImage;
        TextView guidePuntuation;
        TextView guideTotalMarkers;
        boolean guideIsActive;

        public guidesViewHolder(View itemView) {
            super(itemView);

            guideName = itemView.findViewById(R.id.guideName);
            guideDescription = itemView.findViewById(R.id.guideDescription);
            guideImage = itemView.findViewById(R.id.guideImage);
            guidePuntuation = itemView.findViewById(R.id.guidePuntuation);
            guideTotalMarkers = itemView.findViewById(R.id.guideTotalMarkers);

        }
    }

}

