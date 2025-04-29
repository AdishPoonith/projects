package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 implements v {

    /* renamed from: b  reason: collision with root package name */
    private static final Map f4203b = new s.a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4204a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 b(Context context, String str, Runnable runnable) {
        o0 o0Var;
        if (m.b()) {
            throw null;
        }
        synchronized (o0.class) {
            o0Var = (o0) f4203b.get(null);
            if (o0Var == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        synchronized (o0.class) {
            Map map = f4203b;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((o0) it.next()).f4204a;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.v
    public final Object a(String str) {
        throw null;
    }
}
