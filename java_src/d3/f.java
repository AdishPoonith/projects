package d3;

import com.google.common.collect.q;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final c f7712a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final l f7713b = new l();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<m> f7714c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f7715d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7716e;

    /* loaded from: classes.dex */
    class a extends m {
        a() {
        }

        @Override // v1.h
        public void w() {
            f.this.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: j  reason: collision with root package name */
        private final long f7718j;

        /* renamed from: k  reason: collision with root package name */
        private final q<d3.b> f7719k;

        public b(long j10, q<d3.b> qVar) {
            this.f7718j = j10;
            this.f7719k = qVar;
        }

        @Override // d3.h
        public int b(long j10) {
            return this.f7718j > j10 ? 0 : -1;
        }

        @Override // d3.h
        public long g(int i10) {
            p3.a.a(i10 == 0);
            return this.f7718j;
        }

        @Override // d3.h
        public List<d3.b> h(long j10) {
            return j10 >= this.f7718j ? this.f7719k : q.z();
        }

        @Override // d3.h
        public int i() {
            return 1;
        }
    }

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f7714c.addFirst(new a());
        }
        this.f7715d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(m mVar) {
        p3.a.f(this.f7714c.size() < 2);
        p3.a.a(!this.f7714c.contains(mVar));
        mVar.l();
        this.f7714c.addFirst(mVar);
    }

    @Override // v1.d
    public void a() {
        this.f7716e = true;
    }

    @Override // d3.i
    public void b(long j10) {
    }

    @Override // v1.d
    public void flush() {
        p3.a.f(!this.f7716e);
        this.f7713b.l();
        this.f7715d = 0;
    }

    @Override // v1.d
    /* renamed from: g */
    public l e() {
        p3.a.f(!this.f7716e);
        if (this.f7715d != 0) {
            return null;
        }
        this.f7715d = 1;
        return this.f7713b;
    }

    @Override // v1.d
    /* renamed from: h */
    public m d() {
        p3.a.f(!this.f7716e);
        if (this.f7715d != 2 || this.f7714c.isEmpty()) {
            return null;
        }
        m removeFirst = this.f7714c.removeFirst();
        if (this.f7713b.r()) {
            removeFirst.k(4);
        } else {
            l lVar = this.f7713b;
            removeFirst.x(this.f7713b.f19366n, new b(lVar.f19366n, this.f7712a.a(((ByteBuffer) p3.a.e(lVar.f19364l)).array())), 0L);
        }
        this.f7713b.l();
        this.f7715d = 0;
        return removeFirst;
    }

    @Override // v1.d
    /* renamed from: i */
    public void c(l lVar) {
        p3.a.f(!this.f7716e);
        p3.a.f(this.f7715d == 1);
        p3.a.a(this.f7713b == lVar);
        this.f7715d = 2;
    }
}
