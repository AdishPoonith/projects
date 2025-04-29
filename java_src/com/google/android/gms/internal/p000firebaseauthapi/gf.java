package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gf  reason: invalid package */
/* loaded from: classes.dex */
public final class gf extends kb {

    /* renamed from: a  reason: collision with root package name */
    private final lf f4624a;

    /* renamed from: b  reason: collision with root package name */
    private final hv f4625b;

    /* renamed from: c  reason: collision with root package name */
    private final gv f4626c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f4627d;

    private gf(lf lfVar, hv hvVar, gv gvVar, Integer num) {
        this.f4624a = lfVar;
        this.f4625b = hvVar;
        this.f4626c = gvVar;
        this.f4627d = num;
    }

    public static gf a(kf kfVar, hv hvVar, Integer num) {
        gv b10;
        kf kfVar2 = kf.f4882d;
        if (kfVar != kfVar2 && num == null) {
            String obj = kfVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (kfVar != kfVar2 || num == null) {
            if (hvVar.a() != 32) {
                int a10 = hvVar.a();
                throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + a10);
            }
            lf b11 = lf.b(kfVar);
            if (b11.a() == kfVar2) {
                b10 = gv.b(new byte[0]);
            } else if (b11.a() == kf.f4881c) {
                b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (b11.a() != kf.f4880b) {
                throw new IllegalStateException("Unknown Variant: ".concat(b11.a().toString()));
            } else {
                b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            }
            return new gf(b11, hvVar, b10, num);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }
}
