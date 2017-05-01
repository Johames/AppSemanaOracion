package Config;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USUARIO on 13/04/2017.
 */

public class SQLite extends SQLiteOpenHelper{

    private static String NAME_DATABASE = "dbsemanaoracion";
    private static int VERSION=1;

    private String table_bienvenida = "CREATE TABLE bienvenida(id_bienvenida INTEGER PRIMARY KEY AUTOINCREMENT, bienvenida TEXT, director TEXT, datos TEXT, img TEXT) ";
    private String table_biografia = "CREATE TABLE biografia(id_biografia INTEGER PRIMARY KEY AUTOINCREMENT, biografia TEXT, ponente TEXT, datos TEXT, img TEXT, id_semana INTEGER) ";
    private String table_programacion = "CREATE TABLE programacion(id_programacion INTEGER PRIMARY KEY AUTOINCREMENT) ";
    private String table_canticos = "CREATE TABLE canticos(id_canticos INTEGER PRIMARY KEY AUTOINCREMENT, id INTEGER, numero INTEGER, titulo TEXT, letra TEXT) ";
    private String table_mensajes = "CREATE TABLE mensajes(id_mensajes INTEGER PRIMARY KEY AUTOINCREMENT, id INTEGER, mensaje TEXT, n_remitente TEXT, t_remitente TEXT, receptor TEXT, estado INTEGER) ";
    private String table_usuario = "CREATE TABLE usuario(id_usuario INTEGER PRIMARY KEY AUTOINCREMENT, id_user INTEGER, id_per INTEGER, usuario TEXT, password TEXT, estado TEXT) ";
    private String table_contactos = "CREATE TABLE contactos(id_contactos INTEGER PRIMARY KEY AUTOINCREMENT, id INTEGER, nombre TEXT, telefono INTEGER, datos TEXT, img TEXT) ";

    public SQLite(Context c) {
        super(c, NAME_DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(table_bienvenida);
        db.execSQL(table_biografia);
        db.execSQL(table_programacion);
        db.execSQL(table_canticos);
        db.execSQL(table_mensajes);
        db.execSQL(table_usuario);
        db.execSQL(table_contactos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS bienvenida");
        db.execSQL("DROP TABLE IF EXISTS biografia");
        db.execSQL("DROP TABLE IF EXISTS programacion");
        db.execSQL("DROP TABLE IF EXISTS canticos");
        db.execSQL("DROP TABLE IF EXISTS mensajes");
        db.execSQL("DROP TABLE IF EXISTS usuario");
        db.execSQL("DROP TABLE IF EXISTS contactos");

        this.onCreate(db);
    }

}
