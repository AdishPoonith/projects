package i9;

import i9.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final o f10003b = new o(new l.a(), l.b.f9973a);

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, n> f10004a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f10004a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f10003b;
    }

    public n b(String str) {
        return this.f10004a.get(str);
    }
}
