package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nc  reason: invalid package */
/* loaded from: classes.dex */
public final class nc {

    /* renamed from: a  reason: collision with root package name */
    private yc f5062a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f5063b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5064c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ nc(mc mcVar) {
    }

    public final nc a(Integer num) {
        this.f5064c = num;
        return this;
    }

    public final nc b(hv hvVar) {
        this.f5063b = hvVar;
        return this;
    }

    public final nc c(yc ycVar) {
        this.f5062a = ycVar;
        return this;
    }

    public final pc d() {
        hv hvVar;
        gv b10;
        yc ycVar = this.f5062a;
        if (ycVar == null || (hvVar = this.f5063b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ycVar.a() == hvVar.a()) {
            if (ycVar.c() && this.f5064c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f5062a.c() || this.f5064c == null) {
                if (this.f5062a.b() == wc.f5594d) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f5062a.b() == wc.f5593c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5064c.intValue()).array());
                } else if (this.f5062a.b() != wc.f5592b) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f5062a.b())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5064c.intValue()).array());
                }
                return new pc(this.f5062a, this.f5063b, b10, this.f5064c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
