package com.google.android.gms.internal.auth;

import java.util.List;
/* loaded from: classes.dex */
public final class d5 extends g2 implements h3 {
    private static final d5 zzb;
    private j2 zzd = g2.c();

    static {
        d5 d5Var = new d5();
        zzb = d5Var;
        g2.f(d5.class, d5Var);
    }

    private d5() {
    }

    public static d5 j(byte[] bArr) {
        return (d5) g2.b(zzb, bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.auth.g2
    public final Object g(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new c5(null);
                }
                return new d5();
            }
            return g2.e(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final List k() {
        return this.zzd;
    }
}
