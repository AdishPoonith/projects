package z2;

import android.util.SparseArray;
import p3.j0;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<j0> f20848a = new SparseArray<>();

    public j0 a(int i10) {
        j0 j0Var = this.f20848a.get(i10);
        if (j0Var == null) {
            j0 j0Var2 = new j0(9223372036854775806L);
            this.f20848a.put(i10, j0Var2);
            return j0Var2;
        }
        return j0Var;
    }

    public void b() {
        this.f20848a.clear();
    }
}
