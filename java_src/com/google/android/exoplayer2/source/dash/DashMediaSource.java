package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.g0;
import o3.h0;
import o3.i0;
import o3.j0;
import o3.l;
import o3.p0;
import o3.x;
import p3.e0;
import p3.n0;
import p3.r;
import s1.k1;
import s1.u2;
import s1.v1;
import s1.y3;
import u2.b0;
import u2.i;
import u2.n;
import u2.q;
import u2.u;
import w1.y;
import y2.j;
import y2.o;
/* loaded from: classes.dex */
public final class DashMediaSource extends u2.a {
    private final j0.a<? extends y2.c> A;
    private final e B;
    private final Object C;
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> D;
    private final Runnable E;
    private final Runnable F;
    private final e.b G;
    private final i0 H;
    private l I;
    private h0 J;
    private p0 K;
    private IOException L;
    private Handler M;
    private v1.g N;
    private Uri O;
    private Uri P;
    private y2.c Q;
    private boolean R;
    private long S;
    private long T;
    private long U;
    private int V;
    private long W;
    private int X;

    /* renamed from: q  reason: collision with root package name */
    private final v1 f3500q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f3501r;

    /* renamed from: s  reason: collision with root package name */
    private final l.a f3502s;

    /* renamed from: t  reason: collision with root package name */
    private final a.InterfaceC0082a f3503t;

    /* renamed from: u  reason: collision with root package name */
    private final u2.h f3504u;

    /* renamed from: v  reason: collision with root package name */
    private final y f3505v;

    /* renamed from: w  reason: collision with root package name */
    private final g0 f3506w;

    /* renamed from: x  reason: collision with root package name */
    private final x2.b f3507x;

    /* renamed from: y  reason: collision with root package name */
    private final long f3508y;

    /* renamed from: z  reason: collision with root package name */
    private final b0.a f3509z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0082a f3510a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f3511b;

        /* renamed from: c  reason: collision with root package name */
        private w1.b0 f3512c;

        /* renamed from: d  reason: collision with root package name */
        private u2.h f3513d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f3514e;

        /* renamed from: f  reason: collision with root package name */
        private long f3515f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends y2.c> f3516g;

        public Factory(a.InterfaceC0082a interfaceC0082a, l.a aVar) {
            this.f3510a = (a.InterfaceC0082a) p3.a.e(interfaceC0082a);
            this.f3511b = aVar;
            this.f3512c = new w1.l();
            this.f3514e = new x();
            this.f3515f = 30000L;
            this.f3513d = new i();
        }

