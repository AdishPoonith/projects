package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class o implements h {

    /* renamed from: m  reason: collision with root package name */
    public static final o f17454m = new o(0, 0, 0);

    /* renamed from: n  reason: collision with root package name */
    private static final String f17455n = p3.n0.q0(0);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17456o = p3.n0.q0(1);

    /* renamed from: p  reason: collision with root package name */
    private static final String f17457p = p3.n0.q0(2);

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<o> f17458q = new h.a() { // from class: s1.n
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            o b10;
            b10 = o.b(bundle);
            return b10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f17459j;

    /* renamed from: k  reason: collision with root package name */
    public final int f17460k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17461l;

    public o(int i10, int i11, int i12) {
        this.f17459j = i10;
        this.f17460k = i11;
        this.f17461l = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o b(Bundle bundle) {
        return new o(bundle.getInt(f17455n, 0), bundle.getInt(f17456o, 0), bundle.getInt(f17457p, 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f17459j == oVar.f17459j && this.f17460k == oVar.f17460k && this.f17461l == oVar.f17461l;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f17459j) * 31) + this.f17460k) * 31) + this.f17461l;
    }
}
