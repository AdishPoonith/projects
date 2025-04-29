package n3;

import java.util.List;
import s1.n1;
import s1.y3;
import u2.t0;
import u2.u;
/* loaded from: classes.dex */
public interface t extends w {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t0 f14253a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f14254b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14255c;

        public a(t0 t0Var, int... iArr) {
            this(t0Var, iArr, 0);
        }

        public a(t0 t0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                p3.r.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f14253a = t0Var;
            this.f14254b = iArr;
            this.f14255c = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        t[] a(a[] aVarArr, o3.f fVar, u.b bVar, y3 y3Var);
    }

    void e();

    boolean f(int i10, long j10);

    boolean g(int i10, long j10);

    void h(boolean z10);

    void i();

    int j(long j10, List<? extends w2.n> list);

    int k();

    boolean l(long j10, w2.f fVar, List<? extends w2.n> list);

    n1 m();

    int n();

    int o();

    void p(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr);

    void q(float f10);

    Object r();

    void s();

    void t();
}
