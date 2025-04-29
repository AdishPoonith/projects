package k2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k2.a;
import p3.n0;
import s1.m3;
import s1.n1;
import s1.o1;
/* loaded from: classes.dex */
public final class g extends s1.f implements Handler.Callback {
    private final boolean A;
    private c B;
    private boolean C;
    private boolean D;
    private long E;
    private a F;
    private long G;

    /* renamed from: w  reason: collision with root package name */
    private final d f12498w;

    /* renamed from: x  reason: collision with root package name */
    private final f f12499x;

    /* renamed from: y  reason: collision with root package name */
    private final Handler f12500y;

    /* renamed from: z  reason: collision with root package name */
    private final e f12501z;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f12496a);
    }

    public g(f fVar, Looper looper, d dVar) {
        this(fVar, looper, dVar, false);
    }

    public g(f fVar, Looper looper, d dVar, boolean z10) {
        super(5);
        this.f12499x = (f) p3.a.e(fVar);
        this.f12500y = looper == null ? null : n0.v(looper, this);
        this.f12498w = (d) p3.a.e(dVar);
        this.A = z10;
        this.f12501z = new e();
        this.G = -9223372036854775807L;
    }

    private void R(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            n1 n10 = aVar.d(i10).n();
            if (n10 == null || !this.f12498w.a(n10)) {
                list.add(aVar.d(i10));
            } else {
                c b10 = this.f12498w.b(n10);
                byte[] bArr = (byte[]) p3.a.e(aVar.d(i10).w());
                this.f12501z.l();
                this.f12501z.x(bArr.length);
                ((ByteBuffer) n0.j(this.f12501z.f19364l)).put(bArr);
                this.f12501z.y();
                a a10 = b10.a(this.f12501z);
                if (a10 != null) {
                    R(a10, list);
                }
            }
        }
    }

    private long S(long j10) {
        p3.a.f(j10 != -9223372036854775807L);
        p3.a.f(this.G != -9223372036854775807L);
        return j10 - this.G;
    }

    private void T(a aVar) {
        Handler handler = this.f12500y;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            U(aVar);
        }
    }

    private void U(a aVar) {
        this.f12499x.x(aVar);
    }

    private boolean V(long j10) {
        boolean z10;
        a aVar = this.F;
        if (aVar == null || (!this.A && aVar.f12495k > S(j10))) {
            z10 = false;
        } else {
            T(this.F);
            this.F = null;
            z10 = true;
        }
        if (this.C && this.F == null) {
            this.D = true;
        }
        return z10;
    }

    private void W() {
        if (this.C || this.F != null) {
            return;
        }
        this.f12501z.l();
        o1 C = C();
        int O = O(C, this.f12501z, 0);
        if (O != -4) {
            if (O == -5) {
                this.E = ((n1) p3.a.e(C.f17464b)).f17423y;
            }
        } else if (this.f12501z.r()) {
            this.C = true;
        } else {
            e eVar = this.f12501z;
            eVar.f12497r = this.E;
            eVar.y();
            a a10 = ((c) n0.j(this.B)).a(this.f12501z);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.e());
                R(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.F = new a(S(this.f12501z.f19366n), arrayList);
            }
        }
    }

    @Override // s1.f
    protected void H() {
        this.F = null;
        this.B = null;
        this.G = -9223372036854775807L;
    }

    @Override // s1.f
    protected void J(long j10, boolean z10) {
        this.F = null;
        this.C = false;
        this.D = false;
    }

    @Override // s1.f
    protected void N(n1[] n1VarArr, long j10, long j11) {
        this.B = this.f12498w.b(n1VarArr[0]);
        a aVar = this.F;
        if (aVar != null) {
            this.F = aVar.c((aVar.f12495k + this.G) - j11);
        }
        this.G = j11;
    }

    @Override // s1.n3
    public int a(n1 n1Var) {
        if (this.f12498w.a(n1Var)) {
            return m3.a(n1Var.P == 0 ? 4 : 2);
        }
        return m3.a(0);
    }

    @Override // s1.l3
    public boolean b() {
        return this.D;
    }

    @Override // s1.l3
    public boolean d() {
        return true;
    }

    @Override // s1.l3, s1.n3
    public String f() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            U((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // s1.l3
    public void l(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            W();
            z10 = V(j10);
        }
    }
}
