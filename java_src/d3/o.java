package d3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.q;
import p3.n0;
import p3.r;
import p3.v;
import s1.m3;
import s1.n1;
import s1.o1;
/* loaded from: classes.dex */
public final class o extends s1.f implements Handler.Callback {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private n1 E;
    private i F;
    private l G;
    private m H;
    private m I;
    private int J;
    private long K;
    private long L;
    private long M;

    /* renamed from: w  reason: collision with root package name */
    private final Handler f7726w;

    /* renamed from: x  reason: collision with root package name */
    private final n f7727x;

    /* renamed from: y  reason: collision with root package name */
    private final k f7728y;

    /* renamed from: z  reason: collision with root package name */
    private final o1 f7729z;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f7722a);
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        this.f7727x = (n) p3.a.e(nVar);
        this.f7726w = looper == null ? null : n0.v(looper, this);
        this.f7728y = kVar;
        this.f7729z = new o1();
        this.K = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
    }

    private void R() {
        c0(new e(q.z(), U(this.M)));
    }

    private long S(long j10) {
        int b10 = this.H.b(j10);
        if (b10 == 0 || this.H.i() == 0) {
            return this.H.f19372k;
        }
        if (b10 == -1) {
            m mVar = this.H;
            return mVar.g(mVar.i() - 1);
        }
        return this.H.g(b10 - 1);
    }

    private long T() {
        if (this.J == -1) {
            return Long.MAX_VALUE;
        }
        p3.a.e(this.H);
        if (this.J >= this.H.i()) {
            return Long.MAX_VALUE;
        }
        return this.H.g(this.J);
    }

    private long U(long j10) {
        p3.a.f(j10 != -9223372036854775807L);
        p3.a.f(this.L != -9223372036854775807L);
        return j10 - this.L;
    }

    private void V(j jVar) {
        r.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.E, jVar);
        R();
        a0();
    }

    private void W() {
        this.C = true;
        this.F = this.f7728y.b((n1) p3.a.e(this.E));
    }

    private void X(e eVar) {
        this.f7727x.i(eVar.f7710j);
        this.f7727x.d(eVar);
    }

    private void Y() {
        this.G = null;
        this.J = -1;
        m mVar = this.H;
        if (mVar != null) {
            mVar.w();
            this.H = null;
        }
        m mVar2 = this.I;
        if (mVar2 != null) {
            mVar2.w();
            this.I = null;
        }
    }

    private void Z() {
        Y();
        ((i) p3.a.e(this.F)).a();
        this.F = null;
        this.D = 0;
    }

    private void a0() {
        Z();
        W();
    }

    private void c0(e eVar) {
        Handler handler = this.f7726w;
        if (handler != null) {
            handler.obtainMessage(0, eVar).sendToTarget();
        } else {
            X(eVar);
        }
    }

    @Override // s1.f
    protected void H() {
        this.E = null;
        this.K = -9223372036854775807L;
        R();
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
        Z();
    }

    @Override // s1.f
    protected void J(long j10, boolean z10) {
        this.M = j10;
        R();
        this.A = false;
        this.B = false;
        this.K = -9223372036854775807L;
        if (this.D != 0) {
            a0();
            return;
        }
        Y();
        ((i) p3.a.e(this.F)).flush();
    }

    @Override // s1.f
    protected void N(n1[] n1VarArr, long j10, long j11) {
        this.L = j11;
        this.E = n1VarArr[0];
        if (this.F != null) {
            this.D = 1;
        } else {
            W();
        }
    }

    @Override // s1.n3
    public int a(n1 n1Var) {
        if (this.f7728y.a(n1Var)) {
            return m3.a(n1Var.P == 0 ? 4 : 2);
        }
        return m3.a(v.r(n1Var.f17419u) ? 1 : 0);
    }

    @Override // s1.l3
    public boolean b() {
        return this.B;
    }

    public void b0(long j10) {
        p3.a.f(t());
        this.K = j10;
    }

    @Override // s1.l3
    public boolean d() {
        return true;
    }

    @Override // s1.l3, s1.n3
    public String f() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            X((e) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // s1.l3
    public void l(long j10, long j11) {
        boolean z10;
        this.M = j10;
        if (t()) {
            long j12 = this.K;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                Y();
                this.B = true;
            }
        }
        if (this.B) {
            return;
        }
        if (this.I == null) {
            ((i) p3.a.e(this.F)).b(j10);
            try {
                this.I = ((i) p3.a.e(this.F)).d();
            } catch (j e10) {
                V(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.H != null) {
            long T = T();
            z10 = false;
            while (T <= j10) {
                this.J++;
                T = T();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        m mVar = this.I;
        if (mVar != null) {
            if (mVar.r()) {
                if (!z10 && T() == Long.MAX_VALUE) {
                    if (this.D == 2) {
                        a0();
                    } else {
                        Y();
                        this.B = true;
                    }
                }
            } else if (mVar.f19372k <= j10) {
                m mVar2 = this.H;
                if (mVar2 != null) {
                    mVar2.w();
                }
                this.J = mVar.b(j10);
                this.H = mVar;
                this.I = null;
                z10 = true;
            }
        }
        if (z10) {
            p3.a.e(this.H);
            c0(new e(this.H.h(j10), U(S(j10))));
        }
        if (this.D == 2) {
            return;
        }
        while (!this.A) {
            try {
                l lVar = this.G;
                if (lVar == null) {
                    lVar = ((i) p3.a.e(this.F)).e();
                    if (lVar == null) {
                        return;
                    }
                    this.G = lVar;
                }
                if (this.D == 1) {
                    lVar.v(4);
                    ((i) p3.a.e(this.F)).c(lVar);
                    this.G = null;
                    this.D = 2;
                    return;
                }
                int O = O(this.f7729z, lVar, 0);
                if (O == -4) {
                    if (lVar.r()) {
                        this.A = true;
                        this.C = false;
                    } else {
                        n1 n1Var = this.f7729z.f17464b;
                        if (n1Var == null) {
                            return;
                        }
                        lVar.f7723r = n1Var.f17423y;
                        lVar.y();
                        this.C &= !lVar.t();
                    }
                    if (!this.C) {
                        ((i) p3.a.e(this.F)).c(lVar);
                        this.G = null;
                    }
                } else if (O == -3) {
                    return;
                }
            } catch (j e11) {
                V(e11);
                return;
            }
        }
    }
}
