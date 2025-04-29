package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes.dex */
final class x0 implements Serializable, u0 {

    /* renamed from: j  reason: collision with root package name */
    final Object f4273j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(Object obj) {
        this.f4273j = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            Object obj2 = this.f4273j;
            Object obj3 = ((x0) obj).f4273j;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4273j});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f4273j + ")";
    }

    @Override // com.google.android.gms.internal.auth.u0
    public final Object zza() {
        return this.f4273j;
    }
}
