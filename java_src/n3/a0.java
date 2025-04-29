package n3;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p3.n0;
import s1.h;
import u2.t0;
/* loaded from: classes.dex */
public class a0 implements s1.h {
    public static final a0 J;
    @Deprecated
    public static final a0 K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final String f14088a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final String f14089b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final String f14090c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final String f14091d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final String f14092e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final String f14093f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final String f14094g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final String f14095h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final String f14096i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final String f14097j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final String f14098k0;
    @Deprecated

    /* renamed from: l0  reason: collision with root package name */
    public static final h.a<a0> f14099l0;
    public final com.google.common.collect.q<String> A;
    public final com.google.common.collect.q<String> B;
    public final int C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final com.google.common.collect.r<t0, y> H;
    public final com.google.common.collect.s<Integer> I;

    /* renamed from: j  reason: collision with root package name */
    public final int f14100j;

    /* renamed from: k  reason: collision with root package name */
    public final int f14101k;

    /* renamed from: l  reason: collision with root package name */
    public final int f14102l;

    /* renamed from: m  reason: collision with root package name */
    public final int f14103m;

    /* renamed from: n  reason: collision with root package name */
    public final int f14104n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14105o;

    /* renamed from: p  reason: collision with root package name */
    public final int f14106p;

    /* renamed from: q  reason: collision with root package name */
    public final int f14107q;

    /* renamed from: r  reason: collision with root package name */
    public final int f14108r;

    /* renamed from: s  reason: collision with root package name */
    public final int f14109s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f14110t;

    /* renamed from: u  reason: collision with root package name */
    public final com.google.common.collect.q<String> f14111u;

    /* renamed from: v  reason: collision with root package name */
    public final int f14112v;

    /* renamed from: w  reason: collision with root package name */
    public final com.google.common.collect.q<String> f14113w;

    /* renamed from: x  reason: collision with root package name */
    public final int f14114x;

    /* renamed from: y  reason: collision with root package name */
    public final int f14115y;

    /* renamed from: z  reason: collision with root package name */
    public final int f14116z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f14117a;

        /* renamed from: b  reason: collision with root package name */
        private int f14118b;

        /* renamed from: c  reason: collision with root package name */
        private int f14119c;

        /* renamed from: d  reason: collision with root package name */
        private int f14120d;

        /* renamed from: e  reason: collision with root package name */
        private int f14121e;

        /* renamed from: f  reason: collision with root package name */
        private int f14122f;

        /* renamed from: g  reason: collision with root package name */
        private int f14123g;

        /* renamed from: h  reason: collision with root package name */
        private int f14124h;

        /* renamed from: i  reason: collision with root package name */
        private int f14125i;

        /* renamed from: j  reason: collision with root package name */
        private int f14126j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f14127k;

        /* renamed from: l  reason: collision with root package name */
        private com.google.common.collect.q<String> f14128l;

        /* renamed from: m  reason: collision with root package name */
        private int f14129m;

        /* renamed from: n  reason: collision with root package name */
        private com.google.common.collect.q<String> f14130n;

        /* renamed from: o  reason: collision with root package name */
        private int f14131o;

        /* renamed from: p  reason: collision with root package name */
        private int f14132p;

        /* renamed from: q  reason: collision with root package name */
        private int f14133q;

        /* renamed from: r  reason: collision with root package name */
        private com.google.common.collect.q<String> f14134r;

        /* renamed from: s  reason: collision with root package name */
        private com.google.common.collect.q<String> f14135s;

        /* renamed from: t  reason: collision with root package name */
        private int f14136t;

        /* renamed from: u  reason: collision with root package name */
        private int f14137u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f14138v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f14139w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f14140x;

        /* renamed from: y  reason: collision with root package name */
        private HashMap<t0, y> f14141y;

        /* renamed from: z  reason: collision with root package name */
        private HashSet<Integer> f14142z;

