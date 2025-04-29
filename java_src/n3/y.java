package n3;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p3.n0;
import s1.h;
import u2.t0;
/* loaded from: classes.dex */
public final class y implements s1.h {

    /* renamed from: l  reason: collision with root package name */
    private static final String f14267l = n0.q0(0);

    /* renamed from: m  reason: collision with root package name */
    private static final String f14268m = n0.q0(1);

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<y> f14269n = new h.a() { // from class: n3.x
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            y c10;
            c10 = y.c(bundle);
            return c10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final t0 f14270j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.common.collect.q<Integer> f14271k;

    public y(t0 t0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= t0Var.f18978j)) {
            throw new IndexOutOfBoundsException();
        }
        this.f14270j = t0Var;
        this.f14271k = com.google.common.collect.q.v(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y c(Bundle bundle) {
        return new y(t0.f18977q.a((Bundle) p3.a.e(bundle.getBundle(f14267l))), e5.e.c((int[]) p3.a.e(bundle.getIntArray(f14268m))));
    }

    public int b() {
        return this.f14270j.f18980l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f14270j.equals(yVar.f14270j) && this.f14271k.equals(yVar.f14271k);
    }

    public int hashCode() {
        return this.f14270j.hashCode() + (this.f14271k.hashCode() * 31);
    }
}
