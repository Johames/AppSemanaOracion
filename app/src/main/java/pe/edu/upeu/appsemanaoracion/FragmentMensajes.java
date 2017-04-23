package pe.edu.upeu.appsemanaoracion;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        listaMsmPrivada = (ListView) vista.findViewById(R.id.listaMensajes);

        ArrayAdapter<String> adaptadorlistaMsmPrivada = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, privados);
        listaMsmPrivada.setAdapter(adaptadorlistaMsmPrivada);
        listaMsmPrivada.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                DialogMensajes mensajesDialogFragment = new DialogMensajes();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.add(android.R.id.content, mensajesDialogFragment).addToBackStack(null).commit();
            }
        });

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

                ArrayAdapter<String> adaptadorlistaMsmPrivada = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, privados);
                listaMsmPrivada.setAdapter(adaptadorlistaMsmPrivada);
                listaMsmPrivada.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        DialogMensajes mensajesDialogFragment = new DialogMensajes();

                        FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        transaction.add(android.R.id.content, mensajesDialogFragment).addToBackStack(null).commit();
                    }
                });
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

                ArrayAdapter<String> adaptadorlistaMsmGeneral = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, general);
                listaMsmPrivada.setAdapter(adaptadorlistaMsmGeneral);
                listaMsmPrivada.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        DialogMensajes mensajesDialogFragment = new DialogMensajes();

                        FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        transaction.add(android.R.id.content, mensajesDialogFragment).addToBackStack(null).commit();
                    }
                });
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

                ArrayAdapter<String> adaptadorlistaMsmLeidos = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, leidos);
                listaMsmPrivada.setAdapter(adaptadorlistaMsmLeidos);
                listaMsmPrivada.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        DialogMensajes mensajesDialogFragment = new DialogMensajes();

                        FragmentTransaction transaction = fragmentManager.beginTransaction();
                        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        transaction.add(android.R.id.content, mensajesDialogFragment).addToBackStack(null).commit();
                    }
                });
            }
        });

        return vista;
    }

}