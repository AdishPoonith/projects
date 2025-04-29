package com.google.firebase.firestore;

import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: c  reason: collision with root package name */
    static final y0 f6855c = new y0(false, null);

    /* renamed from: d  reason: collision with root package name */
    private static final y0 f6856d = new y0(true, null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6857a;

    /* renamed from: b  reason: collision with root package name */
    private final n6.d f6858b;

    private y0(boolean z10, n6.d dVar) {
        q6.x.a(dVar == null || z10, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f6857a = z10;
        this.f6858b = dVar;
    }

    public static y0 c() {
        return f6856d;
    }

    public static y0 d(List<q> list) {
        HashSet hashSet = new HashSet();
        for (q qVar : list) {
            hashSet.add(qVar.c());
        }
        return new y0(true, n6.d.b(hashSet));
    }

    public n6.d a() {
        return this.f6858b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f6857a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f6857a != y0Var.f6857a) {
            return false;
        }
        n6.d dVar = this.f6858b;
        n6.d dVar2 = y0Var.f6858b;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        int i10 = (this.f6857a ? 1 : 0) * 31;
        n6.d dVar = this.f6858b;
        return i10 + (dVar != null ? dVar.hashCode() : 0);
    }
}
