package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r6  reason: invalid package */
/* loaded from: classes.dex */
final class r6 {
    public static final int a(int i10, Object obj, Object obj2) {
        q6 q6Var = (q6) obj;
        p6 p6Var = (p6) obj2;
        if (q6Var.isEmpty()) {
            return 0;
        }
        Iterator it = q6Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean b(Object obj) {
        return !((q6) obj).g();
    }

    public static final Object c(Object obj, Object obj2) {
        q6 q6Var = (q6) obj;
        q6 q6Var2 = (q6) obj2;
        if (!q6Var2.isEmpty()) {
            if (!q6Var.g()) {
                q6Var = q6Var.c();
            }
            q6Var.f(q6Var2);
        }
        return q6Var;
    }
}
