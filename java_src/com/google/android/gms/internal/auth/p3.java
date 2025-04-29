package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: c  reason: collision with root package name */
    private static final p3 f4208c = new p3();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f4210b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final t3 f4209a = new y2();

    private p3() {
    }

    public static p3 a() {
        return f4208c;
    }

    public final s3 b(Class cls) {
        k2.f(cls, "messageType");
        s3 s3Var = (s3) this.f4210b.get(cls);
        if (s3Var == null) {
            s3Var = this.f4209a.zza(cls);
            k2.f(cls, "messageType");
            k2.f(s3Var, "schema");
            s3 s3Var2 = (s3) this.f4210b.putIfAbsent(cls, s3Var);
            if (s3Var2 != null) {
                return s3Var2;
            }
        }
        return s3Var;
    }
}
