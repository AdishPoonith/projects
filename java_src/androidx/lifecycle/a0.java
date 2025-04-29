package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, w> f2526a = new LinkedHashMap();

    public final void a() {
        for (w wVar : this.f2526a.values()) {
            wVar.a();
        }
        this.f2526a.clear();
    }

    public final w b(String key) {
        kotlin.jvm.internal.l.e(key, "key");
        return this.f2526a.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.f2526a.keySet());
    }

    public final void d(String key, w viewModel) {
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(viewModel, "viewModel");
        w put = this.f2526a.put(key, viewModel);
        if (put != null) {
            put.d();
        }
    }
}
