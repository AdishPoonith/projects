package com.google.firebase.firestore;
/* loaded from: classes.dex */
public final class m0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private long f6796a;

    public long a() {
        return this.f6796a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m0.class == obj.getClass() && this.f6796a == ((m0) obj).f6796a;
    }

    public int hashCode() {
        long j10 = this.f6796a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "MemoryLruGcSettings{cacheSize=" + a() + "}";
    }
}
