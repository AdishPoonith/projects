package p0;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class n0 extends AbstractList<j0> {

    /* renamed from: p  reason: collision with root package name */
    public static final b f14977p = new b(null);

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicInteger f14978q = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private Handler f14979j;

    /* renamed from: k  reason: collision with root package name */
    private int f14980k;

    /* renamed from: l  reason: collision with root package name */
    private final String f14981l;

    /* renamed from: m  reason: collision with root package name */
    private List<j0> f14982m;

    /* renamed from: n  reason: collision with root package name */
    private List<a> f14983n;

    /* renamed from: o  reason: collision with root package name */
    private String f14984o;

    /* loaded from: classes.dex */
    public interface a {
        void b(n0 n0Var);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c extends a {
        void a(n0 n0Var, long j10, long j11);
    }

    public n0(Collection<j0> requests) {
        kotlin.jvm.internal.l.e(requests, "requests");
        this.f14981l = String.valueOf(Integer.valueOf(f14978q.incrementAndGet()));
        this.f14983n = new ArrayList();
        this.f14982m = new ArrayList(requests);
    }

    public n0(j0... requests) {
        List b10;
        kotlin.jvm.internal.l.e(requests, "requests");
        this.f14981l = String.valueOf(Integer.valueOf(f14978q.incrementAndGet()));
        this.f14983n = new ArrayList();
        b10 = t9.j.b(requests);
        this.f14982m = new ArrayList(b10);
    }

    private final List<o0> p() {
        return j0.f14918n.j(this);
    }

    private final m0 r() {
        return j0.f14918n.m(this);
    }

    public /* bridge */ int A(j0 j0Var) {
        return super.indexOf(j0Var);
    }

    public /* bridge */ int B(j0 j0Var) {
        return super.lastIndexOf(j0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: C */
    public final /* bridge */ j0 remove(int i10) {
        return E(i10);
    }

    public /* bridge */ boolean D(j0 j0Var) {
        return super.remove(j0Var);
    }

    public j0 E(int i10) {
        return this.f14982m.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: F */
    public j0 set(int i10, j0 element) {
        kotlin.jvm.internal.l.e(element, "element");
        return this.f14982m.set(i10, element);
    }

    public final void G(Handler handler) {
        this.f14979j = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i10, j0 element) {
        kotlin.jvm.internal.l.e(element, "element");
        this.f14982m.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f14982m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return l((j0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(j0 element) {
        kotlin.jvm.internal.l.e(element, "element");
        return this.f14982m.add(element);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return A((j0) obj);
        }
        return -1;
    }

    public final void k(a callback) {
        kotlin.jvm.internal.l.e(callback, "callback");
        if (this.f14983n.contains(callback)) {
            return;
        }
        this.f14983n.add(callback);
    }

    public /* bridge */ boolean l(j0 j0Var) {
        return super.contains(j0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return B((j0) obj);
        }
        return -1;
    }

    public final List<o0> m() {
        return p();
    }

    public final m0 q() {
        return r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return D((j0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: s */
    public j0 get(int i10) {
        return this.f14982m.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return y();
    }

    public final String t() {
        return this.f14984o;
    }

    public final Handler u() {
        return this.f14979j;
    }

    public final List<a> v() {
        return this.f14983n;
    }

    public final String w() {
        return this.f14981l;
    }

    public final List<j0> x() {
        return this.f14982m;
    }

    public int y() {
        return this.f14982m.size();
    }

    public final int z() {
        return this.f14980k;
    }
}
