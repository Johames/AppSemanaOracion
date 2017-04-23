package pe.edu.upeu.appsemanaoracion;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class FragmentInicio extends Fragment {

    View vista;
    CardView programaHoy;
    Button bienv, biograf;
    TextView contenid, nomb, dat;
    CircleImageView IMG;
    ScrollView scrooll;

    public FragmentInicio() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_inicio, container, false);

        contenid = (TextView) vista.findViewById(R.id.contenido);
        nomb = (TextView) vista.findViewById(R.id.Nomb);
        dat = (TextView) vista.findViewById(R.id.Datos);
        IMG = (CircleImageView) vista.findViewById(R.id.IMG);
        scrooll = (ScrollView) vista.findViewById(R.id.scrool);

        IMG.setImageResource(R.drawable.foto);

        programaHoy = (CardView) vista.findViewById(R.id.programaHoy);
        programaHoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                DialogPrograma programaDialogFragment = new DialogPrograma();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.add(android.R.id.content, programaDialogFragment).addToBackStack(null).commit();

            }
        });

        bienv = (Button) vista.findViewById(R.id.bienvenida);
        bienv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bienv.setBackgroundResource(R.drawable.privado_select);
                bienv.setTextColor(Color.WHITE);
                biograf.setBackgroundResource(R.drawable.leidos);
                biograf.setTextColor(Color.BLACK);

                nomb.setText("Nombre del Director");
                dat.setText("Otros Datos del Director");
                IMG.setImageResource(R.drawable.foto);
                scrooll.scrollTo(0, 0);
            }
        });

        biograf = (Button) vista.findViewById(R.id.biografia);
        biograf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bienv.setBackgroundResource(R.drawable.privado);
                bienv.setTextColor(Color.BLACK);
                biograf.setBackgroundResource(R.drawable.leido_select);
                biograf.setTextColor(Color.WHITE);

                nomb.setText("Nombre del Ponente");
                dat.setText("Otros Datos del Ponente");
                IMG.setImageResource(R.drawable.imgfondo);
                scrooll.scrollTo(0, 0);
            }
        });

        return vista;
    }

}