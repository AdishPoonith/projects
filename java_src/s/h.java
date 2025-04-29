package s;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f16853n = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f16854j;

    /* renamed from: k  reason: collision with root package name */
    private int[] f16855k;

    /* renamed from: l  reason: collision with root package name */
    private Object[] f16856l;

    /* renamed from: m  reason: collision with root package name */
    private int f16857m;

    public h() {
        this(10);
    }

    public h(int i10) {
        this.f16854j = false;
        if (i10 == 0) {
            this.f16855k = c.f16815a;
            this.f16856l = c.f16817c;
            return;
        }
        int e10 = c.e(i10);
        this.f16855k = new int[e10];
        this.f16856l = new Object[e10];
    }

    private void f() {
        int i10 = this.f16857m;
        int[] iArr = this.f16855k;
        Object[] objArr = this.f16856l;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16853n) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16854j = false;
        this.f16857m = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f16857m;
        if (i11 != 0 && i10 <= this.f16855k[i11 - 1]) {
            j(i10, e10);
            return;
        }
        if (this.f16854j && i11 >= this.f16855k.length) {
            f();
        }
        int i12 = this.f16857m;
        if (i12 >= this.f16855k.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f16855k;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f16856l;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16855k = iArr;
            this.f16856l = objArr;
        }
        this.f16855k[i12] = i10;
        this.f16856l[i12] = e10;
        this.f16857m = i12 + 1;
    }

    public void c() {
        int i10 = this.f16857m;
        Object[] objArr = this.f16856l;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16857m = 0;
        this.f16854j = false;
    }

    /* renamed from: d */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f16855k = (int[]) this.f16855k.clone();
            hVar.f16856l = (Object[]) this.f16856l.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E g(int i10) {
        return h(i10, null);
    }

    public E h(int i10, E e10) {
        int a10 = c.a(this.f16855k, this.f16857m, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f16856l;
            if (objArr[a10] != f16853n) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int i(int i10) {
        if (this.f16854j) {
            f();
        }
        return this.f16855k[i10];
    }

    public void j(int i10, E e10) {
        int a10 = c.a(this.f16855k, this.f16857m, i10);
        if (a10 >= 0) {
            this.f16856l[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f16857m;
        if (i11 < i12) {
            Object[] objArr = this.f16856l;
            if (objArr[i11] == f16853n) {
                this.f16855k[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f16854j && i12 >= this.f16855k.length) {
            f();
            i11 = ~c.a(this.f16855k, this.f16857m, i10);
        }
        int i13 = this.f16857m;
        if (i13 >= this.f16855k.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f16855k;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16856l;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16855k = iArr;
            this.f16856l = objArr2;
        }
        int i14 = this.f16857m;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f16855k;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f16856l;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f16857m - i11);
        }
        this.f16855k[i11] = i10;
        this.f16856l[i11] = e10;
        this.f16857m++;
    }

    public int n() {
        if (this.f16854j) {
            f();
        }
        return this.f16857m;
    }

    public E o(int i10) {
        if (this.f16854j) {
            f();
        }
        return (E) this.f16856l[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16857m * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16857m; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(i(i10));
            sb.append('=');
            E o10 = o(i10);
            if (o10 != this) {
                sb.append(o10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
