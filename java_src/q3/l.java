package q3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p3.n0;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final q3.e f16102a = new q3.e();

    /* renamed from: b  reason: collision with root package name */
    private final b f16103b;

    /* renamed from: c  reason: collision with root package name */
    private final e f16104c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16105d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f16106e;

    /* renamed from: f  reason: collision with root package name */
    private float f16107f;

    /* renamed from: g  reason: collision with root package name */
    private float f16108g;

    /* renamed from: h  reason: collision with root package name */
    private float f16109h;

    /* renamed from: i  reason: collision with root package name */
    private float f16110i;

    /* renamed from: j  reason: collision with root package name */
    private int f16111j;

    /* renamed from: k  reason: collision with root package name */
    private long f16112k;

    /* renamed from: l  reason: collision with root package name */
    private long f16113l;

    /* renamed from: m  reason: collision with root package name */
    private long f16114m;

    /* renamed from: n  reason: collision with root package name */
    private long f16115n;

    /* renamed from: o  reason: collision with root package name */
    private long f16116o;

    /* renamed from: p  reason: collision with root package name */
    private long f16117p;

    /* renamed from: q  reason: collision with root package name */
    private long f16118q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                p3.r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void a(Display display);
        }

        void a(a aVar);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f16119a;

        private c(WindowManager windowManager) {
            this.f16119a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // q3.l.b
        public void a(b.a aVar) {
            aVar.a(this.f16119a.getDefaultDisplay());
        }

        @Override // q3.l.b
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f16120a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f16121b;

        private d(DisplayManager displayManager) {
            this.f16120a = displayManager;
        }

        private Display c() {
            return this.f16120a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // q3.l.b
        public void a(b.a aVar) {
            this.f16121b = aVar;
            this.f16120a.registerDisplayListener(this, n0.w());
            aVar.a(c());
        }

        @Override // q3.l.b
        public void b() {
            this.f16120a.unregisterDisplayListener(this);
            this.f16121b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f16121b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: o  reason: collision with root package name */
        private static final e f16122o = new e();

        /* renamed from: j  reason: collision with root package name */
        public volatile long f16123j = -9223372036854775807L;

        /* renamed from: k  reason: collision with root package name */
        private final Handler f16124k;

        /* renamed from: l  reason: collision with root package name */
        private final HandlerThread f16125l;

        /* renamed from: m  reason: collision with root package name */
        private Choreographer f16126m;

        /* renamed from: n  reason: collision with root package name */
        private int f16127n;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f16125l = handlerThread;
            handlerThread.start();
            Handler v10 = n0.v(handlerThread.getLooper(), this);
            this.f16124k = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f16126m;
            if (choreographer != null) {
                int i10 = this.f16127n + 1;
                this.f16127n = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f16126m = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                p3.r.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f16122o;
        }

        private void f() {
            Choreographer choreographer = this.f16126m;
            if (choreographer != null) {
                int i10 = this.f16127n - 1;
                this.f16127n = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f16123j = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f16124k.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f16123j = j10;
            ((Choreographer) p3.a.e(this.f16126m)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f16124k.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public l(Context context) {
        b f10 = f(context);
        this.f16103b = f10;
        this.f16104c = f10 != null ? e.d() : null;
        this.f16112k = -9223372036854775807L;
        this.f16113l = -9223372036854775807L;
        this.f16107f = -1.0f;
        this.f16110i = 1.0f;
        this.f16111j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (n0.f15397a < 30 || (surface = this.f16106e) == null || this.f16111j == Integer.MIN_VALUE || this.f16109h == 0.0f) {
            return;
        }
        this.f16109h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b f(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b d10 = n0.f15397a >= 17 ? d.d(applicationContext) : null;
            return d10 == null ? c.c(applicationContext) : d10;
        }
        return null;
    }

    private void n() {
        this.f16114m = 0L;
        this.f16117p = -1L;
        this.f16115n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f16112k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            p3.r.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f16112k = -9223372036854775807L;
        }
        this.f16113l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f16108g) >= (r8.f16102a.e() && (r8.f16102a.d() > 5000000000L ? 1 : (r8.f16102a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r8.f16102a.c() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r8 = this;
            int r0 = p3.n0.f15397a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r8.f16106e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            q3.e r0 = r8.f16102a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            q3.e r0 = r8.f16102a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r8.f16107f
        L1d:
            float r2 = r8.f16108g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            q3.e r1 = r8.f16102a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            q3.e r1 = r8.f16102a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r8.f16108g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r5 = 0
            goto L6c
        L61:
            if (r6 == 0) goto L64
            goto L6c
        L64:
            q3.e r2 = r8.f16102a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r5 == 0) goto L73
            r8.f16108g = r0
            r8.r(r4)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.l.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        if (n0.f15397a < 30 || (surface = this.f16106e) == null || this.f16111j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f16105d) {
            float f11 = this.f16108g;
            if (f11 != -1.0f) {
                f10 = this.f16110i * f11;
            }
        }
        if (z10 || this.f16109h != f10) {
            this.f16109h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f16117p != -1 && this.f16102a.e()) {
            long a10 = this.f16118q + (((float) (this.f16102a.a() * (this.f16114m - this.f16117p))) / this.f16110i);
            if (c(j10, a10)) {
                j11 = a10;
                this.f16115n = this.f16114m;
                this.f16116o = j11;
                eVar = this.f16104c;
                if (eVar != null || this.f16112k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f16123j;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f16112k) - this.f16113l;
            }
            n();
        }
        j11 = j10;
        this.f16115n = this.f16114m;
        this.f16116o = j11;
        eVar = this.f16104c;
        if (eVar != null) {
        }
        return j11;
    }

    public void g(float f10) {
        this.f16107f = f10;
        this.f16102a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f16115n;
        if (j11 != -1) {
            this.f16117p = j11;
            this.f16118q = this.f16116o;
        }
        this.f16114m++;
        this.f16102a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f16110i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f16105d = true;
        n();
        if (this.f16103b != null) {
            ((e) p3.a.e(this.f16104c)).a();
            this.f16103b.a(new b.a() { // from class: q3.k
                @Override // q3.l.b.a
                public final void a(Display display) {
                    l.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f16105d = false;
        b bVar = this.f16103b;
        if (bVar != null) {
            bVar.b();
            ((e) p3.a.e(this.f16104c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof i) {
            surface = null;
        }
        if (this.f16106e == surface) {
            return;
        }
        d();
        this.f16106e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f16111j == i10) {
            return;
        }
        this.f16111j = i10;
        r(true);
    }
}
