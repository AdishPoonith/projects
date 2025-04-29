package com.google.android.play.integrity.internal;

import java.util.Objects;
/* loaded from: classes.dex */
public final class c0 implements d {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5909c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile d f5910a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5911b = f5909c;

    private c0(d dVar) {
        this.f5910a = dVar;
    }

    public static d b(d dVar) {
        Objects.requireNonNull(dVar);
        return dVar instanceof c0 ? dVar : new c0(dVar);
    }

    @Override // com.google.android.play.integrity.internal.d
    public final Object a() {
        Object obj = this.f5911b;
        Object obj2 = f5909c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f5911b;
                if (obj == obj2) {
                    obj = this.f5910a.a();
                    Object obj3 = this.f5911b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f5911b = obj;
                    this.f5910a = null;
                }
            }
        }
        return obj;
    }
}