        public Factory(l.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(v1 v1Var) {
            p3.a.e(v1Var.f17603k);
            j0.a aVar = this.f3516g;
            if (aVar == null) {
                aVar = new y2.d();
            }
            List<t2.c> list = v1Var.f17603k.f17679d;
            return new DashMediaSource(v1Var, null, this.f3511b, !list.isEmpty() ? new t2.b(aVar, list) : aVar, this.f3510a, this.f3513d, this.f3512c.a(v1Var), this.f3514e, this.f3515f, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e0.b {
        a() {
        }

        @Override // p3.e0.b
        public void a() {
            DashMediaSource.this.b0(e0.h());
        }

        @Override // p3.e0.b
        public void b(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends y3 {

        /* renamed from: o  reason: collision with root package name */
        private final long f3518o;

        /* renamed from: p  reason: collision with root package name */
        private final long f3519p;

        /* renamed from: q  reason: collision with root package name */
        private final long f3520q;

        /* renamed from: r  reason: collision with root package name */
        private final int f3521r;

        /* renamed from: s  reason: collision with root package name */
        private final long f3522s;

        /* renamed from: t  reason: collision with root package name */
        private final long f3523t;

        /* renamed from: u  reason: collision with root package name */
        private final long f3524u;

        /* renamed from: v  reason: collision with root package name */
        private final y2.c f3525v;

        /* renamed from: w  reason: collision with root package name */
        private final v1 f3526w;

        /* renamed from: x  reason: collision with root package name */
        private final v1.g f3527x;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, y2.c cVar, v1 v1Var, v1.g gVar) {
            p3.a.f(cVar.f20385d == (gVar != null));
            this.f3518o = j10;
            this.f3519p = j11;
            this.f3520q = j12;
            this.f3521r = i10;
            this.f3522s = j13;
            this.f3523t = j14;
            this.f3524u = j15;
            this.f3525v = cVar;
            this.f3526w = v1Var;
            this.f3527x = gVar;
        }

        private long w(long j10) {
            x2.f l10;
            long j11 = this.f3524u;
            if (x(this.f3525v)) {
                if (j10 > 0) {
                    j11 += j10;
                    if (j11 > this.f3523t) {
                        return -9223372036854775807L;
                    }
                }
                long j12 = this.f3522s + j11;
                long g10 = this.f3525v.g(0);
                int i10 = 0;
                while (i10 < this.f3525v.e() - 1 && j12 >= g10) {
                    j12 -= g10;
                    i10++;
                    g10 = this.f3525v.g(i10);
                }
                y2.g d10 = this.f3525v.d(i10);
                int a10 = d10.a(2);
                return (a10 == -1 || (l10 = d10.f20419c.get(a10).f20374c.get(0).l()) == null || l10.i(g10) == 0) ? j11 : (j11 + l10.d(l10.a(j12, g10))) - j12;
            }
            return j11;
        }

        private static boolean x(y2.c cVar) {
            return cVar.f20385d && cVar.f20386e != -9223372036854775807L && cVar.f20383b == -9223372036854775807L;
        }

        @Override // s1.y3
        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f3521r) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        @Override // s1.y3
        public y3.b k(int i10, y3.b bVar, boolean z10) {
            p3.a.c(i10, 0, m());
            return bVar.u(z10 ? this.f3525v.d(i10).f20417a : null, z10 ? Integer.valueOf(this.f3521r + i10) : null, 0, this.f3525v.g(i10), n0.B0(this.f3525v.d(i10).f20418b - this.f3525v.d(0).f20418b) - this.f3522s);
        }

        @Override // s1.y3
        public int m() {
            return this.f3525v.e();
        }

        @Override // s1.y3
        public Object q(int i10) {
            p3.a.c(i10, 0, m());
            return Integer.valueOf(this.f3521r + i10);
        }

        @Override // s1.y3
        public y3.d s(int i10, y3.d dVar, long j10) {
            p3.a.c(i10, 0, 1);
            long w10 = w(j10);
            Object obj = y3.d.A;
            v1 v1Var = this.f3526w;
            y2.c cVar = this.f3525v;
            return dVar.h(obj, v1Var, cVar, this.f3518o, this.f3519p, this.f3520q, true, x(cVar), this.f3527x, w10, this.f3523t, 0, m() - 1, this.f3522s);
        }

        @Override // s1.y3
        public int t() {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    private final class c implements e.b {
        private c() {
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a() {
            DashMediaSource.this.U();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b(long j10) {
            DashMediaSource.this.T(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements j0.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f3529a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // o3.j0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, b5.d.f2950c)).readLine();
            try {
                Matcher matcher = f3529a.matcher(readLine);
                if (!matcher.matches()) {
                    throw u2.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw u2.c(null, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e implements h0.b<j0<y2.c>> {
        private e() {
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // o3.h0.b
        /* renamed from: a */
        public void i(j0<y2.c> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: b */
        public void o(j0<y2.c> j0Var, long j10, long j11) {
            DashMediaSource.this.W(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: c */
        public h0.c u(j0<y2.c> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(j0Var, j10, j11, iOException, i10);
        }
    }

    /* loaded from: classes.dex */
    final class f implements i0 {
        f() {
        }

        private void a() {
            if (DashMediaSource.this.L != null) {
                throw DashMediaSource.this.L;
            }
        }

        @Override // o3.i0
        public void b() {
            DashMediaSource.this.J.b();
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class g implements h0.b<j0<Long>> {
        private g() {
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // o3.h0.b
        /* renamed from: a */
        public void i(j0<Long> j0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: b */
        public void o(j0<Long> j0Var, long j10, long j11) {
            DashMediaSource.this.Y(j0Var, j10, j11);
        }

        @Override // o3.h0.b
        /* renamed from: c */
        public h0.c u(j0<Long> j0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(j0Var, j10, j11, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h implements j0.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // o3.j0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(n0.I0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        k1.a("goog.exo.dash");
    }

    private DashMediaSource(v1 v1Var, y2.c cVar, l.a aVar, j0.a<? extends y2.c> aVar2, a.InterfaceC0082a interfaceC0082a, u2.h hVar, y yVar, g0 g0Var, long j10) {
        this.f3500q = v1Var;
        this.N = v1Var.f17605m;
        this.O = ((v1.h) p3.a.e(v1Var.f17603k)).f17676a;
        this.P = v1Var.f17603k.f17676a;
        this.Q = cVar;
        this.f3502s = aVar;
        this.A = aVar2;
        this.f3503t = interfaceC0082a;
        this.f3505v = yVar;
        this.f3506w = g0Var;
        this.f3508y = j10;
        this.f3504u = hVar;
        this.f3507x = new x2.b();
        boolean z10 = cVar != null;
        this.f3501r = z10;
        this.f3509z = w(null);
        this.C = new Object();
        this.D = new SparseArray<>();
        this.G = new c(this, null);
        this.W = -9223372036854775807L;
        this.U = -9223372036854775807L;
        if (!z10) {
            this.B = new e(this, null);
            this.H = new f();
            this.E = new Runnable() { // from class: x2.d
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.i0();
                }
            };
            this.F = new Runnable() { // from class: x2.e
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.R();
                }
            };
            return;
        }
        p3.a.f(true ^ cVar.f20385d);
        this.B = null;
        this.E = null;
        this.F = null;
        this.H = new i0.a();
    }

    /* synthetic */ DashMediaSource(v1 v1Var, y2.c cVar, l.a aVar, j0.a aVar2, a.InterfaceC0082a interfaceC0082a, u2.h hVar, y yVar, g0 g0Var, long j10, a aVar3) {
        this(v1Var, cVar, aVar, aVar2, interfaceC0082a, hVar, yVar, g0Var, j10);
    }

    private static long L(y2.g gVar, long j10, long j11) {
        long B0 = n0.B0(gVar.f20418b);
        boolean P = P(gVar);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f20419c.size(); i10++) {
            y2.a aVar = gVar.f20419c.get(i10);
            List<j> list = aVar.f20374c;
            int i11 = aVar.f20373b;
            boolean z10 = true;
            z10 = (i11 == 1 || i11 == 2) ? false : false;
            if ((!P || !z10) && !list.isEmpty()) {
                x2.f l10 = list.get(0).l();
                if (l10 == null) {
                    return B0 + j10;
                }
                long j13 = l10.j(j10, j11);
                if (j13 == 0) {
                    return B0;
                }
                long c10 = (l10.c(j10, j11) + j13) - 1;
                j12 = Math.min(j12, l10.b(c10, j10) + l10.d(c10) + B0);
            }
        }
        return j12;
    }

    private static long M(y2.g gVar, long j10, long j11) {
        long B0 = n0.B0(gVar.f20418b);
        boolean P = P(gVar);
        long j12 = B0;
        for (int i10 = 0; i10 < gVar.f20419c.size(); i10++) {
            y2.a aVar = gVar.f20419c.get(i10);
            List<j> list = aVar.f20374c;
            int i11 = aVar.f20373b;
            boolean z10 = true;
            z10 = (i11 == 1 || i11 == 2) ? false : false;
            if ((!P || !z10) && !list.isEmpty()) {
                x2.f l10 = list.get(0).l();
                if (l10 == null || l10.j(j10, j11) == 0) {
                    return B0;
                }
                j12 = Math.max(j12, l10.d(l10.c(j10, j11)) + B0);
            }
        }
        return j12;
    }

    private static long N(y2.c cVar, long j10) {
        x2.f l10;
        int e10 = cVar.e() - 1;
        y2.g d10 = cVar.d(e10);
        long B0 = n0.B0(d10.f20418b);
        long g10 = cVar.g(e10);
        long B02 = n0.B0(j10);
        long B03 = n0.B0(cVar.f20382a);
        long B04 = n0.B0(5000L);
        for (int i10 = 0; i10 < d10.f20419c.size(); i10++) {
            List<j> list = d10.f20419c.get(i10).f20374c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long e11 = ((B03 + B0) + l10.e(g10, B02)) - B02;
                if (e11 < B04 - 100000 || (e11 > B04 && e11 < B04 + 100000)) {
                    B04 = e11;
                }
            }
        }
        return d5.c.b(B04, 1000L, RoundingMode.CEILING);
    }

    private long O() {
        return Math.min((this.V - 1) * 1000, 5000);
    }

    private static boolean P(y2.g gVar) {
        for (int i10 = 0; i10 < gVar.f20419c.size(); i10++) {
            int i11 = gVar.f20419c.get(i10).f20373b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(y2.g gVar) {
        for (int i10 = 0; i10 < gVar.f20419c.size(); i10++) {
            x2.f l10 = gVar.f20419c.get(i10).f20374c.get(0).l();
            if (l10 == null || l10.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        e0.j(this.J, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(IOException iOException) {
        r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j10) {
        this.U = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        y2.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            int keyAt = this.D.keyAt(i10);
            if (keyAt >= this.X) {
                this.D.valueAt(i10).M(this.Q, keyAt - this.X);
            }
        }
        y2.g d10 = this.Q.d(0);
        int e10 = this.Q.e() - 1;
        y2.g d11 = this.Q.d(e10);
        long g10 = this.Q.g(e10);
        long B0 = n0.B0(n0.a0(this.U));
        long M = M(d10, this.Q.g(0), B0);
        long L = L(d11, g10, B0);
        boolean z11 = this.Q.f20385d && !Q(d11);
        if (z11) {
            long j12 = this.Q.f20387f;
            if (j12 != -9223372036854775807L) {
                M = Math.max(M, L - n0.B0(j12));
            }
        }
        long j13 = L - M;
        y2.c cVar = this.Q;
        if (cVar.f20385d) {
            p3.a.f(cVar.f20382a != -9223372036854775807L);
            long B02 = (B0 - n0.B0(this.Q.f20382a)) - M;
            j0(B02, j13);
            long Y0 = this.Q.f20382a + n0.Y0(M);
            long B03 = B02 - n0.B0(this.N.f17666j);
            long min = Math.min(5000000L, j13 / 2);
            j10 = Y0;
            j11 = B03 < min ? min : B03;
            gVar = d10;
        } else {
            gVar = d10;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long B04 = M - n0.B0(gVar.f20418b);
        y2.c cVar2 = this.Q;
        D(new b(cVar2.f20382a, j10, this.U, this.X, B04, j13, j11, cVar2, this.f3500q, cVar2.f20385d ? this.N : null));
        if (this.f3501r) {
            return;
        }
        this.M.removeCallbacks(this.F);
        if (z11) {
            this.M.postDelayed(this.F, N(this.Q, n0.a0(this.U)));
        }
        if (this.R) {
            i0();
        } else if (z10) {
            y2.c cVar3 = this.Q;
            if (cVar3.f20385d) {
                long j14 = cVar3.f20386e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    g0(Math.max(0L, (this.S + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d0(o oVar) {
        j0.a<Long> dVar;
        String str = oVar.f20472a;
        if (n0.c(str, "urn:mpeg:dash:utc:direct:2014") || n0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
            return;
        }
        if (n0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || n0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else if (!n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !n0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            if (n0.c(str, "urn:mpeg:dash:utc:ntp:2014") || n0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                S();
                return;
            } else {
                a0(new IOException("Unsupported UTC timing scheme"));
                return;
            }
        } else {
            dVar = new h(null);
        }
        f0(oVar, dVar);
    }

    private void e0(o oVar) {
        try {
            b0(n0.I0(oVar.f20473b) - this.T);
        } catch (u2 e10) {
            a0(e10);
        }
    }

    private void f0(o oVar, j0.a<Long> aVar) {
        h0(new j0(this.I, Uri.parse(oVar.f20473b), 5, aVar), new g(this, null), 1);
    }

    private void g0(long j10) {
        this.M.postDelayed(this.E, j10);
    }

    private <T> void h0(j0<T> j0Var, h0.b<j0<T>> bVar, int i10) {
        this.f3509z.z(new n(j0Var.f14474a, j0Var.f14475b, this.J.n(j0Var, bVar, i10)), j0Var.f14476c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        Uri uri;
        this.M.removeCallbacks(this.E);
        if (this.J.i()) {
            return;
        }
        if (this.J.j()) {
            this.R = true;
            return;
        }
        synchronized (this.C) {
            uri = this.O;
        }
        this.R = false;
        h0(new j0(this.I, uri, 4, this.A), this.B, this.f3506w.d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1 != (-9223372036854775807L)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1 != (-9223372036854775807L)) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.K = p0Var;
        this.f3505v.e(Looper.myLooper(), A());
        this.f3505v.b();
        if (this.f3501r) {
            c0(false);
            return;
        }
        this.I = this.f3502s.a();
        this.J = new h0("DashMediaSource");
        this.M = n0.w();
        i0();
    }

    @Override // u2.a
    protected void E() {
        this.R = false;
        this.I = null;
        h0 h0Var = this.J;
        if (h0Var != null) {
            h0Var.l();
            this.J = null;
        }
        this.S = 0L;
        this.T = 0L;
        this.Q = this.f3501r ? this.Q : null;
        this.O = this.P;
        this.L = null;
        Handler handler = this.M;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.M = null;
        }
        this.U = -9223372036854775807L;
        this.V = 0;
        this.W = -9223372036854775807L;
        this.X = 0;
        this.D.clear();
        this.f3507x.i();
        this.f3505v.a();
    }

    void T(long j10) {
        long j11 = this.W;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.W = j10;
        }
    }

    void U() {
        this.M.removeCallbacks(this.F);
        i0();
    }

    void V(j0<?> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f3506w.a(j0Var.f14474a);
        this.f3509z.q(nVar, j0Var.f14476c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void W(o3.j0<y2.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.W(o3.j0, long, long):void");
    }

    h0.c X(j0<y2.c> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.f3506w.b(new g0.c(nVar, new q(j0Var.f14476c), iOException, i10));
        h0.c h10 = b10 == -9223372036854775807L ? h0.f14453g : h0.h(false, b10);
        boolean z10 = !h10.c();
        this.f3509z.x(nVar, j0Var.f14476c, iOException, z10);
        if (z10) {
            this.f3506w.a(j0Var.f14474a);
        }
        return h10;
    }

    void Y(j0<Long> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f3506w.a(j0Var.f14474a);
        this.f3509z.t(nVar, j0Var.f14476c);
        b0(j0Var.e().longValue() - j10);
    }

    h0.c Z(j0<Long> j0Var, long j10, long j11, IOException iOException) {
        this.f3509z.x(new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a()), j0Var.f14476c, iOException, true);
        this.f3506w.a(j0Var.f14474a);
        a0(iOException);
        return h0.f14452f;
    }

    @Override // u2.u
    public v1 a() {
        return this.f3500q;
    }

    @Override // u2.u
    public void b(u2.r rVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) rVar;
        bVar.I();
        this.D.remove(bVar.f3533j);
    }

    @Override // u2.u
    public void f() {
        this.H.b();
    }

    @Override // u2.u
    public u2.r n(u.b bVar, o3.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f18969a).intValue() - this.X;
        b0.a x10 = x(bVar, this.Q.d(intValue).f20418b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.X, this.Q, this.f3507x, intValue, this.f3503t, this.K, this.f3505v, t(bVar), this.f3506w, x10, this.U, this.H, bVar2, this.f3504u, this.G, A());
        this.D.put(bVar3.f3533j, bVar3);
        return bVar3;
    }
}
