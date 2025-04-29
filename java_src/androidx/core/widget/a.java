package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.t;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int A = ViewConfiguration.getTapTimeout();

    /* renamed from: l  reason: collision with root package name */
    final View f1976l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f1977m;

    /* renamed from: p  reason: collision with root package name */
    private int f1980p;

    /* renamed from: q  reason: collision with root package name */
    private int f1981q;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1985u;

    /* renamed from: v  reason: collision with root package name */
    boolean f1986v;

    /* renamed from: w  reason: collision with root package name */
    boolean f1987w;

    /* renamed from: x  reason: collision with root package name */
    boolean f1988x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1989y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1990z;

    /* renamed from: j  reason: collision with root package name */
    final C0032a f1974j = new C0032a();

    /* renamed from: k  reason: collision with root package name */
    private final Interpolator f1975k = new AccelerateInterpolator();

    /* renamed from: n  reason: collision with root package name */
    private float[] f1978n = {0.0f, 0.0f};

    /* renamed from: o  reason: collision with root package name */
    private float[] f1979o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: r  reason: collision with root package name */
    private float[] f1982r = {0.0f, 0.0f};

    /* renamed from: s  reason: collision with root package name */
    private float[] f1983s = {0.0f, 0.0f};

    /* renamed from: t  reason: collision with root package name */
    private float[] f1984t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0032a {

        /* renamed from: a  reason: collision with root package name */
        private int f1991a;

        /* renamed from: b  reason: collision with root package name */
        private int f1992b;

        /* renamed from: c  reason: collision with root package name */
        private float f1993c;

        /* renamed from: d  reason: collision with root package name */
        private float f1994d;

        /* renamed from: j  reason: collision with root package name */
        private float f2000j;

        /* renamed from: k  reason: collision with root package name */
        private int f2001k;

        /* renamed from: e  reason: collision with root package name */
        private long f1995e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f1999i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f1996f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f1997g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f1998h = 0;

        C0032a() {
        }

        private float e(long j10) {
            long j11 = this.f1995e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f1999i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / this.f1991a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2000j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f2001k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f1996f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            this.f1996f = currentAnimationTimeMillis;
            float f10 = ((float) (currentAnimationTimeMillis - this.f1996f)) * g10;
            this.f1997g = (int) (this.f1993c * f10);
            this.f1998h = (int) (f10 * this.f1994d);
        }

        public int b() {
            return this.f1997g;
        }

        public int c() {
            return this.f1998h;
        }

        public int d() {
            float f10 = this.f1993c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f1994d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f1999i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1999i + ((long) this.f2001k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2001k = a.f((int) (currentAnimationTimeMillis - this.f1995e), 0, this.f1992b);
            this.f2000j = e(currentAnimationTimeMillis);
            this.f1999i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f1992b = i10;
        }

        public void k(int i10) {
            this.f1991a = i10;
        }

        public void l(float f10, float f11) {
            this.f1993c = f10;
            this.f1994d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1995e = currentAnimationTimeMillis;
            this.f1999i = -1L;
            this.f1996f = currentAnimationTimeMillis;
            this.f2000j = 0.5f;
            this.f1997g = 0;
            this.f1998h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1988x) {
                if (aVar.f1986v) {
                    aVar.f1986v = false;
                    aVar.f1974j.m();
                }
                C0032a c0032a = a.this.f1974j;
                if (c0032a.h() || !a.this.u()) {
                    a.this.f1988x = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1987w) {
                    aVar2.f1987w = false;
                    aVar2.c();
                }
                c0032a.a();
                a.this.j(c0032a.b(), c0032a.c());
                t.A(a.this.f1976l, this);
            }
        }
    }

    public a(View view) {
        this.f1976l = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(A);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f1978n[i10], f11, this.f1979o[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f1982r[i10];
        float f14 = this.f1983s[i10];
        float f15 = this.f1984t[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f1980p;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f1988x && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f1975k.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f1975k.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1986v) {
            this.f1988x = false;
        } else {
            this.f1974j.i();
        }
    }

    private void v() {
        int i10;
        if (this.f1977m == null) {
            this.f1977m = new b();
        }
        this.f1988x = true;
        this.f1986v = true;
        if (this.f1985u || (i10 = this.f1981q) <= 0) {
            this.f1977m.run();
        } else {
            t.B(this.f1976l, this.f1977m, i10);
        }
        this.f1985u = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1976l.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f1981q = i10;
        return this;
    }

    public a l(int i10) {
        this.f1980p = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f1989y && !z10) {
            i();
        }
        this.f1989y = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f1979o;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f1984t;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1989y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f1987w = r2
            r5.f1985u = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1976l
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1976l
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1974j
            r7.l(r0, r6)
            boolean r6 = r5.f1988x
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f1990z
            if (r6 == 0) goto L61
            boolean r6 = r5.f1988x
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f1983s;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f1974j.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f1974j.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f1978n;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f1982r;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0032a c0032a = this.f1974j;
        int f10 = c0032a.f();
        int d10 = c0032a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
