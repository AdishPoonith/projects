package m6;

import java.util.ArrayList;
import java.util.List;
import m6.e;
import q6.g0;
/* loaded from: classes.dex */
public abstract class e<B extends e<B>> implements Comparable<B> {

    /* renamed from: j  reason: collision with root package name */
    final List<String> f13798j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List<String> list) {
        this.f13798j = list;
    }

    public B b(String str) {
        ArrayList arrayList = new ArrayList(this.f13798j);
        arrayList.add(str);
        return k(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public B g(B b10) {
        ArrayList arrayList = new ArrayList(this.f13798j);
        arrayList.addAll(b10.f13798j);
        return k(arrayList);
    }

    public abstract String h();

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f13798j.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(B b10) {
        int q10 = q();
        int q11 = b10.q();
        for (int i10 = 0; i10 < q10 && i10 < q11; i10++) {
            int compareTo = n(i10).compareTo(b10.n(i10));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return g0.l(q10, q11);
    }

    abstract B k(List<String> list);

    public String l() {
        return this.f13798j.get(q() - 1);
    }

    public String n(int i10) {
        return this.f13798j.get(i10);
    }

    public boolean o() {
        return q() == 0;
    }

    public boolean p(B b10) {
        if (q() > b10.q()) {
            return false;
        }
        for (int i10 = 0; i10 < q(); i10++) {
            if (!n(i10).equals(b10.n(i10))) {
                return false;
            }
        }
        return true;
    }

    public int q() {
        return this.f13798j.size();
    }

    public B r(int i10) {
        int q10 = q();
        q6.b.d(q10 >= i10, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i10), Integer.valueOf(q10));
        return k(this.f13798j.subList(i10, q10));
    }

    public B s() {
        return k(this.f13798j.subList(0, q() - 1));
    }

    public String toString() {
        return h();
    }
}
