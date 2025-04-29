package ha;

import t9.c0;
/* loaded from: classes.dex */
public class d implements Iterable<Integer>, ea.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f9554m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final int f9555j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9556k;

    /* renamed from: l  reason: collision with root package name */
    private final int f9557l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9555j = i10;
        this.f9556k = y9.c.b(i10, i11, i12);
        this.f9557l = i12;
    }

    public final int b() {
        return this.f9555j;
    }

    public final int e() {
        return this.f9556k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f9555j != dVar.f9555j || this.f9556k != dVar.f9556k || this.f9557l != dVar.f9557l) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f9555j * 31) + this.f9556k) * 31) + this.f9557l;
    }

    public boolean isEmpty() {
        if (this.f9557l > 0) {
            if (this.f9555j > this.f9556k) {
                return true;
            }
        } else if (this.f9555j < this.f9556k) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.f9557l;
    }

    @Override // java.lang.Iterable
    /* renamed from: l */
    public c0 iterator() {
        return new e(this.f9555j, this.f9556k, this.f9557l);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        if (this.f9557l > 0) {
            sb = new StringBuilder();
            sb.append(this.f9555j);
            sb.append("..");
            sb.append(this.f9556k);
            sb.append(" step ");
            i10 = this.f9557l;
        } else {
            sb = new StringBuilder();
            sb.append(this.f9555j);
            sb.append(" downTo ");
            sb.append(this.f9556k);
            sb.append(" step ");
            i10 = -this.f9557l;
        }
        sb.append(i10);
        return sb.toString();
    }
}
