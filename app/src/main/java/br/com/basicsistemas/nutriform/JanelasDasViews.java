package br.com.basicsistemas.nutriform;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class JanelasDasViews extends MenuDoApp implements NavigationView.OnNavigationItemSelectedListener {

    protected Toolbar toolbar;
    protected DrawerLayout drawerLayout;
    protected NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(JanelasDasViews.this, drawerLayout,
                toolbar, R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById( R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen( GravityCompat.START )){
            drawerLayout.closeDrawer( GravityCompat.START );
        }else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        switch (menuItem.getItemId()){

            case R.id.menu_inbox:
                Toast.makeText( this, "Menu Inbox" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_favoritos:
                Toast.makeText( this,"Menu Favoritos" , Toast.LENGTH_SHORT).show();
                break;
            case  R.id.menu_emails_enviados:
                Toast.makeText( this, "Menu emails Enviados", Toast.LENGTH_SHORT ).show();

        }

        drawerLayout.closeDrawer( GravityCompat.START );
        return true;
    }
}
