package p3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p3.l;
/* loaded from: classes.dex */
public final class q<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d f15416a;

    /* renamed from: b  reason: collision with root package name */
    private final n f15417b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f15418c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f15419d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<Runnable> f15420e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<Runnable> f15421f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f15422g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15423h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15424i;

    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t10, l lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f15425a;

        /* renamed from: b  reason: collision with root package name */
        private l.b f15426b = new l.b();

        /* renamed from: c  reason: collision with root package name */
        private boolean f15427c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15428d;

        public c(T t10) {
            this.f15425a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f15428d) {
                return;
            }
            if (i10 != -1) {
                this.f15426b.a(i10);
            }
            this.f15427c = true;
            aVar.invoke(this.f15425a);
        }

        public void b(b<T> bVar) {
            if (this.f15428d || !this.f15427c) {
                return;
            }
            l e10 = this.f15426b.e();
            this.f15426b = new l.b();
            this.f15427c = false;
            bVar.a(this.f15425a, e10);
        }

        public void c(b<T> bVar) {
            this.f15428d = true;
            if (this.f15427c) {
                this.f15427c = false;
                bVar.a(this.f15425a, this.f15426b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f15425a.equals(((c) obj).f15425a);
        }

        public int hashCode() {
            return this.f15425a.hashCode();
        }
    }

    public q(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f15416a = dVar;
        this.f15419d = copyOnWriteArraySet;
        this.f15418c = bVar;
        this.f15422g = new Object();
        this.f15420e = new ArrayDeque<>();
        this.f15421f = new ArrayDeque<>();
        this.f15417b = dVar.c(looper, new Handler.Callback() { // from class: p3.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g10;
                g10 = q.this.g(message);
                return g10;
            }
        });
        this.f15424i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f15419d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f15418c);
            if (this.f15417b.b(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void l() {
        if (this.f15424i) {
            p3.a.f(Thread.currentThread() == this.f15417b.j().getThread());
        }
    }

    public void c(T t10) {
        p3.a.e(t10);
        synchronized (this.f15422g) {
            if (this.f15423h) {
                return;
            }
            this.f15419d.add(new c<>(t10));
        }
    }

    public q<T> d(Looper looper, d dVar, b<T> bVar) {
        return new q<>(this.f15419d, looper, dVar, bVar);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f15416a, bVar);
    }

    public void f() {
        l();
        if (this.f15421f.isEmpty()) {
            return;
        }
        if (!this.f15417b.b(0)) {
            n nVar = this.f15417b;
            nVar.a(nVar.l(0));
        }
        boolean z10 = !this.f15420e.isEmpty();
        this.f15420e.addAll(this.f15421f);
        this.f15421f.clear();
        if (z10) {
            return;
        }
        while (!this.f15420e.isEmpty()) {
            this.f15420e.peekFirst().run();
            this.f15420e.removeFirst();
        }
    }

    public void i(final int i10, final a<T> aVar) {
        l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f15419d);
        this.f15421f.add(new Runnable() { // from class: p3.p
            @Override // java.lang.Runnable
            public final void run() {
                q.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        l();
        synchronized (this.f15422g) {
            this.f15423h = true;
        }
        Iterator<c<T>> it = this.f15419d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f15418c);
        }
        this.f15419d.clear();
    }

    public void k(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }
}
