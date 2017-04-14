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

    private String TABLE_USER ="";

    public SQLite(Context c) {
        super(c, NAME_DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS facultad");
        this.onCreate(db);
    }

}
