package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class w3 extends j3 {

    /* renamed from: n  reason: collision with root package name */
    private static final String f17717n = p3.n0.q0(1);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17718o = p3.n0.q0(2);

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<w3> f17719p = new h.a() { // from class: s1.v3
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            w3 d10;
            d10 = w3.d(bundle);
            return d10;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final boolean f17720l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f17721m;

    public w3() {
        this.f17720l = false;
        this.f17721m = false;
    }

    public w3(boolean z10) {
        this.f17720l = true;
        this.f17721m = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w3 d(Bundle bundle) {
        p3.a.a(bundle.getInt(j3.f17340j, -1) == 3);
        return bundle.getBoolean(f17717n, false) ? new w3(bundle.getBoolean(f17718o, false)) : new w3();
    }

    public boolean equals(Object obj) {
        if (obj instanceof w3) {
            w3 w3Var = (w3) obj;
            return this.f17721m == w3Var.f17721m && this.f17720l == w3Var.f17720l;
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(Boolean.valueOf(this.f17720l), Boolean.valueOf(this.f17721m));
    }
}
