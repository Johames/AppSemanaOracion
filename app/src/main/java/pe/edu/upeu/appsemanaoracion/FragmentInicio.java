package pe.edu.upeu.appsemanaoracion;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentInicio extends Fragment {

    View vista;

    public FragmentInicio() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_inicio, container, false);

        CardView programaHoy = (CardView) vista.findViewById(R.id.programaHoy);

        programaHoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflatePrograma = getLayoutInflater(getArguments());
                final View dialogLayoutPrograma = inflatePrograma.inflate(R.layout.programa, null);

                AlertDialog.Builder programa = new AlertDialog.Builder(getActivity());
                programa.setTitle("Programa de Hoy");
                programa.setIcon(R.drawable.ic_menu_programacion);
                programa.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                programa.setView(dialogLayoutPrograma);
                programa.show();

            }
        });

        return vista;
    }

}