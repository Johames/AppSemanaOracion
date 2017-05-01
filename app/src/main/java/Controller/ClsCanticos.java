package Controller;

import android.content.Context;
import android.database.Cursor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Config.SQLite;

/**
 * Created by USUARIO on 29/04/2017.
 */

public class ClsCanticos {

    SQLite cx;

    public ClsCanticos(Context context) {
        cx = new SQLite(context);
    }

    public void insert_facultad(JSONArray jsonArray) {
        try {
            cx.getWritableDatabase().execSQL("DELETE FROM canticos");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jo = jsonArray.getJSONObject(i);
                cx.getWritableDatabase().execSQL("INSERT INTO canticos(numero, titulo, letra) " +
                        " VALUES ('"+ jo.getString("nro_cantico") + "','"+ jo.getString("titulo") + "','"+ jo.getString("letra") + "' )");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Cursor readCanticos(){
        return cx.getReadableDatabase().rawQuery("SELECT id_cantico, numero, titulo, letra FROM canticos",null);
    }

}
