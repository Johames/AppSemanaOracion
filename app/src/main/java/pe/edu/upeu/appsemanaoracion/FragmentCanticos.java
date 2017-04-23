package pe.edu.upeu.appsemanaoracion;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentCanticos extends Fragment {

    View vista;
    ListView listaCanticos;

    String[] cantos = {"Canto1", "Canto2", "Canto3", "Canto4", "Canto5", "Canto6", "Canto7", "Canto8"};

    public FragmentCanticos() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_canticos, container, false);

        listaCanticos = (ListView) vista.findViewById(R.id.listaCantos);
        ArrayAdapter<String> adaptadorCantos = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, cantos);
        listaCanticos.setAdapter(adaptadorCantos);
        listaCanticos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                DialogCanticos canticosDialogFragment = new DialogCanticos();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.add(android.R.id.content, canticosDialogFragment).addToBackStack(null).commit();
            }
        });

        return vista;
    }

}