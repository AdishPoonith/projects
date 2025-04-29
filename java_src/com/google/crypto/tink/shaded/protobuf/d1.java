package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c  reason: collision with root package name */
    private static final d1 f6154c = new d1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, h1<?>> f6156b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final i1 f6155a = new k0();

    private d1() {
    }

    public static d1 a() {
        return f6154c;
    }

    public <T> void b(T t10, g1 g1Var, q qVar) {
        e(t10).j(t10, g1Var, qVar);
    }

    public h1<?> c(Class<?> cls, h1<?> h1Var) {
        b0.b(cls, "messageType");
        b0.b(h1Var, "schema");
        return this.f6156b.putIfAbsent(cls, h1Var);
    }

    public <T> h1<T> d(Class<T> cls) {
        b0.b(cls, "messageType");
        h1<T> h1Var = (h1<T>) this.f6156b.get(cls);
        if (h1Var == null) {
            h1<T> a10 = this.f6155a.a(cls);
            h1<T> h1Var2 = (h1<T>) c(cls, a10);
            return h1Var2 != null ? h1Var2 : a10;
        }
        return h1Var;
    }

    public <T> h1<T> e(T t10) {
        return d(t10.getClass());
    }
}
