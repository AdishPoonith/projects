package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fm  reason: invalid package */
/* loaded from: classes.dex */
public final class fm {

    /* renamed from: a  reason: collision with root package name */
    private Integer f4589a = null;

    /* renamed from: b  reason: collision with root package name */
    private Integer f4590b = null;

    /* renamed from: c  reason: collision with root package name */
    private gm f4591c = null;

    /* renamed from: d  reason: collision with root package name */
    private hm f4592d = hm.f4700e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fm(em emVar) {
    }

    public final fm a(gm gmVar) {
        this.f4591c = gmVar;
        return this;
    }

    public final fm b(int i10) {
        this.f4589a = Integer.valueOf(i10);
        return this;
    }

    public final fm c(int i10) {
        this.f4590b = Integer.valueOf(i10);
        return this;
    }

    public final fm d(hm hmVar) {
        this.f4592d = hmVar;
        return this;
    }

    public final jm e() {
        Integer num = this.f4589a;
        if (num != null) {
            if (this.f4590b != null) {
                if (this.f4591c != null) {
                    if (this.f4592d != null) {
                        if (num.intValue() >= 16) {
                            int intValue = this.f4590b.intValue();
                            gm gmVar = this.f4591c;
                            if (intValue >= 10) {
                                if (gmVar == gm.f4647b) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (gmVar == gm.f4648c) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (gmVar == gm.f4649d) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (gmVar == gm.f4650e) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (gmVar != gm.f4651f) {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                } else {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                }
                                return new jm(this.f4589a.intValue(), this.f4590b.intValue(), this.f4592d, this.f4591c, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f4589a));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
