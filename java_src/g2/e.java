package g2;

import java.util.Arrays;
import p3.a0;
import x1.m;
import x1.o;
/* loaded from: classes.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f8909a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final a0 f8910b = new a0(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f8911c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f8912d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8913e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f8912d = 0;
        do {
            int i13 = this.f8912d;
            int i14 = i10 + i13;
            f fVar = this.f8909a;
            if (i14 >= fVar.f8920g) {
                break;
            }
            int[] iArr = fVar.f8923j;
            this.f8912d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f8909a;
    }

    public a0 c() {
        return this.f8910b;
    }

    public boolean d(m mVar) {
        int i10;
        p3.a.f(mVar != null);
        if (this.f8913e) {
            this.f8913e = false;
            this.f8910b.P(0);
        }
        while (!this.f8913e) {
            if (this.f8911c < 0) {
                if (!this.f8909a.c(mVar) || !this.f8909a.a(mVar, true)) {
                    return false;
                }
                f fVar = this.f8909a;
                int i11 = fVar.f8921h;
                if ((fVar.f8915b & 1) == 1 && this.f8910b.g() == 0) {
                    i11 += a(0);
                    i10 = this.f8912d + 0;
                } else {
                    i10 = 0;
                }
                if (!o.e(mVar, i11)) {
                    return false;
                }
                this.f8911c = i10;
            }
            int a10 = a(this.f8911c);
            int i12 = this.f8911c + this.f8912d;
            if (a10 > 0) {
                a0 a0Var = this.f8910b;
                a0Var.c(a0Var.g() + a10);
                if (!o.d(mVar, this.f8910b.e(), this.f8910b.g(), a10)) {
                    return false;
                }
                a0 a0Var2 = this.f8910b;
                a0Var2.S(a0Var2.g() + a10);
                this.f8913e = this.f8909a.f8923j[i12 + (-1)] != 255;
            }
            if (i12 == this.f8909a.f8920g) {
                i12 = -1;
            }
            this.f8911c = i12;
        }
        return true;
    }

    public void e() {
        this.f8909a.b();
        this.f8910b.P(0);
        this.f8911c = -1;
        this.f8913e = false;
    }

    public void f() {
        if (this.f8910b.e().length == 65025) {
            return;
        }
        a0 a0Var = this.f8910b;
        a0Var.R(Arrays.copyOf(a0Var.e(), Math.max(65025, this.f8910b.g())), this.f8910b.g());
    }
}
