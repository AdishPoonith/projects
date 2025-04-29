package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hg  reason: invalid package */
/* loaded from: classes.dex */
public final class hg {

    /* renamed from: a  reason: collision with root package name */
    private rg f4689a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f4690b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f4691c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ hg(gg ggVar) {
    }

    public final hg a(Integer num) {
        this.f4691c = num;
        return this;
    }

    public final hg b(hv hvVar) {
        this.f4690b = hvVar;
        return this;
    }

    public final hg c(rg rgVar) {
        this.f4689a = rgVar;
        return this;
    }

    public final jg d() {
        hv hvVar;
        gv b10;
        rg rgVar = this.f4689a;
        if (rgVar == null || (hvVar = this.f4690b) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (rgVar.a() == hvVar.a()) {
            if (rgVar.c() && this.f4691c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f4689a.c() || this.f4691c == null) {
                if (this.f4689a.b() == pg.f5188d) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f4689a.b() == pg.f5187c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4691c.intValue()).array());
                } else if (this.f4689a.b() != pg.f5186b) {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.f4689a.b())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4691c.intValue()).array());
                }
                return new jg(this.f4689a, this.f4690b, b10, this.f4691c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
