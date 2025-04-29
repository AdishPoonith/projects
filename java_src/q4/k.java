package q4;

import android.app.Activity;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k extends com.google.android.gms.common.api.e implements t4.b {

    /* renamed from: k  reason: collision with root package name */
    static final a.g f16195k;

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f16196l;

    static {
        a.g gVar = new a.g();
        f16195k = gVar;
        f16196l = new com.google.android.gms.common.api.a("LocationServices.API", new h(), gVar);
    }

    public k(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) f16196l, a.d.f3749c, e.a.f3761c);
    }

    private final Task z(final LocationRequest locationRequest, com.google.android.gms.common.api.internal.j jVar) {
        final j jVar2 = new j(this, jVar, new i() { // from class: q4.c
            @Override // q4.i
            public final void a(a0 a0Var, j.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
                a0Var.k0(aVar, z10, taskCompletionSource);
            }
        });
        return l(com.google.android.gms.common.api.internal.p.a().b(new com.google.android.gms.common.api.internal.q() { // from class: q4.d
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                com.google.android.gms.common.api.a aVar = k.f16196l;
                ((a0) obj).m0(j.this, locationRequest, (TaskCompletionSource) obj2);
            }
        }).d(jVar2).e(jVar).c(2436).a());
    }

    @Override // t4.b
    public final Task<Void> e(t4.d dVar) {
        return m(com.google.android.gms.common.api.internal.k.b(dVar, t4.d.class.getSimpleName()), 2418).continueWith(new Executor() { // from class: q4.g
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Continuation() { // from class: q4.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                com.google.android.gms.common.api.a aVar = k.f16196l;
                return null;
            }
        });
    }

    @Override // t4.b
    public final Task<Void> f(LocationRequest locationRequest, t4.d dVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            c4.s.k(looper, "invalid null looper");
        }
        return z(locationRequest, com.google.android.gms.common.api.internal.k.a(dVar, looper, t4.d.class.getSimpleName()));
    }
}
