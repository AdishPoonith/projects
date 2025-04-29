package x1;

import java.util.Arrays;
import s1.n1;
/* loaded from: classes.dex */
public interface e0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20123a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f20124b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20125c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20126d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f20123a = i10;
            this.f20124b = bArr;
            this.f20125c = i11;
            this.f20126d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20123a == aVar.f20123a && this.f20125c == aVar.f20125c && this.f20126d == aVar.f20126d && Arrays.equals(this.f20124b, aVar.f20124b);
        }

        public int hashCode() {
            return (((((this.f20123a * 31) + Arrays.hashCode(this.f20124b)) * 31) + this.f20125c) * 31) + this.f20126d;
        }
    }

    int a(o3.i iVar, int i10, boolean z10, int i11);

    void b(p3.a0 a0Var, int i10, int i11);

    void c(long j10, int i10, int i11, int i12, a aVar);

    void d(p3.a0 a0Var, int i10);

    void e(n1 n1Var);

    int f(o3.i iVar, int i10, boolean z10);
}
