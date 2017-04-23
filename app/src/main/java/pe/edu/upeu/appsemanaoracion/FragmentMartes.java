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

public class FragmentMartes extends Fragment {

    View vista;
    Button tMañanaMa, tTardeMa, tNocheMa;

    ListView listaTurnosMartes;

    String[] Mamañana = {"programMartesMañana1", "programMartesMañana2", "programMartesMañana3", "programMartesMañana4", "programMartesMañana5", "programMartesMañana6", "programMartesMañana7", "programMartesMañana8"};
    String[] Matarde = {"programMartesTarde1", "programMartesTarde2", "programMartesTarde3", "programMartesTarde4", "programMartesTarde5", "programMartesTarde6", "programMartesTarde7", "programMartesTarde8"};
    String[] Manoche = {"programMartesNoche1", "programMartesNoche2", "programMartesNoche3", "programMartesNoche4", "programMartesNoche5", "programMartesNoche6", "programMartesNoche7", "programMartesNoche8"};

    public FragmentMartes(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosMartes = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mamañana);
        listaTurnosMartes.setAdapter(turnoMañana);

        tMañanaMa = (Button) vista.findViewById(R.id.turnoM);
        tMañanaMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaMa.setBackgroundResource(R.drawable.privado_select);
                tMañanaMa.setTextColor(Color.WHITE);
                tTardeMa.setBackgroundResource(R.drawable.general);
                tTardeMa.setTextColor(Color.BLACK);
                tNocheMa.setBackgroundResource(R.drawable.leidos);
                tNocheMa.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mamañana);
                listaTurnosMartes.setAdapter(turnoMañana);
            }
        });

        tTardeMa = (Button) vista.findViewById(R.id.turnoT);
        tTardeMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaMa.setBackgroundResource(R.drawable.privado);
                tMañanaMa.setTextColor(Color.BLACK);
                tTardeMa.setBackgroundResource(R.drawable.general_select);
                tTardeMa.setTextColor(Color.WHITE);
                tNocheMa.setBackgroundResource(R.drawable.leidos);
                tNocheMa.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Matarde);
                listaTurnosMartes.setAdapter(turnoTarde);
            }
        });

        tNocheMa = (Button) vista.findViewById(R.id.turnoN);
        tNocheMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaMa.setBackgroundResource(R.drawable.privado);
                tMañanaMa.setTextColor(Color.BLACK);
                tTardeMa.setBackgroundResource(R.drawable.general);
                tTardeMa.setTextColor(Color.BLACK);
                tNocheMa.setBackgroundResource(R.drawable.leido_select);
                tNocheMa.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Manoche);
                listaTurnosMartes.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}