package k;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import androidx.core.view.b0;
import androidx.core.view.z;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f12482c;

    /* renamed from: d  reason: collision with root package name */
    a0 f12483d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12484e;

    /* renamed from: b  reason: collision with root package name */
    private long f12481b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f12485f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<z> f12480a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends b0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12486a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f12487b = 0;

        a() {
        }

        @Override // androidx.core.view.a0
        public void b(View view) {
            int i10 = this.f12487b + 1;
            this.f12487b = i10;
            if (i10 == h.this.f12480a.size()) {
                a0 a0Var = h.this.f12483d;
                if (a0Var != null) {
                    a0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.b0, androidx.core.view.a0
        public void c(View view) {
            if (this.f12486a) {
                return;
            }
            this.f12486a = true;
            a0 a0Var = h.this.f12483d;
            if (a0Var != null) {
                a0Var.c(null);
            }
        }

        void d() {
            this.f12487b = 0;
            this.f12486a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f12484e) {
            Iterator<z> it = this.f12480a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f12484e = false;
        }
    }

    void b() {
        this.f12484e = false;
    }

    public h c(z zVar) {
        if (!this.f12484e) {
            this.f12480a.add(zVar);
        }
        return this;
    }

    public h d(z zVar, z zVar2) {
        this.f12480a.add(zVar);
        zVar2.j(zVar.d());
        this.f12480a.add(zVar2);
        return this;
    }

    public h e(long j10) {
        if (!this.f12484e) {
            this.f12481b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f12484e) {
            this.f12482c = interpolator;
        }
        return this;
    }

    public h g(a0 a0Var) {
        if (!this.f12484e) {
            this.f12483d = a0Var;
        }
        return this;
    }

    public void h() {
        if (this.f12484e) {
            return;
        }
        Iterator<z> it = this.f12480a.iterator();
        while (it.hasNext()) {
            z next = it.next();
            long j10 = this.f12481b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f12482c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f12483d != null) {
                next.h(this.f12485f);
            }
            next.l();
        }
        this.f12484e = true;
    }
}
