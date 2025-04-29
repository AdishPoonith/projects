package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f3880a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.d f3881b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l0(b bVar, b4.d dVar, k0 k0Var) {
        this.f3880a = bVar;
        this.f3881b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof l0)) {
            l0 l0Var = (l0) obj;
            if (c4.q.b(this.f3880a, l0Var.f3880a) && c4.q.b(this.f3881b, l0Var.f3881b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c4.q.c(this.f3880a, this.f3881b);
    }

    public final String toString() {
        return c4.q.d(this).a("key", this.f3880a).a("feature", this.f3881b).toString();
    }
}
