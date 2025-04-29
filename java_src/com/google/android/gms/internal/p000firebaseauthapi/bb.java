package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bb  reason: invalid package */
/* loaded from: classes.dex */
public final class bb {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap f4388a;

    /* renamed from: b  reason: collision with root package name */
    private final List f4389b;

    /* renamed from: c  reason: collision with root package name */
    private final xa f4390c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f4391d;

    /* renamed from: e  reason: collision with root package name */
    private final an f4392e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bb(ConcurrentMap concurrentMap, List list, xa xaVar, an anVar, Class cls, ab abVar) {
        this.f4388a = concurrentMap;
        this.f4389b = list;
        this.f4390c = xaVar;
        this.f4391d = cls;
        this.f4392e = anVar;
    }

    public final xa a() {
        return this.f4390c;
    }

    public final an b() {
        return this.f4392e;
    }

    public final Class c() {
        return this.f4391d;
    }

    public final Collection d() {
        return this.f4388a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.f4388a.get(new za(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean f() {
        return !this.f4392e.a().isEmpty();
    }
}
