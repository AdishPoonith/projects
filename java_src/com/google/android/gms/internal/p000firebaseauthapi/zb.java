package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zb  reason: invalid package */
/* loaded from: classes.dex */
public final class zb {

    /* renamed from: a  reason: collision with root package name */
    private Integer f5778a = null;

    /* renamed from: b  reason: collision with root package name */
    private Integer f5779b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5780c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5781d = null;

    /* renamed from: e  reason: collision with root package name */
    private ac f5782e = null;

    /* renamed from: f  reason: collision with root package name */
    private bc f5783f = bc.f4395d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zb(yb ybVar) {
    }

    public final zb a(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.f5778a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
    }

    public final zb b(ac acVar) {
        this.f5782e = acVar;
        return this;
    }

    public final zb c(int i10) {
        if (i10 >= 16) {
            this.f5779b = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
    }

    public final zb d(int i10) {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f5780c = Integer.valueOf(i10);
        return this;
    }

    public final zb e(int i10) {
        if (i10 >= 10) {
            this.f5781d = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
    }

    public final zb f(bc bcVar) {
        this.f5783f = bcVar;
        return this;
    }

    public final dc g() {
        if (this.f5778a != null) {
            if (this.f5779b != null) {
                if (this.f5780c != null) {
                    Integer num = this.f5781d;
                    if (num != null) {
                        if (this.f5782e != null) {
                            if (this.f5783f != null) {
                                int intValue = num.intValue();
                                ac acVar = this.f5782e;
                                if (acVar == ac.f4342b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (acVar == ac.f4343c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (acVar == ac.f4344d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (acVar == ac.f4345e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (acVar != ac.f4346f) {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                } else {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                }
                                return new dc(this.f5778a.intValue(), this.f5779b.intValue(), this.f5780c.intValue(), this.f5781d.intValue(), this.f5783f, this.f5782e, null);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }
}
