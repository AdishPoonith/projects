package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.um  reason: invalid package */
/* loaded from: classes.dex */
final class um implements cb {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5464a = Logger.getLogger(um.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f5465b = {0};

    /* renamed from: c  reason: collision with root package name */
    private static final um f5466c = new um();

    um() {
    }

    public static void c() {
        gb.j(f5466c);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final /* bridge */ /* synthetic */ Object a(bb bbVar) {
        for (List<xa> list : bbVar.d()) {
            for (xa xaVar : list) {
                if (xaVar.b() instanceof qm) {
                    qm qmVar = (qm) xaVar.b();
                    gv b10 = gv.b(xaVar.g());
                    if (!b10.equals(qmVar.b())) {
                        String valueOf = String.valueOf(qmVar.a());
                        String obj = qmVar.b().toString();
                        String obj2 = b10.toString();
                        throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                    }
                }
            }
        }
        return new tm(bbVar, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final Class zza() {
        return ta.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final Class zzb() {
        return ta.class;
    }
}
