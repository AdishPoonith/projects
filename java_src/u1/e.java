package u1;

import android.media.AudioAttributes;
import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class e implements s1.h {

    /* renamed from: p  reason: collision with root package name */
    public static final e f18565p = new C0268e().a();

    /* renamed from: q  reason: collision with root package name */
    private static final String f18566q = p3.n0.q0(0);

    /* renamed from: r  reason: collision with root package name */
    private static final String f18567r = p3.n0.q0(1);

    /* renamed from: s  reason: collision with root package name */
    private static final String f18568s = p3.n0.q0(2);

    /* renamed from: t  reason: collision with root package name */
    private static final String f18569t = p3.n0.q0(3);

    /* renamed from: u  reason: collision with root package name */
    private static final String f18570u = p3.n0.q0(4);

    /* renamed from: v  reason: collision with root package name */
    public static final h.a<e> f18571v = new h.a() { // from class: u1.d
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            e c10;
            c10 = e.c(bundle);
            return c10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f18572j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18573k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18574l;

    /* renamed from: m  reason: collision with root package name */
    public final int f18575m;

    /* renamed from: n  reason: collision with root package name */
    public final int f18576n;

    /* renamed from: o  reason: collision with root package name */
    private d f18577o;

    /* loaded from: classes.dex */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f18578a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f18572j).setFlags(eVar.f18573k).setUsage(eVar.f18574l);
            int i10 = p3.n0.f15397a;
            if (i10 >= 29) {
                b.a(usage, eVar.f18575m);
            }
            if (i10 >= 32) {
                c.a(usage, eVar.f18576n);
            }
            this.f18578a = usage.build();
        }
    }

    /* renamed from: u1.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0268e {

        /* renamed from: a  reason: collision with root package name */
        private int f18579a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f18580b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f18581c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f18582d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f18583e = 0;

        public e a() {
            return new e(this.f18579a, this.f18580b, this.f18581c, this.f18582d, this.f18583e);
        }

        public C0268e b(int i10) {
            this.f18582d = i10;
            return this;
        }

        public C0268e c(int i10) {
            this.f18579a = i10;
            return this;
        }

        public C0268e d(int i10) {
            this.f18580b = i10;
            return this;
        }

        public C0268e e(int i10) {
            this.f18583e = i10;
            return this;
        }

        public C0268e f(int i10) {
            this.f18581c = i10;
            return this;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14) {
        this.f18572j = i10;
        this.f18573k = i11;
        this.f18574l = i12;
        this.f18575m = i13;
        this.f18576n = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e c(Bundle bundle) {
        C0268e c0268e = new C0268e();
        String str = f18566q;
        if (bundle.containsKey(str)) {
            c0268e.c(bundle.getInt(str));
        }
        String str2 = f18567r;
        if (bundle.containsKey(str2)) {
            c0268e.d(bundle.getInt(str2));
        }
        String str3 = f18568s;
        if (bundle.containsKey(str3)) {
            c0268e.f(bundle.getInt(str3));
        }
        String str4 = f18569t;
        if (bundle.containsKey(str4)) {
            c0268e.b(bundle.getInt(str4));
        }
        String str5 = f18570u;
        if (bundle.containsKey(str5)) {
            c0268e.e(bundle.getInt(str5));
        }
        return c0268e.a();
    }

    public d b() {
        if (this.f18577o == null) {
            this.f18577o = new d();
        }
        return this.f18577o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18572j == eVar.f18572j && this.f18573k == eVar.f18573k && this.f18574l == eVar.f18574l && this.f18575m == eVar.f18575m && this.f18576n == eVar.f18576n;
    }

    public int hashCode() {
        return ((((((((527 + this.f18572j) * 31) + this.f18573k) * 31) + this.f18574l) * 31) + this.f18575m) * 31) + this.f18576n;
    }
}
