package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class p0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f6809a;

    public long a() {
        return this.f6809a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p0.class == obj.getClass() && this.f6809a == ((p0) obj).f6809a;
    }

    public int hashCode() {
        long j10 = this.f6809a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f6809a + '}';
    }
}
