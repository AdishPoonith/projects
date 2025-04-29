package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private l0 f6791a;

    public l0 a() {
        return this.f6791a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        return a().equals(((k0) obj).a());
    }

    public int hashCode() {
        return this.f6791a.hashCode();
    }

    public String toString() {
        return "MemoryCacheSettings{gcSettings=" + a() + "}";
    }
}
