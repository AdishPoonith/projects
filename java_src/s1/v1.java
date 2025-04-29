package s1;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import s1.h;
import s1.v1;
/* loaded from: classes.dex */
public final class v1 implements s1.h {

    /* renamed from: r  reason: collision with root package name */
    public static final v1 f17595r = new c().a();

    /* renamed from: s  reason: collision with root package name */
    private static final String f17596s = p3.n0.q0(0);

    /* renamed from: t  reason: collision with root package name */
    private static final String f17597t = p3.n0.q0(1);

    /* renamed from: u  reason: collision with root package name */
    private static final String f17598u = p3.n0.q0(2);

    /* renamed from: v  reason: collision with root package name */
    private static final String f17599v = p3.n0.q0(3);

    /* renamed from: w  reason: collision with root package name */
    private static final String f17600w = p3.n0.q0(4);

    /* renamed from: x  reason: collision with root package name */
    public static final h.a<v1> f17601x = new h.a() { // from class: s1.u1
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            v1 c10;
            c10 = v1.c(bundle);
            return c10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final String f17602j;

    /* renamed from: k  reason: collision with root package name */
    public final h f17603k;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public final i f17604l;

    /* renamed from: m  reason: collision with root package name */
    public final g f17605m;

    /* renamed from: n  reason: collision with root package name */
    public final a2 f17606n;

    /* renamed from: o  reason: collision with root package name */
    public final d f17607o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public final e f17608p;

    /* renamed from: q  reason: collision with root package name */
    public final j f17609q;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f17610a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f17611b;

        /* renamed from: c  reason: collision with root package name */
        private String f17612c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f17613d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f17614e;

        /* renamed from: f  reason: collision with root package name */
        private List<t2.c> f17615f;

        /* renamed from: g  reason: collision with root package name */
        private String f17616g;

        /* renamed from: h  reason: collision with root package name */
        private com.google.common.collect.q<l> f17617h;

        /* renamed from: i  reason: collision with root package name */
        private Object f17618i;

        /* renamed from: j  reason: collision with root package name */
        private a2 f17619j;

        /* renamed from: k  reason: collision with root package name */
        private g.a f17620k;

        /* renamed from: l  reason: collision with root package name */
        private j f17621l;

        public c() {
            this.f17613d = new d.a();
            this.f17614e = new f.a();
            this.f17615f = Collections.emptyList();
            this.f17617h = com.google.common.collect.q.z();
            this.f17620k = new g.a();
            this.f17621l = j.f17684m;
        }

        private c(v1 v1Var) {
            this();
            this.f17613d = v1Var.f17607o.b();
            this.f17610a = v1Var.f17602j;
            this.f17619j = v1Var.f17606n;
            this.f17620k = v1Var.f17605m.b();
            this.f17621l = v1Var.f17609q;
            h hVar = v1Var.f17603k;
            if (hVar != null) {
                this.f17616g = hVar.f17680e;
                this.f17612c = hVar.f17677b;
                this.f17611b = hVar.f17676a;
                this.f17615f = hVar.f17679d;
                this.f17617h = hVar.f17681f;
                this.f17618i = hVar.f17683h;
                f fVar = hVar.f17678c;
                this.f17614e = fVar != null ? fVar.b() : new f.a();
            }
        }

        public v1 a() {
            i iVar;
            p3.a.f(this.f17614e.f17652b == null || this.f17614e.f17651a != null);
            Uri uri = this.f17611b;
            if (uri != null) {
                iVar = new i(uri, this.f17612c, this.f17614e.f17651a != null ? this.f17614e.i() : null, null, this.f17615f, this.f17616g, this.f17617h, this.f17618i);
            } else {
                iVar = null;
            }
            String str = this.f17610a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g10 = this.f17613d.g();
            g f10 = this.f17620k.f();
            a2 a2Var = this.f17619j;
            if (a2Var == null) {
                a2Var = a2.R;
            }
            return new v1(str2, g10, iVar, f10, a2Var, this.f17621l);
        }

        public c b(String str) {
            this.f17616g = str;
            return this;
        }

        public c c(String str) {
            this.f17610a = (String) p3.a.e(str);
            return this;
        }

        public c d(Object obj) {
            this.f17618i = obj;
            return this;
        }

        public c e(Uri uri) {
            this.f17611b = uri;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements s1.h {

        /* renamed from: o  reason: collision with root package name */
        public static final d f17622o = new a().f();

        /* renamed from: p  reason: collision with root package name */
        private static final String f17623p = p3.n0.q0(0);

        /* renamed from: q  reason: collision with root package name */
        private static final String f17624q = p3.n0.q0(1);

        /* renamed from: r  reason: collision with root package name */
        private static final String f17625r = p3.n0.q0(2);

        /* renamed from: s  reason: collision with root package name */
        private static final String f17626s = p3.n0.q0(3);

        /* renamed from: t  reason: collision with root package name */
        private static final String f17627t = p3.n0.q0(4);

        /* renamed from: u  reason: collision with root package name */
        public static final h.a<e> f17628u = new h.a() { // from class: s1.w1
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                v1.e c10;
                c10 = v1.d.c(bundle);
                return c10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final long f17629j;

        /* renamed from: k  reason: collision with root package name */
        public final long f17630k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f17631l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f17632m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f17633n;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f17634a;

            /* renamed from: b  reason: collision with root package name */
            private long f17635b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f17636c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f17637d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f17638e;

            public a() {
                this.f17635b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f17634a = dVar.f17629j;
                this.f17635b = dVar.f17630k;
                this.f17636c = dVar.f17631l;
                this.f17637d = dVar.f17632m;
                this.f17638e = dVar.f17633n;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                p3.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f17635b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f17637d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f17636c = z10;
                return this;
            }

            public a k(long j10) {
                p3.a.a(j10 >= 0);
                this.f17634a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f17638e = z10;
                return this;
            }
        }

        private d(a aVar) {
            this.f17629j = aVar.f17634a;
            this.f17630k = aVar.f17635b;
            this.f17631l = aVar.f17636c;
            this.f17632m = aVar.f17637d;
            this.f17633n = aVar.f17638e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            a aVar = new a();
            String str = f17623p;
            d dVar = f17622o;
            return aVar.k(bundle.getLong(str, dVar.f17629j)).h(bundle.getLong(f17624q, dVar.f17630k)).j(bundle.getBoolean(f17625r, dVar.f17631l)).i(bundle.getBoolean(f17626s, dVar.f17632m)).l(bundle.getBoolean(f17627t, dVar.f17633n)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f17629j == dVar.f17629j && this.f17630k == dVar.f17630k && this.f17631l == dVar.f17631l && this.f17632m == dVar.f17632m && this.f17633n == dVar.f17633n;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f17629j;
            long j11 = this.f17630k;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f17631l ? 1 : 0)) * 31) + (this.f17632m ? 1 : 0)) * 31) + (this.f17633n ? 1 : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: v  reason: collision with root package name */
        public static final e f17639v = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f17640a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final UUID f17641b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f17642c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final com.google.common.collect.r<String, String> f17643d;

        /* renamed from: e  reason: collision with root package name */
        public final com.google.common.collect.r<String, String> f17644e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f17645f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f17646g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f17647h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public final com.google.common.collect.q<Integer> f17648i;

        /* renamed from: j  reason: collision with root package name */
        public final com.google.common.collect.q<Integer> f17649j;

        /* renamed from: k  reason: collision with root package name */
        private final byte[] f17650k;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private UUID f17651a;

            /* renamed from: b  reason: collision with root package name */
            private Uri f17652b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.common.collect.r<String, String> f17653c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f17654d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f17655e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f17656f;

            /* renamed from: g  reason: collision with root package name */
            private com.google.common.collect.q<Integer> f17657g;

            /* renamed from: h  reason: collision with root package name */
            private byte[] f17658h;

            @Deprecated
            private a() {
                this.f17653c = com.google.common.collect.r.j();
                this.f17657g = com.google.common.collect.q.z();
            }

            private a(f fVar) {
                this.f17651a = fVar.f17640a;
                this.f17652b = fVar.f17642c;
                this.f17653c = fVar.f17644e;
                this.f17654d = fVar.f17645f;
                this.f17655e = fVar.f17646g;
                this.f17656f = fVar.f17647h;
                this.f17657g = fVar.f17649j;
                this.f17658h = fVar.f17650k;
            }

            public f i() {
                return new f(this);
            }
        }

