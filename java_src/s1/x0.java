package s1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p3.q;
import r3.d;
import s1.b;
import s1.c3;
import s1.d;
import s1.g3;
import s1.j1;
import s1.s;
import s1.t2;
import s1.t3;
import s1.x0;
import s1.y3;
import u2.p0;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x0 extends s1.e implements s {
    private final s1.d A;
    private final t3 B;
    private final e4 C;
    private final f4 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private q3 L;
    private u2.p0 M;
    private boolean N;
    private c3.b O;
    private a2 P;
    private a2 Q;
    private n1 R;
    private n1 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private r3.d X;
    private boolean Y;
    private TextureView Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f17723a0;

    /* renamed from: b  reason: collision with root package name */
    final n3.d0 f17724b;

    /* renamed from: b0  reason: collision with root package name */
    private int f17725b0;

    /* renamed from: c  reason: collision with root package name */
    final c3.b f17726c;

    /* renamed from: c0  reason: collision with root package name */
    private p3.d0 f17727c0;

    /* renamed from: d  reason: collision with root package name */
    private final p3.g f17728d;

    /* renamed from: d0  reason: collision with root package name */
    private v1.e f17729d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f17730e;

    /* renamed from: e0  reason: collision with root package name */
    private v1.e f17731e0;

    /* renamed from: f  reason: collision with root package name */
    private final c3 f17732f;

    /* renamed from: f0  reason: collision with root package name */
    private int f17733f0;

    /* renamed from: g  reason: collision with root package name */
    private final l3[] f17734g;

    /* renamed from: g0  reason: collision with root package name */
    private u1.e f17735g0;

    /* renamed from: h  reason: collision with root package name */
    private final n3.c0 f17736h;

    /* renamed from: h0  reason: collision with root package name */
    private float f17737h0;

    /* renamed from: i  reason: collision with root package name */
    private final p3.n f17738i;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f17739i0;

    /* renamed from: j  reason: collision with root package name */
    private final j1.f f17740j;

    /* renamed from: j0  reason: collision with root package name */
    private d3.e f17741j0;

    /* renamed from: k  reason: collision with root package name */
    private final j1 f17742k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f17743k0;

    /* renamed from: l  reason: collision with root package name */
    private final p3.q<c3.d> f17744l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f17745l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet<s.a> f17746m;

    /* renamed from: m0  reason: collision with root package name */
    private p3.c0 f17747m0;

    /* renamed from: n  reason: collision with root package name */
    private final y3.b f17748n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f17749n0;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f17750o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f17751o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f17752p;

    /* renamed from: p0  reason: collision with root package name */
    private o f17753p0;

    /* renamed from: q  reason: collision with root package name */
    private final u.a f17754q;

    /* renamed from: q0  reason: collision with root package name */
    private q3.z f17755q0;

    /* renamed from: r  reason: collision with root package name */
    private final t1.a f17756r;

    /* renamed from: r0  reason: collision with root package name */
    private a2 f17757r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f17758s;

    /* renamed from: s0  reason: collision with root package name */
    private z2 f17759s0;

    /* renamed from: t  reason: collision with root package name */
    private final o3.f f17760t;

    /* renamed from: t0  reason: collision with root package name */
    private int f17761t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f17762u;

    /* renamed from: u0  reason: collision with root package name */
    private int f17763u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f17764v;

    /* renamed from: v0  reason: collision with root package name */
    private long f17765v0;

    /* renamed from: w  reason: collision with root package name */
    private final p3.d f17766w;

    /* renamed from: x  reason: collision with root package name */
    private final c f17767x;

    /* renamed from: y  reason: collision with root package name */
    private final d f17768y;

    /* renamed from: z  reason: collision with root package name */
    private final s1.b f17769z;

    /* loaded from: classes.dex */
    private static final class b {
        public static t1.t1 a(Context context, x0 x0Var, boolean z10) {
            t1.r1 A0 = t1.r1.A0(context);
            if (A0 == null) {
                p3.r.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new t1.t1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                x0Var.O0(A0);
            }
            return new t1.t1(A0.H0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements q3.x, u1.t, d3.n, k2.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, d.a, d.b, b.InterfaceC0253b, t3.b, s.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(c3.d dVar) {
            dVar.R(x0.this.P);
        }

        @Override // s1.t3.b
        public void A(final int i10, final boolean z10) {
            x0.this.f17744l.k(30, new q.a() { // from class: s1.y0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).o0(i10, z10);
                }
            });
        }

        @Override // s1.t3.b
        public void B(int i10) {
            final o S0 = x0.S0(x0.this.B);
            if (S0.equals(x0.this.f17753p0)) {
                return;
            }
            x0.this.f17753p0 = S0;
            x0.this.f17744l.k(29, new q.a() { // from class: s1.d1
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).l0(o.this);
                }
            });
        }

        @Override // s1.s.a
        public /* synthetic */ void C(boolean z10) {
            r.a(this, z10);
        }

        @Override // q3.x
        public /* synthetic */ void D(n1 n1Var) {
            q3.m.a(this, n1Var);
        }

        @Override // s1.b.InterfaceC0253b
        public void E() {
            x0.this.Y1(false, -1, 3);
        }

        @Override // s1.s.a
        public void F(boolean z10) {
            x0.this.b2();
        }

        @Override // s1.d.b
        public void G(float f10) {
            x0.this.P1();
        }

        @Override // s1.d.b
        public void a(int i10) {
            boolean n10 = x0.this.n();
            x0.this.Y1(n10, i10, x0.c1(n10, i10));
        }

        @Override // u1.t
        public void b(final boolean z10) {
            if (x0.this.f17739i0 == z10) {
                return;
            }
            x0.this.f17739i0 = z10;
            x0.this.f17744l.k(23, new q.a() { // from class: s1.f1
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).b(z10);
                }
            });
        }

        @Override // u1.t
        public void c(Exception exc) {
            x0.this.f17756r.c(exc);
        }

        @Override // d3.n
        public void d(final d3.e eVar) {
            x0.this.f17741j0 = eVar;
            x0.this.f17744l.k(27, new q.a() { // from class: s1.z0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).d(d3.e.this);
                }
            });
        }

        @Override // q3.x
        public void e(String str) {
            x0.this.f17756r.e(str);
        }

        @Override // q3.x
        public void f(Object obj, long j10) {
            x0.this.f17756r.f(obj, j10);
            if (x0.this.U == obj) {
                x0.this.f17744l.k(26, new q.a() { // from class: s1.g1
                    @Override // p3.q.a
                    public final void invoke(Object obj2) {
                        ((c3.d) obj2).L();
                    }
                });
            }
        }

        @Override // q3.x
        public void g(String str, long j10, long j11) {
            x0.this.f17756r.g(str, j10, j11);
        }

        @Override // u1.t
        public void h(v1.e eVar) {
            x0.this.f17731e0 = eVar;
            x0.this.f17756r.h(eVar);
        }

        @Override // d3.n
        public void i(final List<d3.b> list) {
            x0.this.f17744l.k(27, new q.a() { // from class: s1.a1
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).i(list);
                }
            });
        }

        @Override // u1.t
        public void j(long j10) {
            x0.this.f17756r.j(j10);
        }

        @Override // u1.t
        public void k(Exception exc) {
            x0.this.f17756r.k(exc);
        }

        @Override // r3.d.a
        public void l(Surface surface) {
            x0.this.U1(null);
        }

        @Override // q3.x
        public void m(Exception exc) {
            x0.this.f17756r.m(exc);
        }

        @Override // u1.t
        public void n(v1.e eVar) {
            x0.this.f17756r.n(eVar);
            x0.this.S = null;
            x0.this.f17731e0 = null;
        }

        @Override // q3.x
        public void o(final q3.z zVar) {
            x0.this.f17755q0 = zVar;
            x0.this.f17744l.k(25, new q.a() { // from class: s1.c1
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).o(q3.z.this);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.T1(surfaceTexture);
            x0.this.J1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x0.this.U1(null);
            x0.this.J1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.J1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // u1.t
        public /* synthetic */ void p(n1 n1Var) {
            u1.i.a(this, n1Var);
        }

        @Override // u1.t
        public void q(String str) {
            x0.this.f17756r.q(str);
        }

        @Override // u1.t
        public void r(String str, long j10, long j11) {
            x0.this.f17756r.r(str, j10, j11);
        }

        @Override // u1.t
        public void s(n1 n1Var, v1.i iVar) {
            x0.this.S = n1Var;
            x0.this.f17756r.s(n1Var, iVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            x0.this.J1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (x0.this.Y) {
                x0.this.U1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (x0.this.Y) {
                x0.this.U1(null);
            }
            x0.this.J1(0, 0);
        }

        @Override // q3.x
        public void t(v1.e eVar) {
            x0.this.f17756r.t(eVar);
            x0.this.R = null;
            x0.this.f17729d0 = null;
        }

        @Override // u1.t
        public void u(int i10, long j10, long j11) {
            x0.this.f17756r.u(i10, j10, j11);
        }

        @Override // q3.x
        public void v(int i10, long j10) {
            x0.this.f17756r.v(i10, j10);
        }

        @Override // q3.x
        public void w(n1 n1Var, v1.i iVar) {
            x0.this.R = n1Var;
            x0.this.f17756r.w(n1Var, iVar);
        }

        @Override // k2.f
        public void x(final k2.a aVar) {
            x0 x0Var = x0.this;
            x0Var.f17757r0 = x0Var.f17757r0.b().L(aVar).H();
            a2 R0 = x0.this.R0();
            if (!R0.equals(x0.this.P)) {
                x0.this.P = R0;
                x0.this.f17744l.i(14, new q.a() { // from class: s1.e1
                    @Override // p3.q.a
                    public final void invoke(Object obj) {
                        x0.c.this.R((c3.d) obj);
                    }
                });
            }
            x0.this.f17744l.i(28, new q.a() { // from class: s1.b1
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).x(k2.a.this);
                }
            });
            x0.this.f17744l.f();
        }

        @Override // q3.x
        public void y(long j10, int i10) {
            x0.this.f17756r.y(j10, i10);
        }

        @Override // q3.x
        public void z(v1.e eVar) {
            x0.this.f17729d0 = eVar;
            x0.this.f17756r.z(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements q3.j, r3.a, g3.b {

        /* renamed from: j  reason: collision with root package name */
        private q3.j f17771j;

        /* renamed from: k  reason: collision with root package name */
        private r3.a f17772k;

        /* renamed from: l  reason: collision with root package name */
        private q3.j f17773l;

        /* renamed from: m  reason: collision with root package name */
        private r3.a f17774m;

        private d() {
        }

        @Override // r3.a
        public void a(long j10, float[] fArr) {
            r3.a aVar = this.f17774m;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            r3.a aVar2 = this.f17772k;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // r3.a
        public void c() {
            r3.a aVar = this.f17774m;
            if (aVar != null) {
                aVar.c();
            }
            r3.a aVar2 = this.f17772k;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // q3.j
        public void g(long j10, long j11, n1 n1Var, MediaFormat mediaFormat) {
            q3.j jVar = this.f17773l;
            if (jVar != null) {
                jVar.g(j10, j11, n1Var, mediaFormat);
            }
            q3.j jVar2 = this.f17771j;
            if (jVar2 != null) {
                jVar2.g(j10, j11, n1Var, mediaFormat);
            }
        }

        @Override // s1.g3.b
        public void m(int i10, Object obj) {
            r3.a cameraMotionListener;
            if (i10 == 7) {
                this.f17771j = (q3.j) obj;
            } else if (i10 == 8) {
                this.f17772k = (r3.a) obj;
            } else if (i10 != 10000) {
            } else {
                r3.d dVar = (r3.d) obj;
                if (dVar == null) {
                    cameraMotionListener = null;
                    this.f17773l = null;
                } else {
                    this.f17773l = dVar.getVideoFrameMetadataListener();
                    cameraMotionListener = dVar.getCameraMotionListener();
                }
                this.f17774m = cameraMotionListener;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements f2 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f17775a;

        /* renamed from: b  reason: collision with root package name */
        private y3 f17776b;

        public e(Object obj, y3 y3Var) {
            this.f17775a = obj;
            this.f17776b = y3Var;
        }

        @Override // s1.f2
        public Object a() {
            return this.f17775a;
        }

        @Override // s1.f2
        public y3 b() {
            return this.f17776b;
        }
    }

    static {
        k1.a("goog.exo.exoplayer");
    }

    public x0(s.b bVar, c3 c3Var) {
        p3.g gVar = new p3.g();
        this.f17728d = gVar;
        try {
            p3.r.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + p3.n0.f15401e + "]");
            Context applicationContext = bVar.f17515a.getApplicationContext();
            this.f17730e = applicationContext;
            t1.a apply = bVar.f17523i.apply(bVar.f17516b);
            this.f17756r = apply;
            this.f17747m0 = bVar.f17525k;
            this.f17735g0 = bVar.f17526l;
            this.f17723a0 = bVar.f17531q;
            this.f17725b0 = bVar.f17532r;
            this.f17739i0 = bVar.f17530p;
            this.E = bVar.f17539y;
            c cVar = new c();
            this.f17767x = cVar;
            d dVar = new d();
            this.f17768y = dVar;
            Handler handler = new Handler(bVar.f17524j);
            l3[] a10 = bVar.f17518d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f17734g = a10;
            p3.a.f(a10.length > 0);
            n3.c0 c0Var = bVar.f17520f.get();
            this.f17736h = c0Var;
            this.f17754q = bVar.f17519e.get();
            o3.f fVar = bVar.f17522h.get();
            this.f17760t = fVar;
            this.f17752p = bVar.f17533s;
            this.L = bVar.f17534t;
            this.f17762u = bVar.f17535u;
            this.f17764v = bVar.f17536v;
            this.N = bVar.f17540z;
            Looper looper = bVar.f17524j;
            this.f17758s = looper;
            p3.d dVar2 = bVar.f17516b;
            this.f17766w = dVar2;
            x0 x0Var = c3Var == null ? this : c3Var;
            this.f17732f = x0Var;
            this.f17744l = new p3.q<>(looper, dVar2, new q.b() { // from class: s1.n0
                @Override // p3.q.b
                public final void a(Object obj, p3.l lVar) {
                    x0.this.l1((c3.d) obj, lVar);
                }
            });
            this.f17746m = new CopyOnWriteArraySet<>();
            this.f17750o = new ArrayList();
            this.M = new p0.a(0);
            n3.d0 d0Var = new n3.d0(new o3[a10.length], new n3.t[a10.length], d4.f17167k, null);
            this.f17724b = d0Var;
            this.f17748n = new y3.b();
            c3.b e10 = new c3.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, c0Var.d()).e();
            this.f17726c = e10;
            this.O = new c3.b.a().b(e10).a(4).a(10).e();
            this.f17738i = dVar2.c(looper, null);
            j1.f fVar2 = new j1.f() { // from class: s1.o0
                @Override // s1.j1.f
                public final void a(j1.e eVar) {
                    x0.this.n1(eVar);
                }
            };
            this.f17740j = fVar2;
            this.f17759s0 = z2.j(d0Var);
            apply.H(x0Var, looper);
            int i10 = p3.n0.f15397a;
            j1 j1Var = new j1(a10, c0Var, d0Var, bVar.f17521g.get(), fVar, this.F, this.G, apply, this.L, bVar.f17537w, bVar.f17538x, this.N, looper, dVar2, fVar2, i10 < 31 ? new t1.t1() : b.a(applicationContext, this, bVar.A), bVar.B);
            this.f17742k = j1Var;
            this.f17737h0 = 1.0f;
            this.F = 0;
            a2 a2Var = a2.R;
            this.P = a2Var;
            this.Q = a2Var;
            this.f17757r0 = a2Var;
            this.f17761t0 = -1;
            this.f17733f0 = i10 < 21 ? i1(0) : p3.n0.F(applicationContext);
            this.f17741j0 = d3.e.f7706l;
            this.f17743k0 = true;
            k(apply);
            fVar.i(new Handler(looper), apply);
            P0(cVar);
            long j10 = bVar.f17517c;
            if (j10 > 0) {
                j1Var.v(j10);
            }
            s1.b bVar2 = new s1.b(bVar.f17515a, handler, cVar);
            this.f17769z = bVar2;
            bVar2.b(bVar.f17529o);
            s1.d dVar3 = new s1.d(bVar.f17515a, handler, cVar);
            this.A = dVar3;
            dVar3.m(bVar.f17527m ? this.f17735g0 : null);
            t3 t3Var = new t3(bVar.f17515a, handler, cVar);
            this.B = t3Var;
            t3Var.h(p3.n0.f0(this.f17735g0.f18574l));
            e4 e4Var = new e4(bVar.f17515a);
            this.C = e4Var;
            e4Var.a(bVar.f17528n != 0);
            f4 f4Var = new f4(bVar.f17515a);
            this.D = f4Var;
            f4Var.a(bVar.f17528n == 2);
            this.f17753p0 = S0(t3Var);
            this.f17755q0 = q3.z.f16157n;
            this.f17727c0 = p3.d0.f15343c;
            c0Var.h(this.f17735g0);
            O1(1, 10, Integer.valueOf(this.f17733f0));
            O1(2, 10, Integer.valueOf(this.f17733f0));
            O1(1, 3, this.f17735g0);
            O1(2, 4, Integer.valueOf(this.f17723a0));
            O1(2, 5, Integer.valueOf(this.f17725b0));
            O1(1, 9, Boolean.valueOf(this.f17739i0));
            O1(2, 7, dVar);
            O1(6, 8, dVar);
            gVar.e();
        } catch (Throwable th) {
            this.f17728d.e();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A1(z2 z2Var, c3.d dVar) {
        dVar.D(z2Var.f17842g);
        dVar.K(z2Var.f17842g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B1(z2 z2Var, c3.d dVar) {
        dVar.B(z2Var.f17847l, z2Var.f17840e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C1(z2 z2Var, c3.d dVar) {
        dVar.W(z2Var.f17840e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D1(z2 z2Var, int i10, c3.d dVar) {
        dVar.X(z2Var.f17847l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E1(z2 z2Var, c3.d dVar) {
        dVar.A(z2Var.f17848m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1(z2 z2Var, c3.d dVar) {
        dVar.p0(j1(z2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G1(z2 z2Var, c3.d dVar) {
        dVar.p(z2Var.f17849n);
    }

    private z2 H1(z2 z2Var, y3 y3Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        p3.a.a(y3Var.u() || pair != null);
        y3 y3Var2 = z2Var.f17836a;
        z2 i11 = z2Var.i(y3Var);
        if (y3Var.u()) {
            u.b k10 = z2.k();
            long B0 = p3.n0.B0(this.f17765v0);
            z2 b10 = i11.c(k10, B0, B0, B0, 0L, u2.v0.f18988m, this.f17724b, com.google.common.collect.q.z()).b(k10);
            b10.f17851p = b10.f17853r;
            return b10;
        }
        Object obj = i11.f17837b.f18969a;
        boolean z10 = !obj.equals(((Pair) p3.n0.j(pair)).first);
        u.b bVar = z10 ? new u.b(pair.first) : i11.f17837b;
        long longValue = ((Long) pair.second).longValue();
        long B02 = p3.n0.B0(j());
        if (!y3Var2.u()) {
            B02 -= y3Var2.l(obj, this.f17748n).q();
        }
        if (z10 || longValue < B02) {
            p3.a.f(!bVar.b());
            z2 b11 = i11.c(bVar, longValue, longValue, longValue, 0L, z10 ? u2.v0.f18988m : i11.f17843h, z10 ? this.f17724b : i11.f17844i, z10 ? com.google.common.collect.q.z() : i11.f17845j).b(bVar);
            b11.f17851p = longValue;
            return b11;
        }
        if (i10 == 0) {
            int f10 = y3Var.f(i11.f17846k.f18969a);
            if (f10 == -1 || y3Var.j(f10, this.f17748n).f17805l != y3Var.l(bVar.f18969a, this.f17748n).f17805l) {
                y3Var.l(bVar.f18969a, this.f17748n);
                j10 = bVar.b() ? this.f17748n.e(bVar.f18970b, bVar.f18971c) : this.f17748n.f17806m;
                i11 = i11.c(bVar, i11.f17853r, i11.f17853r, i11.f17839d, j10 - i11.f17853r, i11.f17843h, i11.f17844i, i11.f17845j).b(bVar);
            }
            return i11;
        }
        p3.a.f(!bVar.b());
        long max = Math.max(0L, i11.f17852q - (longValue - B02));
        j10 = i11.f17851p;
        if (i11.f17846k.equals(i11.f17837b)) {
            j10 = longValue + max;
        }
        i11 = i11.c(bVar, longValue, longValue, longValue, max, i11.f17843h, i11.f17844i, i11.f17845j);
        i11.f17851p = j10;
        return i11;
    }

    private Pair<Object, Long> I1(y3 y3Var, int i10, long j10) {
        if (y3Var.u()) {
            this.f17761t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f17765v0 = j10;
            this.f17763u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= y3Var.t()) {
            i10 = y3Var.e(this.G);
            j10 = y3Var.r(i10, this.f17181a).d();
        }
        return y3Var.n(this.f17181a, this.f17748n, i10, p3.n0.B0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(final int i10, final int i11) {
        if (i10 == this.f17727c0.b() && i11 == this.f17727c0.a()) {
            return;
        }
        this.f17727c0 = new p3.d0(i10, i11);
        this.f17744l.k(24, new q.a() { // from class: s1.q0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c3.d) obj).h0(i10, i11);
            }
        });
    }

    private long K1(y3 y3Var, u.b bVar, long j10) {
        y3Var.l(bVar.f18969a, this.f17748n);
        return j10 + this.f17748n.q();
    }

    private z2 L1(int i10, int i11) {
        int v10 = v();
        y3 E = E();
        int size = this.f17750o.size();
        boolean z10 = true;
        this.H++;
        M1(i10, i11);
        y3 T0 = T0();
        z2 H1 = H1(this.f17759s0, T0, b1(E, T0));
        int i12 = H1.f17840e;
        if ((i12 == 1 || i12 == 4 || i10 >= i11 || i11 != size || v10 < H1.f17836a.t()) ? false : false) {
            H1 = H1.g(4);
        }
        this.f17742k.o0(i10, i11, this.M);
        return H1;
    }

    private void M1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f17750o.remove(i12);
        }
        this.M = this.M.b(i10, i11);
    }

    private void N1() {
        if (this.X != null) {
            U0(this.f17768y).n(10000).m(null).l();
            this.X.d(this.f17767x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f17767x) {
                p3.r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f17767x);
            this.W = null;
        }
    }

    private void O1(int i10, int i11, Object obj) {
        l3[] l3VarArr;
        for (l3 l3Var : this.f17734g) {
            if (l3Var.h() == i10) {
                U0(l3Var).n(i11).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1() {
        O1(1, 2, Float.valueOf(this.f17737h0 * this.A.g()));
    }

    private List<t2.c> Q0(int i10, List<u2.u> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            t2.c cVar = new t2.c(list.get(i11), this.f17752p);
            arrayList.add(cVar);
            this.f17750o.add(i11 + i10, new e(cVar.f17574b, cVar.f17573a.Z()));
        }
        this.M = this.M.d(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a2 R0() {
        y3 E = E();
        if (E.u()) {
            return this.f17757r0;
        }
        return this.f17757r0.b().J(E.r(v(), this.f17181a).f17816l.f17606n).H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o S0(t3 t3Var) {
        return new o(0, t3Var.d(), t3Var.c());
    }

    private void S1(List<u2.u> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int a12 = a1();
        long H = H();
        boolean z11 = true;
        this.H++;
        if (!this.f17750o.isEmpty()) {
            M1(0, this.f17750o.size());
        }
        List<t2.c> Q0 = Q0(0, list);
        y3 T0 = T0();
        if (!T0.u() && i10 >= T0.t()) {
            throw new r1(T0, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = T0.e(this.G);
        } else if (i10 == -1) {
            i11 = a12;
            j11 = H;
        } else {
            i11 = i10;
            j11 = j10;
        }
        z2 H1 = H1(this.f17759s0, T0, I1(T0, i11, j11));
        int i12 = H1.f17840e;
        if (i11 != -1 && i12 != 1) {
            i12 = (T0.u() || i11 >= T0.t()) ? 4 : 2;
        }
        z2 g10 = H1.g(i12);
        this.f17742k.O0(Q0, i11, p3.n0.B0(j11), this.M);
        Z1(g10, 0, 1, false, (this.f17759s0.f17837b.f18969a.equals(g10.f17837b.f18969a) || this.f17759s0.f17836a.u()) ? false : false, 4, Z0(g10), -1, false);
    }

    private y3 T0() {
        return new h3(this.f17750o, this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        U1(surface);
        this.V = surface;
    }

    private g3 U0(g3.b bVar) {
        int a12 = a1();
        j1 j1Var = this.f17742k;
        return new g3(j1Var, bVar, this.f17759s0.f17836a, a12 == -1 ? 0 : a12, this.f17766w, j1Var.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(Object obj) {
        boolean z10;
        ArrayList<g3> arrayList = new ArrayList();
        l3[] l3VarArr = this.f17734g;
        int length = l3VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            l3 l3Var = l3VarArr[i10];
            if (l3Var.h() == 2) {
                arrayList.add(U0(l3Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (g3 g3Var : arrayList) {
                    g3Var.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            W1(false, q.i(new l1(3), 1003));
        }
    }

    private Pair<Boolean, Integer> V0(z2 z2Var, z2 z2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        y3 y3Var = z2Var2.f17836a;
        y3 y3Var2 = z2Var.f17836a;
        if (y3Var2.u() && y3Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (y3Var2.u() != y3Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (y3Var.r(y3Var.l(z2Var2.f17837b.f18969a, this.f17748n).f17805l, this.f17181a).f17814j.equals(y3Var2.r(y3Var2.l(z2Var.f17837b.f18969a, this.f17748n).f17805l, this.f17181a).f17814j)) {
            return (z10 && i10 == 0 && z2Var2.f17837b.f18972d < z2Var.f17837b.f18972d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void W1(boolean z10, q qVar) {
        z2 b10;
        if (z10) {
            b10 = L1(0, this.f17750o.size()).e(null);
        } else {
            z2 z2Var = this.f17759s0;
            b10 = z2Var.b(z2Var.f17837b);
            b10.f17851p = b10.f17853r;
            b10.f17852q = 0L;
        }
        z2 g10 = b10.g(1);
        if (qVar != null) {
            g10 = g10.e(qVar);
        }
        z2 z2Var2 = g10;
        this.H++;
        this.f17742k.h1();
        Z1(z2Var2, 0, 1, false, z2Var2.f17836a.u() && !this.f17759s0.f17836a.u(), 4, Z0(z2Var2), -1, false);
    }

    private void X1() {
        c3.b bVar = this.O;
        c3.b H = p3.n0.H(this.f17732f, this.f17726c);
        this.O = H;
        if (H.equals(bVar)) {
            return;
        }
        this.f17744l.i(13, new q.a() { // from class: s1.s0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                x0.this.s1((c3.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        z2 z2Var = this.f17759s0;
        if (z2Var.f17847l == z11 && z2Var.f17848m == i12) {
            return;
        }
        this.H++;
        z2 d10 = z2Var.d(z11, i12);
        this.f17742k.R0(z11, i12);
        Z1(d10, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    private long Z0(z2 z2Var) {
        return z2Var.f17836a.u() ? p3.n0.B0(this.f17765v0) : z2Var.f17837b.b() ? z2Var.f17853r : K1(z2Var.f17836a, z2Var.f17837b, z2Var.f17853r);
    }

    private void Z1(final z2 z2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        z2 z2Var2 = this.f17759s0;
        this.f17759s0 = z2Var;
        boolean z13 = !z2Var2.f17836a.equals(z2Var.f17836a);
        Pair<Boolean, Integer> V0 = V0(z2Var, z2Var2, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) V0.first).booleanValue();
        final int intValue = ((Integer) V0.second).intValue();
        a2 a2Var = this.P;
        if (booleanValue) {
            r3 = z2Var.f17836a.u() ? null : z2Var.f17836a.r(z2Var.f17836a.l(z2Var.f17837b.f18969a, this.f17748n).f17805l, this.f17181a).f17816l;
            this.f17757r0 = a2.R;
        }
        if (booleanValue || !z2Var2.f17845j.equals(z2Var.f17845j)) {
            this.f17757r0 = this.f17757r0.b().K(z2Var.f17845j).H();
            a2Var = R0();
        }
        boolean z14 = !a2Var.equals(this.P);
        this.P = a2Var;
        boolean z15 = z2Var2.f17847l != z2Var.f17847l;
        boolean z16 = z2Var2.f17840e != z2Var.f17840e;
        if (z16 || z15) {
            b2();
        }
        boolean z17 = z2Var2.f17842g;
        boolean z18 = z2Var.f17842g;
        boolean z19 = z17 != z18;
        if (z19) {
            a2(z18);
        }
        if (z13) {
            this.f17744l.i(0, new q.a() { // from class: s1.h0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.t1(z2.this, i10, (c3.d) obj);
                }
            });
        }
        if (z11) {
            final c3.e f12 = f1(i12, z2Var2, i13);
            final c3.e e12 = e1(j10);
            this.f17744l.i(11, new q.a() { // from class: s1.r0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.u1(i12, f12, e12, (c3.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f17744l.i(1, new q.a() { // from class: s1.t0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).i0(v1.this, intValue);
                }
            });
        }
        if (z2Var2.f17841f != z2Var.f17841f) {
            this.f17744l.i(10, new q.a() { // from class: s1.v0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.w1(z2.this, (c3.d) obj);
                }
            });
            if (z2Var.f17841f != null) {
                this.f17744l.i(10, new q.a() { // from class: s1.e0
                    @Override // p3.q.a
                    public final void invoke(Object obj) {
                        x0.x1(z2.this, (c3.d) obj);
                    }
                });
            }
        }
        n3.d0 d0Var = z2Var2.f17844i;
        n3.d0 d0Var2 = z2Var.f17844i;
        if (d0Var != d0Var2) {
            this.f17736h.e(d0Var2.f14158e);
            this.f17744l.i(2, new q.a() { // from class: s1.a0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.y1(z2.this, (c3.d) obj);
                }
            });
        }
        if (z14) {
            final a2 a2Var2 = this.P;
            this.f17744l.i(14, new q.a() { // from class: s1.u0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).R(a2.this);
                }
            });
        }
        if (z19) {
            this.f17744l.i(3, new q.a() { // from class: s1.g0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.A1(z2.this, (c3.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f17744l.i(-1, new q.a() { // from class: s1.f0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.B1(z2.this, (c3.d) obj);
                }
            });
        }
        if (z16) {
            this.f17744l.i(4, new q.a() { // from class: s1.w0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.C1(z2.this, (c3.d) obj);
                }
            });
        }
        if (z15) {
            this.f17744l.i(5, new q.a() { // from class: s1.i0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.D1(z2.this, i11, (c3.d) obj);
                }
            });
        }
        if (z2Var2.f17848m != z2Var.f17848m) {
            this.f17744l.i(6, new q.a() { // from class: s1.b0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.E1(z2.this, (c3.d) obj);
                }
            });
        }
        if (j1(z2Var2) != j1(z2Var)) {
            this.f17744l.i(7, new q.a() { // from class: s1.d0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.F1(z2.this, (c3.d) obj);
                }
            });
        }
        if (!z2Var2.f17849n.equals(z2Var.f17849n)) {
            this.f17744l.i(12, new q.a() { // from class: s1.c0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.G1(z2.this, (c3.d) obj);
                }
            });
        }
        if (z10) {
            this.f17744l.i(-1, new q.a() { // from class: s1.m0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).M();
                }
            });
        }
        X1();
        this.f17744l.f();
        if (z2Var2.f17850o != z2Var.f17850o) {
            Iterator<s.a> it = this.f17746m.iterator();
            while (it.hasNext()) {
                it.next().F(z2Var.f17850o);
            }
        }
    }

    private int a1() {
        if (this.f17759s0.f17836a.u()) {
            return this.f17761t0;
        }
        z2 z2Var = this.f17759s0;
        return z2Var.f17836a.l(z2Var.f17837b.f18969a, this.f17748n).f17805l;
    }

    private void a2(boolean z10) {
        p3.c0 c0Var = this.f17747m0;
        if (c0Var != null) {
            if (z10 && !this.f17749n0) {
                c0Var.a(0);
                this.f17749n0 = true;
            } else if (z10 || !this.f17749n0) {
            } else {
                c0Var.b(0);
                this.f17749n0 = false;
            }
        }
    }

    private Pair<Object, Long> b1(y3 y3Var, y3 y3Var2) {
        long j10 = j();
        if (y3Var.u() || y3Var2.u()) {
            boolean z10 = !y3Var.u() && y3Var2.u();
            int a12 = z10 ? -1 : a1();
            if (z10) {
                j10 = -9223372036854775807L;
            }
            return I1(y3Var2, a12, j10);
        }
        Pair<Object, Long> n10 = y3Var.n(this.f17181a, this.f17748n, v(), p3.n0.B0(j10));
        Object obj = ((Pair) p3.n0.j(n10)).first;
        if (y3Var2.f(obj) != -1) {
            return n10;
        }
        Object z02 = j1.z0(this.f17181a, this.f17748n, this.F, this.G, obj, y3Var, y3Var2);
        if (z02 != null) {
            y3Var2.l(z02, this.f17748n);
            int i10 = this.f17748n.f17805l;
            return I1(y3Var2, i10, y3Var2.r(i10, this.f17181a).d());
        }
        return I1(y3Var2, -1, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        int p10 = p();
        boolean z10 = true;
        if (p10 != 1) {
            if (p10 == 2 || p10 == 3) {
                this.C.b((!n() || W0()) ? false : false);
                this.D.b(n());
                return;
            } else if (p10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void c2() {
        this.f17728d.b();
        if (Thread.currentThread() != X0().getThread()) {
            String C = p3.n0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), X0().getThread().getName());
            if (this.f17743k0) {
                throw new IllegalStateException(C);
            }
            p3.r.j("ExoPlayerImpl", C, this.f17745l0 ? null : new IllegalStateException());
            this.f17745l0 = true;
        }
    }

    private c3.e e1(long j10) {
        v1 v1Var;
        Object obj;
        int i10;
        int v10 = v();
        Object obj2 = null;
        if (this.f17759s0.f17836a.u()) {
            v1Var = null;
            obj = null;
            i10 = -1;
        } else {
            z2 z2Var = this.f17759s0;
            Object obj3 = z2Var.f17837b.f18969a;
            z2Var.f17836a.l(obj3, this.f17748n);
            i10 = this.f17759s0.f17836a.f(obj3);
            obj = obj3;
            obj2 = this.f17759s0.f17836a.r(v10, this.f17181a).f17814j;
            v1Var = this.f17181a.f17816l;
        }
        long Y0 = p3.n0.Y0(j10);
        long Y02 = this.f17759s0.f17837b.b() ? p3.n0.Y0(g1(this.f17759s0)) : Y0;
        u.b bVar = this.f17759s0.f17837b;
        return new c3.e(obj2, v10, v1Var, obj, i10, Y0, Y02, bVar.f18970b, bVar.f18971c);
    }

    private c3.e f1(int i10, z2 z2Var, int i11) {
        int i12;
        Object obj;
        v1 v1Var;
        Object obj2;
        int i13;
        long j10;
        long j11;
        y3.b bVar = new y3.b();
        if (z2Var.f17836a.u()) {
            i12 = i11;
            obj = null;
            v1Var = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = z2Var.f17837b.f18969a;
            z2Var.f17836a.l(obj3, bVar);
            int i14 = bVar.f17805l;
            i12 = i14;
            obj2 = obj3;
            i13 = z2Var.f17836a.f(obj3);
            obj = z2Var.f17836a.r(i14, this.f17181a).f17814j;
            v1Var = this.f17181a.f17816l;
        }
        boolean b10 = z2Var.f17837b.b();
        if (i10 == 0) {
            if (b10) {
                u.b bVar2 = z2Var.f17837b;
                j10 = bVar.e(bVar2.f18970b, bVar2.f18971c);
                j11 = g1(z2Var);
            } else {
                j10 = z2Var.f17837b.f18973e != -1 ? g1(this.f17759s0) : bVar.f17807n + bVar.f17806m;
                j11 = j10;
            }
        } else if (b10) {
            j10 = z2Var.f17853r;
            j11 = g1(z2Var);
        } else {
            j10 = bVar.f17807n + z2Var.f17853r;
            j11 = j10;
        }
        long Y0 = p3.n0.Y0(j10);
        long Y02 = p3.n0.Y0(j11);
        u.b bVar3 = z2Var.f17837b;
        return new c3.e(obj, i12, v1Var, obj2, i13, Y0, Y02, bVar3.f18970b, bVar3.f18971c);
    }

    private static long g1(z2 z2Var) {
        y3.d dVar = new y3.d();
        y3.b bVar = new y3.b();
        z2Var.f17836a.l(z2Var.f17837b.f18969a, bVar);
        return z2Var.f17838c == -9223372036854775807L ? z2Var.f17836a.r(bVar.f17805l, dVar).e() : bVar.q() + z2Var.f17838c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public void m1(j1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f17323c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f17324d) {
            this.I = eVar.f17325e;
            this.J = true;
        }
        if (eVar.f17326f) {
            this.K = eVar.f17327g;
        }
        if (i10 == 0) {
            y3 y3Var = eVar.f17322b.f17836a;
            if (!this.f17759s0.f17836a.u() && y3Var.u()) {
                this.f17761t0 = -1;
                this.f17765v0 = 0L;
                this.f17763u0 = 0;
            }
            if (!y3Var.u()) {
                List<y3> I = ((h3) y3Var).I();
                p3.a.f(I.size() == this.f17750o.size());
                for (int i11 = 0; i11 < I.size(); i11++) {
                    this.f17750o.get(i11).f17776b = I.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f17322b.f17837b.equals(this.f17759s0.f17837b) && eVar.f17322b.f17839d == this.f17759s0.f17853r) {
                    z11 = false;
                }
                if (z11) {
                    if (y3Var.u() || eVar.f17322b.f17837b.b()) {
                        j11 = eVar.f17322b.f17839d;
                    } else {
                        z2 z2Var = eVar.f17322b;
                        j11 = K1(y3Var, z2Var.f17837b, z2Var.f17839d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            Z1(eVar.f17322b, 1, this.K, false, z10, this.I, j10, -1, false);
        }
    }

    private int i1(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean j1(z2 z2Var) {
        return z2Var.f17840e == 3 && z2Var.f17847l && z2Var.f17848m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(c3.d dVar, p3.l lVar) {
        dVar.j0(this.f17732f, new c3.c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(final j1.e eVar) {
        this.f17738i.k(new Runnable() { // from class: s1.z
            @Override // java.lang.Runnable
            public final void run() {
                x0.this.m1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o1(c3.d dVar) {
        dVar.F(q.i(new l1(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(c3.d dVar) {
        dVar.O(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t1(z2 z2Var, int i10, c3.d dVar) {
        dVar.g0(z2Var.f17836a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u1(int i10, c3.e eVar, c3.e eVar2, c3.d dVar) {
        dVar.E(i10);
        dVar.b0(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w1(z2 z2Var, c3.d dVar) {
        dVar.d0(z2Var.f17841f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x1(z2 z2Var, c3.d dVar) {
        dVar.F(z2Var.f17841f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y1(z2 z2Var, c3.d dVar) {
        dVar.N(z2Var.f17844i.f14157d);
    }

    @Override // s1.c3
    public int B() {
        c2();
        return this.f17759s0.f17848m;
    }

    @Override // s1.c3
    public int C() {
        c2();
        return this.F;
    }

    @Override // s1.c3
    public long D() {
        c2();
        if (i()) {
            z2 z2Var = this.f17759s0;
            u.b bVar = z2Var.f17837b;
            z2Var.f17836a.l(bVar.f18969a, this.f17748n);
            return p3.n0.Y0(this.f17748n.e(bVar.f18970b, bVar.f18971c));
        }
        return J();
    }

    @Override // s1.c3
    public y3 E() {
        c2();
        return this.f17759s0.f17836a;
    }

    @Override // s1.c3
    public boolean F() {
        c2();
        return this.G;
    }

    @Override // s1.c3
    public long H() {
        c2();
        return p3.n0.Y0(Z0(this.f17759s0));
    }

    @Override // s1.e
    public void N(int i10, long j10, int i11, boolean z10) {
        c2();
        p3.a.a(i10 >= 0);
        this.f17756r.e0();
        y3 y3Var = this.f17759s0.f17836a;
        if (y3Var.u() || i10 < y3Var.t()) {
            this.H++;
            if (i()) {
                p3.r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                j1.e eVar = new j1.e(this.f17759s0);
                eVar.b(1);
                this.f17740j.a(eVar);
                return;
            }
            int i12 = p() != 1 ? 2 : 1;
            int v10 = v();
            z2 H1 = H1(this.f17759s0.g(i12), y3Var, I1(y3Var, i10, j10));
            this.f17742k.B0(y3Var, i10, p3.n0.B0(j10));
            Z1(H1, 0, 1, true, true, 1, Z0(H1), v10, z10);
        }
    }

    public void O0(t1.c cVar) {
        this.f17756r.J((t1.c) p3.a.e(cVar));
    }

    public void P0(s.a aVar) {
        this.f17746m.add(aVar);
    }

    public void Q1(List<u2.u> list) {
        c2();
        R1(list, true);
    }

    public void R1(List<u2.u> list, boolean z10) {
        c2();
        S1(list, -1, -9223372036854775807L, z10);
    }

    public void V1(boolean z10) {
        c2();
        this.A.p(n(), 1);
        W1(z10, null);
        this.f17741j0 = new d3.e(com.google.common.collect.q.z(), this.f17759s0.f17853r);
    }

    public boolean W0() {
        c2();
        return this.f17759s0.f17850o;
    }

    public Looper X0() {
        return this.f17758s;
    }

    public long Y0() {
        c2();
        if (this.f17759s0.f17836a.u()) {
            return this.f17765v0;
        }
        z2 z2Var = this.f17759s0;
        if (z2Var.f17846k.f18972d != z2Var.f17837b.f18972d) {
            return z2Var.f17836a.r(v(), this.f17181a).f();
        }
        long j10 = z2Var.f17851p;
        if (this.f17759s0.f17846k.b()) {
            z2 z2Var2 = this.f17759s0;
            y3.b l10 = z2Var2.f17836a.l(z2Var2.f17846k.f18969a, this.f17748n);
            long i10 = l10.i(this.f17759s0.f17846k.f18970b);
            j10 = i10 == Long.MIN_VALUE ? l10.f17806m : i10;
        }
        z2 z2Var3 = this.f17759s0;
        return p3.n0.Y0(K1(z2Var3.f17836a, z2Var3.f17846k, j10));
    }

    @Override // s1.c3
    public void a() {
        AudioTrack audioTrack;
        p3.r.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + p3.n0.f15401e + "] [" + k1.b() + "]");
        c2();
        if (p3.n0.f15397a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f17769z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f17742k.l0()) {
            this.f17744l.k(10, new q.a() { // from class: s1.l0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    x0.o1((c3.d) obj);
                }
            });
        }
        this.f17744l.j();
        this.f17738i.i(null);
        this.f17760t.d(this.f17756r);
        z2 g10 = this.f17759s0.g(1);
        this.f17759s0 = g10;
        z2 b10 = g10.b(g10.f17837b);
        this.f17759s0 = b10;
        b10.f17851p = b10.f17853r;
        this.f17759s0.f17852q = 0L;
        this.f17756r.a();
        this.f17736h.f();
        N1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f17749n0) {
            ((p3.c0) p3.a.e(this.f17747m0)).b(0);
            this.f17749n0 = false;
        }
        this.f17741j0 = d3.e.f7706l;
        this.f17751o0 = true;
    }

    @Override // s1.c3
    public void b() {
        c2();
        boolean n10 = n();
        int p10 = this.A.p(n10, 2);
        Y1(n10, p10, c1(n10, p10));
        z2 z2Var = this.f17759s0;
        if (z2Var.f17840e != 1) {
            return;
        }
        z2 e10 = z2Var.e(null);
        z2 g10 = e10.g(e10.f17836a.u() ? 4 : 2);
        this.H++;
        this.f17742k.j0();
        Z1(g10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // s1.c3
    public void c(b3 b3Var) {
        c2();
        if (b3Var == null) {
            b3Var = b3.f17104m;
        }
        if (this.f17759s0.f17849n.equals(b3Var)) {
            return;
        }
        z2 f10 = this.f17759s0.f(b3Var);
        this.H++;
        this.f17742k.T0(b3Var);
        Z1(f10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // s1.s
    public void d(final u1.e eVar, boolean z10) {
        c2();
        if (this.f17751o0) {
            return;
        }
        if (!p3.n0.c(this.f17735g0, eVar)) {
            this.f17735g0 = eVar;
            O1(1, 3, eVar);
            this.B.h(p3.n0.f0(eVar.f18574l));
            this.f17744l.i(20, new q.a() { // from class: s1.j0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).n0(u1.e.this);
                }
            });
        }
        this.A.m(z10 ? eVar : null);
        this.f17736h.h(eVar);
        boolean n10 = n();
        int p10 = this.A.p(n10, p());
        Y1(n10, p10, c1(n10, p10));
        this.f17744l.f();
    }

    @Override // s1.c3
    /* renamed from: d1 */
    public q f() {
        c2();
        return this.f17759s0.f17841f;
    }

    @Override // s1.c3
    public void e(float f10) {
        c2();
        final float p10 = p3.n0.p(f10, 0.0f, 1.0f);
        if (this.f17737h0 == p10) {
            return;
        }
        this.f17737h0 = p10;
        P1();
        this.f17744l.k(22, new q.a() { // from class: s1.k0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c3.d) obj).S(p10);
            }
        });
    }

    @Override // s1.c3
    public void g(boolean z10) {
        c2();
        int p10 = this.A.p(z10, p());
        Y1(z10, p10, c1(z10, p10));
    }

    @Override // s1.c3
    public void h(Surface surface) {
        c2();
        N1();
        U1(surface);
        int i10 = surface == null ? 0 : -1;
        J1(i10, i10);
    }

    @Override // s1.c3
    public boolean i() {
        c2();
        return this.f17759s0.f17837b.b();
    }

    @Override // s1.c3
    public long j() {
        c2();
        if (i()) {
            z2 z2Var = this.f17759s0;
            z2Var.f17836a.l(z2Var.f17837b.f18969a, this.f17748n);
            z2 z2Var2 = this.f17759s0;
            return z2Var2.f17838c == -9223372036854775807L ? z2Var2.f17836a.r(v(), this.f17181a).d() : this.f17748n.p() + p3.n0.Y0(this.f17759s0.f17838c);
        }
        return H();
    }

    @Override // s1.c3
    public void k(c3.d dVar) {
        this.f17744l.c((c3.d) p3.a.e(dVar));
    }

    @Override // s1.c3
    public long l() {
        c2();
        return p3.n0.Y0(this.f17759s0.f17852q);
    }

    @Override // s1.c3
    public long m() {
        c2();
        if (i()) {
            z2 z2Var = this.f17759s0;
            return z2Var.f17846k.equals(z2Var.f17837b) ? p3.n0.Y0(this.f17759s0.f17851p) : D();
        }
        return Y0();
    }

    @Override // s1.c3
    public boolean n() {
        c2();
        return this.f17759s0.f17847l;
    }

    @Override // s1.c3
    public int p() {
        c2();
        return this.f17759s0.f17840e;
    }

    @Override // s1.s
    public n1 q() {
        c2();
        return this.R;
    }

    @Override // s1.c3
    public d4 r() {
        c2();
        return this.f17759s0.f17844i.f14157d;
    }

    @Override // s1.c3
    public void stop() {
        c2();
        V1(false);
    }

    @Override // s1.c3
    public int t() {
        c2();
        if (this.f17759s0.f17836a.u()) {
            return this.f17763u0;
        }
        z2 z2Var = this.f17759s0;
        return z2Var.f17836a.f(z2Var.f17837b.f18969a);
    }

    @Override // s1.c3
    public int u() {
        c2();
        if (i()) {
            return this.f17759s0.f17837b.f18970b;
        }
        return -1;
    }

    @Override // s1.c3
    public int v() {
        c2();
        int a12 = a1();
        if (a12 == -1) {
            return 0;
        }
        return a12;
    }

    @Override // s1.c3
    public void w(final int i10) {
        c2();
        if (this.F != i10) {
            this.F = i10;
            this.f17742k.V0(i10);
            this.f17744l.i(8, new q.a() { // from class: s1.p0
                @Override // p3.q.a
                public final void invoke(Object obj) {
                    ((c3.d) obj).l(i10);
                }
            });
            X1();
            this.f17744l.f();
        }
    }

    @Override // s1.s
    public void y(u2.u uVar) {
        c2();
        Q1(Collections.singletonList(uVar));
    }

    @Override // s1.c3
    public int z() {
        c2();
        if (i()) {
            return this.f17759s0.f17837b.f18971c;
        }
        return -1;
    }
}
