package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class q1 extends j3 {

    /* renamed from: n  reason: collision with root package name */
    private static final String f17488n = p3.n0.q0(1);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17489o = p3.n0.q0(2);

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<q1> f17490p = new h.a() { // from class: s1.p1
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            q1 d10;
            d10 = q1.d(bundle);
            return d10;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final boolean f17491l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f17492m;

    public q1() {
        this.f17491l = false;
        this.f17492m = false;
    }

    public q1(boolean z10) {
        this.f17491l = true;
        this.f17492m = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q1 d(Bundle bundle) {
        p3.a.a(bundle.getInt(j3.f17340j, -1) == 0);
        return bundle.getBoolean(f17488n, false) ? new q1(bundle.getBoolean(f17489o, false)) : new q1();
    }

    public boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            return this.f17492m == q1Var.f17492m && this.f17491l == q1Var.f17491l;
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(Boolean.valueOf(this.f17491l), Boolean.valueOf(this.f17492m));
    }
}
