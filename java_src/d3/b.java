package d3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import p3.n0;
import s1.h;
/* loaded from: classes.dex */
public final class b implements s1.h {
    public static final b A = new C0115b().o("").a();
    private static final String B = n0.q0(0);
    private static final String C = n0.q0(1);
    private static final String D = n0.q0(2);
    private static final String E = n0.q0(3);
    private static final String F = n0.q0(4);
    private static final String G = n0.q0(5);
    private static final String H = n0.q0(6);
    private static final String I = n0.q0(7);
    private static final String J = n0.q0(8);
    private static final String K = n0.q0(9);
    private static final String L = n0.q0(10);
    private static final String M = n0.q0(11);
    private static final String N = n0.q0(12);
    private static final String O = n0.q0(13);
    private static final String P = n0.q0(14);
    private static final String Q = n0.q0(15);
    private static final String R = n0.q0(16);
    public static final h.a<b> S = new h.a() { // from class: d3.a
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            b c10;
            c10 = b.c(bundle);
            return c10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f7671j;

    /* renamed from: k  reason: collision with root package name */
    public final Layout.Alignment f7672k;

    /* renamed from: l  reason: collision with root package name */
    public final Layout.Alignment f7673l;

    /* renamed from: m  reason: collision with root package name */
    public final Bitmap f7674m;

    /* renamed from: n  reason: collision with root package name */
    public final float f7675n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7676o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7677p;

    /* renamed from: q  reason: collision with root package name */
    public final float f7678q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7679r;

    /* renamed from: s  reason: collision with root package name */
    public final float f7680s;

    /* renamed from: t  reason: collision with root package name */
    public final float f7681t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f7682u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7683v;

    /* renamed from: w  reason: collision with root package name */
    public final int f7684w;

    /* renamed from: x  reason: collision with root package name */
    public final float f7685x;

    /* renamed from: y  reason: collision with root package name */
    public final int f7686y;

    /* renamed from: z  reason: collision with root package name */
    public final float f7687z;

    /* renamed from: d3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0115b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f7688a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f7689b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f7690c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f7691d;

        /* renamed from: e  reason: collision with root package name */
        private float f7692e;

        /* renamed from: f  reason: collision with root package name */
        private int f7693f;

        /* renamed from: g  reason: collision with root package name */
        private int f7694g;

        /* renamed from: h  reason: collision with root package name */
        private float f7695h;

        /* renamed from: i  reason: collision with root package name */
        private int f7696i;

        /* renamed from: j  reason: collision with root package name */
        private int f7697j;

        /* renamed from: k  reason: collision with root package name */
        private float f7698k;

        /* renamed from: l  reason: collision with root package name */
        private float f7699l;

        /* renamed from: m  reason: collision with root package name */
        private float f7700m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f7701n;

        /* renamed from: o  reason: collision with root package name */
        private int f7702o;

        /* renamed from: p  reason: collision with root package name */
        private int f7703p;

        /* renamed from: q  reason: collision with root package name */
        private float f7704q;

        public C0115b() {
            this.f7688a = null;
            this.f7689b = null;
            this.f7690c = null;
            this.f7691d = null;
            this.f7692e = -3.4028235E38f;
            this.f7693f = Integer.MIN_VALUE;
            this.f7694g = Integer.MIN_VALUE;
            this.f7695h = -3.4028235E38f;
            this.f7696i = Integer.MIN_VALUE;
            this.f7697j = Integer.MIN_VALUE;
            this.f7698k = -3.4028235E38f;
            this.f7699l = -3.4028235E38f;
            this.f7700m = -3.4028235E38f;
            this.f7701n = false;
            this.f7702o = -16777216;
            this.f7703p = Integer.MIN_VALUE;
        }

        private C0115b(b bVar) {
            this.f7688a = bVar.f7671j;
            this.f7689b = bVar.f7674m;
            this.f7690c = bVar.f7672k;
            this.f7691d = bVar.f7673l;
            this.f7692e = bVar.f7675n;
            this.f7693f = bVar.f7676o;
            this.f7694g = bVar.f7677p;
            this.f7695h = bVar.f7678q;
            this.f7696i = bVar.f7679r;
            this.f7697j = bVar.f7684w;
            this.f7698k = bVar.f7685x;
            this.f7699l = bVar.f7680s;
            this.f7700m = bVar.f7681t;
            this.f7701n = bVar.f7682u;
            this.f7702o = bVar.f7683v;
            this.f7703p = bVar.f7686y;
            this.f7704q = bVar.f7687z;
        }

        public b a() {
            return new b(this.f7688a, this.f7690c, this.f7691d, this.f7689b, this.f7692e, this.f7693f, this.f7694g, this.f7695h, this.f7696i, this.f7697j, this.f7698k, this.f7699l, this.f7700m, this.f7701n, this.f7702o, this.f7703p, this.f7704q);
        }

        public C0115b b() {
            this.f7701n = false;
            return this;
        }

        public int c() {
            return this.f7694g;
        }

        public int d() {
            return this.f7696i;
        }

        public CharSequence e() {
            return this.f7688a;
        }

        public C0115b f(Bitmap bitmap) {
            this.f7689b = bitmap;
            return this;
        }

        public C0115b g(float f10) {
            this.f7700m = f10;
            return this;
        }

        public C0115b h(float f10, int i10) {
            this.f7692e = f10;
            this.f7693f = i10;
            return this;
        }

        public C0115b i(int i10) {
            this.f7694g = i10;
            return this;
        }

        public C0115b j(Layout.Alignment alignment) {
            this.f7691d = alignment;
            return this;
        }

        public C0115b k(float f10) {
            this.f7695h = f10;
            return this;
        }

        public C0115b l(int i10) {
            this.f7696i = i10;
            return this;
        }

        public C0115b m(float f10) {
            this.f7704q = f10;
            return this;
        }

        public C0115b n(float f10) {
            this.f7699l = f10;
            return this;
        }

        public C0115b o(CharSequence charSequence) {
            this.f7688a = charSequence;
            return this;
        }

        public C0115b p(Layout.Alignment alignment) {
            this.f7690c = alignment;
            return this;
        }

        public C0115b q(float f10, int i10) {
            this.f7698k = f10;
            this.f7697j = i10;
            return this;
        }

        public C0115b r(int i10) {
            this.f7703p = i10;
            return this;
        }

        public C0115b s(int i10) {
            this.f7702o = i10;
            this.f7701n = true;
            return this;
        }
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            p3.a.e(bitmap);
        } else {
            p3.a.a(bitmap == null);
        }
        this.f7671j = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f7672k = alignment;
        this.f7673l = alignment2;
        this.f7674m = bitmap;
        this.f7675n = f10;
        this.f7676o = i10;
        this.f7677p = i11;
        this.f7678q = f11;
        this.f7679r = i12;
        this.f7680s = f13;
        this.f7681t = f14;
        this.f7682u = z10;
        this.f7683v = i14;
        this.f7684w = i13;
        this.f7685x = f12;
        this.f7686y = i15;
        this.f7687z = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c(Bundle bundle) {
        C0115b c0115b = new C0115b();
        CharSequence charSequence = bundle.getCharSequence(B);
        if (charSequence != null) {
            c0115b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C);
        if (alignment != null) {
            c0115b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(D);
        if (alignment2 != null) {
            c0115b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(E);
        if (bitmap != null) {
            c0115b.f(bitmap);
        }
        String str = F;
        if (bundle.containsKey(str)) {
            String str2 = G;
            if (bundle.containsKey(str2)) {
                c0115b.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = H;
        if (bundle.containsKey(str3)) {
            c0115b.i(bundle.getInt(str3));
        }
        String str4 = I;
        if (bundle.containsKey(str4)) {
            c0115b.k(bundle.getFloat(str4));
        }
        String str5 = J;
        if (bundle.containsKey(str5)) {
            c0115b.l(bundle.getInt(str5));
        }
        String str6 = L;
        if (bundle.containsKey(str6)) {
            String str7 = K;
            if (bundle.containsKey(str7)) {
                c0115b.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = M;
        if (bundle.containsKey(str8)) {
            c0115b.n(bundle.getFloat(str8));
        }
        String str9 = N;
        if (bundle.containsKey(str9)) {
            c0115b.g(bundle.getFloat(str9));
        }
        String str10 = O;
        if (bundle.containsKey(str10)) {
            c0115b.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(P, false)) {
            c0115b.b();
        }
        String str11 = Q;
        if (bundle.containsKey(str11)) {
            c0115b.r(bundle.getInt(str11));
        }
        String str12 = R;
        if (bundle.containsKey(str12)) {
            c0115b.m(bundle.getFloat(str12));
        }
        return c0115b.a();
    }

    public C0115b b() {
        return new C0115b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f7671j, bVar.f7671j) && this.f7672k == bVar.f7672k && this.f7673l == bVar.f7673l && ((bitmap = this.f7674m) != null ? !((bitmap2 = bVar.f7674m) == null || !bitmap.sameAs(bitmap2)) : bVar.f7674m == null) && this.f7675n == bVar.f7675n && this.f7676o == bVar.f7676o && this.f7677p == bVar.f7677p && this.f7678q == bVar.f7678q && this.f7679r == bVar.f7679r && this.f7680s == bVar.f7680s && this.f7681t == bVar.f7681t && this.f7682u == bVar.f7682u && this.f7683v == bVar.f7683v && this.f7684w == bVar.f7684w && this.f7685x == bVar.f7685x && this.f7686y == bVar.f7686y && this.f7687z == bVar.f7687z;
    }

    public int hashCode() {
        return b5.j.b(this.f7671j, this.f7672k, this.f7673l, this.f7674m, Float.valueOf(this.f7675n), Integer.valueOf(this.f7676o), Integer.valueOf(this.f7677p), Float.valueOf(this.f7678q), Integer.valueOf(this.f7679r), Float.valueOf(this.f7680s), Float.valueOf(this.f7681t), Boolean.valueOf(this.f7682u), Integer.valueOf(this.f7683v), Integer.valueOf(this.f7684w), Float.valueOf(this.f7685x), Integer.valueOf(this.f7686y), Float.valueOf(this.f7687z));
    }
}
