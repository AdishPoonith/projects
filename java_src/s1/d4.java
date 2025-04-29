package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s1.d4;
import s1.h;
/* loaded from: classes.dex */
public final class d4 implements h {

    /* renamed from: k  reason: collision with root package name */
    public static final d4 f17167k = new d4(com.google.common.collect.q.z());

    /* renamed from: l  reason: collision with root package name */
    private static final String f17168l = p3.n0.q0(0);

    /* renamed from: m  reason: collision with root package name */
    public static final h.a<d4> f17169m = new h.a() { // from class: s1.b4
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            d4 d10;
            d10 = d4.d(bundle);
            return d10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final com.google.common.collect.q<a> f17170j;

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: o  reason: collision with root package name */
        private static final String f17171o = p3.n0.q0(0);

        /* renamed from: p  reason: collision with root package name */
        private static final String f17172p = p3.n0.q0(1);

        /* renamed from: q  reason: collision with root package name */
        private static final String f17173q = p3.n0.q0(3);

        /* renamed from: r  reason: collision with root package name */
        private static final String f17174r = p3.n0.q0(4);

        /* renamed from: s  reason: collision with root package name */
        public static final h.a<a> f17175s = new h.a() { // from class: s1.c4
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                d4.a f10;
                f10 = d4.a.f(bundle);
                return f10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final int f17176j;

        /* renamed from: k  reason: collision with root package name */
        private final u2.t0 f17177k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f17178l;

        /* renamed from: m  reason: collision with root package name */
        private final int[] f17179m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean[] f17180n;

        public a(u2.t0 t0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = t0Var.f18978j;
            this.f17176j = i10;
            boolean z11 = false;
            p3.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f17177k = t0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f17178l = z11;
            this.f17179m = (int[]) iArr.clone();
            this.f17180n = (boolean[]) zArr.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a f(Bundle bundle) {
            u2.t0 a10 = u2.t0.f18977q.a((Bundle) p3.a.e(bundle.getBundle(f17171o)));
            return new a(a10, bundle.getBoolean(f17174r, false), (int[]) b5.h.a(bundle.getIntArray(f17172p), new int[a10.f18978j]), (boolean[]) b5.h.a(bundle.getBooleanArray(f17173q), new boolean[a10.f18978j]));
        }

        public n1 b(int i10) {
            return this.f17177k.b(i10);
        }

        public int c() {
            return this.f17177k.f18980l;
        }

        public boolean d() {
            return e5.a.b(this.f17180n, true);
        }

        public boolean e(int i10) {
            return this.f17180n[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17178l == aVar.f17178l && this.f17177k.equals(aVar.f17177k) && Arrays.equals(this.f17179m, aVar.f17179m) && Arrays.equals(this.f17180n, aVar.f17180n);
        }

        public int hashCode() {
            return (((((this.f17177k.hashCode() * 31) + (this.f17178l ? 1 : 0)) * 31) + Arrays.hashCode(this.f17179m)) * 31) + Arrays.hashCode(this.f17180n);
        }
    }

    public d4(List<a> list) {
        this.f17170j = com.google.common.collect.q.v(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d4 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f17168l);
        return new d4(parcelableArrayList == null ? com.google.common.collect.q.z() : p3.c.b(a.f17175s, parcelableArrayList));
    }

    public com.google.common.collect.q<a> b() {
        return this.f17170j;
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f17170j.size(); i11++) {
            a aVar = this.f17170j.get(i11);
            if (aVar.d() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d4.class != obj.getClass()) {
            return false;
        }
        return this.f17170j.equals(((d4) obj).f17170j);
    }

    public int hashCode() {
        return this.f17170j.hashCode();
    }
}
