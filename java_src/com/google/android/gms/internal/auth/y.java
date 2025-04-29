package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements v {

    /* renamed from: c  reason: collision with root package name */
    private static y f4275c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4276a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f4277b;

    private y() {
        this.f4276a = null;
        this.f4277b = null;
    }

    private y(Context context) {
        this.f4276a = context;
        x xVar = new x(this, null);
        this.f4277b = xVar;
        context.getContentResolver().registerContentObserver(l.f4154a, true, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(Context context) {
        y yVar;
        synchronized (y.class) {
            if (f4275c == null) {
                f4275c = androidx.core.content.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new y(context) : new y();
            }
            yVar = f4275c;
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        Context context;
        synchronized (y.class) {
            y yVar = f4275c;
            if (yVar != null && (context = yVar.f4276a) != null && yVar.f4277b != null) {
                context.getContentResolver().unregisterContentObserver(f4275c.f4277b);
            }
            f4275c = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.v
    /* renamed from: c */
    public final String a(final String str) {
        Context context = this.f4276a;
        if (context != null && !m.a(context)) {
            try {
                return (String) t.a(new u() { // from class: com.google.android.gms.internal.auth.w
                    @Override // com.google.android.gms.internal.auth.u
                    public final Object zza() {
                        return y.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return l.a(this.f4276a.getContentResolver(), str, null);
    }
}
