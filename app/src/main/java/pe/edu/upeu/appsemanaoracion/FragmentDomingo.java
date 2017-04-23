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

public class FragmentDomingo extends Fragment {

    View vista;
    Button tMañanaD, tTardeD, tNocheD;

    ListView listaTurnosDomingo;

    String[] Dmañana = {"programDomingoMañana1", "programDomingoMañana2", "programDomingoMañana3", "programDomingoMañana4", "programDomingoMañana5", "programDomingoMañana6", "programDomingoMañana7", "programDomingoMañana8"};
    String[] Dtarde = {"programDomingoTarde1", "programDomingoTarde2", "programDomingoTarde3", "programDomingoTarde4", "programDomingoTarde5", "programDomingoTarde6", "programDomingoTarde7", "programDomingoTarde8"};
    String[] Dnoche = {"programDomingoNoche1", "programDomingoNoche2", "programDomingoNoche3", "programDomingoNoche4", "programDomingoNoche5", "programDomingoNoche6", "programDomingoNoche7", "programDomingoNoche8"};

    public FragmentDomingo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosDomingo = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Dmañana);
        listaTurnosDomingo.setAdapter(turnoMañana);

        tMañanaD = (Button) vista.findViewById(R.id.turnoM);
        tMañanaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaD.setBackgroundResource(R.drawable.privado_select);
                tMañanaD.setTextColor(Color.WHITE);
                tTardeD.setBackgroundResource(R.drawable.general);
                tTardeD.setTextColor(Color.BLACK);
                tNocheD.setBackgroundResource(R.drawable.leidos);
                tNocheD.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Dmañana);
                listaTurnosDomingo.setAdapter(turnoMañana);
            }
        });

        tTardeD = (Button) vista.findViewById(R.id.turnoT);
        tTardeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaD.setBackgroundResource(R.drawable.privado);
                tMañanaD.setTextColor(Color.BLACK);
                tTardeD.setBackgroundResource(R.drawable.general_select);
                tTardeD.setTextColor(Color.WHITE);
                tNocheD.setBackgroundResource(R.drawable.leidos);
                tNocheD.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Dtarde);
                listaTurnosDomingo.setAdapter(turnoTarde);
            }
        });

        tNocheD = (Button) vista.findViewById(R.id.turnoN);
        tNocheD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaD.setBackgroundResource(R.drawable.privado);
                tMañanaD.setTextColor(Color.BLACK);
                tTardeD.setBackgroundResource(R.drawable.general);
                tTardeD.setTextColor(Color.BLACK);
                tNocheD.setBackgroundResource(R.drawable.leido_select);
                tNocheD.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Dnoche);
                listaTurnosDomingo.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}