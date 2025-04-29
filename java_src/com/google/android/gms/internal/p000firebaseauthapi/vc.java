package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vc  reason: invalid package */
/* loaded from: classes.dex */
public final class vc {

    /* renamed from: a  reason: collision with root package name */
    private Integer f5519a = null;

    /* renamed from: b  reason: collision with root package name */
    private Integer f5520b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5521c = null;

    /* renamed from: d  reason: collision with root package name */
    private wc f5522d = wc.f5594d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ vc(uc ucVar) {
    }

    public final vc a(int i10) {
        if (i10 == 12 || i10 == 16) {
            this.f5520b = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
    }

    public final vc b(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.f5519a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
    }

    public final vc c(int i10) {
        this.f5521c = 16;
        return this;
    }

    public final vc d(wc wcVar) {
        this.f5522d = wcVar;
        return this;
    }

    public final yc e() {
        Integer num = this.f5519a;
        if (num != null) {
            if (this.f5520b != null) {
                if (this.f5522d != null) {
                    if (this.f5521c != null) {
                        int intValue = num.intValue();
                        int intValue2 = this.f5520b.intValue();
                        this.f5521c.intValue();
                        return new yc(intValue, intValue2, 16, this.f5522d, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
