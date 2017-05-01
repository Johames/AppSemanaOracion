package pe.edu.upeu.appsemanaoracion;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import Controller.ClsCanticos;
import RestClient.VolleyS;

public class FragmentCanticos extends Fragment {

    View vista;
    ListView listaCanticos;
    private VolleyS volley;
    ClsCanticos cant;
    protected RequestQueue fRequestQueue;

    String[] cantos = {"Canto1", "Canto2", "Canto3", "Canto4", "Canto5", "Canto6", "Canto7", "Canto8", "Canto9", "Canto10", "Canto11", "Canto12", "Canto13", "Canto14", "Canto15", "Canto16"};

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

        //volley = VolleyS.getInstance(getContext());
        //fRequestQueue = volley.getRequestQueue();

        return vista;
    }

    /* public void syncCanticos(View v){
        cargarCanticos();
        String[] columnas = new String[]{"numero","titulo", "letra"};
        int[] id_views = new int[]{android.R.id.text1,android.R.id.text2};
        Cursor cursorf = cant.readCanticos();
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getContext(), android.R.layout.simple_list_item_2, cursorf, columnas, id_views);
        listaCanticos.setAdapter(adapter);
    }

    public void cargarCanticos(){
        String url = "http://192.168.244.2/api%20rest/modulos/rest/rest1.php";
        JsonObjectRequest request = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                List<Facultad> MyList = new ArrayList<>();
                try {
                    JSONArray jsonArray = jsonObject.getJSONArray("facultad");
                    cf.insert_facultad(jsonArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                onConnectionFinished();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                onConnectionFailed(volleyError.toString());
            }
        });
        addToQueue(request);
    }

    public void addToQueue(Request request) {
        if (request != null) {
            request.setTag(this);
            if (fRequestQueue == null)
                fRequestQueue = volley.getRequestQueue();
            request.setRetryPolicy(new DefaultRetryPolicy(
                    60000, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
            ));
            onPreStartConnection();
            fRequestQueue.add(request);
        }
    }
    @Override
    public void onStop() {
        super.onStop();
        if (fRequestQueue != null) {
            fRequestQueue.cancelAll(this);
        }
    }
    public void  onPreStartConnection() {
        setProgressBarIndeterminateVisibility(true);
    }

    public void onConnectionFailed(String error) {
        setProgressBarIndeterminateVisibility(true);
        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
    }

    public void onConnectionFinished() {
        setProgressBarIndeterminateVisibility(true);
    } */


}