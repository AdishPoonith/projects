package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: c  reason: collision with root package name */
    private static final i1 f7160c = new i1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, n1<?>> f7162b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final o1 f7161a = new n0();

    private i1() {
    }

    public static i1 a() {
        return f7160c;
    }

    public n1<?> b(Class<?> cls, n1<?> n1Var) {
        d0.b(cls, "messageType");
        d0.b(n1Var, "schema");
        return this.f7162b.putIfAbsent(cls, n1Var);
    }

    public <T> n1<T> c(Class<T> cls) {
        d0.b(cls, "messageType");
        n1<T> n1Var = (n1<T>) this.f7162b.get(cls);
        if (n1Var == null) {
            n1<T> a10 = this.f7161a.a(cls);
            n1<T> n1Var2 = (n1<T>) b(cls, a10);
            return n1Var2 != null ? n1Var2 : a10;
        }
        return n1Var;
    }

    public <T> n1<T> d(T t10) {
        return c(t10.getClass());
    }
}
