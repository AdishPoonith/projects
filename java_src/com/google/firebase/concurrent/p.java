package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledFuture<?> f6694q;

    /* loaded from: classes.dex */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.x(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.w(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* loaded from: classes.dex */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c<V> cVar) {
        this.f6694q = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: C */
    public int compareTo(Delayed delayed) {
        return this.f6694q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f6694q.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void h() {
        this.f6694q.cancel(z());
    }
}
