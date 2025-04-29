package u2;

import android.util.SparseArray;
/* loaded from: classes.dex */
final class r0<V> {

    /* renamed from: c  reason: collision with root package name */
    private final p3.h<V> f18968c;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<V> f18967b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    private int f18966a = -1;

    public r0(p3.h<V> hVar) {
        this.f18968c = hVar;
    }

    public void a(int i10, V v10) {
        if (this.f18966a == -1) {
            p3.a.f(this.f18967b.size() == 0);
            this.f18966a = 0;
        }
        if (this.f18967b.size() > 0) {
            SparseArray<V> sparseArray = this.f18967b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            p3.a.a(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f18967b;
                this.f18968c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f18967b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f18967b.size(); i10++) {
            this.f18968c.accept(this.f18967b.valueAt(i10));
        }
        this.f18966a = -1;
        this.f18967b.clear();
    }

    public void c(int i10) {
        for (int size = this.f18967b.size() - 1; size >= 0 && i10 < this.f18967b.keyAt(size); size--) {
            this.f18968c.accept(this.f18967b.valueAt(size));
            this.f18967b.removeAt(size);
        }
        this.f18966a = this.f18967b.size() > 0 ? Math.min(this.f18966a, this.f18967b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f18967b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f18967b.keyAt(i12)) {
                return;
            }
            this.f18968c.accept(this.f18967b.valueAt(i11));
            this.f18967b.removeAt(i11);
            int i13 = this.f18966a;
            if (i13 > 0) {
                this.f18966a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public V e(int i10) {
        if (this.f18966a == -1) {
            this.f18966a = 0;
        }
        while (true) {
            int i11 = this.f18966a;
            if (i11 <= 0 || i10 >= this.f18967b.keyAt(i11)) {
                break;
            }
            this.f18966a--;
        }
        while (this.f18966a < this.f18967b.size() - 1 && i10 >= this.f18967b.keyAt(this.f18966a + 1)) {
            this.f18966a++;
        }
        return this.f18967b.valueAt(this.f18966a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f18967b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f18967b.size() == 0;
    }
}
