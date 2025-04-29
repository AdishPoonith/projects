package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import t9.o;
import t9.p;
import t9.x;
/* loaded from: classes.dex */
public final class zzad extends SQLiteOpenHelper {
    public static final zzab zza = new zzab(null);
    private static zzad zzb;

    public /* synthetic */ zzad(Context context, g gVar) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        String z10;
        if (list.isEmpty()) {
            return 0;
        }
        z10 = x.z(list, ", ", "(", ")", 0, null, zzac.zza, 24, null);
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(z10)), null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        try {
            if (rawQuery.moveToNext()) {
                return rawQuery.getInt(0);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        } finally {
            rawQuery.close();
        }
    }

    public final List zzd() {
        List e10;
        Cursor query = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                arrayList.add(new zzae(query.getString(query.getColumnIndexOrThrow("ss")), query.getLong(query.getColumnIndexOrThrow("ts")), query.getInt(query.getColumnIndexOrThrow("id"))));
            } catch (Exception unused) {
                e10 = p.e();
                return e10;
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzae zzaeVar) {
        List b10;
        b10 = o.b(zzaeVar);
        return zza(b10) == 1;
    }
}
