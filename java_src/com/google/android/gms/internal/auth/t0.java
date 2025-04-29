package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class t0 extends s0 {

    /* renamed from: j  reason: collision with root package name */
    private final Object f4241j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(Object obj) {
        this.f4241j = obj;
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final Object a() {
        return this.f4241j;
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            return this.f4241j.equals(((t0) obj).f4241j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4241j.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f4241j + ")";
    }
}
