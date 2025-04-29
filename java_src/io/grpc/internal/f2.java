package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: d  reason: collision with root package name */
    private static final f2 f11173d = new f2(new a());

    /* renamed from: a  reason: collision with root package name */
    private final IdentityHashMap<d<?>, c> f11174a = new IdentityHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final e f11175b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledExecutorService f11176c;

    /* loaded from: classes.dex */
    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.f2.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(r0.i("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f11177j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f11178k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Object f11179l;

        b(c cVar, d dVar, Object obj) {
            this.f11177j = cVar;
            this.f11178k = dVar;
            this.f11179l = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f2.this) {
                if (this.f11177j.f11182b == 0) {
                    this.f11178k.b(this.f11179l);
                    f2.this.f11174a.remove(this.f11178k);
                    if (f2.this.f11174a.isEmpty()) {
                        f2.this.f11176c.shutdown();
                        f2.this.f11176c = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f11181a;

        /* renamed from: b  reason: collision with root package name */
        int f11182b;

        /* renamed from: c  reason: collision with root package name */
        ScheduledFuture<?> f11183c;

        c(Object obj) {
            this.f11181a = obj;
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();

        void b(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        ScheduledExecutorService a();
    }

    f2(e eVar) {
        this.f11175b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return (T) f11173d.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t10) {
        return (T) f11173d.g(dVar, t10);
    }

    synchronized <T> T e(d<T> dVar) {
        c cVar;
        cVar = this.f11174a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.a());
            this.f11174a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f11183c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f11183c = null;
        }
        cVar.f11182b++;
        return (T) cVar.f11181a;
    }

    synchronized <T> T g(d<T> dVar, T t10) {
        c cVar = this.f11174a.get(dVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        b5.n.e(t10 == cVar.f11181a, "Releasing the wrong instance");
        b5.n.u(cVar.f11182b > 0, "Refcount has already reached zero");
        int i10 = cVar.f11182b - 1;
        cVar.f11182b = i10;
        if (i10 == 0) {
            b5.n.u(cVar.f11183c == null, "Destroy task already scheduled");
            if (this.f11176c == null) {
                this.f11176c = this.f11175b.a();
            }
            cVar.f11183c = this.f11176c.schedule(new d1(new b(cVar, dVar, t10)), 1L, TimeUnit.SECONDS);
        }
        return null;
    }
}
