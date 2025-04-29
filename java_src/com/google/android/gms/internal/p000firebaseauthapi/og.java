package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.og  reason: invalid package */
/* loaded from: classes.dex */
public final class og {

    /* renamed from: a  reason: collision with root package name */
    private Integer f5131a = null;

    /* renamed from: b  reason: collision with root package name */
    private pg f5132b = pg.f5188d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ og(ng ngVar) {
    }

    public final og a(int i10) {
        if (i10 == 32 || i10 == 48 || i10 == 64) {
            this.f5131a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
    }

    public final og b(pg pgVar) {
        this.f5132b = pgVar;
        return this;
    }

    public final rg c() {
        Integer num = this.f5131a;
        if (num != null) {
            if (this.f5132b != null) {
                return new rg(num.intValue(), this.f5132b, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
