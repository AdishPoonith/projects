package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f1905a;

    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f1906a;

        /* renamed from: b  reason: collision with root package name */
        private final View f1907b;

        a(Window window, View view) {
            this.f1906a = window;
            this.f1907b = view;
        }

        protected void c(int i10) {
            View decorView = this.f1906a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f1906a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f1906a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f1906a.clearFlags(i10);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.e0.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.e0.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final e0 f1908a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f1909b;

        /* renamed from: c  reason: collision with root package name */
        private final s.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f1910c;

        /* renamed from: d  reason: collision with root package name */
        protected Window f1911d;

        d(Window window, e0 e0Var) {
            this(window.getInsetsController(), e0Var);
            this.f1911d = window;
        }

        d(WindowInsetsController windowInsetsController, e0 e0Var) {
            this.f1910c = new s.g<>();
            this.f1909b = windowInsetsController;
            this.f1908a = e0Var;
        }

        @Override // androidx.core.view.e0.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f1911d != null) {
                    c(16);
                }
                this.f1909b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f1911d != null) {
                d(16);
            }
            this.f1909b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.e0.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f1911d != null) {
                    c(8192);
                }
                this.f1909b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f1911d != null) {
                d(8192);
            }
            this.f1909b.setSystemBarsAppearance(0, 8);
        }

        protected void c(int i10) {
            View decorView = this.f1911d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f1911d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public e0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f1905a = new d(window, this);
        } else {
            this.f1905a = i10 >= 26 ? new c(window, view) : i10 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public void a(boolean z10) {
        this.f1905a.a(z10);
    }

    public void b(boolean z10) {
        this.f1905a.b(z10);
    }
}
