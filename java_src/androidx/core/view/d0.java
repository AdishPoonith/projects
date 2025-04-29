package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f1868b;

    /* renamed from: a  reason: collision with root package name */
    private final l f1869a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f1870a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f1871b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f1872c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f1873d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1870a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1871b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1872c = declaredField3;
                declaredField3.setAccessible(true);
                f1873d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static d0 a(View view) {
            if (f1873d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1870a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1871b.get(obj);
                        Rect rect2 = (Rect) f1872c.get(obj);
                        if (rect != null && rect2 != null) {
                            d0 a10 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a10.o(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f1874a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f1874a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(d0 d0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f1874a = i10 >= 30 ? new e(d0Var) : i10 >= 29 ? new d(d0Var) : new c(d0Var);
        }

        public d0 a() {
            return this.f1874a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f1874a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f1874a.f(bVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f1875e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f1876f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f1877g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1878h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f1879c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f1880d;

        c() {
            this.f1879c = h();
        }

        c(d0 d0Var) {
            super(d0Var);
            this.f1879c = d0Var.q();
        }

        private static WindowInsets h() {
            if (!f1876f) {
                try {
                    f1875e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f1876f = true;
            }
            Field field = f1875e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f1878h) {
                try {
                    f1877g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f1878h = true;
            }
            Constructor<WindowInsets> constructor = f1877g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.d0.f
        d0 b() {
            a();
            d0 r10 = d0.r(this.f1879c);
            r10.m(this.f1883b);
            r10.p(this.f1880d);
            return r10;
        }

        @Override // androidx.core.view.d0.f
        void d(androidx.core.graphics.b bVar) {
            this.f1880d = bVar;
        }

        @Override // androidx.core.view.d0.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f1879c;
            if (windowInsets != null) {
                this.f1879c = windowInsets.replaceSystemWindowInsets(bVar.f1693a, bVar.f1694b, bVar.f1695c, bVar.f1696d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f1881c;

        d() {
            this.f1881c = new WindowInsets.Builder();
        }

        d(d0 d0Var) {
            super(d0Var);
            WindowInsets q10 = d0Var.q();
            this.f1881c = q10 != null ? new WindowInsets.Builder(q10) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.d0.f
        d0 b() {
            a();
            d0 r10 = d0.r(this.f1881c.build());
            r10.m(this.f1883b);
            return r10;
        }

        @Override // androidx.core.view.d0.f
        void c(androidx.core.graphics.b bVar) {
            this.f1881c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.d0.f
        void d(androidx.core.graphics.b bVar) {
            this.f1881c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.d0.f
        void e(androidx.core.graphics.b bVar) {
            this.f1881c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.d0.f
        void f(androidx.core.graphics.b bVar) {
            this.f1881c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.d0.f
        void g(androidx.core.graphics.b bVar) {
            this.f1881c.setTappableElementInsets(bVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(d0 d0Var) {
            super(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f1882a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f1883b;

        f() {
            this(new d0((d0) null));
        }

        f(d0 d0Var) {
            this.f1882a = d0Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f1883b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.a(1)];
                androidx.core.graphics.b bVar2 = this.f1883b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f1882a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f1882a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f1883b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f1883b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f1883b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        d0 b() {
            throw null;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
            throw null;
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
            throw null;
        }

        void g(androidx.core.graphics.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f1884h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f1885i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f1886j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f1887k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f1888l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f1889c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f1890d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f1891e;

        /* renamed from: f  reason: collision with root package name */
        private d0 f1892f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f1893g;

        g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f1891e = null;
            this.f1889c = windowInsets;
        }

        g(d0 d0Var, g gVar) {
            this(d0Var, new WindowInsets(gVar.f1889c));
        }

        private androidx.core.graphics.b s(int i10, boolean z10) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f1692e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, t(i11, z10));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b u() {
            d0 d0Var = this.f1892f;
            return d0Var != null ? d0Var.g() : androidx.core.graphics.b.f1692e;
        }

        private androidx.core.graphics.b v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f1884h) {
                    w();
                }
                Method method = f1885i;
                if (method != null && f1886j != null && f1887k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f1887k.get(f1888l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void w() {
            try {
                f1885i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1886j = cls;
                f1887k = cls.getDeclaredField("mVisibleInsets");
                f1888l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1887k.setAccessible(true);
                f1888l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f1884h = true;
        }

        @Override // androidx.core.view.d0.l
        void d(View view) {
            androidx.core.graphics.b v10 = v(view);
            if (v10 == null) {
                v10 = androidx.core.graphics.b.f1692e;
            }
            p(v10);
        }

        @Override // androidx.core.view.d0.l
        void e(d0 d0Var) {
            d0Var.o(this.f1892f);
            d0Var.n(this.f1893g);
        }

        @Override // androidx.core.view.d0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1893g, ((g) obj).f1893g);
            }
            return false;
        }

        @Override // androidx.core.view.d0.l
        public androidx.core.graphics.b g(int i10) {
            return s(i10, false);
        }

        @Override // androidx.core.view.d0.l
        final androidx.core.graphics.b k() {
            if (this.f1891e == null) {
                this.f1891e = androidx.core.graphics.b.b(this.f1889c.getSystemWindowInsetLeft(), this.f1889c.getSystemWindowInsetTop(), this.f1889c.getSystemWindowInsetRight(), this.f1889c.getSystemWindowInsetBottom());
            }
            return this.f1891e;
        }

        @Override // androidx.core.view.d0.l
        boolean n() {
            return this.f1889c.isRound();
        }

        @Override // androidx.core.view.d0.l
        public void o(androidx.core.graphics.b[] bVarArr) {
            this.f1890d = bVarArr;
        }

        @Override // androidx.core.view.d0.l
        void p(androidx.core.graphics.b bVar) {
            this.f1893g = bVar;
        }

        @Override // androidx.core.view.d0.l
        void q(d0 d0Var) {
            this.f1892f = d0Var;
        }

        protected androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b g10;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.b.b(0, Math.max(u().f1694b, k().f1694b), 0, 0) : androidx.core.graphics.b.b(0, k().f1694b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.b u10 = u();
                    androidx.core.graphics.b i12 = i();
                    return androidx.core.graphics.b.b(Math.max(u10.f1693a, i12.f1693a), 0, Math.max(u10.f1695c, i12.f1695c), Math.max(u10.f1696d, i12.f1696d));
                }
                androidx.core.graphics.b k10 = k();
                d0 d0Var = this.f1892f;
                g10 = d0Var != null ? d0Var.g() : null;
                int i13 = k10.f1696d;
                if (g10 != null) {
                    i13 = Math.min(i13, g10.f1696d);
                }
                return androidx.core.graphics.b.b(k10.f1693a, 0, k10.f1695c, i13);
            } else if (i10 != 8) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                return androidx.core.graphics.b.f1692e;
                            }
                            d0 d0Var2 = this.f1892f;
                            androidx.core.view.c e10 = d0Var2 != null ? d0Var2.e() : f();
                            return e10 != null ? androidx.core.graphics.b.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.b.f1692e;
                        }
                        return l();
                    }
                    return h();
                }
                return j();
            } else {
                androidx.core.graphics.b[] bVarArr = this.f1890d;
                g10 = bVarArr != null ? bVarArr[m.a(8)] : null;
                if (g10 != null) {
                    return g10;
                }
                androidx.core.graphics.b k11 = k();
                androidx.core.graphics.b u11 = u();
                int i14 = k11.f1696d;
                if (i14 > u11.f1696d) {
                    return androidx.core.graphics.b.b(0, 0, 0, i14);
                }
                androidx.core.graphics.b bVar = this.f1893g;
                return (bVar == null || bVar.equals(androidx.core.graphics.b.f1692e) || (i11 = this.f1893g.f1696d) <= u11.f1696d) ? androidx.core.graphics.b.f1692e : androidx.core.graphics.b.b(0, 0, 0, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f1894m;

        h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.f1894m = null;
        }

        h(d0 d0Var, h hVar) {
            super(d0Var, hVar);
            this.f1894m = null;
            this.f1894m = hVar.f1894m;
        }

        @Override // androidx.core.view.d0.l
        d0 b() {
            return d0.r(this.f1889c.consumeStableInsets());
        }

        @Override // androidx.core.view.d0.l
        d0 c() {
            return d0.r(this.f1889c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.d0.l
        final androidx.core.graphics.b i() {
            if (this.f1894m == null) {
                this.f1894m = androidx.core.graphics.b.b(this.f1889c.getStableInsetLeft(), this.f1889c.getStableInsetTop(), this.f1889c.getStableInsetRight(), this.f1889c.getStableInsetBottom());
            }
            return this.f1894m;
        }

        @Override // androidx.core.view.d0.l
        boolean m() {
            return this.f1889c.isConsumed();
        }

        @Override // androidx.core.view.d0.l
        public void r(androidx.core.graphics.b bVar) {
            this.f1894m = bVar;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        i(d0 d0Var, i iVar) {
            super(d0Var, iVar);
        }

        @Override // androidx.core.view.d0.l
        d0 a() {
            return d0.r(this.f1889c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.d0.g, androidx.core.view.d0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return Objects.equals(this.f1889c, iVar.f1889c) && Objects.equals(this.f1893g, iVar.f1893g);
            }
            return false;
        }

        @Override // androidx.core.view.d0.l
        androidx.core.view.c f() {
            return androidx.core.view.c.e(this.f1889c.getDisplayCutout());
        }

        @Override // androidx.core.view.d0.l
        public int hashCode() {
            return this.f1889c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.b f1895n;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f1896o;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f1897p;

        j(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.f1895n = null;
            this.f1896o = null;
            this.f1897p = null;
        }

        j(d0 d0Var, j jVar) {
            super(d0Var, jVar);
            this.f1895n = null;
            this.f1896o = null;
            this.f1897p = null;
        }

        @Override // androidx.core.view.d0.l
        androidx.core.graphics.b h() {
            if (this.f1896o == null) {
                this.f1896o = androidx.core.graphics.b.d(this.f1889c.getMandatorySystemGestureInsets());
            }
            return this.f1896o;
        }

        @Override // androidx.core.view.d0.l
        androidx.core.graphics.b j() {
            if (this.f1895n == null) {
                this.f1895n = androidx.core.graphics.b.d(this.f1889c.getSystemGestureInsets());
            }
            return this.f1895n;
        }

        @Override // androidx.core.view.d0.l
        androidx.core.graphics.b l() {
            if (this.f1897p == null) {
                this.f1897p = androidx.core.graphics.b.d(this.f1889c.getTappableElementInsets());
            }
            return this.f1897p;
        }

        @Override // androidx.core.view.d0.h, androidx.core.view.d0.l
        public void r(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final d0 f1898q = d0.r(WindowInsets.CONSUMED);

        k(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        k(d0 d0Var, k kVar) {
            super(d0Var, kVar);
        }

        @Override // androidx.core.view.d0.g, androidx.core.view.d0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.d0.g, androidx.core.view.d0.l
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f1889c.getInsets(n.a(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final d0 f1899b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final d0 f1900a;

        l(d0 d0Var) {
            this.f1900a = d0Var;
        }

        d0 a() {
            return this.f1900a;
        }

        d0 b() {
            return this.f1900a;
        }

        d0 c() {
            return this.f1900a;
        }

        void d(View view) {
        }

        void e(d0 d0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return n() == lVar.n() && m() == lVar.m() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
            }
            return false;
        }

        androidx.core.view.c f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f1692e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f1692e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f1692e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        boolean m() {
            return false;
        }

        boolean n() {
            return false;
        }

        public void o(androidx.core.graphics.b[] bVarArr) {
        }

        void p(androidx.core.graphics.b bVar) {
        }

        void q(d0 d0Var) {
        }

        public void r(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            if (i10 != 16) {
                                if (i10 != 32) {
                                    if (i10 != 64) {
                                        if (i10 != 128) {
                                            if (i10 == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        f1868b = Build.VERSION.SDK_INT >= 30 ? k.f1898q : l.f1899b;
    }

    private d0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f1869a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public d0(d0 d0Var) {
        if (d0Var == null) {
            this.f1869a = new l(this);
            return;
        }
        l lVar = d0Var.f1869a;
        int i10 = Build.VERSION.SDK_INT;
        this.f1869a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public static d0 r(WindowInsets windowInsets) {
        return s(windowInsets, null);
    }

    public static d0 s(WindowInsets windowInsets, View view) {
        d0 d0Var = new d0((WindowInsets) androidx.core.util.d.c(windowInsets));
        if (view != null && t.t(view)) {
            d0Var.o(t.n(view));
            d0Var.d(view.getRootView());
        }
        return d0Var;
    }

    @Deprecated
    public d0 a() {
        return this.f1869a.a();
    }

    @Deprecated
    public d0 b() {
        return this.f1869a.b();
    }

    @Deprecated
    public d0 c() {
        return this.f1869a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f1869a.d(view);
    }

    public androidx.core.view.c e() {
        return this.f1869a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return androidx.core.util.c.a(this.f1869a, ((d0) obj).f1869a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f1869a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f1869a.i();
    }

    @Deprecated
    public int h() {
        return this.f1869a.k().f1696d;
    }

    public int hashCode() {
        l lVar = this.f1869a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f1869a.k().f1693a;
    }

    @Deprecated
    public int j() {
        return this.f1869a.k().f1695c;
    }

    @Deprecated
    public int k() {
        return this.f1869a.k().f1694b;
    }

    @Deprecated
    public d0 l(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void m(androidx.core.graphics.b[] bVarArr) {
        this.f1869a.o(bVarArr);
    }

    void n(androidx.core.graphics.b bVar) {
        this.f1869a.p(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(d0 d0Var) {
        this.f1869a.q(d0Var);
    }

    void p(androidx.core.graphics.b bVar) {
        this.f1869a.r(bVar);
    }

    public WindowInsets q() {
        l lVar = this.f1869a;
        if (lVar instanceof g) {
            return ((g) lVar).f1889c;
        }
        return null;
    }
}
