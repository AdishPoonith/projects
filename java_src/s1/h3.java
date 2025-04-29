package s1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
final class h3 extends a {

    /* renamed from: r  reason: collision with root package name */
    private final int f17244r;

    /* renamed from: s  reason: collision with root package name */
    private final int f17245s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f17246t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f17247u;

    /* renamed from: v  reason: collision with root package name */
    private final y3[] f17248v;

    /* renamed from: w  reason: collision with root package name */
    private final Object[] f17249w;

    /* renamed from: x  reason: collision with root package name */
    private final HashMap<Object, Integer> f17250x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Collection<? extends f2> collection, u2.p0 p0Var) {
        super(false, p0Var);
        int i10 = 0;
        int size = collection.size();
        this.f17246t = new int[size];
        this.f17247u = new int[size];
        this.f17248v = new y3[size];
        this.f17249w = new Object[size];
        this.f17250x = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (f2 f2Var : collection) {
            this.f17248v[i12] = f2Var.b();
            this.f17247u[i12] = i10;
            this.f17246t[i12] = i11;
            i10 += this.f17248v[i12].t();
            i11 += this.f17248v[i12].m();
            this.f17249w[i12] = f2Var.a();
            this.f17250x.put(this.f17249w[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f17244r = i10;
        this.f17245s = i11;
    }

    @Override // s1.a
    protected Object B(int i10) {
        return this.f17249w[i10];
    }

    @Override // s1.a
    protected int D(int i10) {
        return this.f17246t[i10];
    }

    @Override // s1.a
    protected int E(int i10) {
        return this.f17247u[i10];
    }

    @Override // s1.a
    protected y3 H(int i10) {
        return this.f17248v[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<y3> I() {
        return Arrays.asList(this.f17248v);
    }

    @Override // s1.y3
    public int m() {
        return this.f17245s;
    }

    @Override // s1.y3
    public int t() {
        return this.f17244r;
    }

    @Override // s1.a
    protected int w(Object obj) {
        Integer num = this.f17250x.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // s1.a
    protected int x(int i10) {
        return p3.n0.h(this.f17246t, i10 + 1, false, false);
    }

    @Override // s1.a
    protected int y(int i10) {
        return p3.n0.h(this.f17247u, i10 + 1, false, false);
    }
}
