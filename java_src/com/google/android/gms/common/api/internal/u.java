package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class u<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final b4.d[] f3931a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3932b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3933c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        private q f3934a;

        /* renamed from: c  reason: collision with root package name */
        private b4.d[] f3936c;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3935b = true;

        /* renamed from: d  reason: collision with root package name */
        private int f3937d = 0;

        /* synthetic */ a(j1 j1Var) {
        }

        public u<A, ResultT> a() {
            c4.s.b(this.f3934a != null, "execute parameter required");
            return new i1(this, this.f3936c, this.f3935b, this.f3937d);
        }

        public a<A, ResultT> b(q<A, TaskCompletionSource<ResultT>> qVar) {
            this.f3934a = qVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f3935b = z10;
            return this;
        }

        public a<A, ResultT> d(b4.d... dVarArr) {
            this.f3936c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f3937d = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u(b4.d[] dVarArr, boolean z10, int i10) {
        this.f3931a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f3932b = z11;
        this.f3933c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a10, TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean c() {
        return this.f3932b;
    }

    public final int d() {
        return this.f3933c;
    }

    public final b4.d[] e() {
        return this.f3931a;
    }
}
