package q0;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<a, e0> f15923a = new HashMap<>();

    private final synchronized e0 e(a aVar) {
        e0 e0Var = this.f15923a.get(aVar);
        if (e0Var == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            Context l10 = p0.f0.l();
            f1.a e10 = f1.a.f8366f.e(l10);
            if (e10 != null) {
                e0Var = new e0(e10, o.f15963b.b(l10));
            }
        }
        if (e0Var == null) {
            return null;
        }
        this.f15923a.put(aVar, e0Var);
        return e0Var;
    }

    public final synchronized void a(a accessTokenAppIdPair, d appEvent) {
        kotlin.jvm.internal.l.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        kotlin.jvm.internal.l.e(appEvent, "appEvent");
        e0 e10 = e(accessTokenAppIdPair);
        if (e10 != null) {
            e10.a(appEvent);
        }
    }

    public final synchronized void b(d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        for (Map.Entry<a, List<d>> entry : d0Var.b()) {
            e0 e10 = e(entry.getKey());
            if (e10 != null) {
                for (d dVar : entry.getValue()) {
                    e10.a(dVar);
                }
            }
        }
    }

    public final synchronized e0 c(a accessTokenAppIdPair) {
        kotlin.jvm.internal.l.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f15923a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int i10;
        i10 = 0;
        for (e0 e0Var : this.f15923a.values()) {
            i10 += e0Var.c();
        }
        return i10;
    }

    public final synchronized Set<a> f() {
        Set<a> keySet;
        keySet = this.f15923a.keySet();
        kotlin.jvm.internal.l.d(keySet, "stateMap.keys");
        return keySet;
    }
}
