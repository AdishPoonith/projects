package com.google.android.play.integrity.internal;
/* loaded from: classes.dex */
final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private final long f5913a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, long j10) {
        this.f5913a = j10;
    }

    @Override // com.google.android.play.integrity.internal.h
    public final int a() {
        return 3;
    }

    @Override // com.google.android.play.integrity.internal.h
    public final long b() {
        return this.f5913a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.a();
            if (this.f5913a == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5913a;
        return (-724379968) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        long j10 = this.f5913a;
        return "EventRecord{eventType=3, eventTimestamp=" + j10 + "}";
    }
}
