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

public class FragmentSabado extends Fragment{

    View vista;
    Button tMañanaS, tTardeS, tNocheS;

    ListView listaTurnosSabado;

    String[] Smañana = {"programSabadoMañana1", "programSabadoMañana2", "programSabadoMañana3", "programSabadoMañana4", "programSabadoMañana5", "programSabadoMañana6", "programSabadoMañana7", "programSabadoMañana8"};
    String[] Starde = {"programSabadoTarde1", "programSabadoTarde2", "programSabadoTarde3", "programSabadoTarde4", "programSabadoTarde5", "programSabadoTarde6", "programSabadoTarde7", "programSabadoTarde8"};
    String[] Snoche = {"programSabadoNoche1", "programSabadoNoche2", "programSabadoNoche3", "programSabadoNoche4", "programSabadoNoche5", "programSabadoNoche6", "programSabadoNoche7", "programSabadoNoche8"};

    public FragmentSabado(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosSabado = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Smañana);
        listaTurnosSabado.setAdapter(turnoMañana);

        tMañanaS = (Button) vista.findViewById(R.id.turnoM);
        tMañanaS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaS.setBackgroundResource(R.drawable.privado_select);
                tMañanaS.setTextColor(Color.WHITE);
                tTardeS.setBackgroundResource(R.drawable.general);
                tTardeS.setTextColor(Color.BLACK);
                tNocheS.setBackgroundResource(R.drawable.leidos);
                tNocheS.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Smañana);
                listaTurnosSabado.setAdapter(turnoMañana);
            }
        });

        tTardeS = (Button) vista.findViewById(R.id.turnoT);
        tTardeS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaS.setBackgroundResource(R.drawable.privado);
                tMañanaS.setTextColor(Color.BLACK);
                tTardeS.setBackgroundResource(R.drawable.general_select);
                tTardeS.setTextColor(Color.WHITE);
                tNocheS.setBackgroundResource(R.drawable.leidos);
                tNocheS.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Starde);
                listaTurnosSabado.setAdapter(turnoTarde);
            }
        });

        tNocheS = (Button) vista.findViewById(R.id.turnoN);
        tNocheS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaS.setBackgroundResource(R.drawable.privado);
                tMañanaS.setTextColor(Color.BLACK);
                tTardeS.setBackgroundResource(R.drawable.general);
                tTardeS.setTextColor(Color.BLACK);
                tNocheS.setBackgroundResource(R.drawable.leido_select);
                tNocheS.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Snoche);
                listaTurnosSabado.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}
