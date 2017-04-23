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

public class FragmentSabadoP extends Fragment {

    View vista;
    Button tMañanaSP, tTardeSP, tNocheSP;

    ListView listaTurnosSabadoP;

    String[] PSmañana = {"programPSabadoMañana1", "programPSabadoMañana2", "programPSabadoMañana3", "programPSabadoMañana4", "programPSabadoMañana5", "programPSabadoMañana6", "programPSabadoMañana7", "programPSabadoMañana8"};
    String[] PStarde = {"programPSabadoTarde1", "programPSabadoTarde2", "programPSabadoTarde3", "programPSabadoTarde4", "programPSabadoTarde5", "programPSabadoTarde6", "programPSabadoTarde7", "programPSabadoTarde8"};
    String[] PSnoche = {"programPSabadoNoche1", "programPSabadoNoche2", "programPSabadoNoche3", "programPSabadoNoche4", "programPSabadoNoche5", "programPSabadoNoche6", "programPSabadoNoche7", "programPSabadoNoche8"};

    public FragmentSabadoP(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment, container, false);

        listaTurnosSabadoP = (ListView) vista.findViewById(R.id.listaTurnoPrograma);

        ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PSmañana);
        listaTurnosSabadoP.setAdapter(turnoMañana);

        tMañanaSP = (Button) vista.findViewById(R.id.turnoM);
        tMañanaSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaSP.setBackgroundResource(R.drawable.privado_select);
                tMañanaSP.setTextColor(Color.WHITE);
                tTardeSP.setBackgroundResource(R.drawable.general);
                tTardeSP.setTextColor(Color.BLACK);
                tNocheSP.setBackgroundResource(R.drawable.leidos);
                tNocheSP.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoMañana = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PSmañana);
                listaTurnosSabadoP.setAdapter(turnoMañana);
            }
        });

        tTardeSP = (Button) vista.findViewById(R.id.turnoT);
        tTardeSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaSP.setBackgroundResource(R.drawable.privado);
                tMañanaSP.setTextColor(Color.BLACK);
                tTardeSP.setBackgroundResource(R.drawable.general_select);
                tTardeSP.setTextColor(Color.WHITE);
                tNocheSP.setBackgroundResource(R.drawable.leidos);
                tNocheSP.setTextColor(Color.BLACK);

                ArrayAdapter<String> turnoTarde = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PStarde);
                listaTurnosSabadoP.setAdapter(turnoTarde);
            }
        });

        tNocheSP = (Button) vista.findViewById(R.id.turnoN);
        tNocheSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tMañanaSP.setBackgroundResource(R.drawable.privado);
                tMañanaSP.setTextColor(Color.BLACK);
                tTardeSP.setBackgroundResource(R.drawable.general);
                tTardeSP.setTextColor(Color.BLACK);
                tNocheSP.setBackgroundResource(R.drawable.leido_select);
                tNocheSP.setTextColor(Color.WHITE);

                ArrayAdapter<String> turnoNoche = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, PSnoche);
                listaTurnosSabadoP.setAdapter(turnoNoche);
            }
        });

        return vista;
    }

}