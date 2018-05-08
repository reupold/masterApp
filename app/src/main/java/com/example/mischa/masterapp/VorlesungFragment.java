package com.example.mischa.masterapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mischa on 28.04.18.
 */

public class VorlesungFragment extends Fragment{

    /**
     * default constructor
     */
    public VorlesungFragment() {
    }

    /**
     * Method onAttach to register Listener to parent
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /**
     * Class onCreateView to inflate layout and register exitbutton
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return the setted view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vorlesungView =  inflater.inflate(R.layout.vorlesung_fragment, container, false);

        return vorlesungView;
    }
}
