package c0;

import androidx.lifecycle.w;
import androidx.lifecycle.x;
import da.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f3130a = new ArrayList();

    public final <T extends w> void a(ia.c<T> clazz, l<? super a, ? extends T> initializer) {
        kotlin.jvm.internal.l.e(clazz, "clazz");
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f3130a.add(new f<>(ca.a.a(clazz), initializer));
    }

    public final x.b b() {
        f[] fVarArr = (f[]) this.f3130a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
