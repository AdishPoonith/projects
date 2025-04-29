package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ja  reason: invalid package */
/* loaded from: classes.dex */
public final class ja {

    /* renamed from: a  reason: collision with root package name */
    private final as f4807a;

    private ja(as asVar) {
        this.f4807a = asVar;
    }

    public static ja e(String str, byte[] bArr, int i10) {
        zr C = as.C();
        C.s(str);
        m4 m4Var = m4.f4993k;
        C.t(m4.w(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        C.r(i11 != 0 ? i11 != 1 ? i11 != 2 ? ct.CRUNCHY : ct.RAW : ct.LEGACY : ct.TINK);
        return new ja((as) C.j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final as a() {
        return this.f4807a;
    }

    public final String b() {
        return this.f4807a.H();
    }

    public final byte[] c() {
        return this.f4807a.G().z();
    }

    public final int d() {
        ct F = this.f4807a.F();
        ct ctVar = ct.UNKNOWN_PREFIX;
        int ordinal = F.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
