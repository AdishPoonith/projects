package o3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.f;
/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: o3.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0212a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0213a> f14426a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: o3.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0213a {

                /* renamed from: a  reason: collision with root package name */
                private final Handler f14427a;

                /* renamed from: b  reason: collision with root package name */
                private final a f14428b;

                /* renamed from: c  reason: collision with root package name */
                private boolean f14429c;

                public C0213a(Handler handler, a aVar) {
                    this.f14427a = handler;
                    this.f14428b = aVar;
                }

                public void d() {
                    this.f14429c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0213a c0213a, int i10, long j10, long j11) {
                c0213a.f14428b.c0(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                p3.a.e(handler);
                p3.a.e(aVar);
                e(aVar);
                this.f14426a.add(new C0213a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0213a> it = this.f14426a.iterator();
                while (it.hasNext()) {
                    final C0213a next = it.next();
                    if (!next.f14429c) {
                        next.f14427a.post(new Runnable() { // from class: o3.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.a.C0212a.d(f.a.C0212a.C0213a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0213a> it = this.f14426a.iterator();
                while (it.hasNext()) {
                    C0213a next = it.next();
                    if (next.f14428b == aVar) {
                        next.d();
                        this.f14426a.remove(next);
                    }
                }
            }
        }

        void c0(int i10, long j10, long j11);
    }

    p0 a();

    void d(a aVar);

    long f();

    long g();

    void i(Handler handler, a aVar);
}
