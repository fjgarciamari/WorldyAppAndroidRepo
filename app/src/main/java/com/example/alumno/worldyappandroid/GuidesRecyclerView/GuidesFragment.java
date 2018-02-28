package com.example.alumno.worldyappandroid.GuidesRecyclerView;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.alumno.worldyappandroid.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GuidesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GuidesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuidesFragment extends Fragment, AppCompatActivity {

    private RecyclerView recView1;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adaptador;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GuidesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GuidesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GuidesFragment newInstance(String param1, String param2) {
        GuidesFragment fragment = new GuidesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //__________________________________________________________________________________
    //__________________________________________________________________________________


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

            ArrayList<GuidesData> guides = new ArrayList<GuidesData>();

            //GuíaPrueba
            guides.add(new GuidesData("Aldaia",
                    "Un paseo por el pueblucho este...",
                    7,
                    8,
                    R.drawable.common_full_open_on_phone,
                    false));



            //Extrallendo nombre del Reciclador
            recView1 = (RecyclerView) findViewById(R.id.recView1);

            //LayoutManager
            layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recView1.setLayoutManager(layoutManager);

            //Adaptador
            adaptador = new GuidesAdapter(guides);
            recView1.setAdapter(adaptador);
        }
    }

    //__________________________________________________________________________________
    //__________________________________________________________________________________


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guides, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            //Toast.makeText(context, "Entrando en GuidesFragment", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
