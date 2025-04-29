package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.m> extends com.google.android.gms.common.api.h<R> {

    /* renamed from: o */
    static final ThreadLocal f3767o = new w1();

    /* renamed from: p */
    public static final /* synthetic */ int f3768p = 0;

    /* renamed from: a */
    private final Object f3769a;

    /* renamed from: b */
    protected final a f3770b;

    /* renamed from: c */
    protected final WeakReference f3771c;

    /* renamed from: d */
    private final CountDownLatch f3772d;

    /* renamed from: e */
    private final ArrayList f3773e;

    /* renamed from: f */
    private com.google.android.gms.common.api.n f3774f;

    /* renamed from: g */
    private final AtomicReference f3775g;

    /* renamed from: h */
    private com.google.android.gms.common.api.m f3776h;

    /* renamed from: i */
    private Status f3777i;

    /* renamed from: j */
    private volatile boolean f3778j;

    /* renamed from: k */
    private boolean f3779k;

    /* renamed from: l */
    private boolean f3780l;

    /* renamed from: m */
    private c4.l f3781m;
    @KeepName
    private y1 mResultGuardian;

    /* renamed from: n */
    private boolean f3782n;

    /* loaded from: classes.dex */
    public static class a<R extends com.google.android.gms.common.api.m> extends o4.j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.n nVar, com.google.android.gms.common.api.m mVar) {
            int i10 = BasePendingResult.f3768p;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.n) c4.s.j(nVar), mVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                com.google.android.gms.common.api.n nVar = (com.google.android.gms.common.api.n) pair.first;
                com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) pair.second;
                try {
                    nVar.a(mVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.k(mVar);
                    throw e10;
                }
            } else if (i10 == 2) {
                ((BasePendingResult) message.obj).d(Status.f3737s);
            } else {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f3769a = new Object();
        this.f3772d = new CountDownLatch(1);
        this.f3773e = new ArrayList();
        this.f3775g = new AtomicReference();
        this.f3782n = false;
        this.f3770b = new a(Looper.getMainLooper());
        this.f3771c = new WeakReference(null);
    }

    public BasePendingResult(com.google.android.gms.common.api.f fVar) {
        this.f3769a = new Object();
        this.f3772d = new CountDownLatch(1);
        this.f3773e = new ArrayList();
        this.f3775g = new AtomicReference();
        this.f3782n = false;
        this.f3770b = new a(fVar != null ? fVar.d() : Looper.getMainLooper());
        this.f3771c = new WeakReference(fVar);
    }

    private final com.google.android.gms.common.api.m g() {
        com.google.android.gms.common.api.m mVar;
        synchronized (this.f3769a) {
            c4.s.m(!this.f3778j, "Result has already been consumed.");
            c4.s.m(e(), "Result is not ready.");
            mVar = this.f3776h;
            this.f3776h = null;
            this.f3774f = null;
            this.f3778j = true;
        }
        if (((l1) this.f3775g.getAndSet(null)) == null) {
            return (com.google.android.gms.common.api.m) c4.s.j(mVar);
        }
        throw null;
    }

    private final void h(com.google.android.gms.common.api.m mVar) {
        this.f3776h = mVar;
        this.f3777i = mVar.p();
        this.f3781m = null;
        this.f3772d.countDown();
        if (this.f3779k) {
            this.f3774f = null;
        } else {
            com.google.android.gms.common.api.n nVar = this.f3774f;
            if (nVar != null) {
                this.f3770b.removeMessages(2);
                this.f3770b.a(nVar, g());
            } else if (this.f3776h instanceof com.google.android.gms.common.api.j) {
                this.mResultGuardian = new y1(this, null);
            }
        }
        ArrayList arrayList = this.f3773e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h.a) arrayList.get(i10)).a(this.f3777i);
        }
        this.f3773e.clear();
    }

    public static void k(com.google.android.gms.common.api.m mVar) {
        if (mVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) mVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(mVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final void a(h.a aVar) {
        c4.s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f3769a) {
            if (e()) {
                aVar.a(this.f3777i);
            } else {
                this.f3773e.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final R b(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            c4.s.i("await must not be called on the UI thread when time is greater than zero.");
        }
        c4.s.m(!this.f3778j, "Result has already been consumed.");
        c4.s.m(true, "Cannot await if then() has been called.");
        try {
            if (!this.f3772d.await(j10, timeUnit)) {
                d(Status.f3737s);
            }
        } catch (InterruptedException unused) {
            d(Status.f3735q);
        }
        c4.s.m(e(), "Result is not ready.");
        return (R) g();
    }

    public abstract R c(Status status);

    @Deprecated
    public final void d(Status status) {
        synchronized (this.f3769a) {
            if (!e()) {
                f(c(status));
                this.f3780l = true;
            }
        }
    }

    public final boolean e() {
        return this.f3772d.getCount() == 0;
    }

    public final void f(R r10) {
        synchronized (this.f3769a) {
            if (this.f3780l || this.f3779k) {
                k(r10);
                return;
            }
            e();
            c4.s.m(!e(), "Results have already been set");
            c4.s.m(!this.f3778j, "Result has already been consumed");
            h(r10);
        }
    }

    public final void j() {
        boolean z10 = true;
        if (!this.f3782n && !((Boolean) f3767o.get()).booleanValue()) {
            z10 = false;
        }
        this.f3782n = z10;
    }
}
