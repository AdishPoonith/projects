package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    private static j f5883a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized j a(Context context) {
        j jVar;
        synchronized (l.class) {
            if (f5883a == null) {
                h hVar = new h(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                hVar.a(context);
                f5883a = hVar.b();
            }
            jVar = f5883a;
        }
        return jVar;
    }
}
