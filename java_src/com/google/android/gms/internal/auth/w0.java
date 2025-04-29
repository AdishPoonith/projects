package com.google.android.gms.internal.auth;

import java.util.Objects;
/* loaded from: classes.dex */
final class w0 implements u0 {

    /* renamed from: j  reason: collision with root package name */
    volatile u0 f4268j;

    /* renamed from: k  reason: collision with root package name */
    volatile boolean f4269k;

    /* renamed from: l  reason: collision with root package name */
    Object f4270l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(u0 u0Var) {
        Objects.requireNonNull(u0Var);
        this.f4268j = u0Var;
    }

    public final String toString() {
        Object obj = this.f4268j;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f4270l + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.u0
    public final Object zza() {
        if (!this.f4269k) {
            synchronized (this) {
                if (!this.f4269k) {
                    u0 u0Var = this.f4268j;
                    u0Var.getClass();
                    Object zza = u0Var.zza();
                    this.f4270l = zza;
                    this.f4269k = true;
                    this.f4268j = null;
                    return zza;
                }
            }
        }
        return this.f4270l;
    }
}
