package com.example.spider.myapplication.Activitys;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.spider.myapplication.Adapters.NavDrawAdapter;
import com.example.spider.myapplication.Models.NavDrawItemModel;
import com.example.spider.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spider on 5/4/17.
 */

public class Mainactivitymain extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    String[] title = {"About App","feedback","Setting","The Team","Contact Us"};
    private CharSequence mTitle;
    private CharSequence mDrawerTitle;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar topToolBar;
    Context context;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.mainactivity_main);
            context = this;
            mTitle = mDrawerTitle = getTitle() ;
            topToolBar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(topToolBar);
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mDrawerList = (ListView) findViewById(R.id.left_drawer);

            List<NavDrawItemModel> listViewItems = new ArrayList<NavDrawItemModel>();
            listViewItems.add(new NavDrawItemModel("About App", R.drawable.ic_info_black_24dp));
            listViewItems.add(new NavDrawItemModel("Feedback", R.drawable.ic_feedback_black_24dp));
            listViewItems.add(new NavDrawItemModel("Settings", R.drawable.ic_settings_black_24dp));
            listViewItems.add(new NavDrawItemModel("The Team", R.drawable.group_work_black));
            listViewItems.add(new NavDrawItemModel("Contact Us", R.drawable.settings_phone_black));

            mDrawerList.setAdapter(new NavDrawAdapter(this,listViewItems));
            mDrawerToggle=new ActionBarDrawerToggle(Mainactivitymain.this,mDrawerLayout,R.string.drawer_open,R.string.drawer_close){
                public void onDrawerClosed(View view) {
                    super.onDrawerClosed(view);
                    getSupportActionBar().setTitle(mTitle);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }

                /** Called when a drawer has settled in a completely open state. */
                public void onDrawerOpened(View drawerView) {
                    super.onDrawerOpened(drawerView);
                    getSupportActionBar().setTitle(mDrawerTitle);
                    invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
                }

            };

            mDrawerLayout.setDrawerListener(mDrawerToggle);
            mDrawerToggle.setDrawerIndicatorEnabled(true);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);

            mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View vw, int position, long id) {

                    selectOptionFromNav(position);
                }
            });

        }

        private void selectOptionFromNav(int position){

            switch (position){
                case 0:
                    startActivity(new Intent(this,Aboutapp.class));
                    break;
                case 1:
                    Intent intent=new Intent(Intent.ACTION_SENDTO);
                    String uriText="mailto:"+ Uri.encode("rakekum35@gmail.com")+"?subject=" + Uri.encode("Reporting A Bug/Feedback") + "&body=" + Uri.encode("Hello, \nI want to report a bug/give feedback corresponding to the app SENDAPP App.\n.....\n\n-Your name");

                    Uri uri =Uri.parse(uriText);
                    intent.setData(uri);
                    startActivity(Intent.createChooser(intent,"Send Email"));
                    break;

                case 3:
                    startActivity(new Intent(this,Team.class));
                    break;
                case 4:
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                    alertDialog.setTitle("Contact Us");
                    alertDialog.setMessage("\nReach us at : \n\nContact No. : 9882926584 \n\nEmail Id : rakekum34@gmail.com\n\n");
                    alertDialog.setIcon(android.R.drawable.sym_contact_card);
                    alertDialog.show();
                    break;

            }


            mDrawerList.setItemChecked(position,true);
            setTitle(title[position]);
            mDrawerLayout.closeDrawer(mDrawerList);
        }

        public void Mainactivityview(View view)
        {
            Intent intent4 = new Intent(Mainactivitymain.this,Mainactivity.class);
            startActivity(intent4);
        }

        public void Sendsmsfun(View view)
        {
            Intent intent5 = new Intent(Mainactivitymain.this,Forsendsms.class);
            startActivity(intent5);
        }



}
