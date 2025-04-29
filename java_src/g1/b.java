package g1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, a>> f8884a = new ConcurrentHashMap<>();

    public final List<a> a(String appId) {
        l.e(appId, "appId");
        ConcurrentHashMap<String, a> concurrentHashMap = this.f8884a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<String, a> entry : concurrentHashMap.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    public final void b(String appId, List<a> gateKeeperList) {
        l.e(appId, "appId");
        l.e(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        for (a aVar : gateKeeperList) {
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.f8884a.put(appId, concurrentHashMap);
    }
}
