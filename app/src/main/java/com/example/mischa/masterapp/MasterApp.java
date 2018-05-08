package com.example.mischa.masterapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MasterApp extends AppCompatActivity implements MainPageInterface{

    private FragmentManager fragmentManager = getFragmentManager();
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_app);

        Fragment mainPage = new MainPageFragment();
        fragmentManager.beginTransaction().add(R.id.fragment_container, mainPage).commit();

        setupDrawerLayout();
        }

        public void setupDrawerLayout(){

                drawerLayout = findViewById(R.id.drawer_layout);

                navigationView = findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(
                    new NavigationView.OnNavigationItemSelectedListener() {
                        @Override
                        public boolean onNavigationItemSelected(MenuItem menuItem) {
                            // set item as selected to persist highlight
                            menuItem.setChecked(true);
                            // close drawer when item is tapped
                            drawerLayout.closeDrawers();

                            switch (menuItem.getItemId()){

                                case R.id._essen:
                                    Fragment essen_fragment = new EssenFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, essen_fragment).addToBackStack(null).commit();
                                    break;

                                case R.id._mvv:
                                    Fragment mvv_fragment = new MVVFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, mvv_fragment).addToBackStack(null).commit();
                                    break;

                                case R.id._navigation_haus:
                                    Fragment nav_fragment = new NavigationFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, nav_fragment).addToBackStack(null).commit();
                                    break;

                                case R.id._prof:
                                    Fragment prof_fragment = new ProfFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, prof_fragment).addToBackStack(null).commit();
                                    break;

                                case R.id._schw_brett:
                                    Fragment schw_brett_fragment = new SchwBrettFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, schw_brett_fragment).addToBackStack(null).commit();
                                    break;

                                case R.id._vorlesung:
                                    Fragment vorlesung_fragment = new VorlesungFragment();
                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, vorlesung_fragment).addToBackStack(null).commit();
                                    break;
                            }


                            return true;
                        }
                    });

        }

        public void switchToEssenFragment() {
            Fragment fragment = new EssenFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

        public void switchToMVVFragment(){
            Fragment fragment = new MVVFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

        public void switchToNaviFragment(){
            Fragment fragment = new NavigationFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

        public void switchToProfFragment(){
            Fragment fragment = new ProfFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

        public void switchToSchwBrettFragment(){
            Fragment fragment = new SchwBrettFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

        public void switchToVorlesungFragment(){
            Fragment fragment = new VorlesungFragment();
//            replace fragment
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        }

    @Override
    public void changeFragmentMainPage(int ID) {
        switch (ID){

            case 0:
                switchToEssenFragment();
                break;

            case 1:
                switchToMVVFragment();
                break;

            case 2:
                switchToNaviFragment();
                break;

            case 3:
                switchToProfFragment();
                break;

            case 4:
                switchToSchwBrettFragment();
                break;

            case 5:
                switchToVorlesungFragment();
                break;

            default: throw new IndexOutOfBoundsException("Selection not in Bounds. Should not happen," +
                    "for people who make mistakes only ;)");
        }
    }


}
