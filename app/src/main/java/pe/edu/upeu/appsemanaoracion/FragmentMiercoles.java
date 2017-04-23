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

public class FragmentMiercoles extends Fragment {

    View vista;
    Button tMañanaM, tTardeM, tNocheM;

    ListView listaTurnosMiercoles;

    String[] Mmañana = {"programMiercolesMañana1", "programMiercolesMañana2", "programMiercolesMañana3", "programMiercolesMañana4", "programMiercolesMañana5", "programMiercolesMañana6", "programMiercolesMañana7", "programMiercolesMañana8"};
    String[] Mtarde = {"programMiercolesTarde1", "programMiercolesTarde2", "programMiercolesTarde3", "programMiercolesTarde4", "programMiercolesTarde5", "programMiercolesTarde6", "programMiercolesTarde7", "programMiercolesTarde8"};
    String[] Mnoche = {"programMiercolesNoche1", "programMiercolesNoche2", "programMiercolesNoche3", "programMiercolesNoche4", "programMiercolesNoche5", "programMiercolesNoche6", "programMiercolesNoche7", "programMiercolesNoche8"};

    public FragmentMiercoles(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosMiercoles = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mmañana);
        listaTurnosMiercoles.setAdapter(turnoMañana);

        tMañanaM = (Button) vista.findViewById(R.id.turnoM);
        tMañanaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaM.setBackgroundResource(R.drawable.privado_select);
                tMañanaM.setTextColor(Color.WHITE);
                tTardeM.setBackgroundResource(R.drawable.general);
                tTardeM.setTextColor(Color.BLACK);
                tNocheM.setBackgroundResource(R.drawable.leidos);
                tNocheM.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mmañana);
                listaTurnosMiercoles.setAdapter(turnoMañana);
            }
        });

        tTardeM = (Button) vista.findViewById(R.id.turnoT);
        tTardeM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaM.setBackgroundResource(R.drawable.privado);
                tMañanaM.setTextColor(Color.BLACK);
                tTardeM.setBackgroundResource(R.drawable.general_select);
                tTardeM.setTextColor(Color.WHITE);
                tNocheM.setBackgroundResource(R.drawable.leidos);
                tNocheM.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mtarde);
                listaTurnosMiercoles.setAdapter(turnoTarde);
            }
        });

        tNocheM = (Button) vista.findViewById(R.id.turnoN);
        tNocheM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaM.setBackgroundResource(R.drawable.privado);
                tMañanaM.setTextColor(Color.BLACK);
                tTardeM.setBackgroundResource(R.drawable.general);
                tTardeM.setTextColor(Color.BLACK);
                tNocheM.setBackgroundResource(R.drawable.leido_select);
                tNocheM.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Mnoche);
                listaTurnosMiercoles.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}