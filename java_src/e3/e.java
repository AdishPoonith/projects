package e3;

import d3.i;
import d3.l;
import d3.m;
import e3.e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p3.n0;
import v1.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f8105a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<m> f8106b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f8107c;

    /* renamed from: d  reason: collision with root package name */
    private b f8108d;

    /* renamed from: e  reason: collision with root package name */
    private long f8109e;

    /* renamed from: f  reason: collision with root package name */
    private long f8110f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends l implements Comparable<b> {

        /* renamed from: s  reason: collision with root package name */
        private long f8111s;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: D */
        public int compareTo(b bVar) {
            if (r() != bVar.r()) {
                return r() ? 1 : -1;
            }
            long j10 = this.f19366n - bVar.f19366n;
            if (j10 == 0) {
                j10 = this.f8111s - bVar.f8111s;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends m {

        /* renamed from: o  reason: collision with root package name */
        private h.a<c> f8112o;

        public c(h.a<c> aVar) {
            this.f8112o = aVar;
        }

        @Override // v1.h
        public final void w() {
            this.f8112o.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f8105a.add(new b());
        }
        this.f8106b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f8106b.add(new c(new h.a() { // from class: e3.d
                @Override // v1.h.a
                public final void a(h hVar) {
                    e.this.o((e.c) hVar);
                }
            }));
        }
        this.f8107c = new PriorityQueue<>();
    }

    private void n(b bVar) {
        bVar.l();
        this.f8105a.add(bVar);
    }

    @Override // v1.d
    public void a() {
    }

    @Override // d3.i
    public void b(long j10) {
        this.f8109e = j10;
    }

    protected abstract d3.h f();

    @Override // v1.d
    public void flush() {
        this.f8110f = 0L;
        this.f8109e = 0L;
        while (!this.f8107c.isEmpty()) {
            n((b) n0.j(this.f8107c.poll()));
        }
        b bVar = this.f8108d;
        if (bVar != null) {
            n(bVar);
            this.f8108d = null;
        }
    }

    protected abstract void g(l lVar);

    @Override // v1.d
    /* renamed from: h */
    public l e() {
        p3.a.f(this.f8108d == null);
        if (this.f8105a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f8105a.pollFirst();
        this.f8108d = pollFirst;
        return pollFirst;
    }

    @Override // v1.d
    /* renamed from: i */
    public m d() {
        m mVar;
        if (this.f8106b.isEmpty()) {
            return null;
        }
        while (!this.f8107c.isEmpty() && ((b) n0.j(this.f8107c.peek())).f19366n <= this.f8109e) {
            b bVar = (b) n0.j(this.f8107c.poll());
            if (bVar.r()) {
                mVar = (m) n0.j(this.f8106b.pollFirst());
                mVar.k(4);
            } else {
                g(bVar);
                if (l()) {
                    d3.h f10 = f();
                    mVar = (m) n0.j(this.f8106b.pollFirst());
                    mVar.x(bVar.f19366n, f10, Long.MAX_VALUE);
                } else {
                    n(bVar);
                }
            }
            n(bVar);
            return mVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m j() {
        return this.f8106b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long k() {
        return this.f8109e;
    }

    protected abstract boolean l();

    @Override // v1.d
    /* renamed from: m */
    public void c(l lVar) {
        p3.a.a(lVar == this.f8108d);
        b bVar = (b) lVar;
        if (bVar.q()) {
            n(bVar);
        } else {
            long j10 = this.f8110f;
            this.f8110f = 1 + j10;
            bVar.f8111s = j10;
            this.f8107c.add(bVar);
        }
        this.f8108d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(m mVar) {
        mVar.l();
        this.f8106b.add(mVar);
    }
}
