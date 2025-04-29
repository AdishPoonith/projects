package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e7  reason: invalid package */
/* loaded from: classes.dex */
public final class e7 {

    /* renamed from: c  reason: collision with root package name */
    private static final e7 f4531c = new e7();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f4533b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final k7 f4532a = new o6();

    private e7() {
    }

    public static e7 a() {
        return f4531c;
    }

    public final j7 b(Class cls) {
        x5.c(cls, "messageType");
        j7 j7Var = (j7) this.f4533b.get(cls);
        if (j7Var == null) {
            j7Var = this.f4532a.zza(cls);
            x5.c(cls, "messageType");
            x5.c(j7Var, "schema");
            j7 j7Var2 = (j7) this.f4533b.putIfAbsent(cls, j7Var);
            if (j7Var2 != null) {
                return j7Var2;
            }
        }
        return j7Var;
    }
}
