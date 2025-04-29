package s;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f16818n = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f16819j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f16820k;

    /* renamed from: l  reason: collision with root package name */
    private Object[] f16821l;

    /* renamed from: m  reason: collision with root package name */
    private int f16822m;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f16819j = false;
        if (i10 == 0) {
            this.f16820k = c.f16816b;
            this.f16821l = c.f16817c;
            return;
        }
        int f10 = c.f(i10);
        this.f16820k = new long[f10];
        this.f16821l = new Object[f10];
    }

    private void g() {
        int i10 = this.f16822m;
        long[] jArr = this.f16820k;
        Object[] objArr = this.f16821l;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16818n) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16819j = false;
        this.f16822m = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f16822m;
        if (i10 != 0 && j10 <= this.f16820k[i10 - 1]) {
            n(j10, e10);
            return;
        }
        if (this.f16819j && i10 >= this.f16820k.length) {
            g();
        }
        int i11 = this.f16822m;
        if (i11 >= this.f16820k.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f16820k;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f16821l;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16820k = jArr;
            this.f16821l = objArr;
        }
        this.f16820k[i11] = j10;
        this.f16821l[i11] = e10;
        this.f16822m = i11 + 1;
    }

    public void c() {
        int i10 = this.f16822m;
        Object[] objArr = this.f16821l;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16822m = 0;
        this.f16819j = false;
    }

    /* renamed from: d */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f16820k = (long[]) this.f16820k.clone();
            dVar.f16821l = (Object[]) this.f16821l.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Deprecated
    public void f(long j10) {
        o(j10);
    }

    public E h(long j10) {
        return i(j10, null);
    }

    public E i(long j10, E e10) {
        int b10 = c.b(this.f16820k, this.f16822m, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f16821l;
            if (objArr[b10] != f16818n) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public long j(int i10) {
        if (this.f16819j) {
            g();
        }
        return this.f16820k[i10];
    }

    public void n(long j10, E e10) {
        int b10 = c.b(this.f16820k, this.f16822m, j10);
        if (b10 >= 0) {
            this.f16821l[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f16822m;
        if (i10 < i11) {
            Object[] objArr = this.f16821l;
            if (objArr[i10] == f16818n) {
                this.f16820k[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f16819j && i11 >= this.f16820k.length) {
            g();
            i10 = ~c.b(this.f16820k, this.f16822m, j10);
        }
        int i12 = this.f16822m;
        if (i12 >= this.f16820k.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f16820k;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16821l;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16820k = jArr;
            this.f16821l = objArr2;
        }
        int i13 = this.f16822m;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f16820k;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f16821l;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f16822m - i10);
        }
        this.f16820k[i10] = j10;
        this.f16821l[i10] = e10;
        this.f16822m++;
    }

    public void o(long j10) {
        int b10 = c.b(this.f16820k, this.f16822m, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f16821l;
            Object obj = objArr[b10];
            Object obj2 = f16818n;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f16819j = true;
            }
        }
    }

    public int p() {
        if (this.f16819j) {
            g();
        }
        return this.f16822m;
    }

    public E r(int i10) {
        if (this.f16819j) {
            g();
        }
        return (E) this.f16821l[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16822m * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16822m; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(j(i10));
            sb.append('=');
            E r10 = r(i10);
            if (r10 != this) {
                sb.append(r10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
