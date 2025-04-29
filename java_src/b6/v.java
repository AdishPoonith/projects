package b6;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class v implements g6.d, g6.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<g6.b<Object>, Executor>> f3058a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<g6.a<?>> f3059b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3060c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f3060c = executor;
    }

    private synchronized Set<Map.Entry<g6.b<Object>, Executor>> d(g6.a<?> aVar) {
        ConcurrentHashMap<g6.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f3058a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Map.Entry entry, g6.a aVar) {
        ((g6.b) entry.getKey()).a(aVar);
    }

    @Override // g6.c
    public void a(final g6.a<?> aVar) {
        e0.b(aVar);
        synchronized (this) {
            Queue<g6.a<?>> queue = this.f3059b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<g6.b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: b6.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.e(entry, aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Queue<g6.a<?>> queue;
        synchronized (this) {
            queue = this.f3059b;
            if (queue != null) {
                this.f3059b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (g6.a<?> aVar : queue) {
                a(aVar);
            }
        }
    }
}
