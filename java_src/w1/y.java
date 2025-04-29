package w1;

import android.os.Looper;
import s1.n1;
import t1.t1;
import w1.o;
import w1.w;
/* loaded from: classes.dex */
public interface y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f19760a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final y f19761b;

    /* loaded from: classes.dex */
    class a implements y {
        a() {
        }

        @Override // w1.y
        public /* synthetic */ void a() {
            x.c(this);
        }

        @Override // w1.y
        public /* synthetic */ void b() {
            x.b(this);
        }

        @Override // w1.y
        public o c(w.a aVar, n1 n1Var) {
            if (n1Var.f17422x == null) {
                return null;
            }
            return new e0(new o.a(new p0(1), 6001));
        }

        @Override // w1.y
        public /* synthetic */ b d(w.a aVar, n1 n1Var) {
            return x.a(this, aVar, n1Var);
        }

        @Override // w1.y
        public void e(Looper looper, t1 t1Var) {
        }

        @Override // w1.y
        public int f(n1 n1Var) {
            return n1Var.f17422x != null ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19762a = new b() { // from class: w1.z
            @Override // w1.y.b
            public final void a() {
                a0.a();
            }
        };

        void a();
    }

    static {
        a aVar = new a();
        f19760a = aVar;
        f19761b = aVar;
    }

    void a();

    void b();

    o c(w.a aVar, n1 n1Var);

    b d(w.a aVar, n1 n1Var);

    void e(Looper looper, t1 t1Var);

    int f(n1 n1Var);
}
