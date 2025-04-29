package n5;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import g5.p;
import java.io.IOException;
import t5.c0;
import t5.t;
import u5.k;
/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences.Editor f14304a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14305b;

    public e(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f14305b = str;
        Context applicationContext = context.getApplicationContext();
        this.f14304a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // g5.p
    public void a(c0 c0Var) {
        if (!this.f14304a.putString(this.f14305b, k.b(c0Var.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // g5.p
    public void b(t tVar) {
        if (!this.f14304a.putString(this.f14305b, k.b(tVar.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
