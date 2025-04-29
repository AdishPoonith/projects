package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public class p<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    public final o<A, L> f3901a;

    /* renamed from: b  reason: collision with root package name */
    public final w f3902b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f3903c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, L> {

        /* renamed from: a  reason: collision with root package name */
        private q f3904a;

        /* renamed from: b  reason: collision with root package name */
        private q f3905b;

        /* renamed from: d  reason: collision with root package name */
        private j f3907d;

        /* renamed from: e  reason: collision with root package name */
        private b4.d[] f3908e;

        /* renamed from: g  reason: collision with root package name */
        private int f3910g;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f3906c = new Runnable() { // from class: com.google.android.gms.common.api.internal.z0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f  reason: collision with root package name */
        private boolean f3909f = true;

        /* synthetic */ a(c1 c1Var) {
        }

        public p<A, L> a() {
            c4.s.b(this.f3904a != null, "Must set register function");
            c4.s.b(this.f3905b != null, "Must set unregister function");
            c4.s.b(this.f3907d != null, "Must set holder");
            return new p<>(new a1(this, this.f3907d, this.f3908e, this.f3909f, this.f3910g), new b1(this, (j.a) c4.s.k(this.f3907d.b(), "Key must not be null")), this.f3906c, null);
        }

        public a<A, L> b(q<A, TaskCompletionSource<Void>> qVar) {
            this.f3904a = qVar;
            return this;
        }

        public a<A, L> c(int i10) {
            this.f3910g = i10;
            return this;
        }

        public a<A, L> d(q<A, TaskCompletionSource<Boolean>> qVar) {
            this.f3905b = qVar;
            return this;
        }

        public a<A, L> e(j<L> jVar) {
            this.f3907d = jVar;
            return this;
        }
    }

    /* synthetic */ p(o oVar, w wVar, Runnable runnable, d1 d1Var) {
        this.f3901a = oVar;
        this.f3902b = wVar;
        this.f3903c = runnable;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
