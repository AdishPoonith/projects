package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class w0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f11698a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f11698a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f11698a.isEmpty();
    }

    public final void e(T t10, boolean z10) {
        int size = this.f11698a.size();
        if (z10) {
            this.f11698a.add(t10);
            if (size == 0) {
                b();
            }
        } else if (this.f11698a.remove(t10) && size == 1) {
            c();
        }
    }
}
