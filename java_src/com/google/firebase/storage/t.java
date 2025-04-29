package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t {

    /* renamed from: c  reason: collision with root package name */
    private static final t f7001c = new t();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WeakReference<s<?>>> f7002a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f7003b = new Object();

    t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t b() {
        return f7001c;
    }

    public void a(s<?> sVar) {
        synchronized (this.f7003b) {
            this.f7002a.put(sVar.I().toString(), new WeakReference<>(sVar));
        }
    }

    public void c(s<?> sVar) {
        synchronized (this.f7003b) {
            String lVar = sVar.I().toString();
            WeakReference<s<?>> weakReference = this.f7002a.get(lVar);
            s<?> sVar2 = weakReference != null ? weakReference.get() : null;
            if (sVar2 == null || sVar2 == sVar) {
                this.f7002a.remove(lVar);
            }
        }
    }
}
