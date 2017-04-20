package pe.edu.upeu.appsemanaoracion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentProgramacion extends Fragment {

    View vista;
    ListView listaProgramacion;

    String[] programa = {
            "Programa de Domingo",
            "Programa de Lunes",
            "Programa de Martes",
            "Programa de Miercoles",
            "Programa de Jueves",
            "Programa de Jueves",
            "Programa de Viernes",
            "Programa de Sabado",
            "Programa de Domingo",
            "Programa de Lunes",
            "Programa de Martes",
            "Programa de Miercoles"
    };

    public FragmentProgramacion() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_programacion, container, false);

        listaProgramacion = (ListView) vista.findViewById(R.id.listaProgramacion);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, programa);
        listaProgramacion.setAdapter(adapter);

        return vista;
    }

}