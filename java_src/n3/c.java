package n3;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p3.n0;
import s1.n1;
import u2.t0;
/* loaded from: classes.dex */
public abstract class c implements t {

    /* renamed from: a  reason: collision with root package name */
    protected final t0 f14144a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f14145b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f14146c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14147d;

    /* renamed from: e  reason: collision with root package name */
    private final n1[] f14148e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f14149f;

    /* renamed from: g  reason: collision with root package name */
    private int f14150g;

    public c(t0 t0Var, int... iArr) {
        this(t0Var, iArr, 0);
    }

    public c(t0 t0Var, int[] iArr, int i10) {
        int i11 = 0;
        p3.a.f(iArr.length > 0);
        this.f14147d = i10;
        this.f14144a = (t0) p3.a.e(t0Var);
        int length = iArr.length;
        this.f14145b = length;
        this.f14148e = new n1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f14148e[i12] = t0Var.b(iArr[i12]);
        }
        Arrays.sort(this.f14148e, new Comparator() { // from class: n3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w10;
                w10 = c.w((n1) obj, (n1) obj2);
                return w10;
            }
        });
        this.f14146c = new int[this.f14145b];
        while (true) {
            int i13 = this.f14145b;
            if (i11 >= i13) {
                this.f14149f = new long[i13];
                return;
            } else {
                this.f14146c[i11] = t0Var.c(this.f14148e[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(n1 n1Var, n1 n1Var2) {
        return n1Var2.f17415q - n1Var.f17415q;
    }

    @Override // n3.w
    public final n1 a(int i10) {
        return this.f14148e[i10];
    }

    @Override // n3.w
    public final int b(int i10) {
        return this.f14146c[i10];
    }

    @Override // n3.w
    public final t0 c() {
        return this.f14144a;
    }

    @Override // n3.w
    public final int d(n1 n1Var) {
        for (int i10 = 0; i10 < this.f14145b; i10++) {
            if (this.f14148e[i10] == n1Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // n3.t
    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14144a == cVar.f14144a && Arrays.equals(this.f14146c, cVar.f14146c);
    }

    @Override // n3.t
    public boolean f(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean g10 = g(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f14145b && !g10) {
            g10 = (i11 == i10 || g(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (g10) {
            long[] jArr = this.f14149f;
            jArr[i10] = Math.max(jArr[i10], n0.b(elapsedRealtime, j10, Long.MAX_VALUE));
            return true;
        }
        return false;
    }

    @Override // n3.t
    public boolean g(int i10, long j10) {
        return this.f14149f[i10] > j10;
    }

    @Override // n3.t
    public /* synthetic */ void h(boolean z10) {
        s.b(this, z10);
    }

    public int hashCode() {
        if (this.f14150g == 0) {
            this.f14150g = (System.identityHashCode(this.f14144a) * 31) + Arrays.hashCode(this.f14146c);
        }
        return this.f14150g;
    }

    @Override // n3.t
    public void i() {
    }

    @Override // n3.t
    public int j(long j10, List<? extends w2.n> list) {
        return list.size();
    }

    @Override // n3.t
    public final int k() {
        return this.f14146c[o()];
    }

    @Override // n3.t
    public /* synthetic */ boolean l(long j10, w2.f fVar, List list) {
        return s.d(this, j10, fVar, list);
    }

    @Override // n3.w
    public final int length() {
        return this.f14146c.length;
    }

    @Override // n3.t
    public final n1 m() {
        return this.f14148e[o()];
    }

    @Override // n3.t
    public void q(float f10) {
    }

    @Override // n3.t
    public /* synthetic */ void s() {
        s.a(this);
    }

    @Override // n3.t
    public /* synthetic */ void t() {
        s.c(this);
    }

    @Override // n3.w
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f14145b; i11++) {
            if (this.f14146c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
