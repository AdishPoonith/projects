package u2;

import android.os.Bundle;
import java.util.ArrayList;
import s1.h;
/* loaded from: classes.dex */
public final class v0 implements s1.h {

    /* renamed from: m  reason: collision with root package name */
    public static final v0 f18988m = new v0(new t0[0]);

    /* renamed from: n  reason: collision with root package name */
    private static final String f18989n = p3.n0.q0(0);

    /* renamed from: o  reason: collision with root package name */
    public static final h.a<v0> f18990o = new h.a() { // from class: u2.u0
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            v0 d10;
            d10 = v0.d(bundle);
            return d10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f18991j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.common.collect.q<t0> f18992k;

    /* renamed from: l  reason: collision with root package name */
    private int f18993l;

    public v0(t0... t0VarArr) {
        this.f18992k = com.google.common.collect.q.w(t0VarArr);
        this.f18991j = t0VarArr.length;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v0 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f18989n);
        return parcelableArrayList == null ? new v0(new t0[0]) : new v0((t0[]) p3.c.b(t0.f18977q, parcelableArrayList).toArray(new t0[0]));
    }

    private void e() {
        int i10 = 0;
        while (i10 < this.f18992k.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f18992k.size(); i12++) {
                if (this.f18992k.get(i10).equals(this.f18992k.get(i12))) {
                    p3.r.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public t0 b(int i10) {
        return this.f18992k.get(i10);
    }

    public int c(t0 t0Var) {
        int indexOf = this.f18992k.indexOf(t0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f18991j == v0Var.f18991j && this.f18992k.equals(v0Var.f18992k);
    }

    public int hashCode() {
        if (this.f18993l == 0) {
            this.f18993l = this.f18992k.hashCode();
        }
        return this.f18993l;
    }
}
