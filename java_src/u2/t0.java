package u2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import s1.h;
import s1.n1;
/* loaded from: classes.dex */
public final class t0 implements s1.h {

    /* renamed from: o  reason: collision with root package name */
    private static final String f18975o = p3.n0.q0(0);

    /* renamed from: p  reason: collision with root package name */
    private static final String f18976p = p3.n0.q0(1);

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<t0> f18977q = new h.a() { // from class: u2.s0
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            t0 d10;
            d10 = t0.d(bundle);
            return d10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f18978j;

    /* renamed from: k  reason: collision with root package name */
    public final String f18979k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18980l;

    /* renamed from: m  reason: collision with root package name */
    private final n1[] f18981m;

    /* renamed from: n  reason: collision with root package name */
    private int f18982n;

    public t0(String str, n1... n1VarArr) {
        p3.a.a(n1VarArr.length > 0);
        this.f18979k = str;
        this.f18981m = n1VarArr;
        this.f18978j = n1VarArr.length;
        int k10 = p3.v.k(n1VarArr[0].f17419u);
        this.f18980l = k10 == -1 ? p3.v.k(n1VarArr[0].f17418t) : k10;
        h();
    }

    public t0(n1... n1VarArr) {
        this("", n1VarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t0 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f18975o);
        return new t0(bundle.getString(f18976p, ""), (n1[]) (parcelableArrayList == null ? com.google.common.collect.q.z() : p3.c.b(n1.f17407y0, parcelableArrayList)).toArray(new n1[0]));
    }

    private static void e(String str, String str2, String str3, int i10) {
        p3.r.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int g(int i10) {
        return i10 | 16384;
    }

    private void h() {
        String f10 = f(this.f18981m[0].f17410l);
        int g10 = g(this.f18981m[0].f17412n);
        int i10 = 1;
        while (true) {
            n1[] n1VarArr = this.f18981m;
            if (i10 >= n1VarArr.length) {
                return;
            }
            if (!f10.equals(f(n1VarArr[i10].f17410l))) {
                n1[] n1VarArr2 = this.f18981m;
                e("languages", n1VarArr2[0].f17410l, n1VarArr2[i10].f17410l, i10);
                return;
            } else if (g10 != g(this.f18981m[i10].f17412n)) {
                e("role flags", Integer.toBinaryString(this.f18981m[0].f17412n), Integer.toBinaryString(this.f18981m[i10].f17412n), i10);
                return;
            } else {
                i10++;
            }
        }
    }

    public n1 b(int i10) {
        return this.f18981m[i10];
    }

    public int c(n1 n1Var) {
        int i10 = 0;
        while (true) {
            n1[] n1VarArr = this.f18981m;
            if (i10 >= n1VarArr.length) {
                return -1;
            }
            if (n1Var == n1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f18979k.equals(t0Var.f18979k) && Arrays.equals(this.f18981m, t0Var.f18981m);
    }

    public int hashCode() {
        if (this.f18982n == 0) {
            this.f18982n = ((527 + this.f18979k.hashCode()) * 31) + Arrays.hashCode(this.f18981m);
        }
        return this.f18982n;
    }
}
