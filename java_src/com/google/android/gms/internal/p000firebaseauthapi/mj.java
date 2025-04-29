package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mj  reason: invalid package */
/* loaded from: classes.dex */
public final class mj {

    /* renamed from: a  reason: collision with root package name */
    public static final cn f5021a = new lj(null);

    public static in a(bb bbVar) {
        ia iaVar;
        en enVar = new en();
        enVar.b(bbVar.b());
        for (List<xa> list : bbVar.d()) {
            for (xa xaVar : list) {
                int h10 = xaVar.h() - 2;
                if (h10 == 1) {
                    iaVar = ia.f4738b;
                } else if (h10 == 2) {
                    iaVar = ia.f4739c;
                } else if (h10 != 3) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    iaVar = ia.f4740d;
                }
                int a10 = xaVar.a();
                String f10 = xaVar.f();
                if (f10.startsWith("type.googleapis.com/google.crypto.")) {
                    f10 = f10.substring(34);
                }
                enVar.a(iaVar, a10, f10, xaVar.c().name());
            }
        }
        if (bbVar.a() != null) {
            enVar.c(bbVar.a().a());
        }
        try {
            return enVar.d();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
