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

public class ClsBienvenida {

    SQLite cx;

    public ClsBienvenida(Context context) {
        cx = new SQLite(context);
    }

    public void insert_facultad(JSONArray jsonArray) {
        try {
            cx.getWritableDatabase().execSQL("DELETE FROM bienvenida");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jo = jsonArray.getJSONObject(i);
                cx.getWritableDatabase().execSQL("INSERT INTO bienvenida(bienvenida, director, datos, img) " +
                        " VALUES ('"+ jo.getString("facultad") + "','"+ jo.getString("abv") + "' )");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Cursor readBienvenida(){
        return cx.getReadableDatabase().rawQuery("SELECT id_bienvenida, bienvenida, director, datos, img FROM bienvenida",null);
    }

}
