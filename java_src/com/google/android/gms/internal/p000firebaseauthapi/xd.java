package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xd  reason: invalid package */
/* loaded from: classes.dex */
public final class xd {

    /* renamed from: a  reason: collision with root package name */
    private he f5646a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f5647b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5648c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xd(wd wdVar) {
    }

    public final xd a(Integer num) {
        this.f5648c = num;
        return this;
    }

    public final xd b(hv hvVar) {
        this.f5647b = hvVar;
        return this;
    }

    public final xd c(he heVar) {
        this.f5646a = heVar;
        return this;
    }

    public final zd d() {
        hv hvVar;
        gv b10;
        he heVar = this.f5646a;
        if (heVar == null || (hvVar = this.f5647b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (heVar.a() == hvVar.a()) {
            if (heVar.c() && this.f5648c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f5646a.c() || this.f5648c == null) {
                if (this.f5646a.b() == fe.f4581d) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f5646a.b() == fe.f4580c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5648c.intValue()).array());
                } else if (this.f5646a.b() != fe.f4579b) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f5646a.b())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5648c.intValue()).array());
                }
                return new zd(this.f5646a, this.f5647b, b10, this.f5648c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
