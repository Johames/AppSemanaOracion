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

public class FragmentJueves extends Fragment {

    View vista;
    Button tMañanaJ, tTardeJ, tNocheJ;

    ListView listaTurnosJueves;

    String[] Jmañana = {"programJuevesMañana1", "programJuevesMañana2", "programJuevesMañana3", "programJuevesMañana4", "programJuevesMañana5", "programJuevesMañana6", "programJuevesMañana7", "programJuevesMañana8"};
    String[] Jtarde = {"programJuevesTarde1", "programJuevesTarde2", "programJuevesTarde3", "programJuevesTarde4", "programJuevesTarde5", "programJuevesTarde6", "programJuevesTarde7", "programJuevesTarde8"};
    String[] Jnoche = {"programJuevesNoche1", "programJuevesNoche2", "programJuevesNoche3", "programJuevesNoche4", "programJuevesNoche5", "programJuevesNoche6", "programJuevesNoche7", "programJuevesNoche8"};

    public FragmentJueves(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosJueves = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Jmañana);
        listaTurnosJueves.setAdapter(turnoMañana);

        tMañanaJ = (Button) vista.findViewById(R.id.turnoM);
        tMañanaJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaJ.setBackgroundResource(R.drawable.privado_select);
                tMañanaJ.setTextColor(Color.WHITE);
                tTardeJ.setBackgroundResource(R.drawable.general);
                tTardeJ.setTextColor(Color.BLACK);
                tNocheJ.setBackgroundResource(R.drawable.leidos);
                tNocheJ.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Jmañana);
                listaTurnosJueves.setAdapter(turnoMañana);
            }
        });

        tTardeJ = (Button) vista.findViewById(R.id.turnoT);
        tTardeJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaJ.setBackgroundResource(R.drawable.privado);
                tMañanaJ.setTextColor(Color.BLACK);
                tTardeJ.setBackgroundResource(R.drawable.general_select);
                tTardeJ.setTextColor(Color.WHITE);
                tNocheJ.setBackgroundResource(R.drawable.leidos);
                tNocheJ.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Jtarde);
                listaTurnosJueves.setAdapter(turnoTarde);
            }
        });

        tNocheJ = (Button) vista.findViewById(R.id.turnoN);
        tNocheJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaJ.setBackgroundResource(R.drawable.privado);
                tMañanaJ.setTextColor(Color.BLACK);
                tTardeJ.setBackgroundResource(R.drawable.general);
                tTardeJ.setTextColor(Color.BLACK);
                tNocheJ.setBackgroundResource(R.drawable.leido_select);
                tNocheJ.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Jnoche);
                listaTurnosJueves.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}