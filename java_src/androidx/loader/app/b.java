package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.loader.app.a;
import d0.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import s.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f2585c = false;

    /* renamed from: a  reason: collision with root package name */
    private final i f2586a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2587b;

    /* loaded from: classes.dex */
    public static class a<D> extends n<D> implements b.InterfaceC0112b<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f2588l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f2589m;

        /* renamed from: n  reason: collision with root package name */
        private final d0.b<D> f2590n;

        /* renamed from: o  reason: collision with root package name */
        private i f2591o;

        /* renamed from: p  reason: collision with root package name */
        private C0045b<D> f2592p;

        /* renamed from: q  reason: collision with root package name */
        private d0.b<D> f2593q;

        a(int i10, Bundle bundle, d0.b<D> bVar, d0.b<D> bVar2) {
            this.f2588l = i10;
            this.f2589m = bundle;
            this.f2590n = bVar;
            this.f2593q = bVar2;
            bVar.q(i10, this);
        }

        @Override // d0.b.InterfaceC0112b
        public void a(d0.b<D> bVar, D d10) {
            if (b.f2585c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d10);
                return;
            }
            if (b.f2585c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d10);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.f2585c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f2590n.t();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.f2585c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f2590n.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(o<? super D> oVar) {
            super.m(oVar);
            this.f2591o = null;
            this.f2592p = null;
        }

        @Override // androidx.lifecycle.n, androidx.lifecycle.LiveData
        public void n(D d10) {
            super.n(d10);
            d0.b<D> bVar = this.f2593q;
            if (bVar != null) {
                bVar.r();
                this.f2593q = null;
            }
        }

        d0.b<D> o(boolean z10) {
            if (b.f2585c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f2590n.b();
            this.f2590n.a();
            C0045b<D> c0045b = this.f2592p;
            if (c0045b != null) {
                m(c0045b);
                if (z10) {
                    c0045b.d();
                }
            }
            this.f2590n.v(this);
            if ((c0045b == null || c0045b.c()) && !z10) {
                return this.f2590n;
            }
            this.f2590n.r();
            return this.f2593q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2588l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2589m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2590n);
            d0.b<D> bVar = this.f2590n;
            bVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f2592p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2592p);
                C0045b<D> c0045b = this.f2592p;
                c0045b.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        d0.b<D> q() {
            return this.f2590n;
        }

        void r() {
            i iVar = this.f2591o;
            C0045b<D> c0045b = this.f2592p;
            if (iVar == null || c0045b == null) {
                return;
            }
            super.m(c0045b);
            h(iVar, c0045b);
        }

        d0.b<D> s(i iVar, a.InterfaceC0044a<D> interfaceC0044a) {
            C0045b<D> c0045b = new C0045b<>(this.f2590n, interfaceC0044a);
            h(iVar, c0045b);
            C0045b<D> c0045b2 = this.f2592p;
            if (c0045b2 != null) {
                m(c0045b2);
            }
            this.f2591o = iVar;
            this.f2592p = c0045b;
            return this.f2590n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2588l);
            sb.append(" : ");
            androidx.core.util.b.a(this.f2590n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045b<D> implements o<D> {

        /* renamed from: a  reason: collision with root package name */
        private final d0.b<D> f2594a;

        /* renamed from: b  reason: collision with root package name */
        private final a.InterfaceC0044a<D> f2595b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2596c = false;

        C0045b(d0.b<D> bVar, a.InterfaceC0044a<D> interfaceC0044a) {
            this.f2594a = bVar;
            this.f2595b = interfaceC0044a;
        }

        @Override // androidx.lifecycle.o
        public void a(D d10) {
            if (b.f2585c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f2594a + ": " + this.f2594a.d(d10));
            }
            this.f2595b.a(this.f2594a, d10);
            this.f2596c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2596c);
        }

        boolean c() {
            return this.f2596c;
        }

        void d() {
            if (this.f2596c) {
                if (b.f2585c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f2594a);
                }
                this.f2595b.b(this.f2594a);
            }
        }

        public String toString() {
            return this.f2595b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends w {

        /* renamed from: f  reason: collision with root package name */
        private static final x.b f2597f = new a();

        /* renamed from: d  reason: collision with root package name */
        private h<a> f2598d = new h<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f2599e = false;

        /* loaded from: classes.dex */
        static class a implements x.b {
            a() {
            }

            @Override // androidx.lifecycle.x.b
            public <T extends w> T a(Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.x.b
            public /* synthetic */ w b(Class cls, c0.a aVar) {
                return y.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c g(a0 a0Var) {
            return (c) new x(a0Var, f2597f).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.w
        public void d() {
            super.d();
            int n10 = this.f2598d.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.f2598d.o(i10).o(true);
            }
            this.f2598d.c();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2598d.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f2598d.n(); i10++) {
                    a o10 = this.f2598d.o(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2598d.i(i10));
                    printWriter.print(": ");
                    printWriter.println(o10.toString());
                    o10.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f2599e = false;
        }

        <D> a<D> h(int i10) {
            return this.f2598d.g(i10);
        }

        boolean i() {
            return this.f2599e;
        }

        void j() {
            int n10 = this.f2598d.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.f2598d.o(i10).r();
            }
        }

        void k(int i10, a aVar) {
            this.f2598d.j(i10, aVar);
        }

        void l() {
            this.f2599e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(i iVar, a0 a0Var) {
        this.f2586a = iVar;
        this.f2587b = c.g(a0Var);
    }

    private <D> d0.b<D> e(int i10, Bundle bundle, a.InterfaceC0044a<D> interfaceC0044a, d0.b<D> bVar) {
        try {
            this.f2587b.l();
            d0.b<D> c10 = interfaceC0044a.c(i10, bundle);
            if (c10 != null) {
                if (c10.getClass().isMemberClass() && !Modifier.isStatic(c10.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c10);
                }
                a aVar = new a(i10, bundle, c10, bVar);
                if (f2585c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar);
                }
                this.f2587b.k(i10, aVar);
                this.f2587b.f();
                return aVar.s(this.f2586a, interfaceC0044a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f2587b.f();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2587b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> d0.b<D> c(int i10, Bundle bundle, a.InterfaceC0044a<D> interfaceC0044a) {
        if (this.f2587b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> h10 = this.f2587b.h(i10);
            if (f2585c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (h10 == null) {
                return e(i10, bundle, interfaceC0044a, null);
            }
            if (f2585c) {
                Log.v("LoaderManager", "  Re-using existing loader " + h10);
            }
            return h10.s(this.f2586a, interfaceC0044a);
        }
        throw new IllegalStateException("initLoader must be called on the main thread");
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f2587b.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2586a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
