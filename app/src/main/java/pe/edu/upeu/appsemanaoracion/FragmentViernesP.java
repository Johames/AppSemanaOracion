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

public class FragmentViernesP extends Fragment {

    View vista;
    Button tMañanaVP, tTardeVP, tNocheVP;

    ListView listaTurnosViernesP;

    String[] PVmañana = {"programPViernesMañana1", "programPViernesMañana2", "programPViernesMañana3", "programPViernesMañana4", "programPViernesMañana5", "programPViernesMañana6", "programPViernesMañana7", "programPViernesMañana8"};
    String[] PVtarde = {"programPViernesTarde1", "programPViernesTarde2", "programPViernesTarde3", "programPViernesTarde4", "programPViernesTarde5", "programPViernesTarde6", "programPViernesTarde7", "programPViernesTarde8"};
    String[] PVnoche = {"programPViernesNoche1", "programPViernesNoche2", "programPViernesNoche3", "programPViernesNoche4", "programPViernesNoche5", "programPViernesNoche6", "programPViernesNoche7", "programPViernesNoche8"};

    public FragmentViernesP(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosViernesP = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PVmañana);
        listaTurnosViernesP.setAdapter(turnoMañana);

        tMañanaVP = (Button) vista.findViewById(R.id.turnoM);
        tMañanaVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaVP.setBackgroundResource(R.drawable.privado_select);
                tMañanaVP.setTextColor(Color.WHITE);
                tTardeVP.setBackgroundResource(R.drawable.general);
                tTardeVP.setTextColor(Color.BLACK);
                tNocheVP.setBackgroundResource(R.drawable.leidos);
                tNocheVP.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PVmañana);
                listaTurnosViernesP.setAdapter(turnoMañana);
            }
        });

        tTardeVP = (Button) vista.findViewById(R.id.turnoT);
        tTardeVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaVP.setBackgroundResource(R.drawable.privado);
                tMañanaVP.setTextColor(Color.BLACK);
                tTardeVP.setBackgroundResource(R.drawable.general_select);
                tTardeVP.setTextColor(Color.WHITE);
                tNocheVP.setBackgroundResource(R.drawable.leidos);
                tNocheVP.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PVtarde);
                listaTurnosViernesP.setAdapter(turnoTarde);
            }
        });

        tNocheVP = (Button) vista.findViewById(R.id.turnoN);
        tNocheVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaVP.setBackgroundResource(R.drawable.privado);
                tMañanaVP.setTextColor(Color.BLACK);
                tTardeVP.setBackgroundResource(R.drawable.general);
                tTardeVP.setTextColor(Color.BLACK);
                tNocheVP.setBackgroundResource(R.drawable.leido_select);
                tNocheVP.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PVnoche);
                listaTurnosViernesP.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}