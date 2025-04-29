package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: j  reason: collision with root package name */
    private c f9573j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f9574k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f9575l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f9576m;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9578o;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9581r;

    /* renamed from: s  reason: collision with root package name */
    private Runnable f9582s;

    /* renamed from: t  reason: collision with root package name */
    private long f9583t;

    /* renamed from: u  reason: collision with root package name */
    private long f9584u;

    /* renamed from: v  reason: collision with root package name */
    private C0157b f9585v;

    /* renamed from: n  reason: collision with root package name */
    private int f9577n = 255;

    /* renamed from: p  reason: collision with root package name */
    private int f9579p = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f9580q = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0157b implements Drawable.Callback {

        /* renamed from: j  reason: collision with root package name */
        private Drawable.Callback f9587j;

        C0157b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f9587j;
            this.f9587j = null;
            return callback;
        }

        public C0157b b(Drawable.Callback callback) {
            this.f9587j = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f9587j;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9587j;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f9588a;

        /* renamed from: b  reason: collision with root package name */
        Resources f9589b;

        /* renamed from: c  reason: collision with root package name */
        int f9590c;

        /* renamed from: d  reason: collision with root package name */
        int f9591d;

        /* renamed from: e  reason: collision with root package name */
        int f9592e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f9593f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f9594g;

        /* renamed from: h  reason: collision with root package name */
        int f9595h;

        /* renamed from: i  reason: collision with root package name */
        boolean f9596i;

        /* renamed from: j  reason: collision with root package name */
        boolean f9597j;

        /* renamed from: k  reason: collision with root package name */
        Rect f9598k;

        /* renamed from: l  reason: collision with root package name */
        boolean f9599l;

        /* renamed from: m  reason: collision with root package name */
        boolean f9600m;

        /* renamed from: n  reason: collision with root package name */
        int f9601n;

        /* renamed from: o  reason: collision with root package name */
        int f9602o;

        /* renamed from: p  reason: collision with root package name */
        int f9603p;

        /* renamed from: q  reason: collision with root package name */
        int f9604q;

        /* renamed from: r  reason: collision with root package name */
        boolean f9605r;

        /* renamed from: s  reason: collision with root package name */
        int f9606s;

        /* renamed from: t  reason: collision with root package name */
        boolean f9607t;

        /* renamed from: u  reason: collision with root package name */
        boolean f9608u;

        /* renamed from: v  reason: collision with root package name */
        boolean f9609v;

        /* renamed from: w  reason: collision with root package name */
        boolean f9610w;

        /* renamed from: x  reason: collision with root package name */
        boolean f9611x;

        /* renamed from: y  reason: collision with root package name */
        boolean f9612y;

        /* renamed from: z  reason: collision with root package name */
        int f9613z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, b bVar, Resources resources) {
            this.f9590c = 160;
            this.f9596i = false;
            this.f9599l = false;
            this.f9611x = true;
            this.A = 0;
            this.B = 0;
            this.f9588a = bVar;
            this.f9589b = resources != null ? resources : cVar != null ? cVar.f9589b : null;
            int f10 = b.f(resources, cVar != null ? cVar.f9590c : 0);
            this.f9590c = f10;
            if (cVar == null) {
                this.f9594g = new Drawable[10];
                this.f9595h = 0;
                return;
            }
            this.f9591d = cVar.f9591d;
            this.f9592e = cVar.f9592e;
            this.f9609v = true;
            this.f9610w = true;
            this.f9596i = cVar.f9596i;
            this.f9599l = cVar.f9599l;
            this.f9611x = cVar.f9611x;
            this.f9612y = cVar.f9612y;
            this.f9613z = cVar.f9613z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f9590c == f10) {
                if (cVar.f9597j) {
                    this.f9598k = new Rect(cVar.f9598k);
                    this.f9597j = true;
                }
                if (cVar.f9600m) {
                    this.f9601n = cVar.f9601n;
                    this.f9602o = cVar.f9602o;
                    this.f9603p = cVar.f9603p;
                    this.f9604q = cVar.f9604q;
                    this.f9600m = true;
                }
            }
            if (cVar.f9605r) {
                this.f9606s = cVar.f9606s;
                this.f9605r = true;
            }
            if (cVar.f9607t) {
                this.f9608u = cVar.f9608u;
                this.f9607t = true;
            }
            Drawable[] drawableArr = cVar.f9594g;
            this.f9594g = new Drawable[drawableArr.length];
            this.f9595h = cVar.f9595h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f9593f;
            this.f9593f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f9595h);
            int i10 = this.f9595h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null) {
                    Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                    if (constantState != null) {
                        this.f9593f.put(i11, constantState);
                    } else {
                        this.f9594g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9593f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f9594g[this.f9593f.keyAt(i10)] = s(this.f9593f.valueAt(i10).newDrawable(this.f9589b));
                }
                this.f9593f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f9613z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9588a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f9595h;
            if (i10 >= this.f9594g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9588a);
            this.f9594g[i10] = drawable;
            this.f9595h++;
            this.f9592e = drawable.getChangingConfigurations() | this.f9592e;
            p();
            this.f9598k = null;
            this.f9597j = false;
            this.f9600m = false;
            this.f9609v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f9595h;
                Drawable[] drawableArr = this.f9594g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && drawableArr[i11].canApplyTheme()) {
                        drawableArr[i11].applyTheme(theme);
                        this.f9592e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f9609v) {
                return this.f9610w;
            }
            e();
            this.f9609v = true;
            int i10 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f9610w = false;
                    return false;
                }
            }
            this.f9610w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9593f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f9600m = true;
            e();
            int i10 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            this.f9602o = -1;
            this.f9601n = -1;
            this.f9604q = 0;
            this.f9603p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9601n) {
                    this.f9601n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9602o) {
                    this.f9602o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9603p) {
                    this.f9603p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9604q) {
                    this.f9604q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f9594g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f9594g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9593f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f9593f.valueAt(indexOfKey).newDrawable(this.f9589b));
            this.f9594g[i10] = s10;
            this.f9593f.removeAt(indexOfKey);
            if (this.f9593f.size() == 0) {
                this.f9593f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9591d | this.f9592e;
        }

        public final int h() {
            return this.f9595h;
        }

        public final int i() {
            if (!this.f9600m) {
                d();
            }
            return this.f9602o;
        }

        public final int j() {
            if (!this.f9600m) {
                d();
            }
            return this.f9604q;
        }

        public final int k() {
            if (!this.f9600m) {
                d();
            }
            return this.f9603p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f9596i) {
                return null;
            }
            Rect rect2 = this.f9598k;
            if (rect2 != null || this.f9597j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f9597j = true;
            this.f9598k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f9600m) {
                d();
            }
            return this.f9601n;
        }

        public final int n() {
            if (this.f9605r) {
                return this.f9606s;
            }
            e();
            int i10 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f9606s = opacity;
            this.f9605r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            System.arraycopy(this.f9594g, 0, drawableArr, 0, i10);
            this.f9594g = drawableArr;
        }

        void p() {
            this.f9605r = false;
            this.f9607t = false;
        }

        public final boolean q() {
            return this.f9599l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f9599l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f9595h;
            Drawable[] drawableArr = this.f9594g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i13].setLayoutDirection(i10) : false;
                    if (i13 == i11) {
                        z10 = layoutDirection;
                    }
                }
            }
            this.f9613z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f9596i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f9589b = resources;
                int f10 = b.f(resources, this.f9590c);
                int i10 = this.f9590c;
                this.f9590c = f10;
                if (i10 != f10) {
                    this.f9600m = false;
                    this.f9597j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f9585v == null) {
            this.f9585v = new C0157b();
        }
        drawable.setCallback(this.f9585v.b(drawable.getCallback()));
        try {
            if (this.f9573j.A <= 0 && this.f9578o) {
                drawable.setAlpha(this.f9577n);
            }
            c cVar = this.f9573j;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f9573j;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9573j.f9611x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f9573j.C);
            Rect rect = this.f9574k;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f9585v.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9578o = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9575l
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f9583t
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f9577n
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            i.b$c r9 = r13.f9573j
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9577n
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f9583t = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f9576m
            if (r9 == 0) goto L64
            long r10 = r13.f9584u
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L66
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L51
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f9576m = r0
            r0 = -1
            r13.f9580q = r0
            goto L64
        L51:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$c r4 = r13.f9573j
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f9577n
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L67
        L64:
            r13.f9584u = r7
        L66:
            r0 = r3
        L67:
            if (r14 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Runnable r14 = r13.f9582s
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f9573j.b(theme);
    }

    c b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f9579p;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f9573j.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9576m;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r9) {
        /*
            r8 = this;
            int r0 = r8.f9579p
            r1 = 0
            if (r9 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$c r0 = r8.f9573j
            int r0 = r0.B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L35
            android.graphics.drawable.Drawable r0 = r8.f9576m
            if (r0 == 0) goto L1b
            r0.setVisible(r1, r1)
        L1b:
            android.graphics.drawable.Drawable r0 = r8.f9575l
            if (r0 == 0) goto L2e
            r8.f9576m = r0
            int r0 = r8.f9579p
            r8.f9580q = r0
            i.b$c r0 = r8.f9573j
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f9584u = r0
            goto L3c
        L2e:
            r8.f9576m = r5
            r8.f9580q = r4
            r8.f9584u = r6
            goto L3c
        L35:
            android.graphics.drawable.Drawable r0 = r8.f9575l
            if (r0 == 0) goto L3c
            r0.setVisible(r1, r1)
        L3c:
            if (r9 < 0) goto L5c
            i.b$c r0 = r8.f9573j
            int r1 = r0.f9595h
            if (r9 >= r1) goto L5c
            android.graphics.drawable.Drawable r0 = r0.g(r9)
            r8.f9575l = r0
            r8.f9579p = r9
            if (r0 == 0) goto L60
            i.b$c r9 = r8.f9573j
            int r9 = r9.A
            if (r9 <= 0) goto L58
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f9583t = r2
        L58:
            r8.d(r0)
            goto L60
        L5c:
            r8.f9575l = r5
            r8.f9579p = r4
        L60:
            long r0 = r8.f9583t
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L6d
            long r0 = r8.f9584u
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L7f
        L6d:
            java.lang.Runnable r0 = r8.f9582s
            if (r0 != 0) goto L79
            i.b$a r0 = new i.b$a
            r0.<init>()
            r8.f9582s = r0
            goto L7c
        L79:
            r8.unscheduleSelf(r0)
        L7c:
            r8.a(r9)
        L7f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9577n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9573j.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9573j.c()) {
            this.f9573j.f9591d = getChangingConfigurations();
            return this.f9573j;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f9575l;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9574k;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f9573j.q()) {
            return this.f9573j.i();
        }
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f9573j.q()) {
            return this.f9573j.m();
        }
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f9573j.q()) {
            return this.f9573j.j();
        }
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f9573j.q()) {
            return this.f9573j.k();
        }
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9575l;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9573j.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f9573j.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f9575l;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(c cVar) {
        this.f9573j = cVar;
        int i10 = this.f9579p;
        if (i10 >= 0) {
            Drawable g10 = cVar.g(i10);
            this.f9575l = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f9580q = -1;
        this.f9576m = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f9573j.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f9573j;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f9575l || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9573j.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f9576m;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9576m = null;
            this.f9580q = -1;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f9575l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9578o) {
                this.f9575l.setAlpha(this.f9577n);
            }
        }
        if (this.f9584u != 0) {
            this.f9584u = 0L;
            z10 = true;
        }
        if (this.f9583t != 0) {
            this.f9583t = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9581r && super.mutate() == this) {
            c b10 = b();
            b10.r();
            h(b10);
            this.f9581r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9576m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9575l;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f9573j.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f9576m;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f9575l;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9576m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9575l;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f9575l || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f9578o && this.f9577n == i10) {
            return;
        }
        this.f9578o = true;
        this.f9577n = i10;
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            if (this.f9583t == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        c cVar = this.f9573j;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f9575l;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f9573j;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f9575l;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        c cVar = this.f9573j;
        if (cVar.f9611x != z10) {
            cVar.f9611x = z10;
            Drawable drawable = this.f9575l;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f9574k;
        if (rect == null) {
            this.f9574k = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f9575l;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f9573j;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f9575l, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f9573j;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f9575l, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f9576m;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f9575l;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f9575l || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
