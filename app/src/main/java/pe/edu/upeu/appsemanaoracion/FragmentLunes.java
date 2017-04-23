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

public class FragmentLunes extends Fragment {

    View vista;
    Button tMañanaL, tTardeL, tNocheL;

    ListView listaTurnosLunes;

    String[] Lmañana = {"programLunesMañana1", "programLunesMañana2", "programLunesMañana3", "programLunesMañana4", "programLunesMañana5", "programLunesMañana6", "programLunesMañana7", "programLunesMañana8"};
    String[] Ltarde = {"programLunesTarde1", "programLunesTarde2", "programLunesTarde3", "programLunesTarde4", "programLunesTarde5", "programLunesTarde6", "programLunesTarde7", "programLunesTarde8"};
    String[] Lnoche = {"programLunesNoche1", "programLunesNoche2", "programLunesNoche3", "programLunesNoche4", "programLunesNoche5", "programLunesNoche6", "programLunesNoche7", "programLunesNoche8"};

    public FragmentLunes(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosLunes = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Lmañana);
        listaTurnosLunes.setAdapter(turnoMañana);

        tMañanaL = (Button) vista.findViewById(R.id.turnoM);
        tMañanaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaL.setBackgroundResource(R.drawable.privado_select);
                tMañanaL.setTextColor(Color.WHITE);
                tTardeL.setBackgroundResource(R.drawable.general);
                tTardeL.setTextColor(Color.BLACK);
                tNocheL.setBackgroundResource(R.drawable.leidos);
                tNocheL.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Lmañana);
                listaTurnosLunes.setAdapter(turnoMañana);
            }
        });

        tTardeL = (Button) vista.findViewById(R.id.turnoT);
        tTardeL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaL.setBackgroundResource(R.drawable.privado);
                tMañanaL.setTextColor(Color.BLACK);
                tTardeL.setBackgroundResource(R.drawable.general_select);
                tTardeL.setTextColor(Color.WHITE);
                tNocheL.setBackgroundResource(R.drawable.leidos);
                tNocheL.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Ltarde);
                listaTurnosLunes.setAdapter(turnoTarde);
            }
        });

        tNocheL = (Button) vista.findViewById(R.id.turnoN);
        tNocheL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaL.setBackgroundResource(R.drawable.privado);
                tMañanaL.setTextColor(Color.BLACK);
                tTardeL.setBackgroundResource(R.drawable.general);
                tTardeL.setTextColor(Color.BLACK);
                tNocheL.setBackgroundResource(R.drawable.leido_select);
                tNocheL.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Lnoche);
                listaTurnosLunes.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}