package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ur  reason: invalid package */
/* loaded from: classes.dex */
public enum ur implements t5 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: q  reason: collision with root package name */
    private static final u5 f5473q = new u5() { // from class: com.google.android.gms.internal.firebase-auth-api.tr
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f5475j;

    ur(int i10) {
        this.f5475j = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f5475j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
