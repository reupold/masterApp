package com.example.mischa.masterapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by mischa on 07.05.18.
 */

public class MainPageFragment extends Fragment {

    private MainPageInterface listener;
    private View mainPageView;
    private ImageButton essen;
    private ImageButton mvv;
    private ImageButton navi;
    private ImageButton prof;
    private ImageButton schwBrett;
    private ImageButton vorlesung;

    /**
     * default constructor
     */
    public MainPageFragment() {
    }

    /**
     * Method onAttach to register Listener to parent
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainPageInterface) {
            listener = (MainPageInterface) context;
        } else {
            throw new ClassCastException(context.toString() + "Parent must implement MainPageInterface");
        }
    }

    /**
     * Class onCreateView to inflate layout and register buttons
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return the setted view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainPageView =  inflater.inflate(R.layout.mainpage_fragment, container, false);
        setEssen();
        setmvv();
        setNavi();
        setProf();
        setSchwBrett();
        setVorlesung();

        return mainPageView;
    }

    private void setEssen(){
        essen = (ImageButton) mainPageView.findViewById(R.id.EssenButton);

        essen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(0);
            }
        });
    }

    private void setmvv(){
        mvv = (ImageButton) mainPageView.findViewById(R.id.MVVButton);

        mvv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(1);
            }
        });
    }

    private void setNavi(){
        navi = (ImageButton) mainPageView.findViewById(R.id.NaviButton);

        navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(2);
            }
        });
    }

    private void setProf(){
        prof = (ImageButton) mainPageView.findViewById(R.id.ProfButton);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(3);
            }
        });
    }

    private void setSchwBrett(){
        schwBrett = (ImageButton) mainPageView.findViewById(R.id.SchwBrettButton);

        schwBrett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(4);
            }
        });
    }

    private void setVorlesung(){
        vorlesung = (ImageButton) mainPageView.findViewById(R.id.VorlesungButton);

        vorlesung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.changeFragmentMainPage(5);
            }
        });
    }
}
