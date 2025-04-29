package u2;

import android.os.Handler;
import s1.v1;
import s1.y3;
import t1.t1;
/* loaded from: classes.dex */
public interface u {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b extends s {
        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(s sVar) {
            super(sVar);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(u uVar, y3 y3Var);
    }

    v1 a();

    void b(r rVar);

    void c(c cVar);

    void d(c cVar);

    void e(b0 b0Var);

    void f();

    boolean g();

    void h(c cVar, o3.p0 p0Var, t1 t1Var);

    y3 j();

    void k(c cVar);

    void l(Handler handler, b0 b0Var);

    r n(b bVar, o3.b bVar2, long j10);

    void p(Handler handler, w1.w wVar);

    void q(w1.w wVar);
}
