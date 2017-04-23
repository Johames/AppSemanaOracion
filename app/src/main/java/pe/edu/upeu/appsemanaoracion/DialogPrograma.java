package pe.edu.upeu.appsemanaoracion;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USUARIO on 20/04/2017.
 */

public class DialogPrograma extends DialogFragment {

    static String title = "Programa de Hoy";

    String[] programaDeHoy = {
            "Programa de Hoy1",
            "Programa de Hoy2",
            "Programa de Hoy3",
            "Programa de Hoy4",
            "Programa de Hoy5",
            "Programa de Hoy6",
            "Programa de Hoy7",
            "Programa de Hoy8",
            "Programa de Hoy9",
            "Programa de Hoy10",
            "Programa de Hoy11",
            "Programa de Hoy12"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.programa, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        final ListView programacionHoy = (ListView) view.findViewById(R.id.listaProgramaDeHoy);
        ArrayAdapter<String> listaHoy = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, programaDeHoy);
        programacionHoy.setAdapter(listaHoy);

        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setHomeAsUpIndicator(android.R.drawable.ic_menu_close_clear_cancel);
        }
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            dismiss();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}