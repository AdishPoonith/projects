package s1;

import android.content.Context;
import android.os.Looper;
import s1.j;
import s1.s;
import u2.u;
/* loaded from: classes.dex */
public interface s extends c3 {

    /* loaded from: classes.dex */
    public interface a {
        void C(boolean z10);

        void F(boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class b {
        boolean A;
        Looper B;
        boolean C;

        /* renamed from: a  reason: collision with root package name */
        final Context f17515a;

        /* renamed from: b  reason: collision with root package name */
        p3.d f17516b;

        /* renamed from: c  reason: collision with root package name */
        long f17517c;

        /* renamed from: d  reason: collision with root package name */
        b5.t<p3> f17518d;

        /* renamed from: e  reason: collision with root package name */
        b5.t<u.a> f17519e;

        /* renamed from: f  reason: collision with root package name */
        b5.t<n3.c0> f17520f;

        /* renamed from: g  reason: collision with root package name */
        b5.t<t1> f17521g;

        /* renamed from: h  reason: collision with root package name */
        b5.t<o3.f> f17522h;

        /* renamed from: i  reason: collision with root package name */
        b5.f<p3.d, t1.a> f17523i;

        /* renamed from: j  reason: collision with root package name */
        Looper f17524j;

        /* renamed from: k  reason: collision with root package name */
        p3.c0 f17525k;

        /* renamed from: l  reason: collision with root package name */
        u1.e f17526l;

        /* renamed from: m  reason: collision with root package name */
        boolean f17527m;

        /* renamed from: n  reason: collision with root package name */
        int f17528n;

        /* renamed from: o  reason: collision with root package name */
        boolean f17529o;

        /* renamed from: p  reason: collision with root package name */
        boolean f17530p;

        /* renamed from: q  reason: collision with root package name */
        int f17531q;

        /* renamed from: r  reason: collision with root package name */
        int f17532r;

        /* renamed from: s  reason: collision with root package name */
        boolean f17533s;

        /* renamed from: t  reason: collision with root package name */
        q3 f17534t;

        /* renamed from: u  reason: collision with root package name */
        long f17535u;

        /* renamed from: v  reason: collision with root package name */
        long f17536v;

        /* renamed from: w  reason: collision with root package name */
        s1 f17537w;

        /* renamed from: x  reason: collision with root package name */
        long f17538x;

        /* renamed from: y  reason: collision with root package name */
        long f17539y;

        /* renamed from: z  reason: collision with root package name */
        boolean f17540z;

        public b(final Context context) {
            this(context, new b5.t() { // from class: s1.v
                @Override // b5.t
                public final Object get() {
                    p3 f10;
                    f10 = s.b.f(context);
                    return f10;
                }
            }, new b5.t() { // from class: s1.x
                @Override // b5.t
                public final Object get() {
                    u.a g10;
                    g10 = s.b.g(context);
                    return g10;
                }
            });
        }

        private b(final Context context, b5.t<p3> tVar, b5.t<u.a> tVar2) {
            this(context, tVar, tVar2, new b5.t() { // from class: s1.w
                @Override // b5.t
                public final Object get() {
                    n3.c0 h10;
                    h10 = s.b.h(context);
                    return h10;
                }
            }, new b5.t() { // from class: s1.y
                @Override // b5.t
                public final Object get() {
                    return new k();
                }
            }, new b5.t() { // from class: s1.u
                @Override // b5.t
                public final Object get() {
                    o3.f n10;
                    n10 = o3.s.n(context);
                    return n10;
                }
            }, new b5.f() { // from class: s1.t
                @Override // b5.f
                public final Object apply(Object obj) {
                    return new t1.o1((p3.d) obj);
                }
            });
        }

        private b(Context context, b5.t<p3> tVar, b5.t<u.a> tVar2, b5.t<n3.c0> tVar3, b5.t<t1> tVar4, b5.t<o3.f> tVar5, b5.f<p3.d, t1.a> fVar) {
            this.f17515a = (Context) p3.a.e(context);
            this.f17518d = tVar;
            this.f17519e = tVar2;
            this.f17520f = tVar3;
            this.f17521g = tVar4;
            this.f17522h = tVar5;
            this.f17523i = fVar;
            this.f17524j = p3.n0.Q();
            this.f17526l = u1.e.f18565p;
            this.f17528n = 0;
            this.f17531q = 1;
            this.f17532r = 0;
            this.f17533s = true;
            this.f17534t = q3.f17501g;
            this.f17535u = 5000L;
            this.f17536v = 15000L;
            this.f17537w = new j.b().a();
            this.f17516b = p3.d.f15342a;
            this.f17538x = 500L;
            this.f17539y = 2000L;
            this.A = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ p3 f(Context context) {
            return new m(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u.a g(Context context) {
            return new u2.j(context, new x1.i());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ n3.c0 h(Context context) {
            return new n3.m(context);
        }

        public s e() {
            p3.a.f(!this.C);
            this.C = true;
            return new x0(this, null);
        }
    }

    void d(u1.e eVar, boolean z10);

    n1 q();

    void y(u2.u uVar);
}
