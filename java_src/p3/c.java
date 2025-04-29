package p3;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.q;
import java.util.List;
import s1.h;
/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) n0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends s1.h> com.google.common.collect.q<T> b(h.a<T> aVar, List<Bundle> list) {
        q.a t10 = com.google.common.collect.q.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return t10.h();
    }

    public static <T extends s1.h> SparseArray<T> c(h.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
