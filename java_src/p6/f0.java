package p6;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d7.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import q6.g;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: h  reason: collision with root package name */
    private static q6.y<i9.v0<?>> f15566h;

    /* renamed from: a  reason: collision with root package name */
    private Task<i9.u0> f15567a;

    /* renamed from: b  reason: collision with root package name */
    private final q6.g f15568b;

    /* renamed from: c  reason: collision with root package name */
    private i9.c f15569c;

    /* renamed from: d  reason: collision with root package name */
    private g.b f15570d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f15571e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.m f15572f;

    /* renamed from: g  reason: collision with root package name */
    private final i9.b f15573g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(q6.g gVar, Context context, j6.m mVar, i9.b bVar) {
        this.f15568b = gVar;
        this.f15571e = context;
        this.f15572f = mVar;
        this.f15573g = bVar;
        k();
    }

    private void h() {
        if (this.f15570d != null) {
            q6.v.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f15570d.c();
            this.f15570d = null;
        }
    }

    private i9.u0 j(Context context, j6.m mVar) {
        i9.v0<?> v0Var;
        try {
            x4.a.a(context);
        } catch (b4.g | b4.h | IllegalStateException e10) {
            q6.v.e("GrpcCallProvider", "Failed to update ssl context: %s", e10);
        }
        q6.y<i9.v0<?>> yVar = f15566h;
        if (yVar != null) {
            v0Var = yVar.get();
        } else {
            i9.v0<?> b10 = i9.v0.b(mVar.b());
            if (!mVar.d()) {
                b10.d();
            }
            v0Var = b10;
        }
        v0Var.c(30L, TimeUnit.SECONDS);
        return j9.a.k(v0Var).i(context).a();
    }

    private void k() {
        this.f15567a = Tasks.call(q6.p.f16301c, new Callable() { // from class: p6.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i9.u0 n10;
                n10 = f0.this.n();
                return n10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task l(i9.z0 z0Var, Task task) {
        return Tasks.forResult(((i9.u0) task.getResult()).e(z0Var, this.f15569c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i9.u0 n() {
        final i9.u0 j10 = j(this.f15571e, this.f15572f);
        this.f15568b.l(new Runnable() { // from class: p6.c0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.m(j10);
            }
        });
        this.f15569c = ((p.b) ((p.b) d7.p.f(j10).c(this.f15573g)).d(this.f15568b.o())).b();
        q6.v.a("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(i9.u0 u0Var) {
        q6.v.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        h();
        t(u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(final i9.u0 u0Var) {
        this.f15568b.l(new Runnable() { // from class: p6.z
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.p(u0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(i9.u0 u0Var) {
        u0Var.n();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void p(final i9.u0 u0Var) {
        i9.p k10 = u0Var.k(true);
        q6.v.a("GrpcCallProvider", "Current gRPC connectivity state: " + k10, new Object[0]);
        h();
        if (k10 == i9.p.CONNECTING) {
            q6.v.a("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.f15570d = this.f15568b.k(g.d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: p6.b0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.this.o(u0Var);
                }
            });
        }
        u0Var.l(k10, new Runnable() { // from class: p6.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.q(u0Var);
            }
        });
    }

    private void t(final i9.u0 u0Var) {
        this.f15568b.l(new Runnable() { // from class: p6.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.r(u0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <ReqT, RespT> Task<i9.g<ReqT, RespT>> i(final i9.z0<ReqT, RespT> z0Var) {
        return (Task<i9.g<ReqT, RespT>>) this.f15567a.continueWithTask(this.f15568b.o(), new Continuation() { // from class: p6.y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task l10;
                l10 = f0.this.l(z0Var, task);
                return l10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        try {
            i9.u0 u0Var = (i9.u0) Tasks.await(this.f15567a);
            u0Var.m();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (u0Var.i(1L, timeUnit)) {
                    return;
                }
                q6.v.a(w.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                u0Var.n();
                if (u0Var.i(60L, timeUnit)) {
                    return;
                }
                q6.v.e(w.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                u0Var.n();
                q6.v.e(w.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            q6.v.e(w.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            q6.v.e(w.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e10);
        }
    }
}
