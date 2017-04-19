package pe.edu.upeu.appsemanaoracion;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Fragment fragmentoGenerico = null;
    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(navigationView != null){
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.principales, new FragmentInicio())
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inicio) {

            fragmentoGenerico = new FragmentInicio();
            setTitle(item.getTitle());

        } else if (id == R.id.nav_programacion) {

            fragmentoGenerico = new FragmentProgramacion();
            setTitle(item.getTitle());

        } else if (id == R.id.nav_Canticos) {

            fragmentoGenerico = new FragmentCanticos();
            setTitle(item.getTitle());

        } else if (id == R.id.nav_contactos) {

            fragmentoGenerico = new FragmentContactos();
            setTitle(item.getTitle());

        } else if (id == R.id.nav_sesion) {

            LayoutInflater inflateEliminar = getLayoutInflater();
            final View dialogLayoutEliminar = inflateEliminar.inflate(R.layout.sesion, null);

            AlertDialog.Builder info = new AlertDialog.Builder(InicioActivity.this);
            info.setView(dialogLayoutEliminar);
            info.show();

        } else if (id == R.id.nav_salir) {

            LayoutInflater inflateEliminar = getLayoutInflater();
            final View dialogLayoutEliminar = inflateEliminar.inflate(R.layout.cerrar_aplicacion, null);

            final TextView textEliminar = (TextView) dialogLayoutEliminar.findViewById(R.id.TextEliminar);
            textEliminar.setText("¿Seguro que desea cerrar la aplicación?");

            AlertDialog.Builder info = new AlertDialog.Builder(InicioActivity.this);
            info.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    InicioActivity.this.finish();
                    finish();
                }
            });
            info.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            info.setView(dialogLayoutEliminar);
            info.show();

        }

        if(fragmentoGenerico != null){
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.principales, fragmentoGenerico)
                    .commit();
        }

        //setTitle(item.getTitle());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //item.setChecked(true);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
