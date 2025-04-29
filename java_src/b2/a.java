package b2;

import b2.e;
import java.util.Collections;
import p3.a0;
import s1.n1;
import u1.a;
import x1.e0;
/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2858e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f2859b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2860c;

    /* renamed from: d  reason: collision with root package name */
    private int f2861d;

    public a(e0 e0Var) {
        super(e0Var);
    }

    @Override // b2.e
    protected boolean b(a0 a0Var) {
        n1.b h02;
        if (this.f2859b) {
            a0Var.U(1);
        } else {
            int G = a0Var.G();
            int i10 = (G >> 4) & 15;
            this.f2861d = i10;
            if (i10 == 2) {
                h02 = new n1.b().g0("audio/mpeg").J(1).h0(f2858e[(G >> 2) & 3]);
            } else if (i10 == 7 || i10 == 8) {
                h02 = new n1.b().g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000);
            } else {
                if (i10 != 10) {
                    throw new e.a("Audio format not supported: " + this.f2861d);
                }
                this.f2859b = true;
            }
            this.f2883a.e(h02.G());
            this.f2860c = true;
            this.f2859b = true;
        }
        return true;
    }

    @Override // b2.e
    protected boolean c(a0 a0Var, long j10) {
        if (this.f2861d == 2) {
            int a10 = a0Var.a();
            this.f2883a.d(a0Var, a10);
            this.f2883a.c(j10, 1, a10, 0, null);
            return true;
        }
        int G = a0Var.G();
        if (G != 0 || this.f2860c) {
            if (this.f2861d != 10 || G == 1) {
                int a11 = a0Var.a();
                this.f2883a.d(a0Var, a11);
                this.f2883a.c(j10, 1, a11, 0, null);
                return true;
            }
            return false;
        }
        int a12 = a0Var.a();
        byte[] bArr = new byte[a12];
        a0Var.l(bArr, 0, a12);
        a.b f10 = u1.a.f(bArr);
        this.f2883a.e(new n1.b().g0("audio/mp4a-latm").K(f10.f18460c).J(f10.f18459b).h0(f10.f18458a).V(Collections.singletonList(bArr)).G());
        this.f2860c = true;
        return false;
    }
}
