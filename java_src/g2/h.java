package g2;

import com.google.common.collect.q;
import g2.i;
import java.util.Arrays;
import java.util.List;
import p3.a0;
import s1.n1;
import u1.i0;
import x1.h0;
/* loaded from: classes.dex */
final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f8925o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f8926p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f8927n;

    private static boolean n(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int f10 = a0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.l(bArr2, 0, bArr.length);
        a0Var.T(f10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(a0 a0Var) {
        return n(a0Var, f8925o);
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        return c(i0.e(a0Var.e()));
    }

    @Override // g2.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        n1.b Z;
        if (n(a0Var, f8925o)) {
            byte[] copyOf = Arrays.copyOf(a0Var.e(), a0Var.g());
            int c10 = i0.c(copyOf);
            List<byte[]> a10 = i0.a(copyOf);
            if (bVar.f8941a != null) {
                return true;
            }
            Z = new n1.b().g0("audio/opus").J(c10).h0(48000).V(a10);
        } else {
            byte[] bArr = f8926p;
            if (!n(a0Var, bArr)) {
                p3.a.h(bVar.f8941a);
                return false;
            }
            p3.a.h(bVar.f8941a);
            if (this.f8927n) {
                return true;
            }
            this.f8927n = true;
            a0Var.U(bArr.length);
            k2.a c11 = h0.c(q.w(h0.j(a0Var, false, false).f20153b));
            if (c11 == null) {
                return true;
            }
            Z = bVar.f8941a.b().Z(c11.b(bVar.f8941a.f17417s));
        }
        bVar.f8941a = Z.G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f8927n = false;
        }
    }
}
