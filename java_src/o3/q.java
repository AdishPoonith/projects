package o3;

import java.util.Arrays;
import o3.b;
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14533a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14534b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f14535c;

    /* renamed from: d  reason: collision with root package name */
    private int f14536d;

    /* renamed from: e  reason: collision with root package name */
    private int f14537e;

    /* renamed from: f  reason: collision with root package name */
    private int f14538f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f14539g;

    public q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public q(boolean z10, int i10, int i11) {
        p3.a.a(i10 > 0);
        p3.a.a(i11 >= 0);
        this.f14533a = z10;
        this.f14534b = i10;
        this.f14538f = i11;
        this.f14539g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f14535c = null;
            return;
        }
        this.f14535c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f14539g[i12] = new a(this.f14535c, i12 * i10);
        }
    }

    @Override // o3.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f14539g;
            int i10 = this.f14538f;
            this.f14538f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f14537e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // o3.b
    public synchronized void b() {
        int i10 = 0;
        int max = Math.max(0, p3.n0.l(this.f14536d, this.f14534b) - this.f14537e);
        int i11 = this.f14538f;
        if (max >= i11) {
            return;
        }
        if (this.f14535c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) p3.a.e(this.f14539g[i10]);
                if (aVar.f14404a == this.f14535c) {
                    i10++;
                } else {
                    a aVar2 = (a) p3.a.e(this.f14539g[i12]);
                    if (aVar2.f14404a != this.f14535c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f14539g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f14538f) {
                return;
            }
        }
        Arrays.fill(this.f14539g, max, this.f14538f, (Object) null);
        this.f14538f = max;
    }

    @Override // o3.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.f14539g;
        int i10 = this.f14538f;
        this.f14538f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f14537e--;
        notifyAll();
    }

    @Override // o3.b
    public synchronized a d() {
        a aVar;
        this.f14537e++;
        int i10 = this.f14538f;
        if (i10 > 0) {
            a[] aVarArr = this.f14539g;
            int i11 = i10 - 1;
            this.f14538f = i11;
            aVar = (a) p3.a.e(aVarArr[i11]);
            this.f14539g[this.f14538f] = null;
        } else {
            aVar = new a(new byte[this.f14534b], 0);
            int i12 = this.f14537e;
            a[] aVarArr2 = this.f14539g;
            if (i12 > aVarArr2.length) {
                this.f14539g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // o3.b
    public int e() {
        return this.f14534b;
    }

    public synchronized int f() {
        return this.f14537e * this.f14534b;
    }

    public synchronized void g() {
        if (this.f14533a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f14536d;
        this.f14536d = i10;
        if (z10) {
            b();
        }
    }
}
