package pe.edu.upeu.appsemanaoracion;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FragmentMensajes extends Fragment {

    View vista;
    ListView listaMsmPrivada, listaMsmGeneral, listaMsmLeidos;

    Button btnPriv, btnGen, btnLeid;

    String[] privados = {"MsmPriv1", "MsmPriv2", "MsmPriv3", "MsmPriv4", "MsmPriv5", "MsmPriv6", "MsmPriv7", "MsmPriv8"};
    String[] general = {"MsmGen1", "MsmGen2", "MsmGen3", "MsmGen4", "MsmGen5", "MsmGen6", "MsmGen7", "MsmGen8"};
    String[] leidos = {"MsmLeid1", "MsmLeid2", "MsmLeid3", "MsmLeid4", "MsmLeid5", "MsmLeid6", "MsmLeid7", "MsmLeid8"};

    public FragmentMensajes() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_mensajes, container, false);

        btnPriv = (Button) vista.findViewById(R.id.msmPriv);
        btnPriv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPriv.setBackgroundResource(R.drawable.privado_select);
                btnPriv.setTextColor(Color.WHITE);
                btnGen.setBackgroundResource(R.drawable.general);
                btnGen.setTextColor(Color.BLACK);
                btnLeid.setBackgroundResource(R.drawable.leidos);
                btnLeid.setTextColor(Color.BLACK);
                listaMsmPrivada.setVisibility(v.VISIBLE);
                listaMsmGeneral.setVisibility(v.INVISIBLE);
                listaMsmLeidos.setVisibility(v.INVISIBLE);
            }
        });

        btnGen = (Button) vista.findViewById(R.id.msmGen);
        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPriv.setBackgroundResource(R.drawable.privado);
                btnPriv.setTextColor(Color.BLACK);
                btnGen.setBackgroundResource(R.drawable.general_select);
                btnGen.setTextColor(Color.WHITE);
                btnLeid.setBackgroundResource(R.drawable.leidos);
                btnLeid.setTextColor(Color.BLACK);
                listaMsmPrivada.setVisibility(v.INVISIBLE);
                listaMsmGeneral.setVisibility(v.VISIBLE);
                listaMsmLeidos.setVisibility(v.INVISIBLE);
            }
        });

        btnLeid = (Button) vista.findViewById(R.id.msmLeid);
        btnLeid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPriv.setBackgroundResource(R.drawable.privado);
                btnPriv.setTextColor(Color.BLACK);
                btnGen.setBackgroundResource(R.drawable.general);
                btnGen.setTextColor(Color.BLACK);
                btnLeid.setBackgroundResource(R.drawable.leido_select);
                btnLeid.setTextColor(Color.WHITE);
                listaMsmPrivada.setVisibility(v.INVISIBLE);
                listaMsmGeneral.setVisibility(v.INVISIBLE);
                listaMsmLeidos.setVisibility(v.VISIBLE);
            }
        });

        listaMsmPrivada = (ListView) vista.findViewById(R.id.mensajesPrivados);
        ArrayAdapter<String> adaptadorlistaMsmPrivada = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, privados);
        listaMsmPrivada.setAdapter(adaptadorlistaMsmPrivada);

        listaMsmGeneral = (ListView) vista.findViewById(R.id.mensajesGenerales);
        ArrayAdapter<String> adaptadorlistaMsmGeneral = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, general);
        listaMsmGeneral.setAdapter(adaptadorlistaMsmGeneral);

        listaMsmLeidos = (ListView) vista.findViewById(R.id.mensajesLeidos);
        ArrayAdapter<String> adaptadorlistaMsmLeidos = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, leidos);
        listaMsmLeidos.setAdapter(adaptadorlistaMsmLeidos);

        return vista;
    }

}