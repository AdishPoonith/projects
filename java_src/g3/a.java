package g3;

import android.graphics.Bitmap;
import d3.b;
import d3.g;
import d3.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p3.a0;
import p3.n0;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f8953o;

    /* renamed from: p  reason: collision with root package name */
    private final a0 f8954p;

    /* renamed from: q  reason: collision with root package name */
    private final C0148a f8955q;

    /* renamed from: r  reason: collision with root package name */
    private Inflater f8956r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0148a {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f8957a = new a0();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f8958b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f8959c;

        /* renamed from: d  reason: collision with root package name */
        private int f8960d;

        /* renamed from: e  reason: collision with root package name */
        private int f8961e;

        /* renamed from: f  reason: collision with root package name */
        private int f8962f;

        /* renamed from: g  reason: collision with root package name */
        private int f8963g;

        /* renamed from: h  reason: collision with root package name */
        private int f8964h;

        /* renamed from: i  reason: collision with root package name */
        private int f8965i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(a0 a0Var, int i10) {
            int J;
            if (i10 < 4) {
                return;
            }
            a0Var.U(3);
            int i11 = i10 - 4;
            if ((a0Var.G() & 128) != 0) {
                if (i11 < 7 || (J = a0Var.J()) < 4) {
                    return;
                }
                this.f8964h = a0Var.M();
                this.f8965i = a0Var.M();
                this.f8957a.P(J - 4);
                i11 -= 7;
            }
            int f10 = this.f8957a.f();
            int g10 = this.f8957a.g();
            if (f10 >= g10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, g10 - f10);
            a0Var.l(this.f8957a.e(), f10, min);
            this.f8957a.T(f10 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(a0 a0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f8960d = a0Var.M();
            this.f8961e = a0Var.M();
            a0Var.U(11);
            this.f8962f = a0Var.M();
            this.f8963g = a0Var.M();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(a0 a0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            a0Var.U(2);
            Arrays.fill(this.f8958b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int G = a0Var.G();
                int G2 = a0Var.G();
                int G3 = a0Var.G();
                int G4 = a0Var.G();
                int G5 = a0Var.G();
                double d10 = G2;
                double d11 = G3 - 128;
                int i13 = i12;
                double d12 = G4 - 128;
                this.f8958b[G] = n0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (n0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (G5 << 24) | (n0.q((int) ((1.402d * d11) + d10), 0, 255) << 16);
                i12 = i13 + 1;
            }
            this.f8959c = true;
        }

        public d3.b d() {
            int i10;
            if (this.f8960d == 0 || this.f8961e == 0 || this.f8964h == 0 || this.f8965i == 0 || this.f8957a.g() == 0 || this.f8957a.f() != this.f8957a.g() || !this.f8959c) {
                return null;
            }
            this.f8957a.T(0);
            int i11 = this.f8964h * this.f8965i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int G = this.f8957a.G();
                if (G != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f8958b[G];
                } else {
                    int G2 = this.f8957a.G();
                    if (G2 != 0) {
                        i10 = ((G2 & 64) == 0 ? G2 & 63 : ((G2 & 63) << 8) | this.f8957a.G()) + i12;
                        Arrays.fill(iArr, i12, i10, (G2 & 128) == 0 ? 0 : this.f8958b[this.f8957a.G()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0115b().f(Bitmap.createBitmap(iArr, this.f8964h, this.f8965i, Bitmap.Config.ARGB_8888)).k(this.f8962f / this.f8960d).l(0).h(this.f8963g / this.f8961e, 0).i(0).n(this.f8964h / this.f8960d).g(this.f8965i / this.f8961e).a();
        }

        public void h() {
            this.f8960d = 0;
            this.f8961e = 0;
            this.f8962f = 0;
            this.f8963g = 0;
            this.f8964h = 0;
            this.f8965i = 0;
            this.f8957a.P(0);
            this.f8959c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f8953o = new a0();
        this.f8954p = new a0();
        this.f8955q = new C0148a();
    }

    private void C(a0 a0Var) {
        if (a0Var.a() <= 0 || a0Var.j() != 120) {
            return;
        }
        if (this.f8956r == null) {
            this.f8956r = new Inflater();
        }
        if (n0.p0(a0Var, this.f8954p, this.f8956r)) {
            a0Var.R(this.f8954p.e(), this.f8954p.g());
        }
    }

    private static d3.b D(a0 a0Var, C0148a c0148a) {
        int g10 = a0Var.g();
        int G = a0Var.G();
        int M = a0Var.M();
        int f10 = a0Var.f() + M;
        d3.b bVar = null;
        if (f10 > g10) {
            a0Var.T(g10);
            return null;
        }
        if (G != 128) {
            switch (G) {
                case 20:
                    c0148a.g(a0Var, M);
                    break;
                case 21:
                    c0148a.e(a0Var, M);
                    break;
                case 22:
                    c0148a.f(a0Var, M);
                    break;
            }
        } else {
            bVar = c0148a.d();
            c0148a.h();
        }
        a0Var.T(f10);
        return bVar;
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        this.f8953o.R(bArr, i10);
        C(this.f8953o);
        this.f8955q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f8953o.a() >= 3) {
            d3.b D = D(this.f8953o, this.f8955q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
