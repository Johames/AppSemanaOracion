package pe.edu.upeu.appsemanaoracion;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by USUARIO on 21/04/2017.
 */

public class FragmentViernes extends Fragment {

    View vista;
    Button tMañanaV, tTardeV, tNocheV;

    ListView listaTurnosViernes;

    String[] Vmañana = {"programViernesMañana1", "programViernesMañana2", "programViernesMañana3", "programViernesMañana4", "programViernesMañana5", "programViernesMañana6", "programViernesMañana7", "programViernesMañana8"};
    String[] Vtarde = {"programViernesTarde1", "programViernesTarde2", "programViernesTarde3", "programViernesTarde4", "programViernesTarde5", "programViernesTarde6", "programViernesTarde7", "programViernesTarde8"};
    String[] Vnoche = {"programViernesNoche1", "programViernesNoche2", "programViernesNoche3", "programViernesNoche4", "programViernesNoche5", "programViernesNoche6", "programViernesNoche7", "programViernesNoche8"};

    public FragmentViernes(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosViernes = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Vmañana);
        listaTurnosViernes.setAdapter(turnoMañana);

        tMañanaV = (Button) vista.findViewById(R.id.turnoM);
        tMañanaV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaV.setBackgroundResource(R.drawable.privado_select);
                tMañanaV.setTextColor(Color.WHITE);
                tTardeV.setBackgroundResource(R.drawable.general);
                tTardeV.setTextColor(Color.BLACK);
                tNocheV.setBackgroundResource(R.drawable.leidos);
                tNocheV.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Vmañana);
                listaTurnosViernes.setAdapter(turnoMañana);
            }
        });

        tTardeV = (Button) vista.findViewById(R.id.turnoT);
        tTardeV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaV.setBackgroundResource(R.drawable.privado);
                tMañanaV.setTextColor(Color.BLACK);
                tTardeV.setBackgroundResource(R.drawable.general_select);
                tTardeV.setTextColor(Color.WHITE);
                tNocheV.setBackgroundResource(R.drawable.leidos);
                tNocheV.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Vtarde);
                listaTurnosViernes.setAdapter(turnoTarde);
            }
        });

        tNocheV = (Button) vista.findViewById(R.id.turnoN);
        tNocheV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaV.setBackgroundResource(R.drawable.privado);
                tMañanaV.setTextColor(Color.BLACK);
                tTardeV.setBackgroundResource(R.drawable.general);
                tTardeV.setTextColor(Color.BLACK);
                tNocheV.setBackgroundResource(R.drawable.leido_select);
                tNocheV.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Vnoche);
                listaTurnosViernes.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}
