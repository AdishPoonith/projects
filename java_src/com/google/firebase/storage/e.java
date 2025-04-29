package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f6926a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final w5.f f6927b;

    /* renamed from: c  reason: collision with root package name */
    private final s6.b<a6.b> f6928c;

    /* renamed from: d  reason: collision with root package name */
    private final s6.b<z5.b> f6929d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(w5.f fVar, s6.b<a6.b> bVar, s6.b<z5.b> bVar2) {
        this.f6927b = fVar;
        this.f6928c = bVar;
        this.f6929d = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized d a(String str) {
        d dVar;
        dVar = this.f6926a.get(str);
        if (dVar == null) {
            dVar = new d(str, this.f6927b, this.f6928c, this.f6929d);
            this.f6926a.put(str, dVar);
        }
        return dVar;
    }
}
