package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes.dex */
final class v0 implements Serializable, u0 {

    /* renamed from: j  reason: collision with root package name */
    final u0 f4257j;

    /* renamed from: k  reason: collision with root package name */
    volatile transient boolean f4258k;

    /* renamed from: l  reason: collision with root package name */
    transient Object f4259l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(u0 u0Var) {
        Objects.requireNonNull(u0Var);
        this.f4257j = u0Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f4258k) {
            obj = "<supplier that returned " + this.f4259l + ">";
        } else {
            obj = this.f4257j;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.u0
    public final Object zza() {
        if (!this.f4258k) {
            synchronized (this) {
                if (!this.f4258k) {
                    Object zza = this.f4257j.zza();
                    this.f4259l = zza;
                    this.f4258k = true;
                    return zza;
                }
            }
        }
        return this.f4259l;
    }
}
