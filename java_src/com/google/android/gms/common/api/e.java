package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c4.e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.h1;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
/* loaded from: classes.dex */
public abstract class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3751a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3752b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.api.a f3753c;

    /* renamed from: d  reason: collision with root package name */
    private final a.d f3754d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.b f3755e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f3756f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3757g;

    /* renamed from: h  reason: collision with root package name */
    private final f f3758h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.s f3759i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.f f3760j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f3761c = new C0087a().a();

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.gms.common.api.internal.s f3762a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f3763b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0087a {

            /* renamed from: a  reason: collision with root package name */
            private com.google.android.gms.common.api.internal.s f3764a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f3765b;

            public a a() {
                if (this.f3764a == null) {
                    this.f3764a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f3765b == null) {
                    this.f3765b = Looper.getMainLooper();
                }
                return new a(this.f3764a, this.f3765b);
            }

            public C0087a b(Looper looper) {
                c4.s.k(looper, "Looper must not be null.");
                this.f3765b = looper;
                return this;
            }

            public C0087a c(com.google.android.gms.common.api.internal.s sVar) {
                c4.s.k(sVar, "StatusExceptionMapper must not be null.");
                this.f3764a = sVar;
                return this;
            }
        }

        private a(com.google.android.gms.common.api.internal.s sVar, Account account, Looper looper) {
            this.f3762a = sVar;
            this.f3763b = looper;
        }
    }

    public e(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.app.Activity r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.s r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.s):void");
    }

    private e(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        c4.s.k(context, "Null context is not permitted.");
        c4.s.k(aVar, "Api must not be null.");
        c4.s.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f3751a = context.getApplicationContext();
        String str = null;
        if (h4.j.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f3752b = str;
        this.f3753c = aVar;
        this.f3754d = dVar;
        this.f3756f = aVar2.f3763b;
        com.google.android.gms.common.api.internal.b a10 = com.google.android.gms.common.api.internal.b.a(aVar, dVar, str);
        this.f3755e = a10;
        this.f3758h = new o0(this);
        com.google.android.gms.common.api.internal.f y10 = com.google.android.gms.common.api.internal.f.y(this.f3751a);
        this.f3760j = y10;
        this.f3757g = y10.n();
        this.f3759i = aVar2.f3762a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            a0.j(activity, y10, a10);
        }
        y10.c(this);
    }

    public e(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.d x(int i10, com.google.android.gms.common.api.internal.d dVar) {
        dVar.j();
        this.f3760j.G(this, i10, dVar);
        return dVar;
    }

    private final Task y(int i10, com.google.android.gms.common.api.internal.u uVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3760j.H(this, i10, uVar, taskCompletionSource, this.f3759i);
        return taskCompletionSource.getTask();
    }

    public f g() {
        return this.f3758h;
    }

    protected e.a h() {
        Account d10;
        GoogleSignInAccount z10;
        GoogleSignInAccount z11;
        e.a aVar = new e.a();
        a.d dVar = this.f3754d;
        if (!(dVar instanceof a.d.b) || (z11 = ((a.d.b) dVar).z()) == null) {
            a.d dVar2 = this.f3754d;
            d10 = dVar2 instanceof a.d.InterfaceC0086a ? ((a.d.InterfaceC0086a) dVar2).d() : null;
        } else {
            d10 = z11.d();
        }
        aVar.d(d10);
        a.d dVar3 = this.f3754d;
        aVar.c((!(dVar3 instanceof a.d.b) || (z10 = ((a.d.b) dVar3).z()) == null) ? Collections.emptySet() : z10.G());
        aVar.e(this.f3751a.getClass().getName());
        aVar.b(this.f3751a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> Task<TResult> i(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return y(2, uVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T j(T t10) {
        x(0, t10);
        return t10;
    }

    public <TResult, A extends a.b> Task<TResult> k(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return y(0, uVar);
    }

    public <A extends a.b> Task<Void> l(com.google.android.gms.common.api.internal.p<A, ?> pVar) {
        c4.s.j(pVar);
        c4.s.k(pVar.f3901a.b(), "Listener has already been released.");
        c4.s.k(pVar.f3902b.a(), "Listener has already been released.");
        return this.f3760j.A(this, pVar.f3901a, pVar.f3902b, pVar.f3903c);
    }

    public Task<Boolean> m(j.a<?> aVar, int i10) {
        c4.s.k(aVar, "Listener key cannot be null.");
        return this.f3760j.B(this, aVar, i10);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends m, A>> T n(T t10) {
        x(1, t10);
        return t10;
    }

    public <TResult, A extends a.b> Task<TResult> o(com.google.android.gms.common.api.internal.u<A, TResult> uVar) {
        return y(1, uVar);
    }

    public final com.google.android.gms.common.api.internal.b<O> p() {
        return this.f3755e;
    }

    public O q() {
        return (O) this.f3754d;
    }

    public Context r() {
        return this.f3751a;
    }

    protected String s() {
        return this.f3752b;
    }

    public Looper t() {
        return this.f3756f;
    }

    public final int u() {
        return this.f3757g;
    }

    public final a.f v(Looper looper, j0 j0Var) {
        a.f a10 = ((a.AbstractC0085a) c4.s.j(this.f3753c.a())).a(this.f3751a, looper, h().a(), this.f3754d, j0Var, j0Var);
        String s10 = s();
        if (s10 != null && (a10 instanceof c4.c)) {
            ((c4.c) a10).O(s10);
        }
        if (s10 != null && (a10 instanceof com.google.android.gms.common.api.internal.l)) {
            ((com.google.android.gms.common.api.internal.l) a10).r(s10);
        }
        return a10;
    }

    public final h1 w(Context context, Handler handler) {
        return new h1(context, handler, h().a());
    }
}
