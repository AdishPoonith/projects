package b6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y<T> implements s6.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f3065b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<s6.b<T>> f3064a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<s6.b<T>> collection) {
        this.f3064a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y<?> b(Collection<s6.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (s6.b<T> bVar : this.f3064a) {
            this.f3065b.add(bVar.get());
        }
        this.f3064a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(s6.b<T> bVar) {
        Set set;
        if (this.f3065b == null) {
            set = this.f3064a;
        } else {
            set = this.f3065b;
            bVar = (s6.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // s6.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f3065b == null) {
            synchronized (this) {
                if (this.f3065b == null) {
                    this.f3065b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f3065b);
    }
}
