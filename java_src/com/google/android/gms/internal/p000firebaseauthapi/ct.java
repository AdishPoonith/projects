package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ct  reason: invalid package */
/* loaded from: classes.dex */
public enum ct implements t5 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: q  reason: collision with root package name */
    private static final u5 f4465q = new u5() { // from class: com.google.android.gms.internal.firebase-auth-api.bt
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f4467j;

    ct(int i10) {
        this.f4467j = i10;
    }

    public static ct b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f4467j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
