package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
/* loaded from: classes.dex */
public final class b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3790a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.common.api.a f3791b;

    /* renamed from: c  reason: collision with root package name */
    private final a.d f3792c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3793d;

    private b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f3791b = aVar;
        this.f3792c = dVar;
        this.f3793d = str;
        this.f3790a = c4.q.c(aVar, dVar, str);
    }

    public static <O extends a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f3791b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return c4.q.b(this.f3791b, bVar.f3791b) && c4.q.b(this.f3792c, bVar.f3792c) && c4.q.b(this.f3793d, bVar.f3793d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3790a;
    }
}
