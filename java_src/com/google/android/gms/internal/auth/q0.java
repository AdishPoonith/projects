package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class q0 extends s0 {

    /* renamed from: j  reason: collision with root package name */
    static final q0 f4222j = new q0();

    private q0() {
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.s0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
