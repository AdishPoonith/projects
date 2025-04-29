package p3;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f15390a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseBooleanArray f15391a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f15392b;

        public b a(int i10) {
            p3.a.f(!this.f15392b);
            this.f15391a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                a(lVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            p3.a.f(!this.f15392b);
            this.f15392b = true;
            return new l(this.f15391a);
        }
    }

    private l(SparseBooleanArray sparseBooleanArray) {
        this.f15390a = sparseBooleanArray;
    }

    public boolean a(int i10) {
        return this.f15390a.get(i10);
    }

    public int b(int i10) {
        p3.a.c(i10, 0, c());
        return this.f15390a.keyAt(i10);
    }

    public int c() {
        return this.f15390a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (n0.f15397a < 24) {
                if (c() != lVar.c()) {
                    return false;
                }
                for (int i10 = 0; i10 < c(); i10++) {
                    if (b(i10) != lVar.b(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return this.f15390a.equals(lVar.f15390a);
        }
        return false;
    }

    public int hashCode() {
        if (n0.f15397a < 24) {
            int c10 = c();
            for (int i10 = 0; i10 < c(); i10++) {
                c10 = (c10 * 31) + b(i10);
            }
            return c10;
        }
        return this.f15390a.hashCode();
    }
}
