package pe.edu.upeu.appsemanaoracion;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentContactos extends Fragment {

    View vista;
    ListView listContactos;

    String[] contactos = {"Contacto1", "Contacto2", "Contacto3", "Contacto4", "Contacto5", "Contacto6", "Contacto7", "Contacto8", "Contacto9", "Contacto10"};

    public FragmentContactos() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_contactos, container, false);

        listContactos = (ListView) vista.findViewById(R.id.listaContactos);
        ArrayAdapter<String> adaptadorContactos = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, contactos);
        listContactos.setAdapter(adaptadorContactos);
        listContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LayoutInflater inflateEliminar = getLayoutInflater(getArguments());
                final View dialogLayoutEliminar = inflateEliminar.inflate(R.layout.perfil, null);

                AlertDialog.Builder info = new AlertDialog.Builder(getActivity());
                info.setView(dialogLayoutEliminar);
                info.show();
            }
        });

        return vista;
    }

}