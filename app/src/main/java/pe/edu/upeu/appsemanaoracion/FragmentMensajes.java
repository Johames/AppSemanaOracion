package pe.edu.upeu.appsemanaoracion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMensajes extends Fragment {

    View vista;

    public FragmentMensajes() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_mensajes, container, false);



        return vista;
    }

}