package com.example.mischa.masterapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by mischa on 28.04.18.
 */

public class EssenFragment extends Fragment{


    // exit
    ImageButton exitbutton;

    /**
     * default constructor
     */
    public EssenFragment() {
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
        View helpView =  inflater.inflate(R.layout.essen_fragment, container, false);

        return helpView;
    }
}