        @Deprecated
        public a() {
            this.f14117a = Integer.MAX_VALUE;
            this.f14118b = Integer.MAX_VALUE;
            this.f14119c = Integer.MAX_VALUE;
            this.f14120d = Integer.MAX_VALUE;
            this.f14125i = Integer.MAX_VALUE;
            this.f14126j = Integer.MAX_VALUE;
            this.f14127k = true;
            this.f14128l = com.google.common.collect.q.z();
            this.f14129m = 0;
            this.f14130n = com.google.common.collect.q.z();
            this.f14131o = 0;
            this.f14132p = Integer.MAX_VALUE;
            this.f14133q = Integer.MAX_VALUE;
            this.f14134r = com.google.common.collect.q.z();
            this.f14135s = com.google.common.collect.q.z();
            this.f14136t = 0;
            this.f14137u = 0;
            this.f14138v = false;
            this.f14139w = false;
            this.f14140x = false;
            this.f14141y = new HashMap<>();
            this.f14142z = new HashSet<>();
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Bundle bundle) {
            String str = a0.Q;
            a0 a0Var = a0.J;
            this.f14117a = bundle.getInt(str, a0Var.f14100j);
            this.f14118b = bundle.getInt(a0.R, a0Var.f14101k);
            this.f14119c = bundle.getInt(a0.S, a0Var.f14102l);
            this.f14120d = bundle.getInt(a0.T, a0Var.f14103m);
            this.f14121e = bundle.getInt(a0.U, a0Var.f14104n);
            this.f14122f = bundle.getInt(a0.V, a0Var.f14105o);
            this.f14123g = bundle.getInt(a0.W, a0Var.f14106p);
            this.f14124h = bundle.getInt(a0.X, a0Var.f14107q);
            this.f14125i = bundle.getInt(a0.Y, a0Var.f14108r);
            this.f14126j = bundle.getInt(a0.Z, a0Var.f14109s);
            this.f14127k = bundle.getBoolean(a0.f14088a0, a0Var.f14110t);
            this.f14128l = com.google.common.collect.q.w((String[]) b5.h.a(bundle.getStringArray(a0.f14089b0), new String[0]));
            this.f14129m = bundle.getInt(a0.f14097j0, a0Var.f14112v);
            this.f14130n = C((String[]) b5.h.a(bundle.getStringArray(a0.L), new String[0]));
            this.f14131o = bundle.getInt(a0.M, a0Var.f14114x);
            this.f14132p = bundle.getInt(a0.f14090c0, a0Var.f14115y);
            this.f14133q = bundle.getInt(a0.f14091d0, a0Var.f14116z);
            this.f14134r = com.google.common.collect.q.w((String[]) b5.h.a(bundle.getStringArray(a0.f14092e0), new String[0]));
            this.f14135s = C((String[]) b5.h.a(bundle.getStringArray(a0.N), new String[0]));
            this.f14136t = bundle.getInt(a0.O, a0Var.C);
            this.f14137u = bundle.getInt(a0.f14098k0, a0Var.D);
            this.f14138v = bundle.getBoolean(a0.P, a0Var.E);
            this.f14139w = bundle.getBoolean(a0.f14093f0, a0Var.F);
            this.f14140x = bundle.getBoolean(a0.f14094g0, a0Var.G);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a0.f14095h0);
            com.google.common.collect.q z10 = parcelableArrayList == null ? com.google.common.collect.q.z() : p3.c.b(y.f14269n, parcelableArrayList);
            this.f14141y = new HashMap<>();
            for (int i10 = 0; i10 < z10.size(); i10++) {
                y yVar = (y) z10.get(i10);
                this.f14141y.put(yVar.f14270j, yVar);
            }
            int[] iArr = (int[]) b5.h.a(bundle.getIntArray(a0.f14096i0), new int[0]);
            this.f14142z = new HashSet<>();
            for (int i11 : iArr) {
                this.f14142z.add(Integer.valueOf(i11));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(a0 a0Var) {
            B(a0Var);
        }

        private void B(a0 a0Var) {
            this.f14117a = a0Var.f14100j;
            this.f14118b = a0Var.f14101k;
            this.f14119c = a0Var.f14102l;
            this.f14120d = a0Var.f14103m;
            this.f14121e = a0Var.f14104n;
            this.f14122f = a0Var.f14105o;
            this.f14123g = a0Var.f14106p;
            this.f14124h = a0Var.f14107q;
            this.f14125i = a0Var.f14108r;
            this.f14126j = a0Var.f14109s;
            this.f14127k = a0Var.f14110t;
            this.f14128l = a0Var.f14111u;
            this.f14129m = a0Var.f14112v;
            this.f14130n = a0Var.f14113w;
            this.f14131o = a0Var.f14114x;
            this.f14132p = a0Var.f14115y;
            this.f14133q = a0Var.f14116z;
            this.f14134r = a0Var.A;
            this.f14135s = a0Var.B;
            this.f14136t = a0Var.C;
            this.f14137u = a0Var.D;
            this.f14138v = a0Var.E;
            this.f14139w = a0Var.F;
            this.f14140x = a0Var.G;
            this.f14142z = new HashSet<>(a0Var.I);
            this.f14141y = new HashMap<>(a0Var.H);
        }

        private static com.google.common.collect.q<String> C(String[] strArr) {
            q.a t10 = com.google.common.collect.q.t();
            for (String str : (String[]) p3.a.e(strArr)) {
                t10.a(n0.D0((String) p3.a.e(str)));
            }
            return t10.h();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((n0.f15397a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f14136t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f14135s = com.google.common.collect.q.A(n0.X(locale));
                }
            }
        }

        public a0 A() {
            return new a0(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a D(a0 a0Var) {
            B(a0Var);
            return this;
        }

        public a E(Context context) {
            if (n0.f15397a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f14125i = i10;
            this.f14126j = i11;
            this.f14127k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O = n0.O(context);
            return G(O.x, O.y, z10);
        }
    }

    static {
        a0 A = new a().A();
        J = A;
        K = A;
        L = n0.q0(1);
        M = n0.q0(2);
        N = n0.q0(3);
        O = n0.q0(4);
        P = n0.q0(5);
        Q = n0.q0(6);
        R = n0.q0(7);
        S = n0.q0(8);
        T = n0.q0(9);
        U = n0.q0(10);
        V = n0.q0(11);
        W = n0.q0(12);
        X = n0.q0(13);
        Y = n0.q0(14);
        Z = n0.q0(15);
        f14088a0 = n0.q0(16);
        f14089b0 = n0.q0(17);
        f14090c0 = n0.q0(18);
        f14091d0 = n0.q0(19);
        f14092e0 = n0.q0(20);
        f14093f0 = n0.q0(21);
        f14094g0 = n0.q0(22);
        f14095h0 = n0.q0(23);
        f14096i0 = n0.q0(24);
        f14097j0 = n0.q0(25);
        f14098k0 = n0.q0(26);
        f14099l0 = new h.a() { // from class: n3.z
            @Override // s1.h.a
            public final s1.h a(Bundle bundle) {
                return a0.A(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a0(a aVar) {
        this.f14100j = aVar.f14117a;
        this.f14101k = aVar.f14118b;
        this.f14102l = aVar.f14119c;
        this.f14103m = aVar.f14120d;
        this.f14104n = aVar.f14121e;
        this.f14105o = aVar.f14122f;
        this.f14106p = aVar.f14123g;
        this.f14107q = aVar.f14124h;
        this.f14108r = aVar.f14125i;
        this.f14109s = aVar.f14126j;
        this.f14110t = aVar.f14127k;
        this.f14111u = aVar.f14128l;
        this.f14112v = aVar.f14129m;
        this.f14113w = aVar.f14130n;
        this.f14114x = aVar.f14131o;
        this.f14115y = aVar.f14132p;
        this.f14116z = aVar.f14133q;
        this.A = aVar.f14134r;
        this.B = aVar.f14135s;
        this.C = aVar.f14136t;
        this.D = aVar.f14137u;
        this.E = aVar.f14138v;
        this.F = aVar.f14139w;
        this.G = aVar.f14140x;
        this.H = com.google.common.collect.r.c(aVar.f14141y);
        this.I = com.google.common.collect.s.t(aVar.f14142z);
    }

    public static a0 A(Bundle bundle) {
        return new a(bundle).A();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f14100j == a0Var.f14100j && this.f14101k == a0Var.f14101k && this.f14102l == a0Var.f14102l && this.f14103m == a0Var.f14103m && this.f14104n == a0Var.f14104n && this.f14105o == a0Var.f14105o && this.f14106p == a0Var.f14106p && this.f14107q == a0Var.f14107q && this.f14110t == a0Var.f14110t && this.f14108r == a0Var.f14108r && this.f14109s == a0Var.f14109s && this.f14111u.equals(a0Var.f14111u) && this.f14112v == a0Var.f14112v && this.f14113w.equals(a0Var.f14113w) && this.f14114x == a0Var.f14114x && this.f14115y == a0Var.f14115y && this.f14116z == a0Var.f14116z && this.A.equals(a0Var.A) && this.B.equals(a0Var.B) && this.C == a0Var.C && this.D == a0Var.D && this.E == a0Var.E && this.F == a0Var.F && this.G == a0Var.G && this.H.equals(a0Var.H) && this.I.equals(a0Var.I);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f14100j + 31) * 31) + this.f14101k) * 31) + this.f14102l) * 31) + this.f14103m) * 31) + this.f14104n) * 31) + this.f14105o) * 31) + this.f14106p) * 31) + this.f14107q) * 31) + (this.f14110t ? 1 : 0)) * 31) + this.f14108r) * 31) + this.f14109s) * 31) + this.f14111u.hashCode()) * 31) + this.f14112v) * 31) + this.f14113w.hashCode()) * 31) + this.f14114x) * 31) + this.f14115y) * 31) + this.f14116z) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + this.H.hashCode()) * 31) + this.I.hashCode();
    }
}