        private f(a aVar) {
            p3.a.f((aVar.f17656f && aVar.f17652b == null) ? false : true);
            UUID uuid = (UUID) p3.a.e(aVar.f17651a);
            this.f17640a = uuid;
            this.f17641b = uuid;
            this.f17642c = aVar.f17652b;
            this.f17643d = aVar.f17653c;
            this.f17644e = aVar.f17653c;
            this.f17645f = aVar.f17654d;
            this.f17647h = aVar.f17656f;
            this.f17646g = aVar.f17655e;
            this.f17648i = aVar.f17657g;
            this.f17649j = aVar.f17657g;
            this.f17650k = aVar.f17658h != null ? Arrays.copyOf(aVar.f17658h, aVar.f17658h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f17650k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f17640a.equals(fVar.f17640a) && p3.n0.c(this.f17642c, fVar.f17642c) && p3.n0.c(this.f17644e, fVar.f17644e) && this.f17645f == fVar.f17645f && this.f17647h == fVar.f17647h && this.f17646g == fVar.f17646g && this.f17649j.equals(fVar.f17649j) && Arrays.equals(this.f17650k, fVar.f17650k);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f17640a.hashCode() * 31;
            Uri uri = this.f17642c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f17644e.hashCode()) * 31) + (this.f17645f ? 1 : 0)) * 31) + (this.f17647h ? 1 : 0)) * 31) + (this.f17646g ? 1 : 0)) * 31) + this.f17649j.hashCode()) * 31) + Arrays.hashCode(this.f17650k);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements s1.h {

        /* renamed from: o  reason: collision with root package name */
        public static final g f17659o = new a().f();

        /* renamed from: p  reason: collision with root package name */
        private static final String f17660p = p3.n0.q0(0);

        /* renamed from: q  reason: collision with root package name */
        private static final String f17661q = p3.n0.q0(1);

        /* renamed from: r  reason: collision with root package name */
        private static final String f17662r = p3.n0.q0(2);

        /* renamed from: s  reason: collision with root package name */
        private static final String f17663s = p3.n0.q0(3);

        /* renamed from: t  reason: collision with root package name */
        private static final String f17664t = p3.n0.q0(4);

        /* renamed from: u  reason: collision with root package name */
        public static final h.a<g> f17665u = new h.a() { // from class: s1.x1
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                v1.g c10;
                c10 = v1.g.c(bundle);
                return c10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final long f17666j;

        /* renamed from: k  reason: collision with root package name */
        public final long f17667k;

        /* renamed from: l  reason: collision with root package name */
        public final long f17668l;

        /* renamed from: m  reason: collision with root package name */
        public final float f17669m;

        /* renamed from: n  reason: collision with root package name */
        public final float f17670n;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private long f17671a;

            /* renamed from: b  reason: collision with root package name */
            private long f17672b;

            /* renamed from: c  reason: collision with root package name */
            private long f17673c;

            /* renamed from: d  reason: collision with root package name */
            private float f17674d;

            /* renamed from: e  reason: collision with root package name */
            private float f17675e;

            public a() {
                this.f17671a = -9223372036854775807L;
                this.f17672b = -9223372036854775807L;
                this.f17673c = -9223372036854775807L;
                this.f17674d = -3.4028235E38f;
                this.f17675e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f17671a = gVar.f17666j;
                this.f17672b = gVar.f17667k;
                this.f17673c = gVar.f17668l;
                this.f17674d = gVar.f17669m;
                this.f17675e = gVar.f17670n;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f17673c = j10;
                return this;
            }

            public a h(float f10) {
                this.f17675e = f10;
                return this;
            }

            public a i(long j10) {
                this.f17672b = j10;
                return this;
            }

            public a j(float f10) {
                this.f17674d = f10;
                return this;
            }

            public a k(long j10) {
                this.f17671a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f17666j = j10;
            this.f17667k = j11;
            this.f17668l = j12;
            this.f17669m = f10;
            this.f17670n = f11;
        }

        private g(a aVar) {
            this(aVar.f17671a, aVar.f17672b, aVar.f17673c, aVar.f17674d, aVar.f17675e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g c(Bundle bundle) {
            String str = f17660p;
            g gVar = f17659o;
            return new g(bundle.getLong(str, gVar.f17666j), bundle.getLong(f17661q, gVar.f17667k), bundle.getLong(f17662r, gVar.f17668l), bundle.getFloat(f17663s, gVar.f17669m), bundle.getFloat(f17664t, gVar.f17670n));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f17666j == gVar.f17666j && this.f17667k == gVar.f17667k && this.f17668l == gVar.f17668l && this.f17669m == gVar.f17669m && this.f17670n == gVar.f17670n;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f17666j;
            long j11 = this.f17667k;
            long j12 = this.f17668l;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f17669m;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f17670n;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f17676a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17677b;

        /* renamed from: c  reason: collision with root package name */
        public final f f17678c;

        /* renamed from: d  reason: collision with root package name */
        public final List<t2.c> f17679d;

        /* renamed from: e  reason: collision with root package name */
        public final String f17680e;

        /* renamed from: f  reason: collision with root package name */
        public final com.google.common.collect.q<l> f17681f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public final List<k> f17682g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f17683h;

        private h(Uri uri, String str, f fVar, b bVar, List<t2.c> list, String str2, com.google.common.collect.q<l> qVar, Object obj) {
            this.f17676a = uri;
            this.f17677b = str;
            this.f17678c = fVar;
            this.f17679d = list;
            this.f17680e = str2;
            this.f17681f = qVar;
            q.a t10 = com.google.common.collect.q.t();
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                t10.a(qVar.get(i10).a().i());
            }
            this.f17682g = t10.h();
            this.f17683h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f17676a.equals(hVar.f17676a) && p3.n0.c(this.f17677b, hVar.f17677b) && p3.n0.c(this.f17678c, hVar.f17678c) && p3.n0.c(null, null) && this.f17679d.equals(hVar.f17679d) && p3.n0.c(this.f17680e, hVar.f17680e) && this.f17681f.equals(hVar.f17681f) && p3.n0.c(this.f17683h, hVar.f17683h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f17676a.hashCode() * 31;
            String str = this.f17677b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f17678c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f17679d.hashCode()) * 31;
            String str2 = this.f17680e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17681f.hashCode()) * 31;
            Object obj = this.f17683h;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<t2.c> list, String str2, com.google.common.collect.q<l> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements s1.h {

        /* renamed from: m  reason: collision with root package name */
        public static final j f17684m = new a().d();

        /* renamed from: n  reason: collision with root package name */
        private static final String f17685n = p3.n0.q0(0);

        /* renamed from: o  reason: collision with root package name */
        private static final String f17686o = p3.n0.q0(1);

        /* renamed from: p  reason: collision with root package name */
        private static final String f17687p = p3.n0.q0(2);

        /* renamed from: q  reason: collision with root package name */
        public static final h.a<j> f17688q = new h.a() { // from class: s1.y1
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                v1.j b10;
                b10 = v1.j.b(bundle);
                return b10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final Uri f17689j;

        /* renamed from: k  reason: collision with root package name */
        public final String f17690k;

        /* renamed from: l  reason: collision with root package name */
        public final Bundle f17691l;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f17692a;

            /* renamed from: b  reason: collision with root package name */
            private String f17693b;

            /* renamed from: c  reason: collision with root package name */
            private Bundle f17694c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f17694c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f17692a = uri;
                return this;
            }

            public a g(String str) {
                this.f17693b = str;
                return this;
            }
        }

        private j(a aVar) {
            this.f17689j = aVar.f17692a;
            this.f17690k = aVar.f17693b;
            this.f17691l = aVar.f17694c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j b(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f17685n)).g(bundle.getString(f17686o)).e(bundle.getBundle(f17687p)).d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return p3.n0.c(this.f17689j, jVar.f17689j) && p3.n0.c(this.f17690k, jVar.f17690k);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f17689j;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f17690k;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f17695a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17696b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17697c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17698d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17699e;

        /* renamed from: f  reason: collision with root package name */
        public final String f17700f;

        /* renamed from: g  reason: collision with root package name */
        public final String f17701g;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Uri f17702a;

            /* renamed from: b  reason: collision with root package name */
            private String f17703b;

            /* renamed from: c  reason: collision with root package name */
            private String f17704c;

            /* renamed from: d  reason: collision with root package name */
            private int f17705d;

            /* renamed from: e  reason: collision with root package name */
            private int f17706e;

            /* renamed from: f  reason: collision with root package name */
            private String f17707f;

            /* renamed from: g  reason: collision with root package name */
            private String f17708g;

            private a(l lVar) {
                this.f17702a = lVar.f17695a;
                this.f17703b = lVar.f17696b;
                this.f17704c = lVar.f17697c;
                this.f17705d = lVar.f17698d;
                this.f17706e = lVar.f17699e;
                this.f17707f = lVar.f17700f;
                this.f17708g = lVar.f17701g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public k i() {
                return new k(this);
            }
        }

        private l(a aVar) {
            this.f17695a = aVar.f17702a;
            this.f17696b = aVar.f17703b;
            this.f17697c = aVar.f17704c;
            this.f17698d = aVar.f17705d;
            this.f17699e = aVar.f17706e;
            this.f17700f = aVar.f17707f;
            this.f17701g = aVar.f17708g;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return this.f17695a.equals(lVar.f17695a) && p3.n0.c(this.f17696b, lVar.f17696b) && p3.n0.c(this.f17697c, lVar.f17697c) && this.f17698d == lVar.f17698d && this.f17699e == lVar.f17699e && p3.n0.c(this.f17700f, lVar.f17700f) && p3.n0.c(this.f17701g, lVar.f17701g);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f17695a.hashCode() * 31;
            String str = this.f17696b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f17697c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17698d) * 31) + this.f17699e) * 31;
            String str3 = this.f17700f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f17701g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private v1(String str, e eVar, i iVar, g gVar, a2 a2Var, j jVar) {
        this.f17602j = str;
        this.f17603k = iVar;
        this.f17604l = iVar;
        this.f17605m = gVar;
        this.f17606n = a2Var;
        this.f17607o = eVar;
        this.f17608p = eVar;
        this.f17609q = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v1 c(Bundle bundle) {
        String str = (String) p3.a.e(bundle.getString(f17596s, ""));
        Bundle bundle2 = bundle.getBundle(f17597t);
        g a10 = bundle2 == null ? g.f17659o : g.f17665u.a(bundle2);
        Bundle bundle3 = bundle.getBundle(f17598u);
        a2 a11 = bundle3 == null ? a2.R : a2.f17035z0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f17599v);
        e a12 = bundle4 == null ? e.f17639v : d.f17628u.a(bundle4);
        Bundle bundle5 = bundle.getBundle(f17600w);
        return new v1(str, a12, null, a10, a11, bundle5 == null ? j.f17684m : j.f17688q.a(bundle5));
    }

    public static v1 d(Uri uri) {
        return new c().e(uri).a();
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return p3.n0.c(this.f17602j, v1Var.f17602j) && this.f17607o.equals(v1Var.f17607o) && p3.n0.c(this.f17603k, v1Var.f17603k) && p3.n0.c(this.f17605m, v1Var.f17605m) && p3.n0.c(this.f17606n, v1Var.f17606n) && p3.n0.c(this.f17609q, v1Var.f17609q);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f17602j.hashCode() * 31;
        h hVar = this.f17603k;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f17605m.hashCode()) * 31) + this.f17607o.hashCode()) * 31) + this.f17606n.hashCode()) * 31) + this.f17609q.hashCode();
    }
}
