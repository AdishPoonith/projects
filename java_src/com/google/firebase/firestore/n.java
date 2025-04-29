package com.google.firebase.firestore;

import java.util.Map;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f6797a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.l f6798b;

    /* renamed from: c  reason: collision with root package name */
    private final m6.i f6799c;

    /* renamed from: d  reason: collision with root package name */
    private final z0 f6800d;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        ESTIMATE,
        PREVIOUS;
        

        /* renamed from: m  reason: collision with root package name */
        static final a f6804m = NONE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(FirebaseFirestore firebaseFirestore, m6.l lVar, m6.i iVar, boolean z10, boolean z11) {
        this.f6797a = (FirebaseFirestore) q6.x.b(firebaseFirestore);
        this.f6798b = (m6.l) q6.x.b(lVar);
        this.f6799c = iVar;
        this.f6800d = new z0(z11, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n b(FirebaseFirestore firebaseFirestore, m6.i iVar, boolean z10, boolean z11) {
        return new n(firebaseFirestore, iVar.getKey(), iVar, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n c(FirebaseFirestore firebaseFirestore, m6.l lVar, boolean z10) {
        return new n(firebaseFirestore, lVar, null, z10, false);
    }

    public boolean a() {
        return this.f6799c != null;
    }

    public Map<String, Object> d() {
        return e(a.f6804m);
    }

    public Map<String, Object> e(a aVar) {
        q6.x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        g1 g1Var = new g1(this.f6797a, aVar);
        m6.i iVar = this.f6799c;
        if (iVar == null) {
            return null;
        }
        return g1Var.b(iVar.k().o());
    }

    public boolean equals(Object obj) {
        m6.i iVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f6797a.equals(nVar.f6797a) && this.f6798b.equals(nVar.f6798b) && ((iVar = this.f6799c) != null ? iVar.equals(nVar.f6799c) : nVar.f6799c == null) && this.f6800d.equals(nVar.f6800d);
        }
        return false;
    }

    public z0 f() {
        return this.f6800d;
    }

    public m g() {
        return new m(this.f6798b, this.f6797a);
    }

    public int hashCode() {
        int hashCode = ((this.f6797a.hashCode() * 31) + this.f6798b.hashCode()) * 31;
        m6.i iVar = this.f6799c;
        int hashCode2 = (hashCode + (iVar != null ? iVar.getKey().hashCode() : 0)) * 31;
        m6.i iVar2 = this.f6799c;
        return ((hashCode2 + (iVar2 != null ? iVar2.k().hashCode() : 0)) * 31) + this.f6800d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f6798b + ", metadata=" + this.f6800d + ", doc=" + this.f6799c + '}';
    }
}
